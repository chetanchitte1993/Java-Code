package com.bugtraking.api.controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.bugtraking.api.dao.UserDao;
import com.bugtraking.api.dto.UserDTO;

import com.bugtraking.api.entity.User;
import com.bugtraking.api.entity.UserRole;
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
public class MainController {

	@Autowired
	private UserService userService;
	/*
	 * @Autowired private UserDao userDao;
	 */
/**
 * get and post mapping
 * @return
 */
	//********************** home page *************************//
	
	@GetMapping("/home")
	public String home() {
		return "This my First Project BugTraking Rest API Service";
	}

	// **************** fetch the users *************************//
	
	@GetMapping("/users")
	public List<User> getUsers() {
		List<User> user = new ArrayList();

		try {
			user = userService.getUsers();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;

	}

	//************************* fetch single user id **************************//

	@GetMapping("users/{userId}")
	public User getUser(@PathVariable Long userId) {
		return this.userService.getUser(userId);
	}

	//************************ post the users **********************************//

	@PostMapping("/users")
	public ResponseEntity<UserDTO> addUser(@Valid @RequestBody UserDTO userDTO) {
		try {
			User user = new User();

			UserRole role = new UserRole();

			user.setFirstname(userDTO.getFirstname());

			user.setLastname(userDTO.getLastname());

			user.setUsername(userDTO.getUsername());

			user.setPassword(userDTO.getPassword());

			role.setId(userDTO.getUserRoleDTO().getId());

			role.setRole(userDTO.getUserRoleDTO().getRole());

			user.setRole(role);

			System.out.println("Print here!!");

			userService.addUser(user);
			return ResponseEntity.of(Optional.of(userDTO));

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	/**
	 * Update and Delete 
	 */
	//************************* update user using PUT request *****************************//

	@PutMapping("/users/{userId}")
	public User updateUser(@Valid @RequestBody User user, @PathVariable String userId) {
		return this.userService.updateUser(user, userId);
	}

	//****************************** delete user *****************************************//

	@DeleteMapping("/users/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId) {
		try {

			this.userService.deleteUser(Long.parseLong(userId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
