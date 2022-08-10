package com.bugtraking.api.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.bugtraking.api.entity.Team;

public class UserDTO {

	private long id;
	
	@NotNull
	private String firstname;
	
	@NotNull
	private String lastname;
	
	@Email
	private String username;
	
	@NotNull
	private String password;
	
	
	private UserRoleDTO userRoleDTO;
	
	private List<Team> team = new ArrayList<Team>();
	

	public List<Team> getTeam() {
		return team;
	}

	public void setTeam(List<Team> team) {
		this.team = team;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRoleDTO getUserRoleDTO() {
		return userRoleDTO;
	}

	public void setUserRoleDTO(UserRoleDTO userRoleDTO) {
		this.userRoleDTO = userRoleDTO;
	}

	public UserDTO(long id, String firstname, String lastname, String username, String password,
			UserRoleDTO userRoleDTO, List<Team> team) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.userRoleDTO = userRoleDTO;
		this.team = team;
	}

	public UserDTO() {
		super();
		//TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + ", userRoleDTO=" + userRoleDTO + ", team=" + team + "]";
	}
	
	

}
