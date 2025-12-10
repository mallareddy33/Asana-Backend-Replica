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
 * EnumOptionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class EnumOptionRequest {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable Boolean enabled;

  private @Nullable String color;

  private @Nullable String insertBefore;

  private @Nullable String insertAfter;

  public EnumOptionRequest gid(@Nullable String gid) {
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

  public EnumOptionRequest resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "enum_option", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public EnumOptionRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the enum option.
   * @return name
   */
  
  @Schema(name = "name", example = "Low", description = "The name of the enum option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public EnumOptionRequest enabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether or not the enum option is a selectable value for the custom field.
   * @return enabled
   */
  
  @Schema(name = "enabled", example = "true", description = "Whether or not the enum option is a selectable value for the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public EnumOptionRequest color(@Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the enum option. Defaults to `none`.
   * @return color
   */
  
  @Schema(name = "color", example = "blue", description = "The color of the enum option. Defaults to `none`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public @Nullable String getColor() {
    return color;
  }

  public void setColor(@Nullable String color) {
    this.color = color;
  }

  public EnumOptionRequest insertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.
   * @return insertBefore
   */
  
  @Schema(name = "insert_before", example = "12345", description = "An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public @Nullable String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public EnumOptionRequest insertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.
   * @return insertAfter
   */
  
  @Schema(name = "insert_after", example = "12345", description = "An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public @Nullable String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumOptionRequest enumOptionRequest = (EnumOptionRequest) o;
    return Objects.equals(this.gid, enumOptionRequest.gid) &&
        Objects.equals(this.resourceType, enumOptionRequest.resourceType) &&
        Objects.equals(this.name, enumOptionRequest.name) &&
        Objects.equals(this.enabled, enumOptionRequest.enabled) &&
        Objects.equals(this.color, enumOptionRequest.color) &&
        Objects.equals(this.insertBefore, enumOptionRequest.insertBefore) &&
        Objects.equals(this.insertAfter, enumOptionRequest.insertAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, enabled, color, insertBefore, insertAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumOptionRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
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

