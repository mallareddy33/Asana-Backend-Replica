package com.asana.replica.dto;

import java.time.LocalDate;
import java.time.OffsetDateTime;

public record ProjectDto(
        String gid,
        String resource_type,
        String name,
        String notes,
        String color,
        boolean archived,
        LocalDate start_on,
        LocalDate due_on,
        String current_status,
        String workspace_gid,
        String team_gid,
        OffsetDateTime created_at,
        OffsetDateTime updated_at
) {}

