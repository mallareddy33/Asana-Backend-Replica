package com.asana.replica.mapper;

import com.asana.replica.dto.TagCreateRequest;
import com.asana.replica.dto.TagDto;
import com.asana.replica.model.Tag;
import com.asana.replica.model.Workspace;

import java.time.OffsetDateTime;
import java.util.UUID;

public class TagMapper {

    private static final String RESOURCE_TYPE = "tag";

    public static TagDto toDto(Tag tag) {
        return new TagDto(
                tag.getId(),
                RESOURCE_TYPE,
                tag.getName(),
                tag.getColor(),
                tag.getWorkspace() != null ? tag.getWorkspace().getId() : null,
                tag.getCreatedAt(),
                tag.getUpdatedAt()
        );
    }

    public static Tag fromCreateRequest(TagCreateRequest req, Workspace workspace) {
        OffsetDateTime now = OffsetDateTime.now();
        return Tag.builder()
                .id(generateGid())
                .name(req.name())
                .color(req.color())
                .workspace(workspace)
                .createdAt(now)
                .updatedAt(now)
                .build();
    }

    private static String generateGid() {
        return UUID.randomUUID().toString();
    }
}

