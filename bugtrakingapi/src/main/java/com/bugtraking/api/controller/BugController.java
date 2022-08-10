package com.bugtraking.api.controller;

import java.util.List;

import com.bugtraking.api.dto.BugDTO;
import com.bugtraking.api.entity.Bug;
import com.bugtraking.api.services.BugService;
import com.bugtraking.api.services.ProjectService;
import com.bugtraking.api.services.TeamService;
import com.bugtraking.api.services.UserService;
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
public class BugController {

	@Autowired
	private BugService bugService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TeamService teamService;
	
	//***************** Home page ***************//
	
	@GetMapping("/bugHome")
	public String home()
	{
		return "This is a Bug Home page";
	}
	
	//***************** list bug ***********************//
	
	@GetMapping("/bug")
	public List<Bug> getBug()
	{
		return this.bugService.getBag();
	}
	
	//****************************** create ***********************//
	
	@PostMapping("/bug/users")
	public ResponseEntity<BugDTO> addBug(@RequestBody BugDTO bugDTO)
	{
		try
		{
			Bug bug = new Bug();
			bug.setId(bugDTO.getId());
			bug.setBug_desc(bugDTO.getBug_desc());
			bug.setDevloperId(bugDTO.getDevloperId());
			bug.setProjectId(bugDTO.getProjectId());
			bug.setTesterId(bugDTO.getTesterId());
			bug.setStatus(bugDTO.getStatus());
			System.out.println("Print Here....!!");
			bugService.addBug(bug);
			return new ResponseEntity<BugDTO>(bugDTO, HttpStatus.CREATED);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//********************************** update ***********************//
	
	@PutMapping("/bug/{bugId}")
	public Bug updateBug(@RequestBody Bug bug, @PathVariable String bugId)
	{
		return this.bugService.updateBug(bug, bugId);
	}
	
	//********************************** deleted **************************//
	
	@DeleteMapping("/bug/{bugId}")
	public ResponseEntity<HttpStatus> deleteBug(@PathVariable String bugId)
	{
		try
		{
			this.bugService.deleteBug(Long.parseLong(bugId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
