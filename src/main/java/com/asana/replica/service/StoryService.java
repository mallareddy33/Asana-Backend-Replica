package com.asana.replica.service;

import com.asana.replica.dto.StoryCreateRequest;
import com.asana.replica.dto.StoryDto;

import java.util.List;

public interface StoryService {

    List<StoryDto> listByTask(String taskGid);

    StoryDto createForTask(String taskGid, StoryCreateRequest request);

    List<StoryDto> listByProject(String projectGid);
}

