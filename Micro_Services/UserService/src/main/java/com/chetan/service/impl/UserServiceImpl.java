package com.chetan.service.impl;

import java.util.List;

import com.chetan.entity.User;
import com.chetan.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService{

	// fake user list
	List<User> list = List.of(
			new User(1311L, "ChetanChitte","1234567890"),
			new User(1231L,"RajeshKumar","1231231231"),
			new User(1122L, "RohitBhamre","555555555"));
	
	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
