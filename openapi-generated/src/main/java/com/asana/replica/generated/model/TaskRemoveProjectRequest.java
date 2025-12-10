package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
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
 * TaskRemoveProjectRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskRemoveProjectRequest {

  private String project;

  public TaskRemoveProjectRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskRemoveProjectRequest(String project) {
    this.project = project;
  }

  public TaskRemoveProjectRequest project(String project) {
    this.project = project;
    return this;
  }

  /**
   * The project to remove the task from.
   * @return project
   */
  @NotNull 
  @Schema(name = "project", example = "13579", description = "The project to remove the task from.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("project")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskRemoveProjectRequest taskRemoveProjectRequest = (TaskRemoveProjectRequest) o;
    return Objects.equals(this.project, taskRemoveProjectRequest.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskRemoveProjectRequest {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

