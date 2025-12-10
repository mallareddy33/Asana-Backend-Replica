package com.asana.replica.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TeamCreateRequest(
        @NotBlank String name,
        String description,
        @NotNull String workspace_gid
) {}
