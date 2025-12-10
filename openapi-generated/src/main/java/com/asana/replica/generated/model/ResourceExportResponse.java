package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
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
 * A generic Asana Resource, containing a globally unique identifier.
 */

@Schema(name = "ResourceExportResponse", description = "A generic Asana Resource, containing a globally unique identifier.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ResourceExportResponse {

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

  private @Nullable ResourceExportCompact newResourceExport;

  public ResourceExportResponse gid(@Nullable String gid) {
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

  public ResourceExportResponse resourceType(@Nullable String resourceType) {
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

  public ResourceExportResponse resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * A *resource_export* object represents a request to bulk export objects for one or more resources.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "export_request", description = "A *resource_export* object represents a request to bulk export objects for one or more resources.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public ResourceExportResponse status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The current status of this job.
   * @return status
   */
  
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, example = "succeeded", description = "The current status of this job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public ResourceExportResponse newResourceExport(@Nullable ResourceExportCompact newResourceExport) {
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
    ResourceExportResponse resourceExportResponse = (ResourceExportResponse) o;
    return Objects.equals(this.gid, resourceExportResponse.gid) &&
        Objects.equals(this.resourceType, resourceExportResponse.resourceType) &&
        Objects.equals(this.resourceSubtype, resourceExportResponse.resourceSubtype) &&
        Objects.equals(this.status, resourceExportResponse.status) &&
        Objects.equals(this.newResourceExport, resourceExportResponse.newResourceExport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, resourceSubtype, status, newResourceExport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceExportResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

