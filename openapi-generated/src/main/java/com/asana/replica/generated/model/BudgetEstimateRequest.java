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
 * Defines how the estimate portion of a budget is configured. This object controls whether the estimate is enabled, what data source it uses, and which tasks (by billable status) are included in calculating the estimate value. When disabled (enabled: false and source: none), the estimate is hidden and the API response will return &#x60;value: null&#x60; and &#x60;units: null&#x60; for this field.
 */

@Schema(name = "BudgetEstimateRequest", description = "Defines how the estimate portion of a budget is configured. This object controls whether the estimate is enabled, what data source it uses, and which tasks (by billable status) are included in calculating the estimate value. When disabled (enabled: false and source: none), the estimate is hidden and the API response will return `value: null` and `units: null` for this field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BudgetEstimateRequest {

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

  public BudgetEstimateRequest billableStatusFilter(@Nullable BillableStatusFilterEnum billableStatusFilter) {
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

  public BudgetEstimateRequest source(@Nullable SourceEnum source) {
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

  public BudgetEstimateRequest enabled(@Nullable Boolean enabled) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetEstimateRequest budgetEstimateRequest = (BudgetEstimateRequest) o;
    return Objects.equals(this.billableStatusFilter, budgetEstimateRequest.billableStatusFilter) &&
        Objects.equals(this.source, budgetEstimateRequest.source) &&
        Objects.equals(this.enabled, budgetEstimateRequest.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableStatusFilter, source, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetEstimateRequest {\n");
    sb.append("    billableStatusFilter: ").append(toIndentedString(billableStatusFilter)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

