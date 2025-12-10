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
 * Defines how the total portion of a budget is configured. The total represents a user-defined target value, not an aggregated one. This object specifies whether the total is displayed and the current value for the selected budget_type.
 */

@Schema(name = "BudgetTotalRequest", description = "Defines how the total portion of a budget is configured. The total represents a user-defined target value, not an aggregated one. This object specifies whether the total is displayed and the current value for the selected budget_type.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BudgetTotalRequest {

  private @Nullable Boolean enabled;

  private @Nullable BigDecimal value;

  public BudgetTotalRequest enabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Indicates whether the total value is active and should be displayed in the budget. This flag primarily affects UI presentation and the response payload.
   * @return enabled
   */
  
  @Schema(name = "enabled", example = "true", description = "Indicates whether the total value is active and should be displayed in the budget. This flag primarily affects UI presentation and the response payload.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public BudgetTotalRequest value(@Nullable BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The user-set value for the total budget. When `budget_type` is `time`, represents minutes. When `budget_type` is `cost`, represents the monetary amount in the domain's currency. This value is stored separately for each `budget_type`, so switching between types preserves each value.
   * @return value
   */
  @Valid 
  @Schema(name = "value", example = "100", description = "The user-set value for the total budget. When `budget_type` is `time`, represents minutes. When `budget_type` is `cost`, represents the monetary amount in the domain's currency. This value is stored separately for each `budget_type`, so switching between types preserves each value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BudgetTotalRequest budgetTotalRequest = (BudgetTotalRequest) o;
    return Objects.equals(this.enabled, budgetTotalRequest.enabled) &&
        Objects.equals(this.value, budgetTotalRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetTotalRequest {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

