package com.chetan.controller;

import java.util.List;

import com.chetan.entity.User;
import com.chetan.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate; //---------its use to avoid boilerplate code (repeated code/method)
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId)
	{
		User user = this.userService.getUser(userId);
		
		//http://localhost:9001/contact/user/1311
		
		List contacts =  this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getUserId(),List.class);
		
		user.setContacts(contacts);
		return user;
	}
	
}
