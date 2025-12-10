package com.asana.replica.dto;

import java.time.LocalDate;

public record TaskUpdateRequest(
        String name,
        String notes,
        Boolean completed,
        LocalDate due_on,
        String priority,
        String assignee_gid
) {}



