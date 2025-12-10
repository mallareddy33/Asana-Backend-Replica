package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AsanaResource;
import com.asana.replica.generated.model.Like;
import com.asana.replica.generated.model.TaskBaseAllOfExternal;
import com.asana.replica.generated.model.TaskBaseAllOfMemberships;
import com.asana.replica.generated.model.TaskCompactCreatedBy;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskBase {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype `milestone` represent a single moment in time. This means tasks with this subtype cannot have a start_date.
   */
  public enum ResourceSubtypeEnum {
    DEFAULT_TASK("default_task"),
    
    MILESTONE("milestone"),
    
    APPROVAL("approval");

    private final String value;

    ResourceSubtypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ResourceSubtypeEnum resourceSubtype;

  private @Nullable TaskCompactCreatedBy createdBy;

  /**
   * *Conditional* Reflects the approval status of this task. This field is kept in sync with `completed`, meaning `pending` translates to false while `approved`, `rejected`, and `changes_requested` translate to true. If you set completed to true, this field will be set to `approved`.
   */
  public enum ApprovalStatusEnum {
    PENDING("pending"),
    
    APPROVED("approved"),
    
    REJECTED("rejected"),
    
    CHANGES_REQUESTED("changes_requested");

    private final String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApprovalStatusEnum fromValue(String value) {
      for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ApprovalStatusEnum approvalStatus;

  /**
   * *Deprecated* Scheduling status of this task for the user it is assigned to. This field can only be set if the assignee is non-null. Setting this field to \"inbox\" or \"upcoming\" inserts it at the top of the section, while the other options will insert at the bottom.
   */
  public enum AssigneeStatusEnum {
    TODAY("today"),
    
    UPCOMING("upcoming"),
    
    LATER("later"),
    
    NEW("new"),
    
    INBOX("inbox");

    private final String value;

    AssigneeStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssigneeStatusEnum fromValue(String value) {
      for (AssigneeStatusEnum b : AssigneeStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable AssigneeStatusEnum assigneeStatus;

  private @Nullable Boolean completed;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<UserCompact> completedBy = JsonNullable.<UserCompact>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  @Valid
  private List<@Valid AsanaResource> dependencies = new ArrayList<>();

  @Valid
  private List<@Valid AsanaResource> dependents = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dueAt = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> dueOn = JsonNullable.<LocalDate>undefined();

  private @Nullable TaskBaseAllOfExternal external;

  private @Nullable String htmlNotes;

  private @Nullable Boolean hearted;

  @Valid
  private List<@Valid Like> hearts = new ArrayList<>();

  private @Nullable Boolean isRenderedAsSeparator;

  private @Nullable Boolean liked;

  @Valid
  private List<@Valid Like> likes = new ArrayList<>();

  @Valid
  private List<@Valid TaskBaseAllOfMemberships> memberships = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime modifiedAt;

  private @Nullable String notes;

  private @Nullable Integer numHearts;

  private @Nullable Integer numLikes;

  private @Nullable Integer numSubtasks;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> startAt = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> startOn = JsonNullable.<LocalDate>undefined();

  private JsonNullable<BigDecimal> actualTimeMinutes = JsonNullable.<BigDecimal>undefined();

  public TaskBase gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
   */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public TaskBase resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public TaskBase name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.
   * @return name
   */
  
  @Schema(name = "name", example = "Buy catnip", description = "Name of the task. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TaskBase resourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype `milestone` represent a single moment in time. This means tasks with this subtype cannot have a start_date.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", example = "default_task", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype `milestone` represent a single moment in time. This means tasks with this subtype cannot have a start_date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public TaskBase createdBy(@Nullable TaskCompactCreatedBy createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @Valid 
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public @Nullable TaskCompactCreatedBy getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@Nullable TaskCompactCreatedBy createdBy) {
    this.createdBy = createdBy;
  }

  public TaskBase approvalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * *Conditional* Reflects the approval status of this task. This field is kept in sync with `completed`, meaning `pending` translates to false while `approved`, `rejected`, and `changes_requested` translate to true. If you set completed to true, this field will be set to `approved`.
   * @return approvalStatus
   */
  
  @Schema(name = "approval_status", example = "pending", description = "*Conditional* Reflects the approval status of this task. This field is kept in sync with `completed`, meaning `pending` translates to false while `approved`, `rejected`, and `changes_requested` translate to true. If you set completed to true, this field will be set to `approved`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approval_status")
  public @Nullable ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public TaskBase assigneeStatus(@Nullable AssigneeStatusEnum assigneeStatus) {
    this.assigneeStatus = assigneeStatus;
    return this;
  }

  /**
   * *Deprecated* Scheduling status of this task for the user it is assigned to. This field can only be set if the assignee is non-null. Setting this field to \"inbox\" or \"upcoming\" inserts it at the top of the section, while the other options will insert at the bottom.
   * @return assigneeStatus
   */
  
  @Schema(name = "assignee_status", example = "upcoming", description = "*Deprecated* Scheduling status of this task for the user it is assigned to. This field can only be set if the assignee is non-null. Setting this field to \"inbox\" or \"upcoming\" inserts it at the top of the section, while the other options will insert at the bottom.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee_status")
  public @Nullable AssigneeStatusEnum getAssigneeStatus() {
    return assigneeStatus;
  }

  public void setAssigneeStatus(@Nullable AssigneeStatusEnum assigneeStatus) {
    this.assigneeStatus = assigneeStatus;
  }

  public TaskBase completed(@Nullable Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * True if the task is currently marked complete, false if not.
   * @return completed
   */
  
  @Schema(name = "completed", example = "false", description = "True if the task is currently marked complete, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public @Nullable Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(@Nullable Boolean completed) {
    this.completed = completed;
  }

  public TaskBase completedAt(OffsetDateTime completedAt) {
    this.completedAt = JsonNullable.of(completedAt);
    return this;
  }

  /**
   * The time at which this task was completed, or null if the task is incomplete.
   * @return completedAt
   */
  @Valid 
  @Schema(name = "completed_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this task was completed, or null if the task is incomplete.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_at")
  public JsonNullable<OffsetDateTime> getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(JsonNullable<OffsetDateTime> completedAt) {
    this.completedAt = completedAt;
  }

  public TaskBase completedBy(UserCompact completedBy) {
    this.completedBy = JsonNullable.of(completedBy);
    return this;
  }

  /**
   * Get completedBy
   * @return completedBy
   */
  @Valid 
  @Schema(name = "completed_by", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_by")
  public JsonNullable<UserCompact> getCompletedBy() {
    return completedBy;
  }

  public void setCompletedBy(JsonNullable<UserCompact> completedBy) {
    this.completedBy = completedBy;
  }

  public TaskBase createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public TaskBase dependencies(List<@Valid AsanaResource> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public TaskBase addDependenciesItem(AsanaResource dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). Array of resources referencing tasks that this task depends on. The objects contain only the gid of the dependency.
   * @return dependencies
   */
  @Valid 
  @Schema(name = "dependencies", accessMode = Schema.AccessMode.READ_ONLY, description = "[Opt In](/docs/inputoutput-options). Array of resources referencing tasks that this task depends on. The objects contain only the gid of the dependency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependencies")
  public List<@Valid AsanaResource> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<@Valid AsanaResource> dependencies) {
    this.dependencies = dependencies;
  }

  public TaskBase dependents(List<@Valid AsanaResource> dependents) {
    this.dependents = dependents;
    return this;
  }

  public TaskBase addDependentsItem(AsanaResource dependentsItem) {
    if (this.dependents == null) {
      this.dependents = new ArrayList<>();
    }
    this.dependents.add(dependentsItem);
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). Array of resources referencing tasks that depend on this task. The objects contain only the ID of the dependent.
   * @return dependents
   */
  @Valid 
  @Schema(name = "dependents", accessMode = Schema.AccessMode.READ_ONLY, description = "[Opt In](/docs/inputoutput-options). Array of resources referencing tasks that depend on this task. The objects contain only the ID of the dependent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependents")
  public List<@Valid AsanaResource> getDependents() {
    return dependents;
  }

  public void setDependents(List<@Valid AsanaResource> dependents) {
    this.dependents = dependents;
  }

  public TaskBase dueAt(OffsetDateTime dueAt) {
    this.dueAt = JsonNullable.of(dueAt);
    return this;
  }

  /**
   * The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.
   * @return dueAt
   */
  @Valid 
  @Schema(name = "due_at", example = "2019-09-15T02:06:58.147Z", description = "The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_at")
  public JsonNullable<OffsetDateTime> getDueAt() {
    return dueAt;
  }

  public void setDueAt(JsonNullable<OffsetDateTime> dueAt) {
    this.dueAt = dueAt;
  }

  public TaskBase dueOn(LocalDate dueOn) {
    this.dueOn = JsonNullable.of(dueOn);
    return this;
  }

  /**
   * The localized date on which this task is due, or null if the task has no due date. This takes a date with `YYYY-MM-DD` format and should not be used together with `due_at`.
   * @return dueOn
   */
  @Valid 
  @Schema(name = "due_on", example = "2019-09-15", description = "The localized date on which this task is due, or null if the task has no due date. This takes a date with `YYYY-MM-DD` format and should not be used together with `due_at`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public JsonNullable<LocalDate> getDueOn() {
    return dueOn;
  }

  public void setDueOn(JsonNullable<LocalDate> dueOn) {
    this.dueOn = dueOn;
  }

  public TaskBase external(@Nullable TaskBaseAllOfExternal external) {
    this.external = external;
    return this;
  }

  /**
   * Get external
   * @return external
   */
  @Valid 
  @Schema(name = "external", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external")
  public @Nullable TaskBaseAllOfExternal getExternal() {
    return external;
  }

  public void setExternal(@Nullable TaskBaseAllOfExternal external) {
    this.external = external;
  }

  public TaskBase htmlNotes(@Nullable String htmlNotes) {
    this.htmlNotes = htmlNotes;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). The notes of the text with formatting as HTML.
   * @return htmlNotes
   */
  
  @Schema(name = "html_notes", example = "<body>Mittens <em>really</em> likes the stuff from Humboldt.</body>", description = "[Opt In](/docs/inputoutput-options). The notes of the text with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_notes")
  public @Nullable String getHtmlNotes() {
    return htmlNotes;
  }

  public void setHtmlNotes(@Nullable String htmlNotes) {
    this.htmlNotes = htmlNotes;
  }

  public TaskBase hearted(@Nullable Boolean hearted) {
    this.hearted = hearted;
    return this;
  }

  /**
   * *Deprecated - please use liked instead* True if the task is hearted by the authorized user, false if not.
   * @return hearted
   */
  
  @Schema(name = "hearted", accessMode = Schema.AccessMode.READ_ONLY, example = "true", description = "*Deprecated - please use liked instead* True if the task is hearted by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearted")
  public @Nullable Boolean getHearted() {
    return hearted;
  }

  public void setHearted(@Nullable Boolean hearted) {
    this.hearted = hearted;
  }

  public TaskBase hearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
    return this;
  }

  public TaskBase addHeartsItem(Like heartsItem) {
    if (this.hearts == null) {
      this.hearts = new ArrayList<>();
    }
    this.hearts.add(heartsItem);
    return this;
  }

  /**
   * *Deprecated - please use likes instead* Array of likes for users who have hearted this task.
   * @return hearts
   */
  @Valid 
  @Schema(name = "hearts", accessMode = Schema.AccessMode.READ_ONLY, description = "*Deprecated - please use likes instead* Array of likes for users who have hearted this task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearts")
  public List<@Valid Like> getHearts() {
    return hearts;
  }

  public void setHearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
  }

  public TaskBase isRenderedAsSeparator(@Nullable Boolean isRenderedAsSeparator) {
    this.isRenderedAsSeparator = isRenderedAsSeparator;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). In some contexts tasks can be rendered as a visual separator; for instance, subtasks can appear similar to [sections](/reference/sections) without being true `section` objects. If a `task` object is rendered this way in any context it will have the property `is_rendered_as_separator` set to `true`. This parameter only applies to regular tasks with `resource_subtype` of `default_task`. Tasks with `resource_subtype` of `milestone`, `approval`, or custom task types will not have this property and cannot be rendered as separators.
   * @return isRenderedAsSeparator
   */
  
  @Schema(name = "is_rendered_as_separator", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "[Opt In](/docs/inputoutput-options). In some contexts tasks can be rendered as a visual separator; for instance, subtasks can appear similar to [sections](/reference/sections) without being true `section` objects. If a `task` object is rendered this way in any context it will have the property `is_rendered_as_separator` set to `true`. This parameter only applies to regular tasks with `resource_subtype` of `default_task`. Tasks with `resource_subtype` of `milestone`, `approval`, or custom task types will not have this property and cannot be rendered as separators.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_rendered_as_separator")
  public @Nullable Boolean getIsRenderedAsSeparator() {
    return isRenderedAsSeparator;
  }

  public void setIsRenderedAsSeparator(@Nullable Boolean isRenderedAsSeparator) {
    this.isRenderedAsSeparator = isRenderedAsSeparator;
  }

  public TaskBase liked(@Nullable Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * True if the task is liked by the authorized user, false if not.
   * @return liked
   */
  
  @Schema(name = "liked", example = "true", description = "True if the task is liked by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liked")
  public @Nullable Boolean getLiked() {
    return liked;
  }

  public void setLiked(@Nullable Boolean liked) {
    this.liked = liked;
  }

  public TaskBase likes(List<@Valid Like> likes) {
    this.likes = likes;
    return this;
  }

  public TaskBase addLikesItem(Like likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * Array of likes for users who have liked this task.
   * @return likes
   */
  @Valid 
  @Schema(name = "likes", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of likes for users who have liked this task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid Like> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid Like> likes) {
    this.likes = likes;
  }

  public TaskBase memberships(List<@Valid TaskBaseAllOfMemberships> memberships) {
    this.memberships = memberships;
    return this;
  }

  public TaskBase addMembershipsItem(TaskBaseAllOfMemberships membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new ArrayList<>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

  /**
   * <p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>projects:read</code>, <code>project_sections:read</code></p>  *Create-only*. Array of projects this task is associated with and the section it is in. At task creation time, this array can be used to add the task to specific sections. After task creation, these associations can be modified using the `addProject` and `removeProject` endpoints. Note that over time, more types of memberships may be added to this property.
   * @return memberships
   */
  @Valid 
  @Schema(name = "memberships", accessMode = Schema.AccessMode.READ_ONLY, description = "<p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>projects:read</code>, <code>project_sections:read</code></p>  *Create-only*. Array of projects this task is associated with and the section it is in. At task creation time, this array can be used to add the task to specific sections. After task creation, these associations can be modified using the `addProject` and `removeProject` endpoints. Note that over time, more types of memberships may be added to this property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberships")
  public List<@Valid TaskBaseAllOfMemberships> getMemberships() {
    return memberships;
  }

  public void setMemberships(List<@Valid TaskBaseAllOfMemberships> memberships) {
    this.memberships = memberships;
  }

  public TaskBase modifiedAt(@Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which this task was last modified.  The following conditions will change `modified_at`:  - story is created on a task - story is trashed on a task - attachment is trashed on a task - task is assigned or unassigned - custom field value is changed - the task itself is trashed - Or if any of the following fields are updated:   - completed   - name   - due_date   - description   - attachments   - items   - schedule_status  The following conditions will _not_ change `modified_at`:  - moving to a new container (project, portfolio, etc) - comments being added to the task (but the stories they generate   _will_ affect `modified_at`)
   * @return modifiedAt
   */
  @Valid 
  @Schema(name = "modified_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this task was last modified.  The following conditions will change `modified_at`:  - story is created on a task - story is trashed on a task - attachment is trashed on a task - task is assigned or unassigned - custom field value is changed - the task itself is trashed - Or if any of the following fields are updated:   - completed   - name   - due_date   - description   - attachments   - items   - schedule_status  The following conditions will _not_ change `modified_at`:  - moving to a new container (project, portfolio, etc) - comments being added to the task (but the stories they generate   _will_ affect `modified_at`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified_at")
  public @Nullable OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(@Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public TaskBase notes(@Nullable String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Free-form textual information associated with the task (i.e. its description).
   * @return notes
   */
  
  @Schema(name = "notes", example = "Mittens really likes the stuff from Humboldt.", description = "Free-form textual information associated with the task (i.e. its description).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public @Nullable String getNotes() {
    return notes;
  }

  public void setNotes(@Nullable String notes) {
    this.notes = notes;
  }

  public TaskBase numHearts(@Nullable Integer numHearts) {
    this.numHearts = numHearts;
    return this;
  }

  /**
   * *Deprecated - please use likes instead* The number of users who have hearted this task.
   * @return numHearts
   */
  
  @Schema(name = "num_hearts", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "*Deprecated - please use likes instead* The number of users who have hearted this task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_hearts")
  public @Nullable Integer getNumHearts() {
    return numHearts;
  }

  public void setNumHearts(@Nullable Integer numHearts) {
    this.numHearts = numHearts;
  }

  public TaskBase numLikes(@Nullable Integer numLikes) {
    this.numLikes = numLikes;
    return this;
  }

  /**
   * The number of users who have liked this task.
   * @return numLikes
   */
  
  @Schema(name = "num_likes", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "The number of users who have liked this task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_likes")
  public @Nullable Integer getNumLikes() {
    return numLikes;
  }

  public void setNumLikes(@Nullable Integer numLikes) {
    this.numLikes = numLikes;
  }

  public TaskBase numSubtasks(@Nullable Integer numSubtasks) {
    this.numSubtasks = numSubtasks;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). The number of subtasks on this task. 
   * @return numSubtasks
   */
  
  @Schema(name = "num_subtasks", accessMode = Schema.AccessMode.READ_ONLY, example = "3", description = "[Opt In](/docs/inputoutput-options). The number of subtasks on this task. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_subtasks")
  public @Nullable Integer getNumSubtasks() {
    return numSubtasks;
  }

  public void setNumSubtasks(@Nullable Integer numSubtasks) {
    this.numSubtasks = numSubtasks;
  }

  public TaskBase startAt(OffsetDateTime startAt) {
    this.startAt = JsonNullable.of(startAt);
    return this;
  }

  /**
   * Date and time on which work begins for the task, or null if the task has no start time. This takes an ISO 8601 date string in UTC and should not be used together with `start_on`. *Note: `due_at` must be present in the request when setting or unsetting the `start_at` parameter.*
   * @return startAt
   */
  @Valid 
  @Schema(name = "start_at", example = "2019-09-14T02:06:58.147Z", description = "Date and time on which work begins for the task, or null if the task has no start time. This takes an ISO 8601 date string in UTC and should not be used together with `start_on`. *Note: `due_at` must be present in the request when setting or unsetting the `start_at` parameter.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_at")
  public JsonNullable<OffsetDateTime> getStartAt() {
    return startAt;
  }

  public void setStartAt(JsonNullable<OffsetDateTime> startAt) {
    this.startAt = startAt;
  }

  public TaskBase startOn(LocalDate startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work begins for the task , or null if the task has no start date. This takes a date with `YYYY-MM-DD` format and should not be used together with `start_at`. *Note: `due_on` or `due_at` must be present in the request when setting or unsetting the `start_on` parameter.*
   * @return startOn
   */
  @Valid 
  @Schema(name = "start_on", example = "2019-09-14", description = "The day on which work begins for the task , or null if the task has no start date. This takes a date with `YYYY-MM-DD` format and should not be used together with `start_at`. *Note: `due_on` or `due_at` must be present in the request when setting or unsetting the `start_on` parameter.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<LocalDate> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<LocalDate> startOn) {
    this.startOn = startOn;
  }

  public TaskBase actualTimeMinutes(BigDecimal actualTimeMinutes) {
    this.actualTimeMinutes = JsonNullable.of(actualTimeMinutes);
    return this;
  }

  /**
   * <p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>time_tracking_entries:read</code></p>  This value represents the sum of all the Time Tracking entries in the Actual Time field on a given Task. It is represented as a nullable long value.
   * @return actualTimeMinutes
   */
  @Valid 
  @Schema(name = "actual_time_minutes", accessMode = Schema.AccessMode.READ_ONLY, example = "200", description = "<p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>time_tracking_entries:read</code></p>  This value represents the sum of all the Time Tracking entries in the Actual Time field on a given Task. It is represented as a nullable long value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actual_time_minutes")
  public JsonNullable<BigDecimal> getActualTimeMinutes() {
    return actualTimeMinutes;
  }

  public void setActualTimeMinutes(JsonNullable<BigDecimal> actualTimeMinutes) {
    this.actualTimeMinutes = actualTimeMinutes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskBase taskBase = (TaskBase) o;
    return Objects.equals(this.gid, taskBase.gid) &&
        Objects.equals(this.resourceType, taskBase.resourceType) &&
        Objects.equals(this.name, taskBase.name) &&
        Objects.equals(this.resourceSubtype, taskBase.resourceSubtype) &&
        Objects.equals(this.createdBy, taskBase.createdBy) &&
        Objects.equals(this.approvalStatus, taskBase.approvalStatus) &&
        Objects.equals(this.assigneeStatus, taskBase.assigneeStatus) &&
        Objects.equals(this.completed, taskBase.completed) &&
        equalsNullable(this.completedAt, taskBase.completedAt) &&
        equalsNullable(this.completedBy, taskBase.completedBy) &&
        Objects.equals(this.createdAt, taskBase.createdAt) &&
        Objects.equals(this.dependencies, taskBase.dependencies) &&
        Objects.equals(this.dependents, taskBase.dependents) &&
        equalsNullable(this.dueAt, taskBase.dueAt) &&
        equalsNullable(this.dueOn, taskBase.dueOn) &&
        Objects.equals(this.external, taskBase.external) &&
        Objects.equals(this.htmlNotes, taskBase.htmlNotes) &&
        Objects.equals(this.hearted, taskBase.hearted) &&
        Objects.equals(this.hearts, taskBase.hearts) &&
        Objects.equals(this.isRenderedAsSeparator, taskBase.isRenderedAsSeparator) &&
        Objects.equals(this.liked, taskBase.liked) &&
        Objects.equals(this.likes, taskBase.likes) &&
        Objects.equals(this.memberships, taskBase.memberships) &&
        Objects.equals(this.modifiedAt, taskBase.modifiedAt) &&
        Objects.equals(this.notes, taskBase.notes) &&
        Objects.equals(this.numHearts, taskBase.numHearts) &&
        Objects.equals(this.numLikes, taskBase.numLikes) &&
        Objects.equals(this.numSubtasks, taskBase.numSubtasks) &&
        equalsNullable(this.startAt, taskBase.startAt) &&
        equalsNullable(this.startOn, taskBase.startOn) &&
        equalsNullable(this.actualTimeMinutes, taskBase.actualTimeMinutes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, resourceSubtype, createdBy, approvalStatus, assigneeStatus, completed, hashCodeNullable(completedAt), hashCodeNullable(completedBy), createdAt, dependencies, dependents, hashCodeNullable(dueAt), hashCodeNullable(dueOn), external, htmlNotes, hearted, hearts, isRenderedAsSeparator, liked, likes, memberships, modifiedAt, notes, numHearts, numLikes, numSubtasks, hashCodeNullable(startAt), hashCodeNullable(startOn), hashCodeNullable(actualTimeMinutes));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    assigneeStatus: ").append(toIndentedString(assigneeStatus)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    completedBy: ").append(toIndentedString(completedBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    dependents: ").append(toIndentedString(dependents)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    htmlNotes: ").append(toIndentedString(htmlNotes)).append("\n");
    sb.append("    hearted: ").append(toIndentedString(hearted)).append("\n");
    sb.append("    hearts: ").append(toIndentedString(hearts)).append("\n");
    sb.append("    isRenderedAsSeparator: ").append(toIndentedString(isRenderedAsSeparator)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    numHearts: ").append(toIndentedString(numHearts)).append("\n");
    sb.append("    numLikes: ").append(toIndentedString(numLikes)).append("\n");
    sb.append("    numSubtasks: ").append(toIndentedString(numSubtasks)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    actualTimeMinutes: ").append(toIndentedString(actualTimeMinutes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

