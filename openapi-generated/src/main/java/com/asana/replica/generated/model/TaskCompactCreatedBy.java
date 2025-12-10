package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * [Opt In](/docs/inputoutput-options). A *user* object represents an account in Asana that can be given access to various workspaces, projects, and tasks.
 */

@Schema(name = "TaskCompact_created_by", description = "[Opt In](/docs/inputoutput-options). A *user* object represents an account in Asana that can be given access to various workspaces, projects, and tasks.")
@JsonTypeName("TaskCompact_created_by")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskCompactCreatedBy {

  private @Nullable String gid;

  private @Nullable String resourceType;

  public TaskCompactCreatedBy gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource.
   * @return gid
   */
  
  @Schema(name = "gid", example = "1111", description = "Globally unique identifier of the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public TaskCompactCreatedBy resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", example = "user", description = "The type of resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCompactCreatedBy taskCompactCreatedBy = (TaskCompactCreatedBy) o;
    return Objects.equals(this.gid, taskCompactCreatedBy.gid) &&
        Objects.equals(this.resourceType, taskCompactCreatedBy.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCompactCreatedBy {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

