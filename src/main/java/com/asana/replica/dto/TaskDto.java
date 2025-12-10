package com.asana.replica.dto;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

public record TaskDto(
        String gid,
        String resource_type,
        String name,
        String notes,
        boolean completed,
        OffsetDateTime completed_at,
        LocalDate due_on,
        String priority,
        UserRef assignee,
        List<ProjectRef> projects,
        List<TagRef> tags,
        OffsetDateTime created_at,
        OffsetDateTime updated_at
) {}
