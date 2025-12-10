package com.asana.replica.mapper;

import com.asana.replica.dto.StoryCreateRequest;
import com.asana.replica.dto.StoryDto;
import com.asana.replica.dto.UserRef;
import com.asana.replica.model.Project;
import com.asana.replica.model.Story;
import com.asana.replica.model.Task;
import com.asana.replica.model.User;

import java.time.OffsetDateTime;
import java.util.UUID;

public class StoryMapper {

    private static final String RESOURCE_TYPE = "story";

    public static StoryDto toDto(Story s) {
        User author = s.getAuthor();
        UserRef authorRef = author != null
                ? new UserRef(author.getId(), "user", author.getName())
                : null;

        return new StoryDto(
                s.getId(),
                RESOURCE_TYPE,
                s.getType(),
                s.getText(),
                s.getTask() != null ? s.getTask().getId() : null,
                s.getProject() != null ? s.getProject().getId() : null,
                authorRef,
                s.getCreatedAt(),
                s.getUpdatedAt()
        );
    }

    public static Story fromTaskRequest(StoryCreateRequest req, Task task, User author) {
        OffsetDateTime now = OffsetDateTime.now();
        return Story.builder()
                .id(generateGid())
                .type(req.type() != null ? req.type() : "comment")
                .text(req.text())
                .task(task)
                .project(null)
                .author(author)
                .createdAt(now)
                .updatedAt(now)
                .build();
    }

    public static Story fromProjectRequest(StoryCreateRequest req, Project project, User author) {
        OffsetDateTime now = OffsetDateTime.now();
        return Story.builder()
                .id(generateGid())
                .type(req.type() != null ? req.type() : "comment")
                .text(req.text())
                .task(null)
                .project(project)
                .author(author)
                .createdAt(now)
                .updatedAt(now)
                .build();
    }

    private static String generateGid() {
        return UUID.randomUUID().toString();
    }
}

