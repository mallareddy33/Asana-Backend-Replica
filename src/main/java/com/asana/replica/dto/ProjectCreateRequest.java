package com.asana.replica.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ProjectCreateRequest(
        @NotBlank String name,
        String notes,
        String color,
        LocalDate start_on,
        LocalDate due_on,
        String current_status,
        @NotNull String workspace_gid,
        String team_gid
) {}
