package com.asana.replica.controller;

import com.asana.replica.api.DataListResponse;
import com.asana.replica.api.DataResponse;
import com.asana.replica.dto.TaskCreateRequest;
import com.asana.replica.dto.TaskDto;
import com.asana.replica.dto.TaskUpdateRequest;
import com.asana.replica.service.TaskService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    // POST /tasks
    @PostMapping("/tasks")
    public ResponseEntity<DataResponse<TaskDto>> createTask(
            @Valid @RequestBody TaskCreateRequest request
    ) {
        TaskDto created = taskService.createTask(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new DataResponse<>(created));
    }

    // GET /tasks/{task_gid}
    @GetMapping("/tasks/{task_gid}")
    public DataResponse<TaskDto> getTask(@PathVariable("task_gid") String taskGid) {
        TaskDto task = taskService.getTaskByGid(taskGid);
        return new DataResponse<>(task);
    }

    // PATCH /tasks/{task_gid}
    @PatchMapping("/tasks/{task_gid}")
    public DataResponse<TaskDto> updateTask(
            @PathVariable("task_gid") String taskGid,
            @Valid @RequestBody TaskUpdateRequest request
    ) {
        TaskDto updated = taskService.updateTask(taskGid, request);
        return new DataResponse<>(updated);
    }

    // GET /projects/{project_gid}/tasks
    @GetMapping("/projects/{project_gid}/tasks")
    public DataListResponse<TaskDto> getTasksByProject(
            @PathVariable("project_gid") String projectGid,
            @RequestParam(name = "limit", defaultValue = "50") int limit,
            @RequestParam(name = "offset", defaultValue = "0") int offset
    ) {
        List<TaskDto> tasks = taskService.getTasksByProjectGid(projectGid, limit, offset);
        return new DataListResponse<>(tasks);
    }

    // GET /sections/{section_gid}/tasks
    @GetMapping("/sections/{section_gid}/tasks")
    public DataListResponse<TaskDto> getTasksBySection(
            @PathVariable("section_gid") String sectionGid,
            @RequestParam(name = "limit", defaultValue = "50") int limit,
            @RequestParam(name = "offset", defaultValue = "0") int offset
    ) {
        List<TaskDto> tasks = taskService.getTasksBySectionGid(sectionGid, limit, offset);
        return new DataListResponse<>(tasks);
    }
}
