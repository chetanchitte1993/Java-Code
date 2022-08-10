package com.bugtraking.api.services;

import java.util.List;

import com.bugtraking.api.dao.UserRoleDao;
import com.bugtraking.api.entity.UserRole;

public interface UserRoleService {

	List<UserRole> getUserRole();

	UserRole getUserRole(long UserRoleId);
	
	UserRole saveEntity(UserRole userRole);
	

	
}
