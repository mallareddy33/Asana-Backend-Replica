package com.asana.replica.service.impl;

import com.asana.replica.dto.ProjectCreateRequest;
import com.asana.replica.dto.ProjectDto;
import com.asana.replica.exception.NotFoundException;
import com.asana.replica.mapper.ProjectMapper;
import com.asana.replica.model.Project;
import com.asana.replica.model.Team;
import com.asana.replica.model.Workspace;
import com.asana.replica.repository.ProjectRepository;
import com.asana.replica.repository.TeamRepository;
import com.asana.replica.repository.WorkspaceRepository;
import com.asana.replica.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final WorkspaceRepository workspaceRepository;
    private final TeamRepository teamRepository; // create minimal TeamRepository or remove if not needed

    @Override
    @Transactional(readOnly = true)
    public List<ProjectDto> listProjects(String workspaceGid, String teamGid) {
        List<Project> projects;

        if (workspaceGid != null) {
            projects = projectRepository.findByWorkspace_Id(workspaceGid);
        } else if (teamGid != null) {
            projects = projectRepository.findByTeam_Id(teamGid);
        } else {
            projects = projectRepository.findAll();
        }

        return projects.stream()
                .map(ProjectMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public ProjectDto getByGid(String projectGid) {
        Project proj = projectRepository.findById(projectGid)
                .orElseThrow(() -> new NotFoundException("Project not found: " + projectGid));
        return ProjectMapper.toDto(proj);
    }

    @Override
    @Transactional
    public ProjectDto create(ProjectCreateRequest request) {
        Workspace ws = workspaceRepository.findById(request.workspace_gid())
                .orElseThrow(() -> new NotFoundException("Workspace not found: " + request.workspace_gid()));

        Team team = null;
        if (request.team_gid() != null) {
            team = teamRepository.findById(request.team_gid())
                    .orElseThrow(() -> new NotFoundException("Team not found: " + request.team_gid()));
        }

        Project project = ProjectMapper.fromCreateRequest(request, ws, team);
        Project saved = projectRepository.save(project);
        return ProjectMapper.toDto(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProjectDto> listByWorkspace(String workspaceGid) {
        List<Project> projects = projectRepository.findByWorkspace_Id(workspaceGid);
        return projects.stream().map(ProjectMapper::toDto).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProjectDto> listByTeam(String teamGid) {
        List<Project> projects = projectRepository.findByTeam_Id(teamGid);
        return projects.stream().map(ProjectMapper::toDto).toList();
    }
}

