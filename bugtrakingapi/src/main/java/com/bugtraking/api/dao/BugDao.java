package com.bugtraking.api.dao;

import com.bugtraking.api.entity.Bug;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BugDao extends JpaRepository<Bug, Long> {

	
}
