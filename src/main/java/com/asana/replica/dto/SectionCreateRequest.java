package com.asana.replica.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record SectionCreateRequest(
        @NotBlank String name,
        @NotNull String project_gid
) {}


