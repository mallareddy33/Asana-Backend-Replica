package com.asana.replica.dto;

import java.time.OffsetDateTime;

public record TeamDto(
        String gid,
        String resource_type,
        String name,
        String description,
        String workspace_gid,
        OffsetDateTime created_at,
        OffsetDateTime updated_at
) {}

