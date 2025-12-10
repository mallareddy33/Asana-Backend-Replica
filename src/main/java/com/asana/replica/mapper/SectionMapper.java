package com.asana.replica.mapper;

import com.asana.replica.dto.SectionCreateRequest;
import com.asana.replica.dto.SectionDto;
import com.asana.replica.model.Project;
import com.asana.replica.model.Section;

import java.time.OffsetDateTime;
import java.util.UUID;

public class SectionMapper {

    private static final String RESOURCE_TYPE = "section";

    public static SectionDto toDto(Section s) {
        return new SectionDto(
                s.getId(),
                RESOURCE_TYPE,
                s.getName(),
                s.getPosition(),
                s.getProject() != null ? s.getProject().getId() : null,
                s.getCreatedAt(),
                s.getUpdatedAt()
        );
    }

    public static Section fromCreateRequest(SectionCreateRequest req, Project project) {
        OffsetDateTime now = OffsetDateTime.now();
        return Section.builder()
                .id(generateGid())
                .name(req.name())
                .project(project)
                .createdAt(now)
                .updatedAt(now)
                .build();
    }

    private static String generateGid() {
        return UUID.randomUUID().toString();
    }
}

