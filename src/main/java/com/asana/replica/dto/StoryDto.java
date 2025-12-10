package com.asana.replica.dto;

import java.time.OffsetDateTime;

public record StoryDto(
        String gid,
        String resource_type,
        String type,
        String text,
        String task_gid,
        String project_gid,
        UserRef author,
        OffsetDateTime created_at,
        OffsetDateTime updated_at
) {}

