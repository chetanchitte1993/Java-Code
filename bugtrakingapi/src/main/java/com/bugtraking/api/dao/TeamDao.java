package com.bugtraking.api.dao;

import java.util.List;

import com.bugtraking.api.entity.Team;
import com.bugtraking.api.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TeamDao extends JpaRepository<Team, Long>{
	
	

}
