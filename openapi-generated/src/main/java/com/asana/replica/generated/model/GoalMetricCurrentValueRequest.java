package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
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

@Schema(name = "GoalMetricCurrentValueRequest", description = "A generic Asana Resource, containing a globally unique identifier.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GoalMetricCurrentValueRequest {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable BigDecimal currentNumberValue;

  public GoalMetricCurrentValueRequest gid(@Nullable String gid) {
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

  public GoalMetricCurrentValueRequest resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public GoalMetricCurrentValueRequest currentNumberValue(@Nullable BigDecimal currentNumberValue) {
    this.currentNumberValue = currentNumberValue;
    return this;
  }

  /**
   * *Conditional*. This number is the current value of a goal metric of type number.
   * @return currentNumberValue
   */
  @Valid 
  @Schema(name = "current_number_value", example = "8.12", description = "*Conditional*. This number is the current value of a goal metric of type number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_number_value")
  public @Nullable BigDecimal getCurrentNumberValue() {
    return currentNumberValue;
  }

  public void setCurrentNumberValue(@Nullable BigDecimal currentNumberValue) {
    this.currentNumberValue = currentNumberValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalMetricCurrentValueRequest goalMetricCurrentValueRequest = (GoalMetricCurrentValueRequest) o;
    return Objects.equals(this.gid, goalMetricCurrentValueRequest.gid) &&
        Objects.equals(this.resourceType, goalMetricCurrentValueRequest.resourceType) &&
        Objects.equals(this.currentNumberValue, goalMetricCurrentValueRequest.currentNumberValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, currentNumberValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalMetricCurrentValueRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    currentNumberValue: ").append(toIndentedString(currentNumberValue)).append("\n");
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

