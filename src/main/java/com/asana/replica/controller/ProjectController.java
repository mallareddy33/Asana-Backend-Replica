package com.asana.replica.controller;

import com.asana.replica.api.DataListResponse;
import com.asana.replica.api.DataResponse;
import com.asana.replica.dto.ProjectCreateRequest;
import com.asana.replica.dto.ProjectDto;
import com.asana.replica.service.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    // GET /projects?workspace=...&team=...
    @GetMapping("/projects")
    public DataListResponse<ProjectDto> listProjects(
            @RequestParam(name = "workspace", required = false) String workspaceGid,
            @RequestParam(name = "team", required = false) String teamGid
    ) {
        List<ProjectDto> projects = projectService.listProjects(workspaceGid, teamGid);
        return new DataListResponse<>(projects);
    }

    // GET /projects/{project_gid}
    @GetMapping("/projects/{project_gid}")
    public DataResponse<ProjectDto> getProject(@PathVariable("project_gid") String projectGid) {
        ProjectDto project = projectService.getByGid(projectGid);
        return new DataResponse<>(project);
    }

    // POST /projects
    @PostMapping("/projects")
    public ResponseEntity<DataResponse<ProjectDto>> createProject(
            @Valid @RequestBody ProjectCreateRequest request
    ) {
        ProjectDto created = projectService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new DataResponse<>(created));
    }

    // GET /workspaces/{workspace_gid}/projects
    @GetMapping("/workspaces/{workspace_gid}/projects")
    public DataListResponse<ProjectDto> listWorkspaceProjects(
            @PathVariable("workspace_gid") String workspaceGid
    ) {
        List<ProjectDto> projects = projectService.listByWorkspace(workspaceGid);
        return new DataListResponse<>(projects);
    }

    // GET /teams/{team_gid}/projects
    @GetMapping("/teams/{team_gid}/projects")
    public DataListResponse<ProjectDto> listTeamProjects(
            @PathVariable("team_gid") String teamGid
    ) {
        List<ProjectDto> projects = projectService.listByTeam(teamGid);
        return new DataListResponse<>(projects);
    }
}
