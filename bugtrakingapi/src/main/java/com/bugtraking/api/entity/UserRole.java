package com.bugtraking.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String role;
	
	public UserRole(long id) {
		super();
		this.id = id;
	}

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

	public UserRole(long id, String role) {
		super();
		this.id = id;
		this.role = role;
	}

	public UserRole() {
		super();
		//TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserRole [id=" + id + ", role=" + role + "]";
	}
	
	
}
