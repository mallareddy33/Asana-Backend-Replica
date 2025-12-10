package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * BudgetActualResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BudgetActualResponse {

  /**
   * Billable status filter applied to time tracking entries contributing to the actual value. Determines which entries are included in aggregation. When not provided, defaults to `billable`.
   */
  public enum BillableStatusFilterEnum {
    BILLABLE("billable"),
    
    NON_BILLABLE("non_billable"),
    
    ANY("any");

    private final String value;

    BillableStatusFilterEnum(String value) {
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
    public static BillableStatusFilterEnum fromValue(String value) {
      for (BillableStatusFilterEnum b : BillableStatusFilterEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable BillableStatusFilterEnum billableStatusFilter;

  private @Nullable BigDecimal value;

  private @Nullable String units;

  public BudgetActualResponse billableStatusFilter(@Nullable BillableStatusFilterEnum billableStatusFilter) {
    this.billableStatusFilter = billableStatusFilter;
    return this;
  }

  /**
   * Billable status filter applied to time tracking entries contributing to the actual value. Determines which entries are included in aggregation. When not provided, defaults to `billable`.
   * @return billableStatusFilter
   */
  
  @Schema(name = "billable_status_filter", example = "billable", description = "Billable status filter applied to time tracking entries contributing to the actual value. Determines which entries are included in aggregation. When not provided, defaults to `billable`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billable_status_filter")
  public @Nullable BillableStatusFilterEnum getBillableStatusFilter() {
    return billableStatusFilter;
  }

  public void setBillableStatusFilter(@Nullable BillableStatusFilterEnum billableStatusFilter) {
    this.billableStatusFilter = billableStatusFilter;
  }

  public BudgetActualResponse value(@Nullable BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The aggregated actual value for the budget. * When `budget_type` is `time`, represents the total actual minutes from time tracking entries. * When `budget_type` is `cost`, represents the total actual cost, computed as (actual time × resource rate).
   * @return value
   */
  @Valid 
  @Schema(name = "value", accessMode = Schema.AccessMode.READ_ONLY, example = "100", description = "The aggregated actual value for the budget. * When `budget_type` is `time`, represents the total actual minutes from time tracking entries. * When `budget_type` is `cost`, represents the total actual cost, computed as (actual time × resource rate).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable BigDecimal getValue() {
    return value;
  }

  public void setValue(@Nullable BigDecimal value) {
    this.value = value;
  }

  public BudgetActualResponse units(@Nullable String units) {
    this.units = units;
    return this;
  }

  /**
   * The units of the actual value. * When `budget_type` is `time`, units are `\"minutes\"`. * When `budget_type` is `cost`, units are the ISO 4217 currency code configured at the domain level.
   * @return units
   */
  
  @Schema(name = "units", accessMode = Schema.AccessMode.READ_ONLY, example = "USD", description = "The units of the actual value. * When `budget_type` is `time`, units are `\"minutes\"`. * When `budget_type` is `cost`, units are the ISO 4217 currency code configured at the domain level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("units")
  public @Nullable String getUnits() {
    return units;
  }

  public void setUnits(@Nullable String units) {
    this.units = units;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetActualResponse budgetActualResponse = (BudgetActualResponse) o;
    return Objects.equals(this.billableStatusFilter, budgetActualResponse.billableStatusFilter) &&
        Objects.equals(this.value, budgetActualResponse.value) &&
        Objects.equals(this.units, budgetActualResponse.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableStatusFilter, value, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetActualResponse {\n");
    sb.append("    billableStatusFilter: ").append(toIndentedString(billableStatusFilter)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
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

