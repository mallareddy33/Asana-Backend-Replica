package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskTemplateRecipeCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskTemplateRecipeCompact {

  private @Nullable String name;

  /**
   * The subtype of the task that will be created from this template.
   */
  public enum TaskResourceSubtypeEnum {
    DEFAULT_TASK("default_task"),
    
    MILESTONE_TASK("milestone_task"),
    
    APPROVAL_TASK("approval_task");

    private final String value;

    TaskResourceSubtypeEnum(String value) {
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
    public static TaskResourceSubtypeEnum fromValue(String value) {
      for (TaskResourceSubtypeEnum b : TaskResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TaskResourceSubtypeEnum taskResourceSubtype;

  public TaskTemplateRecipeCompact name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task that will be created from this template.
   * @return name
   */
  
  @Schema(name = "name", example = "Bug Report", description = "Name of the task that will be created from this template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TaskTemplateRecipeCompact taskResourceSubtype(@Nullable TaskResourceSubtypeEnum taskResourceSubtype) {
    this.taskResourceSubtype = taskResourceSubtype;
    return this;
  }

  /**
   * The subtype of the task that will be created from this template.
   * @return taskResourceSubtype
   */
  
  @Schema(name = "task_resource_subtype", example = "default_task", description = "The subtype of the task that will be created from this template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task_resource_subtype")
  public @Nullable TaskResourceSubtypeEnum getTaskResourceSubtype() {
    return taskResourceSubtype;
  }

  public void setTaskResourceSubtype(@Nullable TaskResourceSubtypeEnum taskResourceSubtype) {
    this.taskResourceSubtype = taskResourceSubtype;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskTemplateRecipeCompact taskTemplateRecipeCompact = (TaskTemplateRecipeCompact) o;
    return Objects.equals(this.name, taskTemplateRecipeCompact.name) &&
        Objects.equals(this.taskResourceSubtype, taskTemplateRecipeCompact.taskResourceSubtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, taskResourceSubtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskTemplateRecipeCompact {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    taskResourceSubtype: ").append(toIndentedString(taskResourceSubtype)).append("\n");
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

