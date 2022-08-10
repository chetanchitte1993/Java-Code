package com.bugtraking.api.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String teamname;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
	private List<User> user;
	
	@ManyToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Project> projects;
	
	
	public List<Project> getProject() {
		return projects;
	}

	public void setProject(List<Project> project) {
		this.projects = project;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	public List<User> getUsers() {
		return user;
	}

	public void setUsers(List<User> users) {
		this.user = users;
	}

	public Team(Long id, String teamname, List<User> users, List<Project> project) {
		super();
		this.id = id;
		this.teamname = teamname;
		this.user = users;
		this.projects = project;
	}

	public Team() {
		super();
		//TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamname=" + teamname + ", users=" + user + ", project=" + projects + "]";
	}

	

	
	
}
