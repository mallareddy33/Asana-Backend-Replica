package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.BudgetActualResponse;
import com.asana.replica.generated.model.BudgetEstimateResponse;
import com.asana.replica.generated.model.BudgetResponseAllOfParent;
import com.asana.replica.generated.model.BudgetTotalResponse;
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
 * BudgetResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BudgetResponse {

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

  private @Nullable BudgetEstimateResponse estimate;

  private @Nullable BudgetActualResponse actual;

  private @Nullable BudgetTotalResponse total;

  private @Nullable BudgetResponseAllOfParent parent;

  public BudgetResponse gid(@Nullable String gid) {
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

  public BudgetResponse resourceType(@Nullable String resourceType) {
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

  public BudgetResponse budgetType(@Nullable BudgetTypeEnum budgetType) {
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

  public BudgetResponse estimate(@Nullable BudgetEstimateResponse estimate) {
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
  public @Nullable BudgetEstimateResponse getEstimate() {
    return estimate;
  }

  public void setEstimate(@Nullable BudgetEstimateResponse estimate) {
    this.estimate = estimate;
  }

  public BudgetResponse actual(@Nullable BudgetActualResponse actual) {
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
  public @Nullable BudgetActualResponse getActual() {
    return actual;
  }

  public void setActual(@Nullable BudgetActualResponse actual) {
    this.actual = actual;
  }

  public BudgetResponse total(@Nullable BudgetTotalResponse total) {
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
  public @Nullable BudgetTotalResponse getTotal() {
    return total;
  }

  public void setTotal(@Nullable BudgetTotalResponse total) {
    this.total = total;
  }

  public BudgetResponse parent(@Nullable BudgetResponseAllOfParent parent) {
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
  public @Nullable BudgetResponseAllOfParent getParent() {
    return parent;
  }

  public void setParent(@Nullable BudgetResponseAllOfParent parent) {
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
    BudgetResponse budgetResponse = (BudgetResponse) o;
    return Objects.equals(this.gid, budgetResponse.gid) &&
        Objects.equals(this.resourceType, budgetResponse.resourceType) &&
        Objects.equals(this.budgetType, budgetResponse.budgetType) &&
        Objects.equals(this.estimate, budgetResponse.estimate) &&
        Objects.equals(this.actual, budgetResponse.actual) &&
        Objects.equals(this.total, budgetResponse.total) &&
        Objects.equals(this.parent, budgetResponse.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, budgetType, estimate, actual, total, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetResponse {\n");
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

