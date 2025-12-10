package com.asana.replica.mapper;

import com.asana.replica.dto.WorkspaceCreateRequest;
import com.asana.replica.dto.WorkspaceDto;
import com.asana.replica.model.Workspace;

import java.time.OffsetDateTime;
import java.util.UUID;

public class WorkspaceMapper {

    private static final String RESOURCE_TYPE = "workspace";

    public static WorkspaceDto toDto(Workspace ws) {
        return new WorkspaceDto(
                ws.getId(),
                RESOURCE_TYPE,
                ws.getName(),
                ws.getIsOrganization(),
                ws.getCreatedAt(),
                ws.getUpdatedAt()
        );
    }

    public static Workspace fromCreateRequest(WorkspaceCreateRequest req) {
        OffsetDateTime now = OffsetDateTime.now();
        return Workspace.builder()
                .id(generateGid())
                .name(req.name())
                .isOrganization(req.is_organization())
                .createdAt(now)
                .updatedAt(now)
                .build();
    }

    private static String generateGid() {
        return UUID.randomUUID().toString();
    }
}
