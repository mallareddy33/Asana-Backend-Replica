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
 * *Deprecated: new integrations should prefer the &#x60;status_update&#x60; resource.* A *project status* is an update on the progress of a particular project, and is sent out to all project followers when created. These updates include both text describing the update and a color code intended to represent the overall state of the project: \&quot;green\&quot; for projects that are on track, \&quot;yellow\&quot; for projects at risk, and \&quot;red\&quot; for projects that are behind.
 */

@Schema(name = "ProjectStatusCompact", description = "*Deprecated: new integrations should prefer the `status_update` resource.* A *project status* is an update on the progress of a particular project, and is sent out to all project followers when created. These updates include both text describing the update and a color code intended to represent the overall state of the project: \"green\" for projects that are on track, \"yellow\" for projects at risk, and \"red\" for projects that are behind.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectStatusCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String title;

  public ProjectStatusCompact gid(@Nullable String gid) {
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

  public ProjectStatusCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "project_status", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public ProjectStatusCompact title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the project status update.
   * @return title
   */
  
  @Schema(name = "title", example = "Status Update - Jun 15", description = "The title of the project status update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStatusCompact projectStatusCompact = (ProjectStatusCompact) o;
    return Objects.equals(this.gid, projectStatusCompact.gid) &&
        Objects.equals(this.resourceType, projectStatusCompact.resourceType) &&
        Objects.equals(this.title, projectStatusCompact.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatusCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

