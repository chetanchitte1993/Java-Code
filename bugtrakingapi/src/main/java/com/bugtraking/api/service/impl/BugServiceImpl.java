package com.bugtraking.api.service.impl;

import java.util.List;

import com.bugtraking.api.dao.BugDao;
import com.bugtraking.api.entity.Bug;
import com.bugtraking.api.services.BugService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BugServiceImpl implements BugService{

	@Autowired
	private BugDao bugDao;
	
	//add bug
	@Override
	public Bug addBug(Bug bug) {

		System.out.println("before save");
		bugDao.save(bug);
		System.out.println("after save");
		return bug;
	}

	//list bug
	@Override
	public List<Bug> getBag() {
		return bugDao.findAll();
	}

	//update bug
	@Override
	public Bug updateBug(Bug bug, String bugId) {
		bugDao.save(bug);
		return bug;
	}

	//delete bug
	@Override
	public Bug deleteBug(long parseLong) {
		Bug entity = bugDao.getOne(parseLong);
		bugDao.delete(entity);
		return null;
	}

	
	
}
