package com.asana.replica.service;

import com.asana.replica.dto.ProjectCreateRequest;
import com.asana.replica.dto.ProjectDto;

import java.util.List;

public interface ProjectService {

    List<ProjectDto> listProjects(String workspaceGid, String teamGid);

    ProjectDto getByGid(String projectGid);

    ProjectDto create(ProjectCreateRequest request);

    List<ProjectDto> listByWorkspace(String workspaceGid);

    List<ProjectDto> listByTeam(String teamGid);
}

