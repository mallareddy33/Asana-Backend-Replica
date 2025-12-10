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

@Schema(name = "RateRequest", description = "A generic Asana Resource, containing a globally unique identifier.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class RateRequest {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private String parent;

  private String resource;

  private BigDecimal rate;

  public RateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RateRequest(String parent, String resource, BigDecimal rate) {
    this.parent = parent;
    this.resource = resource;
    this.rate = rate;
  }

  public RateRequest gid(@Nullable String gid) {
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

  public RateRequest resourceType(@Nullable String resourceType) {
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

  public RateRequest parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Globally unique ID of the parent object: project.
   * @return parent
   */
  @NotNull 
  @Schema(name = "parent", example = "12345", description = "Globally unique ID of the parent object: project.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public RateRequest resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Globally unique ID of the resource object: user or placeholder.
   * @return resource
   */
  @NotNull 
  @Schema(name = "resource", example = "12345", description = "Globally unique ID of the resource object: user or placeholder.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resource")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public RateRequest rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * The monetary value of the rate.
   * @return rate
   */
  @NotNull @Valid 
  @Schema(name = "rate", example = "100", description = "The monetary value of the rate.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rate")
  public BigDecimal getRate() {
    return rate;
  }

  public void setRate(BigDecimal rate) {
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
    RateRequest rateRequest = (RateRequest) o;
    return Objects.equals(this.gid, rateRequest.gid) &&
        Objects.equals(this.resourceType, rateRequest.resourceType) &&
        Objects.equals(this.parent, rateRequest.parent) &&
        Objects.equals(this.resource, rateRequest.resource) &&
        Objects.equals(this.rate, rateRequest.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, parent, resource, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

