package com.bugtraking.api.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;
import javax.validation.Valid;

import com.bugtraking.api.dao.TeamDao;
import com.bugtraking.api.dao.UserDao;
import com.bugtraking.api.dto.TeamDTO;
import com.bugtraking.api.dto.UserDTO;
import com.bugtraking.api.entity.Team;
import com.bugtraking.api.entity.User;

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
public class TeamController {

	@Autowired
	private TeamService teamService;

	@Autowired
	private UserService userService;

	/**
	 * 
	 * Create or get list of team
	 * @return
	 */
	// team home page

	@GetMapping("/teams")
	public String home() {
		return "This is team home page";
	}

	// list of team

	@GetMapping("/team")
	public List<Team> getTeam() {
		return this.teamService.getTeam();
	}

	// create team

	@PostMapping("/teams")
	public ResponseEntity<TeamDTO> addTeam(@RequestBody @Valid TeamDTO teamDTO, UserDTO userDTO) {
		try {
			Team team = new Team();

			team.setId(teamDTO.getId());
			team.setTeamname(teamDTO.getTeamname());
			/*
			 * team.getUsers().addAll(teamDTO.getUsers()); // ********add user on team
			 * *********
			 * 
			 * 
			 * User user = new User();
			 * 
			 * user.setId(teamDTO.getUsers().get(0).getId());
			 * team.setUsers(Collections.singletonList(user));
			 */
			 
			System.out.println("print here!!");
			teamService.addTeam(team);

			// return ResponseEntity.of(Optional.of(teamDTO));
			return new ResponseEntity<TeamDTO>(teamDTO, HttpStatus.CREATED);

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	/**
	 * add team and user
	 * 
	 * @param tid
	 * @param uid
	 */
	  @PostMapping("/addUser/{tid}/{uid}")
	  public void addUser(@PathVariable("tid")Long tid,@PathVariable("uid")Long uid)
	  { 
		  Team team=teamService.getTeamById(tid);
		  User user = userService.getUsersById(uid);
	  
		  team.getUsers().add(user);
		  user.getTeam().add(team);
	  
		  teamService.save(team);
		  userService.save(user);
		  
		// return new ResponseEntity<User>(user, HttpStatus.OK);
	  }
	  
	 
/**
 * update team and delete
 * @param team
 * @param teamId
 * @return
 */
	// update team by id

	@PutMapping("/teams/{teamId}")
	public Team updateTeam(@RequestBody Team team, @PathVariable String teamId) {
		return this.teamService.updateTeam(team, teamId);
	}

	// delete team by id

	@DeleteMapping("/teams/{teamId}")
	public ResponseEntity<HttpStatus> deleteTeam(@PathVariable String teamId) {
		try {
			this.teamService.deleteTeam(Long.parseLong(teamId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
