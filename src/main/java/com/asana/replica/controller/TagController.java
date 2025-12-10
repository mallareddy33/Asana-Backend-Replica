package com.asana.replica.controller;

import com.asana.replica.api.DataListResponse;
import com.asana.replica.api.DataResponse;
import com.asana.replica.dto.TagCreateRequest;
import com.asana.replica.dto.TagDto;
import com.asana.replica.dto.TaskDto;
import com.asana.replica.service.TagService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
@RequiredArgsConstructor
public class TagController {

    private final TagService tagService;

    // GET /tags?workspace=...
    @GetMapping
    public DataListResponse<TagDto> listTags(
            @RequestParam(name = "workspace", required = false) String workspaceGid
    ) {
        List<TagDto> tags = tagService.listTags(workspaceGid);
        return new DataListResponse<>(tags);
    }

    // GET /tags/{tag_gid}
    @GetMapping("/{tag_gid}")
    public DataResponse<TagDto> getTag(@PathVariable("tag_gid") String tagGid) {
        TagDto tag = tagService.getByGid(tagGid);
        return new DataResponse<>(tag);
    }

    // POST /tags
    @PostMapping
    public ResponseEntity<DataResponse<TagDto>> createTag(
            @Valid @RequestBody TagCreateRequest request
    ) {
        TagDto created = tagService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new DataResponse<>(created));
    }

    // GET /tags/{tag_gid}/tasks
    @GetMapping("/{tag_gid}/tasks")
    public DataListResponse<TaskDto> getTasksByTag(@PathVariable("tag_gid") String tagGid) {
        List<TaskDto> tasks = tagService.getTasksByTag(tagGid);
        return new DataListResponse<>(tasks);
    }
}

