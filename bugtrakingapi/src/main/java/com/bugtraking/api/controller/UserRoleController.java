package com.bugtraking.api.controller;

import java.util.List;

import com.bugtraking.api.dao.UserRoleDao;
import com.bugtraking.api.entity.UserRole;
import com.bugtraking.api.services.UserRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRoleController {

	@Autowired
	private UserRoleService userRoleService;
	
	
	@GetMapping("/Role")
	public String home()
	{
		return "This is my UserRole Controller";
	}
	
	@GetMapping("/userRole")
	public List<UserRole> getUserRoles()
	{
		return this.userRoleService.getUserRole();
	}
	
	@PostMapping("/userRole")
	public ResponseEntity<String> saveEntity(@RequestBody UserRole userRole)
	{
		
		userRoleService.saveEntity(userRole);
		return new ResponseEntity<String>("UserRole save Sucessfull", HttpStatus.CREATED);
		
	}
}
