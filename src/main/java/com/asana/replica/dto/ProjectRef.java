package com.asana.replica.dto;

public record ProjectRef(
        String gid,
        String resource_type,
        String name
) {}
