package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.GraphExportCompact;
import com.asana.replica.generated.model.JobCompactNewTask;
import com.asana.replica.generated.model.ProjectCompact;
import com.asana.replica.generated.model.ProjectTemplateCompact;
import com.asana.replica.generated.model.ResourceExportCompact;
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
 * A *job* is an object representing a process that handles asynchronous work.
 */

@Schema(name = "JobCompact", description = "A *job* is an object representing a process that handles asynchronous work.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class JobCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String resourceSubtype;

  /**
   * The current status of this job.
   */
  public enum StatusEnum {
    NOT_STARTED("not_started"),
    
    IN_PROGRESS("in_progress"),
    
    SUCCEEDED("succeeded"),
    
    FAILED("failed");

    private final String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StatusEnum status;

  private @Nullable ProjectCompact newProject;

  private @Nullable JobCompactNewTask newTask;

  private @Nullable ProjectTemplateCompact newProjectTemplate;

  private @Nullable GraphExportCompact newGraphExport;

  private @Nullable ResourceExportCompact newResourceExport;

  public JobCompact gid(@Nullable String gid) {
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

  public JobCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "job", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public JobCompact resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "duplicate_task", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public JobCompact status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of this job.
   * @return status
   */
  
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, example = "in_progress", description = "The current status of this job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public JobCompact newProject(@Nullable ProjectCompact newProject) {
    this.newProject = newProject;
    return this;
  }

  /**
   * Get newProject
   * @return newProject
   */
  @Valid 
  @Schema(name = "new_project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_project")
  public @Nullable ProjectCompact getNewProject() {
    return newProject;
  }

  public void setNewProject(@Nullable ProjectCompact newProject) {
    this.newProject = newProject;
  }

  public JobCompact newTask(@Nullable JobCompactNewTask newTask) {
    this.newTask = newTask;
    return this;
  }

  /**
   * Get newTask
   * @return newTask
   */
  @Valid 
  @Schema(name = "new_task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_task")
  public @Nullable JobCompactNewTask getNewTask() {
    return newTask;
  }

  public void setNewTask(@Nullable JobCompactNewTask newTask) {
    this.newTask = newTask;
  }

  public JobCompact newProjectTemplate(@Nullable ProjectTemplateCompact newProjectTemplate) {
    this.newProjectTemplate = newProjectTemplate;
    return this;
  }

  /**
   * Get newProjectTemplate
   * @return newProjectTemplate
   */
  @Valid 
  @Schema(name = "new_project_template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_project_template")
  public @Nullable ProjectTemplateCompact getNewProjectTemplate() {
    return newProjectTemplate;
  }

  public void setNewProjectTemplate(@Nullable ProjectTemplateCompact newProjectTemplate) {
    this.newProjectTemplate = newProjectTemplate;
  }

  public JobCompact newGraphExport(@Nullable GraphExportCompact newGraphExport) {
    this.newGraphExport = newGraphExport;
    return this;
  }

  /**
   * Get newGraphExport
   * @return newGraphExport
   */
  @Valid 
  @Schema(name = "new_graph_export", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_graph_export")
  public @Nullable GraphExportCompact getNewGraphExport() {
    return newGraphExport;
  }

  public void setNewGraphExport(@Nullable GraphExportCompact newGraphExport) {
    this.newGraphExport = newGraphExport;
  }

  public JobCompact newResourceExport(@Nullable ResourceExportCompact newResourceExport) {
    this.newResourceExport = newResourceExport;
    return this;
  }

  /**
   * Get newResourceExport
   * @return newResourceExport
   */
  @Valid 
  @Schema(name = "new_resource_export", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_resource_export")
  public @Nullable ResourceExportCompact getNewResourceExport() {
    return newResourceExport;
  }

  public void setNewResourceExport(@Nullable ResourceExportCompact newResourceExport) {
    this.newResourceExport = newResourceExport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCompact jobCompact = (JobCompact) o;
    return Objects.equals(this.gid, jobCompact.gid) &&
        Objects.equals(this.resourceType, jobCompact.resourceType) &&
        Objects.equals(this.resourceSubtype, jobCompact.resourceSubtype) &&
        Objects.equals(this.status, jobCompact.status) &&
        Objects.equals(this.newProject, jobCompact.newProject) &&
        Objects.equals(this.newTask, jobCompact.newTask) &&
        Objects.equals(this.newProjectTemplate, jobCompact.newProjectTemplate) &&
        Objects.equals(this.newGraphExport, jobCompact.newGraphExport) &&
        Objects.equals(this.newResourceExport, jobCompact.newResourceExport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, resourceSubtype, status, newProject, newTask, newProjectTemplate, newGraphExport, newResourceExport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    newProject: ").append(toIndentedString(newProject)).append("\n");
    sb.append("    newTask: ").append(toIndentedString(newTask)).append("\n");
    sb.append("    newProjectTemplate: ").append(toIndentedString(newProjectTemplate)).append("\n");
    sb.append("    newGraphExport: ").append(toIndentedString(newGraphExport)).append("\n");
    sb.append("    newResourceExport: ").append(toIndentedString(newResourceExport)).append("\n");
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

