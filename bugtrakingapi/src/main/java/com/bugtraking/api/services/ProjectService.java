package com.bugtraking.api.services;

import java.util.List;

import com.bugtraking.api.entity.Project;

public interface ProjectService {

	List<Project> getProject();
	
	Project addProject(Project project);
	
	void save(Project project);

	Project getProjectById(Long pid);
	
	Project updateProject(Project project, String projectId);
	
	Project deleteProject(long parseLong);
	
	
	
}
