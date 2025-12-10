package com.asana.replica.dto;

public record TagRef(
        String gid,
        String resource_type,
        String name
) {}