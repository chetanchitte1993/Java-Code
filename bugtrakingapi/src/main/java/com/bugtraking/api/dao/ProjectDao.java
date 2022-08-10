package com.bugtraking.api.dao;

import com.bugtraking.api.entity.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDao extends JpaRepository<Project, Long>
{

	
}
