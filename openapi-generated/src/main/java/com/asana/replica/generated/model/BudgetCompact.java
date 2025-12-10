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
 * A *budget* object represents a budget for a given parent.
 */

@Schema(name = "BudgetCompact", description = "A *budget* object represents a budget for a given parent.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BudgetCompact {

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

  public BudgetCompact gid(@Nullable String gid) {
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

  public BudgetCompact resourceType(@Nullable String resourceType) {
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

  public BudgetCompact budgetType(@Nullable BudgetTypeEnum budgetType) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetCompact budgetCompact = (BudgetCompact) o;
    return Objects.equals(this.gid, budgetCompact.gid) &&
        Objects.equals(this.resourceType, budgetCompact.resourceType) &&
        Objects.equals(this.budgetType, budgetCompact.budgetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, budgetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
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

