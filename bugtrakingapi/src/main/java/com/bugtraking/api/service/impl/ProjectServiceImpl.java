package com.bugtraking.api.service.impl;

import java.util.List;

import com.bugtraking.api.dao.ProjectDao;
import com.bugtraking.api.dao.TeamDao;
import com.bugtraking.api.entity.Project;
import com.bugtraking.api.services.ProjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDao projectDao;
	
	//private TeamDao teamDao;

	@Override
	public List<Project> getProject() {

		return projectDao.findAll();
		
	}
	
	//create project
	@Override
	public Project addProject(Project project) {

		System.out.println("before save");
		System.out.println("project name");
		projectDao.save(project);
		System.out.println("after project");
		return project;
	}

	@Override
	public void save(Project project) {
		
		projectDao.save(project);
		
	}

	@Override
	public Project getProjectById(Long pid) {
		
		return projectDao.findById(pid).get();
	}

	@Override
	public Project updateProject(Project project, String projectId) {
		projectDao.save(project);
		return project;
	}

	@Override
	public Project deleteProject(long parseLong) {
		Project entity = projectDao.getOne(parseLong);
		projectDao.delete(entity);
		return entity;
	}
	
	
	
	
	
}
