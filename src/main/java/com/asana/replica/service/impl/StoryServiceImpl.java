package com.asana.replica.service.impl;

import com.asana.replica.dto.StoryCreateRequest;
import com.asana.replica.dto.StoryDto;
import com.asana.replica.exception.NotFoundException;
import com.asana.replica.mapper.StoryMapper;
import com.asana.replica.model.Project;
import com.asana.replica.model.Story;
import com.asana.replica.model.Task;
import com.asana.replica.model.User;
import com.asana.replica.repository.ProjectRepository;
import com.asana.replica.repository.StoryRepository;
import com.asana.replica.repository.TaskRepository;
import com.asana.replica.repository.UserRepository;
import com.asana.replica.service.StoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoryServiceImpl implements StoryService {

    private final StoryRepository storyRepository;
    private final TaskRepository taskRepository;
    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<StoryDto> listByTask(String taskGid) {
        List<Story> stories = storyRepository.findByTask_Id(taskGid);
        return stories.stream()
                .map(StoryMapper::toDto)
                .toList();
    }

    @Override
    @Transactional
    public StoryDto createForTask(String taskGid, StoryCreateRequest request) {
        Task task = taskRepository.findById(taskGid)
                .orElseThrow(() -> new NotFoundException("Task not found: " + taskGid));

        User author = null;
        if (request.author_gid() != null) {
            author = userRepository.findById(request.author_gid())
                    .orElseThrow(() -> new NotFoundException("Author not found: " + request.author_gid()));
        }

        Story story = StoryMapper.fromTaskRequest(request, task, author);
        Story saved = storyRepository.save(story);
        return StoryMapper.toDto(saved);
    }

    @Override
    @Transactional(readOnly = true)
    public List<StoryDto> listByProject(String projectGid) {
        List<Story> stories = storyRepository.findByProject_Id(projectGid);
        return stories.stream()
                .map(StoryMapper::toDto)
                .toList();
    }
}

