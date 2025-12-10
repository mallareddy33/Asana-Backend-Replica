package com.asana.replica.service.impl;

import com.asana.replica.dto.TeamCreateRequest;
import com.asana.replica.dto.TeamDto;
import com.asana.replica.exception.NotFoundException;
import com.asana.replica.mapper.TeamMapper;
import com.asana.replica.model.Team;
import com.asana.replica.model.Workspace;
import com.asana.replica.repository.TeamRepository;
import com.asana.replica.repository.WorkspaceRepository;
import com.asana.replica.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final WorkspaceRepository workspaceRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TeamDto> listTeams(String workspaceGid) {
        List<Team> teams;
        if (workspaceGid != null) {
            teams = teamRepository.findAll().stream()
                    .filter(t -> t.getWorkspace() != null && workspaceGid.equals(t.getWorkspace().getId()))
                    .toList();
            // or add a findByWorkspace_Id(...) in TeamRepository if you want
        } else {
            teams = teamRepository.findAll();
        }

        return teams.stream()
                .map(TeamMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public TeamDto getByGid(String teamGid) {
        Team team = teamRepository.findById(teamGid)
                .orElseThrow(() -> new NotFoundException("Team not found: " + teamGid));
        return TeamMapper.toDto(team);
    }

    @Override
    @Transactional
    public TeamDto create(TeamCreateRequest request) {
        Workspace workspace = workspaceRepository.findById(request.workspace_gid())
                .orElseThrow(() -> new NotFoundException("Workspace not found: " + request.workspace_gid()));

        Team team = TeamMapper.fromCreateRequest(request, workspace);
        Team saved = teamRepository.save(team);
        return TeamMapper.toDto(saved);
    }
}