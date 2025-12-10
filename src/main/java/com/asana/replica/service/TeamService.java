package com.asana.replica.service;

import com.asana.replica.dto.TeamCreateRequest;
import com.asana.replica.dto.TeamDto;

import java.util.List;

public interface TeamService {

    List<TeamDto> listTeams(String workspaceGid);

    TeamDto getByGid(String teamGid);

    TeamDto create(TeamCreateRequest request);
}

