package com.bugtraking.api.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.bugtraking.api.entity.Project;
import com.bugtraking.api.entity.User;

public class TeamDTO {

	private long id;
	
	@NotNull
	private String teamname;
	
	private List<User> users = new ArrayList<User>();
	
	private List<Project> projects = new ArrayList<Project>();
	

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public TeamDTO(long id, @NotNull String teamname, List<User> users, List<Project> projects) {
		super();
		this.id = id;
		this.teamname = teamname;
		this.users = users;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "TeamDTO [id=" + id + ", teamname=" + teamname + ", users=" + users + ", projects=" + projects + "]";
	}

	
	
	
}
