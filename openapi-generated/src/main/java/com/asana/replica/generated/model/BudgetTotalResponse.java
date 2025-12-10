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
 * BudgetTotalResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BudgetTotalResponse {

  private @Nullable Boolean enabled;

  private @Nullable BigDecimal value;

  private @Nullable String units;

  public BudgetTotalResponse enabled(@Nullable Boolean enabled) {
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

  public BudgetTotalResponse value(@Nullable BigDecimal value) {
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

  public BudgetTotalResponse units(@Nullable String units) {
    this.units = units;
    return this;
  }

  /**
   * The units of the total value. When `budget_type` is `time`, units are `\"minutes\"`. When `budget_type` is `cost`, units are the ISO 4217 currency code configured at the domain level. When `enabled` is `false`, this field will be `null`.
   * @return units
   */
  
  @Schema(name = "units", accessMode = Schema.AccessMode.READ_ONLY, example = "USD", description = "The units of the total value. When `budget_type` is `time`, units are `\"minutes\"`. When `budget_type` is `cost`, units are the ISO 4217 currency code configured at the domain level. When `enabled` is `false`, this field will be `null`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BudgetTotalResponse budgetTotalResponse = (BudgetTotalResponse) o;
    return Objects.equals(this.enabled, budgetTotalResponse.enabled) &&
        Objects.equals(this.value, budgetTotalResponse.value) &&
        Objects.equals(this.units, budgetTotalResponse.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, value, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetTotalResponse {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

