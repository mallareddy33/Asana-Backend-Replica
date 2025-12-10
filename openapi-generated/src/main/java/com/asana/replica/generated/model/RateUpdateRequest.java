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

@Schema(name = "RateUpdateRequest", description = "A generic Asana Resource, containing a globally unique identifier.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class RateUpdateRequest {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable BigDecimal rate;

  public RateUpdateRequest gid(@Nullable String gid) {
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

  public RateUpdateRequest resourceType(@Nullable String resourceType) {
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

  public RateUpdateRequest rate(@Nullable BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The monetary value of the rate.
   * @return rate
   */
  @Valid 
  @Schema(name = "rate", example = "100", description = "The monetary value of the rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rate")
  public @Nullable BigDecimal getRate() {
    return rate;
  }

  public void setRate(@Nullable BigDecimal rate) {
    this.rate = rate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateUpdateRequest rateUpdateRequest = (RateUpdateRequest) o;
    return Objects.equals(this.gid, rateUpdateRequest.gid) &&
        Objects.equals(this.resourceType, rateUpdateRequest.resourceType) &&
        Objects.equals(this.rate, rateUpdateRequest.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateUpdateRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

