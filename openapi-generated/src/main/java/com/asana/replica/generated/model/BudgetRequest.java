package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.BudgetActualRequest;
import com.asana.replica.generated.model.BudgetEstimateRequest;
import com.asana.replica.generated.model.BudgetTotalRequest;
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
 * BudgetRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BudgetRequest {

  private @Nullable String gid;

  private @Nullable String resourceType;

  /**
   * The type of the budget, in \"cost\" or \"time\". The value of this property will dictate how the corresponding values for actual, estimate, and total are interpreted.
   */
  public enum BudgetTypeEnum {
    COST("cost"),
    
    TIME("time");

    private final String value;

    BudgetTypeEnum(String value) {
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
    public static BudgetTypeEnum fromValue(String value) {
      for (BudgetTypeEnum b : BudgetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable BudgetTypeEnum budgetType;

  private @Nullable BudgetEstimateRequest estimate;

  private @Nullable BudgetActualRequest actual;

  private @Nullable BudgetTotalRequest total;

  private @Nullable String parent;

  public BudgetRequest gid(@Nullable String gid) {
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

  public BudgetRequest resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "budget", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public BudgetRequest budgetType(@Nullable BudgetTypeEnum budgetType) {
    this.budgetType = budgetType;
    return this;
  }

  /**
   * The type of the budget, in \"cost\" or \"time\". The value of this property will dictate how the corresponding values for actual, estimate, and total are interpreted.
   * @return budgetType
   */
  
  @Schema(name = "budget_type", description = "The type of the budget, in \"cost\" or \"time\". The value of this property will dictate how the corresponding values for actual, estimate, and total are interpreted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("budget_type")
  public @Nullable BudgetTypeEnum getBudgetType() {
    return budgetType;
  }

  public void setBudgetType(@Nullable BudgetTypeEnum budgetType) {
    this.budgetType = budgetType;
  }

  public BudgetRequest estimate(@Nullable BudgetEstimateRequest estimate) {
    this.estimate = estimate;
    return this;
  }

  /**
   * Get estimate
   * @return estimate
   */
  @Valid 
  @Schema(name = "estimate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimate")
  public @Nullable BudgetEstimateRequest getEstimate() {
    return estimate;
  }

  public void setEstimate(@Nullable BudgetEstimateRequest estimate) {
    this.estimate = estimate;
  }

  public BudgetRequest actual(@Nullable BudgetActualRequest actual) {
    this.actual = actual;
    return this;
  }

  /**
   * Get actual
   * @return actual
   */
  @Valid 
  @Schema(name = "actual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actual")
  public @Nullable BudgetActualRequest getActual() {
    return actual;
  }

  public void setActual(@Nullable BudgetActualRequest actual) {
    this.actual = actual;
  }

  public BudgetRequest total(@Nullable BudgetTotalRequest total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
   */
  @Valid 
  @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public @Nullable BudgetTotalRequest getTotal() {
    return total;
  }

  public void setTotal(@Nullable BudgetTotalRequest total) {
    this.total = total;
  }

  public BudgetRequest parent(@Nullable String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Globally unique ID of the parent object: project. Can only be set on create, immutable thereafter.
   * @return parent
   */
  
  @Schema(name = "parent", example = "181636", description = "Globally unique ID of the parent object: project. Can only be set on create, immutable thereafter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable String getParent() {
    return parent;
  }

  public void setParent(@Nullable String parent) {
    this.parent = parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetRequest budgetRequest = (BudgetRequest) o;
    return Objects.equals(this.gid, budgetRequest.gid) &&
        Objects.equals(this.resourceType, budgetRequest.resourceType) &&
        Objects.equals(this.budgetType, budgetRequest.budgetType) &&
        Objects.equals(this.estimate, budgetRequest.estimate) &&
        Objects.equals(this.actual, budgetRequest.actual) &&
        Objects.equals(this.total, budgetRequest.total) &&
        Objects.equals(this.parent, budgetRequest.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, budgetType, estimate, actual, total, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
    sb.append("    estimate: ").append(toIndentedString(estimate)).append("\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

