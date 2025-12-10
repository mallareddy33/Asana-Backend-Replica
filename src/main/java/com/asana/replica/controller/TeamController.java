package com.asana.replica.controller;

import com.asana.replica.api.DataListResponse;
import com.asana.replica.api.DataResponse;
import com.asana.replica.dto.TeamCreateRequest;
import com.asana.replica.dto.TeamDto;
import com.asana.replica.service.TeamService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @GetMapping
    public DataListResponse<TeamDto> listTeams(
            @RequestParam(name = "workspace", required = false) String workspaceGid
    ) {
        List<TeamDto> teams = teamService.listTeams(workspaceGid);
        return new DataListResponse<>(teams);
    }

    @GetMapping("/{team_gid}")
    public DataResponse<TeamDto> getTeam(@PathVariable("team_gid") String teamGid) {
        TeamDto team = teamService.getByGid(teamGid);
        return new DataResponse<>(team);
    }

    @PostMapping
    public ResponseEntity<DataResponse<TeamDto>> createTeam(
            @Valid @RequestBody TeamCreateRequest request
    ) {
        TeamDto created = teamService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new DataResponse<>(created));
    }
}
