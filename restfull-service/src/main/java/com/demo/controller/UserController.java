package com.demo.controller;

import java.net.URI;
import java.util.List;

import javax.tools.DocumentationTool.Location;
import javax.validation.Valid;

import com.demo.entity.User;
import com.demo.exception.UserNotFoundException;
import com.demo.service.UserService;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	// get users 
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userService.findAll();
	}
	
	//get users by id
		
	@GetMapping("/users/{id}")
	public EntityModel<User> getUser(@PathVariable int id)
	{
		User user = userService.findOne(id);
		
		if(user==null)	
			throw new UserNotFoundException("id-"+ id);
		
		EntityModel<User> model = EntityModel.of(user);
		WebMvcLinkBuilder linkToUsers= linkTo(methodOn(this.getClass()).getAllUsers());
		model.add(linkToUsers.withRel("all-users"));
		return model;	
	}
	
	//create a new user
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user)
	{
		  userService.save(user);
		  URI location = ServletUriComponentsBuilder
				  .fromCurrentRequest()
				  .path("/{id}")
				  .buildAndExpand(user.getId()).toUri();
				  		
		  return ResponseEntity.created(location).build();  
	}
	
	//delete user
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id)
	{
		User user= userService.deleteById(id);
		if(user==null)
			throw new UserNotFoundException("id-" +id);
	}
	
	
}
