package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.ProjectDuplicateRequestScheduleDates;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProjectDuplicateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectDuplicateRequest {

  private String name;

  private @Nullable String team;

  private @Nullable String include;

  private @Nullable ProjectDuplicateRequestScheduleDates scheduleDates;

  public ProjectDuplicateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectDuplicateRequest(String name) {
    this.name = name;
  }

  public ProjectDuplicateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the new project.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "New Project Name", description = "The name of the new project.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectDuplicateRequest team(@Nullable String team) {
    this.team = team;
    return this;
  }

  /**
   * Sets the team of the new project. If team is not defined, the new project will be in the same team as the the original project.
   * @return team
   */
  
  @Schema(name = "team", example = "12345", description = "Sets the team of the new project. If team is not defined, the new project will be in the same team as the the original project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public @Nullable String getTeam() {
    return team;
  }

  public void setTeam(@Nullable String team) {
    this.team = team;
  }

  public ProjectDuplicateRequest include(@Nullable String include) {
    this.include = include;
    return this;
  }

  /**
   * A comma-separated list of elements to include when duplicating a project. Some elements are automatically included and cannot be excluded, while others are **optional** and must be explicitly specified in this field.  **Auto-included fields (non-configurable)** - Tasks - [Project Views](https://asana.com/features/project-management/project-views) (i.e., tabs in a project such as List, Board, Dashboard, etc.) - [Rules](https://help.asana.com/s/article/rules)  *Note: The Owner of the Rules copied to the new project is the user who performs the API call. If the duplication is performed using a [Service Account](/docs/authentication#/service-account), note that Service Accounts cannot access the UI to modify or pause Rules. To prevent unwanted automation behavior, consider pausing Rules in the source project before duplication — their active/paused state is preserved in the new project.*  **Optional fields (configurable)** - allocations - forms - members - notes - permissions - task_assignee - task_attachments - task_dates - task_dependencies - task_followers - task_notes - task_projects - task_subtasks - task_tags - task_templates - task_type_default
   * @return include
   */
  @Pattern(regexp = "([allocations|forms|members|notes|permissions|task_assignee|task_attachments|task_dates|task_dependencies|task_followers|task_notes|task_projects|task_subtasks|task_tags|task_templates|task_type_default])(,\\1)*") 
  @Schema(name = "include", example = "[\"allocations,forms,members,notes,permissions,task_assignee,task_attachments,task_dates,task_dependencies,task_followers,task_notes,task_projects,task_subtasks,task_tags,task_templates,task_type_default\"]", description = "A comma-separated list of elements to include when duplicating a project. Some elements are automatically included and cannot be excluded, while others are **optional** and must be explicitly specified in this field.  **Auto-included fields (non-configurable)** - Tasks - [Project Views](https://asana.com/features/project-management/project-views) (i.e., tabs in a project such as List, Board, Dashboard, etc.) - [Rules](https://help.asana.com/s/article/rules)  *Note: The Owner of the Rules copied to the new project is the user who performs the API call. If the duplication is performed using a [Service Account](/docs/authentication#/service-account), note that Service Accounts cannot access the UI to modify or pause Rules. To prevent unwanted automation behavior, consider pausing Rules in the source project before duplication — their active/paused state is preserved in the new project.*  **Optional fields (configurable)** - allocations - forms - members - notes - permissions - task_assignee - task_attachments - task_dates - task_dependencies - task_followers - task_notes - task_projects - task_subtasks - task_tags - task_templates - task_type_default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include")
  public @Nullable String getInclude() {
    return include;
  }

  public void setInclude(@Nullable String include) {
    this.include = include;
  }

  public ProjectDuplicateRequest scheduleDates(@Nullable ProjectDuplicateRequestScheduleDates scheduleDates) {
    this.scheduleDates = scheduleDates;
    return this;
  }

  /**
   * Get scheduleDates
   * @return scheduleDates
   */
  @Valid 
  @Schema(name = "schedule_dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule_dates")
  public @Nullable ProjectDuplicateRequestScheduleDates getScheduleDates() {
    return scheduleDates;
  }

  public void setScheduleDates(@Nullable ProjectDuplicateRequestScheduleDates scheduleDates) {
    this.scheduleDates = scheduleDates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDuplicateRequest projectDuplicateRequest = (ProjectDuplicateRequest) o;
    return Objects.equals(this.name, projectDuplicateRequest.name) &&
        Objects.equals(this.team, projectDuplicateRequest.team) &&
        Objects.equals(this.include, projectDuplicateRequest.include) &&
        Objects.equals(this.scheduleDates, projectDuplicateRequest.scheduleDates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, team, include, scheduleDates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDuplicateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    scheduleDates: ").append(toIndentedString(scheduleDates)).append("\n");
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

