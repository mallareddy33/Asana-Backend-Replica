package com.asana.replica.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;

public record TaskCreateRequest(
        @NotBlank String name,
        String notes,
        @NotNull String workspace_gid,
        String assignee_gid,
        List<String> project_gids,
        List<String> tag_gids,
        LocalDate due_on,
        String priority
) {}
