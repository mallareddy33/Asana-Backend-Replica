package com.asana.replica.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TagCreateRequest(
        @NotBlank String name,
        String color,
        @NotNull String workspace_gid
) {}

