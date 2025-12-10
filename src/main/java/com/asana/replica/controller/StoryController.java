package com.asana.replica.controller;

import com.asana.replica.api.DataListResponse;
import com.asana.replica.api.DataResponse;
import com.asana.replica.dto.StoryCreateRequest;
import com.asana.replica.dto.StoryDto;
import com.asana.replica.service.StoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StoryController {

    private final StoryService storyService;

    // GET /tasks/{task_gid}/stories
    @GetMapping("/tasks/{task_gid}/stories")
    public DataListResponse<StoryDto> listTaskStories(
            @PathVariable("task_gid") String taskGid
    ) {
        List<StoryDto> stories = storyService.listByTask(taskGid);
        return new DataListResponse<>(stories);
    }

    // POST /tasks/{task_gid}/stories
    @PostMapping("/tasks/{task_gid}/stories")
    public ResponseEntity<DataResponse<StoryDto>> createTaskStory(
            @PathVariable("task_gid") String taskGid,
            @Valid @RequestBody StoryCreateRequest request
    ) {
        StoryDto created = storyService.createForTask(taskGid, request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new DataResponse<>(created));
    }

    // (Optional) GET /projects/{project_gid}/stories
    @GetMapping("/projects/{project_gid}/stories")
    public DataListResponse<StoryDto> listProjectStories(
            @PathVariable("project_gid") String projectGid
    ) {
        List<StoryDto> stories = storyService.listByProject(projectGid);
        return new DataListResponse<>(stories);
    }
}
