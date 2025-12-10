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
 * BudgetEstimateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BudgetEstimateResponse {

  /**
   * Billable status filter applied to the estimate when `source` is `tasks`. Ignored when `source` is `capacity_plans` or `none`. When not provided, defaults to `billable`.
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

  /**
   * The data source for the estimate. `tasks`: use task-level estimated time attributed to the parent. `capacity_plans`: use capacity plan estimates attributed to the parent. `none`: disables the estimate; only valid when `enabled` is `false`. When `enabled` is `true`, `source` must not be `none`.
   */
  public enum SourceEnum {
    NONE("none"),
    
    TASKS("tasks"),
    
    CAPACITY_PLANS("capacity_plans");

    private final String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SourceEnum source;

  private @Nullable Boolean enabled;

  private @Nullable String units;

  private @Nullable BigDecimal value;

  public BudgetEstimateResponse billableStatusFilter(@Nullable BillableStatusFilterEnum billableStatusFilter) {
    this.billableStatusFilter = billableStatusFilter;
    return this;
  }

  /**
   * Billable status filter applied to the estimate when `source` is `tasks`. Ignored when `source` is `capacity_plans` or `none`. When not provided, defaults to `billable`.
   * @return billableStatusFilter
   */
  
  @Schema(name = "billable_status_filter", description = "Billable status filter applied to the estimate when `source` is `tasks`. Ignored when `source` is `capacity_plans` or `none`. When not provided, defaults to `billable`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("billable_status_filter")
  public @Nullable BillableStatusFilterEnum getBillableStatusFilter() {
    return billableStatusFilter;
  }

  public void setBillableStatusFilter(@Nullable BillableStatusFilterEnum billableStatusFilter) {
    this.billableStatusFilter = billableStatusFilter;
  }

  public BudgetEstimateResponse source(@Nullable SourceEnum source) {
    this.source = source;
    return this;
  }

  /**
   * The data source for the estimate. `tasks`: use task-level estimated time attributed to the parent. `capacity_plans`: use capacity plan estimates attributed to the parent. `none`: disables the estimate; only valid when `enabled` is `false`. When `enabled` is `true`, `source` must not be `none`.
   * @return source
   */
  
  @Schema(name = "source", example = "tasks", description = "The data source for the estimate. `tasks`: use task-level estimated time attributed to the parent. `capacity_plans`: use capacity plan estimates attributed to the parent. `none`: disables the estimate; only valid when `enabled` is `false`. When `enabled` is `true`, `source` must not be `none`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public @Nullable SourceEnum getSource() {
    return source;
  }

  public void setSource(@Nullable SourceEnum source) {
    this.source = source;
  }

  public BudgetEstimateResponse enabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Controls whether the estimate is displayed in the budget. This flag primarily affects UI presentation and the response payload. When `false` (and `source` is `none`), the estimate is hidden and the API response will return `value: null` and `units: null` for this field.
   * @return enabled
   */
  
  @Schema(name = "enabled", example = "true", description = "Controls whether the estimate is displayed in the budget. This flag primarily affects UI presentation and the response payload. When `false` (and `source` is `none`), the estimate is hidden and the API response will return `value: null` and `units: null` for this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public BudgetEstimateResponse units(@Nullable String units) {
    this.units = units;
    return this;
  }

  /**
   * The units of the estimate value. When `budget_type` is `time`, units are `\"minutes\"`. When `budget_type` is `cost`, units are the ISO 4217 currency code configured at the domain level. When `source` is `none` and `enabled` is `false`, this field will be `null`.
   * @return units
   */
  
  @Schema(name = "units", accessMode = Schema.AccessMode.READ_ONLY, example = "USD", description = "The units of the estimate value. When `budget_type` is `time`, units are `\"minutes\"`. When `budget_type` is `cost`, units are the ISO 4217 currency code configured at the domain level. When `source` is `none` and `enabled` is `false`, this field will be `null`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("units")
  public @Nullable String getUnits() {
    return units;
  }

  public void setUnits(@Nullable String units) {
    this.units = units;
  }

  public BudgetEstimateResponse value(@Nullable BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The aggregated estimate value for the budget. This value is computed based on the selected `source` and, when `source` is `tasks`, the specified `billable_status_filter`. When `budget_type` is `time`, represents the aggregated estimated minutes on the parent. When `budget_type` is `cost`, represents the aggregated estimated cost on the parent (estimated time x resource rate). When `source` is `none` and `enabled` is `false`, this field will be `null`.
   * @return value
   */
  @Valid 
  @Schema(name = "value", accessMode = Schema.AccessMode.READ_ONLY, example = "100", description = "The aggregated estimate value for the budget. This value is computed based on the selected `source` and, when `source` is `tasks`, the specified `billable_status_filter`. When `budget_type` is `time`, represents the aggregated estimated minutes on the parent. When `budget_type` is `cost`, represents the aggregated estimated cost on the parent (estimated time x resource rate). When `source` is `none` and `enabled` is `false`, this field will be `null`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable BigDecimal getValue() {
    return value;
  }

  public void setValue(@Nullable BigDecimal value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetEstimateResponse budgetEstimateResponse = (BudgetEstimateResponse) o;
    return Objects.equals(this.billableStatusFilter, budgetEstimateResponse.billableStatusFilter) &&
        Objects.equals(this.source, budgetEstimateResponse.source) &&
        Objects.equals(this.enabled, budgetEstimateResponse.enabled) &&
        Objects.equals(this.units, budgetEstimateResponse.units) &&
        Objects.equals(this.value, budgetEstimateResponse.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableStatusFilter, source, enabled, units, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetEstimateResponse {\n");
    sb.append("    billableStatusFilter: ").append(toIndentedString(billableStatusFilter)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

