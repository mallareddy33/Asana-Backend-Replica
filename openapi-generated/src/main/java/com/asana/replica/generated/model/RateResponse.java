package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.ProjectCompact;
import com.asana.replica.generated.model.UserCompact;
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
 * RateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class RateResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable ProjectCompact parent;

  private @Nullable UserCompact resource;

  private @Nullable BigDecimal rate;

  private @Nullable String currencyCode;

  private @Nullable UserCompact createdBy;

  public RateResponse gid(@Nullable String gid) {
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

  public RateResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "rate", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public RateResponse parent(@Nullable ProjectCompact parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable ProjectCompact getParent() {
    return parent;
  }

  public void setParent(@Nullable ProjectCompact parent) {
    this.parent = parent;
  }

  public RateResponse resource(@Nullable UserCompact resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   */
  @Valid 
  @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource")
  public @Nullable UserCompact getResource() {
    return resource;
  }

  public void setResource(@Nullable UserCompact resource) {
    this.resource = resource;
  }

  public RateResponse rate(@Nullable BigDecimal rate) {
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

  public RateResponse currencyCode(@Nullable String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency code of the rate, set at the domain level.
   * @return currencyCode
   */
  
  @Schema(name = "currency_code", accessMode = Schema.AccessMode.READ_ONLY, example = "USD", description = "The currency code of the rate, set at the domain level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency_code")
  public @Nullable String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@Nullable String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public RateResponse createdBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @Valid 
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public @Nullable UserCompact getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateResponse rateResponse = (RateResponse) o;
    return Objects.equals(this.gid, rateResponse.gid) &&
        Objects.equals(this.resourceType, rateResponse.resourceType) &&
        Objects.equals(this.parent, rateResponse.parent) &&
        Objects.equals(this.resource, rateResponse.resource) &&
        Objects.equals(this.rate, rateResponse.rate) &&
        Objects.equals(this.currencyCode, rateResponse.currencyCode) &&
        Objects.equals(this.createdBy, rateResponse.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, parent, resource, rate, currencyCode, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

