package com.bugtraking.api.services;

import java.util.List;

import com.bugtraking.api.dto.TeamDTO;
import com.bugtraking.api.entity.Project;
import com.bugtraking.api.entity.Team;

public interface TeamService {


	List<Team> getTeam();

	Team addTeam(Team team);

	Team updateTeam(Team team, String teamId);

	void deleteTeam(long parseLong);

	Team getTeamById(Long tid);

	void save(Team team);

	Team getTeamById();


	

	
}
