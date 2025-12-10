package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * CustomTypeStatusOptionResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class CustomTypeStatusOptionResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private JsonNullable<String> completionState = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> enabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> color = JsonNullable.<String>undefined();

  public CustomTypeStatusOptionResponse gid(@Nullable String gid) {
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

  public CustomTypeStatusOptionResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "custom_type_status_option", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public CustomTypeStatusOptionResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the custom type status option.
   * @return name
   */
  
  @Schema(name = "name", example = "Solution pending", description = "The name of the custom type status option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public CustomTypeStatusOptionResponse completionState(String completionState) {
    this.completionState = JsonNullable.of(completionState);
    return this;
  }

  /**
   * The completion state the custom type status option corresponds to, all custom types must have one ‘Incomplete’ and ‘Complete’ status option.
   * @return completionState
   */
  
  @Schema(name = "completion_state", example = "Incomplete", description = "The completion state the custom type status option corresponds to, all custom types must have one ‘Incomplete’ and ‘Complete’ status option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completion_state")
  public JsonNullable<String> getCompletionState() {
    return completionState;
  }

  public void setCompletionState(JsonNullable<String> completionState) {
    this.completionState = completionState;
  }

  public CustomTypeStatusOptionResponse enabled(Boolean enabled) {
    this.enabled = JsonNullable.of(enabled);
    return this;
  }

  /**
   * Whether or not the custom type status option is a selectable value for the custom type.
   * @return enabled
   */
  
  @Schema(name = "enabled", example = "true", description = "Whether or not the custom type status option is a selectable value for the custom type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public JsonNullable<Boolean> getEnabled() {
    return enabled;
  }

  public void setEnabled(JsonNullable<Boolean> enabled) {
    this.enabled = enabled;
  }

  public CustomTypeStatusOptionResponse color(String color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * The color associated with the custom type status option. Defaults to ‘none’.
   * @return color
   */
  
  @Schema(name = "color", example = "blue", description = "The color associated with the custom type status option. Defaults to ‘none’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public JsonNullable<String> getColor() {
    return color;
  }

  public void setColor(JsonNullable<String> color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTypeStatusOptionResponse customTypeStatusOptionResponse = (CustomTypeStatusOptionResponse) o;
    return Objects.equals(this.gid, customTypeStatusOptionResponse.gid) &&
        Objects.equals(this.resourceType, customTypeStatusOptionResponse.resourceType) &&
        Objects.equals(this.name, customTypeStatusOptionResponse.name) &&
        equalsNullable(this.completionState, customTypeStatusOptionResponse.completionState) &&
        equalsNullable(this.enabled, customTypeStatusOptionResponse.enabled) &&
        equalsNullable(this.color, customTypeStatusOptionResponse.color);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, hashCodeNullable(completionState), hashCodeNullable(enabled), hashCodeNullable(color));
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
    sb.append("class CustomTypeStatusOptionResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    completionState: ").append(toIndentedString(completionState)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

