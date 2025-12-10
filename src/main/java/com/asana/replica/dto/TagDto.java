package com.asana.replica.dto;

import java.time.OffsetDateTime;

public record TagDto(
        String gid,
        String resource_type,
        String name,
        String color,
        String workspace_gid,
        OffsetDateTime created_at,
        OffsetDateTime updated_at
) {}

