package com.bugtraking.api.dto;

import java.util.ArrayList;
import java.util.List;

import com.bugtraking.api.entity.Team;

public class ProjectDTO {

	private Long id;
	
	private String project_name;
	
	private String technology;
	
	private String status;
	
	private boolean isdeleted;

	private List<Team> team = new ArrayList<Team>();
	
	
	public List<Team> getTeam() {
		return team;
	}

	public void setTeam(List<Team> team) {
		this.team = team;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	public ProjectDTO(Long id, String project_name, String technology, String status, boolean isdeleted,
			List<Team> team) {
		super();
		this.id = id;
		this.project_name = project_name;
		this.technology = technology;
		this.status = status;
		this.isdeleted = isdeleted;
		this.team = team;
	}

	public ProjectDTO() {
		super();
		//TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProjectDTO [id=" + id + ", project_name=" + project_name + ", technology=" + technology + ", status="
				+ status + ", isdeleted=" + isdeleted + ", team=" + team + "]";
	}

	
	
}
