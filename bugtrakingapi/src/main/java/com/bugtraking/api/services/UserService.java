package com.bugtraking.api.services;

import java.util.List;
import java.util.Set;

import com.bugtraking.api.dao.TeamDao;
import com.bugtraking.api.dto.UserDTO;
import com.bugtraking.api.entity.Team;
import com.bugtraking.api.entity.User;

public interface UserService {
	
	public List<User> getUsers();
	
	public User getUser(Long userId);

	public User addUser(User user);

	public void deleteUser(long parseLong);

	public User updateUser(User user, String userId);

	public void save(User user);

	public User findAllByTeam(TeamDao teamDao);

	public User getUsersById(Long uid);


	
	}

