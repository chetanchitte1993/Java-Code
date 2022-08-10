package com.bugtraking.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bugtraking.api.dto.ProjectDTO;
import com.bugtraking.api.dto.TeamDTO;import com.bugtraking.api.entity.Project;
import com.bugtraking.api.entity.Team;
import com.bugtraking.api.services.ProjectService;
import com.bugtraking.api.services.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/projects")
	public String home()
	{
		return "this is a project home page";
	}
	/**
	 * project create and generate the list 
	 * @return
	 */
	//************************************* fetch the project data *******************************//
	@GetMapping("/project")
	public List<Project> getProject()
	{
		List<Project> project;
		try
		{
			project = projectService.getProject();
		}
		catch (Exception e) {
			// TODO: handle exception
			project = new ArrayList<>();
		}
		return project;
	}
	
	//******************* Create a Project **********************************//
	
	@PostMapping("/project/users")
	public ResponseEntity<ProjectDTO> addProject(@RequestBody ProjectDTO projectDTO)
	{
		try
		{
			Project project = new Project();
			
			project.setId(projectDTO.getId());
			
			//project.setProject_name(project.getProject_name());
			
			project.setProject_name(projectDTO.getProject_name());
			
			project.setTechnology(projectDTO.getTechnology());
			
			project.setStatus(projectDTO.getStatus());
			
			project.setIsdeleted(false);
						
			System.out.println("print here");
			
			projectService.addProject(project);
			
			//return ResponseEntity.of(Optional.of(projectDTO));
			
			return new ResponseEntity<ProjectDTO>(projectDTO, HttpStatus.CREATED);
						
		}catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	/**
	 *  add team on project
	 * 
	 */
	//************************ add team **************************************//
	@PostMapping("/addTeam/{pid}/{tid}")
	public void addTeam(@PathVariable("pid") Long pid,@PathVariable("tid") Long tid)
	{
		Project project = projectService.getProjectById(pid);
		Team team = teamService.getTeamById(tid);
		
		project.getTeam().add(team);
		team.getProject().add(project);
		
		projectService.save(project);
		teamService.save(team);
		
	}
	
	/**
	 * update and delete operations 
	 * 
	 * @param project
	 * @param projectId
	 * @return
	 */
	//update project
	@PutMapping("/project/{projectId}")
	public Project updateProject(@RequestBody Project project, @PathVariable String projectId)
	{
		return this.projectService.updateProject(project, projectId);
	}
	
	//delete project
	@DeleteMapping("/project/{projectId}")
	public ResponseEntity<HttpStatus> deleteProject(@PathVariable String projectId)
	{
		try
		{
			this.projectService.deleteProject(Long.parseLong(projectId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
