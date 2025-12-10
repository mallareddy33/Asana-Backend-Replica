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
 * TaskDuplicateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskDuplicateRequest {

  private @Nullable String name;

  private @Nullable String include;

  public TaskDuplicateRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the new task.
   * @return name
   */
  
  @Schema(name = "name", example = "New Task Name", description = "The name of the new task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TaskDuplicateRequest include(@Nullable String include) {
    this.include = include;
    return this;
  }

  /**
   * A comma-separated list of fields that will be duplicated to the new task. ##### Fields - assignee - attachments - dates - dependencies - followers - notes - parent - projects - subtasks - tags
   * @return include
   */
  @Pattern(regexp = "([notes|assignee|subtasks|attachments|tags|followers|projects|dates|dependencies|parent])(,\\1)*") 
  @Schema(name = "include", example = "[\"notes,assignee,subtasks,attachments,tags,followers,projects,dates,dependencies,parent\"]", description = "A comma-separated list of fields that will be duplicated to the new task. ##### Fields - assignee - attachments - dates - dependencies - followers - notes - parent - projects - subtasks - tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include")
  public @Nullable String getInclude() {
    return include;
  }

  public void setInclude(@Nullable String include) {
    this.include = include;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDuplicateRequest taskDuplicateRequest = (TaskDuplicateRequest) o;
    return Objects.equals(this.name, taskDuplicateRequest.name) &&
        Objects.equals(this.include, taskDuplicateRequest.include);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, include);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDuplicateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
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

