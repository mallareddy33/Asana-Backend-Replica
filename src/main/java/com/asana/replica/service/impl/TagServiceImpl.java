package com.asana.replica.service.impl;

import com.asana.replica.dto.TagCreateRequest;
import com.asana.replica.dto.TagDto;
import com.asana.replica.dto.TaskDto;
import com.asana.replica.exception.NotFoundException;
import com.asana.replica.mapper.TagMapper;
import com.asana.replica.mapper.TaskMapper;
import com.asana.replica.model.Tag;
import com.asana.replica.model.Task;
import com.asana.replica.model.Workspace;
import com.asana.replica.repository.TagRepository;
import com.asana.replica.repository.TaskRepository;
import com.asana.replica.repository.WorkspaceRepository;
import com.asana.replica.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;
    private final WorkspaceRepository workspaceRepository;
    private final TaskRepository taskRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TagDto> listTags(String workspaceGid) {
        List<Tag> tags;
        if (workspaceGid != null) {
            tags = tagRepository.findByWorkspace_Id(workspaceGid);
        } else {
            tags = tagRepository.findAll();
        }
        return tags.stream()
                .map(TagMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public TagDto getByGid(String tagGid) {
        Tag tag = tagRepository.findById(tagGid)
                .orElseThrow(() -> new NotFoundException("Tag not found: " + tagGid));
        return TagMapper.toDto(tag);
    }

    @Override
    @Transactional
    public TagDto create(TagCreateRequest request) {
        Workspace workspace = workspaceRepository.findById(request.workspace_gid())
                .orElseThrow(() -> new NotFoundException("Workspace not found: " + request.workspace_gid()));

        Tag tag = TagMapper.fromCreateRequest(request, workspace);
        Tag saved = tagRepository.save(tag);
        return TagMapper.toDto(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TaskDto> getTasksByTag(String tagGid) {
        // ensure tag exists
        tagRepository.findById(tagGid)
                .orElseThrow(() -> new NotFoundException("Tag not found: " + tagGid));

        List<Task> tasks = taskRepository.findByTags_Id(tagGid);
        return tasks.stream()
                .map(TaskMapper::toDto)
                .toList();
    }
}

