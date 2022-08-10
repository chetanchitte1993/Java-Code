package com.bugtraking.api.service.impl;

import java.util.List;

import com.bugtraking.api.dao.UserDao;
import com.bugtraking.api.dao.UserRoleDao;
import com.bugtraking.api.entity.User;
import com.bugtraking.api.entity.UserRole;
import com.bugtraking.api.services.UserRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	private UserRoleDao userRoleDao;
	
	
	@Override
	public List<UserRole> getUserRole() {
		
		return userRoleDao.findAll();
	}


	@Override
	public UserRole getUserRole(long userRoleId) {
		
		return userRoleDao.getOne(userRoleId);
	}


	@Override
	public UserRole saveEntity(UserRole userRole) {

		return userRoleDao.save(userRole);
		
	}


}
