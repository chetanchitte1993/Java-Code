package com.bugtraking.api.services;

import java.util.List;

import com.bugtraking.api.entity.Bug;

public interface BugService {

	Bug addBug(Bug bug);
	
	List<Bug> getBag();
	
	Bug updateBug(Bug bug, String bugId);
	
	Bug deleteBug(long parseLong);
	
	
	
	
}
