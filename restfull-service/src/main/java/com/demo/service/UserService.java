package com.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.demo.entity.User;
import com.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	private static List<User> users = new ArrayList<>();
	private static int usersCount =5;
	
	static {
		users.add(new User(1, "Chetan", new Date()));
		users.add(new User(2, "Krishna", new Date()));
		users.add(new User(3, "Shubham", new Date()));
		users.add(new User(4, "Vishnu", new Date()));
		users.add(new User(5, "Vishal", new Date()));
	}
	
	public List<User> findAll(){

		return userRepository.findAll();
	}
	
	public User save(User user)
	{
		return userRepository.save(user);
	}
	
	public User findOne(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id)
	{
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext())
		{
			User user = iterator.next();
			if(user.getId()==id)
			{
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
