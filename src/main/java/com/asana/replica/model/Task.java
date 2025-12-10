package com.asana.replica.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import com.asana.replica.model.Section;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id; // text PK, also exposed as gid

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "notes")
    private String notes;

    @Column(name = "completed", nullable = false)
    private boolean completed;

    @Column(name = "completed_at")
    private OffsetDateTime completedAt;

    @Column(name = "due_on")
    private LocalDate dueOn;

    @Column(name = "due_at")
    private OffsetDateTime dueAt;

    @Column(name = "start_on")
    private LocalDate startOn;

    @Column(name = "start_at")
    private OffsetDateTime startAt;

    @Column(name = "priority")
    private String priority;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignee_id")
    private User assignee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by_id")
    private User createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id", nullable = false)
    private Workspace workspace;

    // Many-to-many via task_projects
    @ManyToMany
    @JoinTable(
            name = "task_projects",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    @Builder.Default
    private Set<Project> projects = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "task_sections",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "section_id")
    )
    @Builder.Default
    private Set<Section> sections = new HashSet<>();

    // Many-to-many via task_tags
    @ManyToMany
    @JoinTable(
            name = "task_tags",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
}
