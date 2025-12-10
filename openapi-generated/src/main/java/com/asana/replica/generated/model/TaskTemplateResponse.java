package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.ProjectCompact;
import com.asana.replica.generated.model.TaskTemplateRecipe;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
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
 * TaskTemplateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskTemplateResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private JsonNullable<ProjectCompact> project = JsonNullable.<ProjectCompact>undefined();

  private @Nullable TaskTemplateRecipe template;

  private @Nullable UserCompact createdBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  public TaskTemplateResponse gid(@Nullable String gid) {
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

  public TaskTemplateResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task_template", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public TaskTemplateResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task template.
   * @return name
   */
  
  @Schema(name = "name", example = "Bug Report Template", description = "Name of the task template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TaskTemplateResponse project(ProjectCompact project) {
    this.project = JsonNullable.of(project);
    return this;
  }

  /**
   * The project that this task template belongs to.
   * @return project
   */
  @Valid 
  @Schema(name = "project", description = "The project that this task template belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public JsonNullable<ProjectCompact> getProject() {
    return project;
  }

  public void setProject(JsonNullable<ProjectCompact> project) {
    this.project = project;
  }

  public TaskTemplateResponse template(@Nullable TaskTemplateRecipe template) {
    this.template = template;
    return this;
  }

  /**
   * The configuration for the task that will be created from this template.
   * @return template
   */
  @Valid 
  @Schema(name = "template", description = "The configuration for the task that will be created from this template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("template")
  public @Nullable TaskTemplateRecipe getTemplate() {
    return template;
  }

  public void setTemplate(@Nullable TaskTemplateRecipe template) {
    this.template = template;
  }

  public TaskTemplateResponse createdBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The user who created this task template.
   * @return createdBy
   */
  @Valid 
  @Schema(name = "created_by", description = "The user who created this task template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public @Nullable UserCompact getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
  }

  public TaskTemplateResponse createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this task template was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", example = "2019-01-01T00:00Z", description = "The time at which this task template was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskTemplateResponse taskTemplateResponse = (TaskTemplateResponse) o;
    return Objects.equals(this.gid, taskTemplateResponse.gid) &&
        Objects.equals(this.resourceType, taskTemplateResponse.resourceType) &&
        Objects.equals(this.name, taskTemplateResponse.name) &&
        equalsNullable(this.project, taskTemplateResponse.project) &&
        Objects.equals(this.template, taskTemplateResponse.template) &&
        Objects.equals(this.createdBy, taskTemplateResponse.createdBy) &&
        Objects.equals(this.createdAt, taskTemplateResponse.createdAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, hashCodeNullable(project), template, createdBy, createdAt);
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
    sb.append("class TaskTemplateResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

