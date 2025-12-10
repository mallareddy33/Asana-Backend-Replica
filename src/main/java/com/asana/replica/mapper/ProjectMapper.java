package com.asana.replica.mapper;

import com.asana.replica.dto.ProjectCreateRequest;
import com.asana.replica.dto.ProjectDto;
import com.asana.replica.model.Project;
import com.asana.replica.model.Team;
import com.asana.replica.model.Workspace;

import java.time.OffsetDateTime;
import java.util.UUID;

public class ProjectMapper {

    private static final String RESOURCE_TYPE = "project";

    public static ProjectDto toDto(Project p) {
        return new ProjectDto(
                p.getId(),
                RESOURCE_TYPE,
                p.getName(),
                p.getNotes(),
                p.getColor(),
                Boolean.TRUE.equals(p.getArchived()),
                p.getStartOn(),
                p.getDueOn(),
                p.getCurrentStatus(),
                p.getWorkspace() != null ? p.getWorkspace().getId() : null,
                p.getTeam() != null ? p.getTeam().getId() : null,
                p.getCreatedAt(),
                p.getUpdatedAt()
        );
    }

    public static Project fromCreateRequest(ProjectCreateRequest req, Workspace workspace, Team team) {
        OffsetDateTime now = OffsetDateTime.now();
        return Project.builder()
                .id(generateGid())
                .name(req.name())
                .notes(req.notes())
                .color(req.color())
                .archived(false)
                .startOn(req.start_on())
                .dueOn(req.due_on())
                .currentStatus(req.current_status())
                .workspace(workspace)
                .team(team)
                .createdAt(now)
                .updatedAt(now)
                .build();
    }

    private static String generateGid() {
        return UUID.randomUUID().toString();
    }
}

