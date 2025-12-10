package com.asana.replica.dto;

import jakarta.validation.constraints.NotBlank;

public record WorkspaceCreateRequest(
        @NotBlank String name,
        Boolean is_organization
) {}
