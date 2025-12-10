package com.asana.replica.dto;

import jakarta.validation.constraints.NotBlank;

public record StoryCreateRequest(
        @NotBlank String text,
        String type,          // optional, default to "comment" if null
        String author_gid     // optional; null can mean "system"
) {}

