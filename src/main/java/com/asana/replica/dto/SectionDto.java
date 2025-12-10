package com.asana.replica.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public record SectionDto(
        String gid,
        String resource_type,
        String name,
        BigDecimal position,
        String project_gid,
        OffsetDateTime created_at,
        OffsetDateTime updated_at
) {}

