package com.asana.replica.service;

import com.asana.replica.dto.TaskCreateRequest;
import com.asana.replica.dto.TaskDto;
import com.asana.replica.dto.TaskUpdateRequest;

import java.util.List;

public interface TaskService {

    TaskDto createTask(TaskCreateRequest request);

    TaskDto getTaskByGid(String taskGid);

    TaskDto updateTask(String taskGid, TaskUpdateRequest request);

    List<TaskDto> getTasksByProjectGid(String projectGid, int limit, int offset);

    List<TaskDto> getTasksByTagGid(String tagGid, int limit, int offset);

    List<TaskDto> getTasksBySectionGid(String sectionGid, int limit, int offset);
}
