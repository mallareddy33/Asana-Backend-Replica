package com.asana.replica.service.impl;

import com.asana.replica.dto.TaskCreateRequest;
import com.asana.replica.dto.TaskDto;
import com.asana.replica.dto.TaskUpdateRequest;
import com.asana.replica.exception.NotFoundException;
import com.asana.replica.mapper.TaskMapper;
import com.asana.replica.model.*;
import com.asana.replica.repository.*;
import com.asana.replica.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final WorkspaceRepository workspaceRepository;
    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;
    private final TagRepository tagRepository;

    @Override
    @Transactional
    public TaskDto createTask(TaskCreateRequest request) {
        Workspace workspace = workspaceRepository.findById(request.workspace_gid())
                .orElseThrow(() -> new NotFoundException("Workspace not found: " + request.workspace_gid()));

        User assignee = null;
        if (request.assignee_gid() != null) {
            assignee = userRepository.findById(request.assignee_gid())
                    .orElseThrow(() -> new NotFoundException("Assignee not found: " + request.assignee_gid()));
        }

        OffsetDateTime now = OffsetDateTime.now();

        Task task = Task.builder()
                .id(generateGid())
                .name(request.name())
                .notes(request.notes())
                .completed(false)
                .dueOn(request.due_on())
                .priority(request.priority())
                .workspace(workspace)
                .assignee(assignee)
                .createdAt(now)
                .updatedAt(now)
                .build();

        // attach projects
        if (request.project_gids() != null) {
            for (String projectGid : request.project_gids()) {
                Project project = projectRepository.findById(projectGid)
                        .orElseThrow(() -> new NotFoundException("Project not found: " + projectGid));
                task.getProjects().add(project);
            }
        }

        // attach tags
        if (request.tag_gids() != null) {
            for (String tagGid : request.tag_gids()) {
                Tag tag = tagRepository.findById(tagGid)
                        .orElseThrow(() -> new NotFoundException("Tag not found: " + tagGid));
                task.getTags().add(tag);
            }
        }

        Task saved = taskRepository.save(task);
        return TaskMapper.toDto(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public TaskDto getTaskByGid(String taskGid) {
        Task task = taskRepository.findById(taskGid)
                .orElseThrow(() -> new NotFoundException("Task not found: " + taskGid));
        return TaskMapper.toDto(task);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TaskDto> getTasksBySectionGid(String sectionGid, int limit, int offset) {
        List<Task> tasks = taskRepository.findBySections_Id(sectionGid);
        return tasks.stream()
                .skip(offset)
                .limit(limit)
                .map(TaskMapper::toDto)
                .toList();
    }

    @Override
    @Transactional
    public TaskDto updateTask(String taskGid, TaskUpdateRequest request) {
        Task task = taskRepository.findById(taskGid)
                .orElseThrow(() -> new NotFoundException("Task not found: " + taskGid));

        User newAssignee = null;
        if (request.assignee_gid() != null) {
            newAssignee = userRepository.findById(request.assignee_gid())
                    .orElseThrow(() -> new NotFoundException("Assignee not found: " + request.assignee_gid()));
        }

        TaskMapper.applyUpdate(task, request, newAssignee);
        task.setUpdatedAt(OffsetDateTime.now());

        Task saved = taskRepository.save(task);
        return TaskMapper.toDto(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TaskDto> getTasksByProjectGid(String projectGid, int limit, int offset) {
        List<Task> tasks = taskRepository.findByProjects_Id(projectGid);
        return tasks.stream()
                .skip(offset)
                .limit(limit)
                .map(TaskMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<TaskDto> getTasksByTagGid(String tagGid, int limit, int offset) {
        List<Task> tasks = taskRepository.findByTags_Id(tagGid);
        return tasks.stream()
                .skip(offset)
                .limit(limit)
                .map(TaskMapper::toDto)
                .toList();
    }

    private String generateGid() {
        // simple gid generator; you can align this with Asana style if needed
        return UUID.randomUUID().toString();
    }
}
