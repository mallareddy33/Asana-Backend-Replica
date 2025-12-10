package com.asana.replica.mapper;

import com.asana.replica.dto.TeamCreateRequest;
import com.asana.replica.dto.TeamDto;
import com.asana.replica.model.Team;
import com.asana.replica.model.Workspace;

import java.time.OffsetDateTime;
import java.util.UUID;

public class TeamMapper {

    private static final String RESOURCE_TYPE = "team";

    public static TeamDto toDto(Team team) {
        return new TeamDto(
                team.getId(),
                RESOURCE_TYPE,
                team.getName(),
                team.getDescription(),
                team.getWorkspace() != null ? team.getWorkspace().getId() : null,
                team.getCreatedAt(),
                team.getUpdatedAt()
        );
    }

    public static Team fromCreateRequest(TeamCreateRequest req, Workspace workspace) {
        OffsetDateTime now = OffsetDateTime.now();
        return Team.builder()
                .id(generateGid())
                .name(req.name())
                .description(req.description())
                .workspace(workspace)
                .createdAt(now)
                .updatedAt(now)
                .build();
    }

    private static String generateGid() {
        return UUID.randomUUID().toString();
    }
}

