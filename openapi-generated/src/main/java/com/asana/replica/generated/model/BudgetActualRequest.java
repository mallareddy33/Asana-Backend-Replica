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
 * Defines the configuration of the actual portion of a budget. The actual value represents aggregated time tracking data attributed to the budget’s parent. This object controls which time entries are included based on their billable status. When no entries match the selected filter, the value will be 0.
 */

@Schema(name = "BudgetActualRequest", description = "Defines the configuration of the actual portion of a budget. The actual value represents aggregated time tracking data attributed to the budget’s parent. This object controls which time entries are included based on their billable status. When no entries match the selected filter, the value will be 0.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BudgetActualRequest {

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

  public BudgetActualRequest billableStatusFilter(@Nullable BillableStatusFilterEnum billableStatusFilter) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetActualRequest budgetActualRequest = (BudgetActualRequest) o;
    return Objects.equals(this.billableStatusFilter, budgetActualRequest.billableStatusFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billableStatusFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetActualRequest {\n");
    sb.append("    billableStatusFilter: ").append(toIndentedString(billableStatusFilter)).append("\n");
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

