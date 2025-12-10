package com.asana.replica.dto;

public record UserRef(
        String gid,
        String resource_type,
        String name
) {}

