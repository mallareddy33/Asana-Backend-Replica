package com.asana.replica.dto;

import java.time.OffsetDateTime;

public record UserDto(
        String gid,
        String resource_type,
        String name,
        String email,
        String photo_url,
        Boolean is_active,
        String workspace_gid,
        OffsetDateTime created_at,
        OffsetDateTime updated_at
) {}
