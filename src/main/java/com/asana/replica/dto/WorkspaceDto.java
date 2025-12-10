package com.asana.replica.dto;

import java.time.OffsetDateTime;

public record WorkspaceDto(
        String gid,
        String resource_type,
        String name,
        Boolean is_organization,
        OffsetDateTime created_at,
        OffsetDateTime updated_at
) {}
