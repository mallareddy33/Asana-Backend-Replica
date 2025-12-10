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
 * A *workspace* is the highest-level organizational unit in Asana. All projects and tasks have an associated workspace.
 */

@Schema(name = "WorkspaceCompact", description = "A *workspace* is the highest-level organizational unit in Asana. All projects and tasks have an associated workspace.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class WorkspaceCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  public WorkspaceCompact gid(@Nullable String gid) {
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

  public WorkspaceCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "workspace", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public WorkspaceCompact name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workspace.
   * @return name
   */
  
  @Schema(name = "name", example = "My Company Workspace", description = "The name of the workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceCompact workspaceCompact = (WorkspaceCompact) o;
    return Objects.equals(this.gid, workspaceCompact.gid) &&
        Objects.equals(this.resourceType, workspaceCompact.resourceType) &&
        Objects.equals(this.name, workspaceCompact.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

