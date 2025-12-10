package com.asana.replica.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;

@Entity
@Table(name = "workspaces")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Workspace {

    @Id
    @Column(name = "id", nullable = false)
    private String id; // Asana-style gid

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "is_organization")
    private Boolean isOrganization;

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
}
