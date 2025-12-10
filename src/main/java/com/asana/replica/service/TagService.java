package com.asana.replica.service;

import com.asana.replica.dto.TagCreateRequest;
import com.asana.replica.dto.TagDto;
import com.asana.replica.dto.TaskDto;

import java.util.List;

public interface TagService {

    List<TagDto> listTags(String workspaceGid);

    TagDto getByGid(String tagGid);

    TagDto create(TagCreateRequest request);

    List<TaskDto> getTasksByTag(String tagGid);
}

