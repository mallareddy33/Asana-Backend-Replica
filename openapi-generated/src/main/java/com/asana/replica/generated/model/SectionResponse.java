package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.ProjectCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SectionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class SectionResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable ProjectCompact project;

  @Valid
  private List<@Valid ProjectCompact> projects = new ArrayList<>();

  public SectionResponse gid(@Nullable String gid) {
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

  public SectionResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "section", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public SectionResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the section (i.e. the text displayed as the section header).
   * @return name
   */
  
  @Schema(name = "name", example = "Next Actions", description = "The name of the section (i.e. the text displayed as the section header).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public SectionResponse createdAt(@Nullable OffsetDateTime createdAt) {
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

  public SectionResponse project(@Nullable ProjectCompact project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public @Nullable ProjectCompact getProject() {
    return project;
  }

  public void setProject(@Nullable ProjectCompact project) {
    this.project = project;
  }

  public SectionResponse projects(List<@Valid ProjectCompact> projects) {
    this.projects = projects;
    return this;
  }

  public SectionResponse addProjectsItem(ProjectCompact projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * *Deprecated - please use project instead*
   * @return projects
   */
  @Valid 
  @Schema(name = "projects", accessMode = Schema.AccessMode.READ_ONLY, description = "*Deprecated - please use project instead*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public List<@Valid ProjectCompact> getProjects() {
    return projects;
  }

  public void setProjects(List<@Valid ProjectCompact> projects) {
    this.projects = projects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionResponse sectionResponse = (SectionResponse) o;
    return Objects.equals(this.gid, sectionResponse.gid) &&
        Objects.equals(this.resourceType, sectionResponse.resourceType) &&
        Objects.equals(this.name, sectionResponse.name) &&
        Objects.equals(this.createdAt, sectionResponse.createdAt) &&
        Objects.equals(this.project, sectionResponse.project) &&
        Objects.equals(this.projects, sectionResponse.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, createdAt, project, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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

