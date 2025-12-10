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
 * A *status update* is an update on the progress of a particular project, portfolio, or goal, and is sent out to all of its parent&#39;s followers when created. These updates include both text describing the update and a &#x60;status_type&#x60; intended to represent the overall state of the project.
 */

@Schema(name = "StatusUpdateCompact", description = "A *status update* is an update on the progress of a particular project, portfolio, or goal, and is sent out to all of its parent's followers when created. These updates include both text describing the update and a `status_type` intended to represent the overall state of the project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class StatusUpdateCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String title;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.
   */
  public enum ResourceSubtypeEnum {
    PROJECT_STATUS_UPDATE("project_status_update"),
    
    PORTFOLIO_STATUS_UPDATE("portfolio_status_update"),
    
    GOAL_STATUS_UPDATE("goal_status_update");

    private final String value;

    ResourceSubtypeEnum(String value) {
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
    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ResourceSubtypeEnum resourceSubtype;

  public StatusUpdateCompact gid(@Nullable String gid) {
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

  public StatusUpdateCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "status_update", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public StatusUpdateCompact title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the status update.
   * @return title
   */
  
  @Schema(name = "title", example = "Status Update - Jun 15", description = "The title of the status update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public StatusUpdateCompact resourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "project_status_update", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusUpdateCompact statusUpdateCompact = (StatusUpdateCompact) o;
    return Objects.equals(this.gid, statusUpdateCompact.gid) &&
        Objects.equals(this.resourceType, statusUpdateCompact.resourceType) &&
        Objects.equals(this.title, statusUpdateCompact.title) &&
        Objects.equals(this.resourceSubtype, statusUpdateCompact.resourceSubtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, title, resourceSubtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusUpdateCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
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

