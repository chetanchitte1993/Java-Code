package com.bugtraking.api.service.impl;

import java.util.List;

import com.bugtraking.api.dao.TeamDao;
import com.bugtraking.api.dao.UserDao;
import com.bugtraking.api.dto.UserDTO;
import com.bugtraking.api.entity.User;
import com.bugtraking.api.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao userDao;
	
	
	//list of users
	
	@Override
	public List<User> getUsers() {
		
		return userDao.findAll() ;
	}

	//get single user
	
	@Override
	public User getUser(Long userId) {
		
		return userDao.findById(userId).get();
	}

	//add new user
	
	@Override
	public User addUser(User user) {
		System.out.println("befor save");
		userDao.save(user);
		System.out.println("after save");
		
		return user;
	}

	//delete user
	@Override
	public void deleteUser(long parseLong) {

		User entity = userDao.getOne(parseLong);
		userDao.delete(entity);
	}

	//update user
	@Override
	public User updateUser(User user, String userId) {

		userDao.save(user);
	return user;
}

	@Override
	public User getUsersById(Long uid) {
		
		return userDao.getById(uid);
	}

	//save
	@Override
	public void save(User user) {

		userDao.save(user);
		
	}

	// team 
	@Override
	public User findAllByTeam(TeamDao teamDao) {
		
		return (User) userDao.findAll();
	}

	
	

//	@Override
//	public UserDTO getUserById(UserDTO userDTO) {
//		// TODO Auto-generated method stub
//		return null;
//	}



}
