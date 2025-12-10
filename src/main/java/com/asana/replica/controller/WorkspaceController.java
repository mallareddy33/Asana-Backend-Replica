package com.asana.replica.controller;

import com.asana.replica.api.DataListResponse;
import com.asana.replica.api.DataResponse;
import com.asana.replica.dto.WorkspaceCreateRequest;
import com.asana.replica.dto.WorkspaceDto;
import com.asana.replica.service.WorkspaceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workspaces")
@RequiredArgsConstructor
public class WorkspaceController {

    private final WorkspaceService workspaceService;

    @GetMapping
    public DataListResponse<WorkspaceDto> listWorkspaces() {
        List<WorkspaceDto> workspaces = workspaceService.listAll();
        return new DataListResponse<>(workspaces);
    }

    @GetMapping("/{workspace_gid}")
    public DataResponse<WorkspaceDto> getWorkspace(@PathVariable("workspace_gid") String workspaceGid) {
        WorkspaceDto ws = workspaceService.getByGid(workspaceGid);
        return new DataResponse<>(ws);
    }

    @PostMapping
    public ResponseEntity<DataResponse<WorkspaceDto>> createWorkspace(
            @Valid @RequestBody WorkspaceCreateRequest request
    ) {
        WorkspaceDto created = workspaceService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new DataResponse<>(created));
    }
}
