package com.bugtraking.api.dto;

public class UserRoleDTO {

	private long id;
	
	private String role;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserRoleDTO(long id, String role) {
		super();
		this.id = id;
		this.role = role;
	}

	public UserRoleDTO() {
		super();
		//TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserRoleDTO [id=" + id + ", role=" + role + "]";
	}
	
	
	
}
