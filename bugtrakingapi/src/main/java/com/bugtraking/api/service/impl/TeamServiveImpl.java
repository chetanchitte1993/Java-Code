package com.bugtraking.api.service.impl;

import java.util.List;

import com.bugtraking.api.dao.TeamDao;
import com.bugtraking.api.dto.TeamDTO;
import com.bugtraking.api.entity.Team;
import com.bugtraking.api.services.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiveImpl implements TeamService {

	@Autowired
	private TeamDao teamDao;
	
	//list team
	
	@Override
	public List<Team> getTeam() {
		
		return teamDao.findAll();
	}

	// create team
	
	@Override
	public Team addTeam(Team team) {

		System.out.println("befor save");
		teamDao.save(team);
		System.out.println("after save");
		return team;
	}

	//update team
	
	@Override
	public Team updateTeam(Team team, String teamId) {
		teamDao.save(team);
		return team;
	}

	//delete team
	
	@Override
	public void deleteTeam(long parseLong) {

		Team entity = teamDao.getOne(parseLong);
		teamDao.delete(entity);
		
	}

	@Override
	public Team getTeamById(Long tid) {

		return teamDao.findById(tid).get();
	}

	@Override
	public void save(Team team) {
		
		 teamDao.save(team);
		
	}

	@Override
	public Team getTeamById() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
