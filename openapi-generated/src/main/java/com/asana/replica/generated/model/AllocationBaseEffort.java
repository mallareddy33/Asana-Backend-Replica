package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * The amount of time associated with the allocation, represented as a percentage or number of hours.
 */

@Schema(name = "AllocationBase_effort", description = "The amount of time associated with the allocation, represented as a percentage or number of hours.")
@JsonTypeName("AllocationBase_effort")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AllocationBaseEffort {

  /**
   * The units used for tracking effort on an allocation, either \"hours\" or \"percent\".
   */
  public enum TypeEnum {
    HOURS("hours"),
    
    PERCENT("percent");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

  private @Nullable BigDecimal value;

  public AllocationBaseEffort type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The units used for tracking effort on an allocation, either \"hours\" or \"percent\".
   * @return type
   */
  
  @Schema(name = "type", description = "The units used for tracking effort on an allocation, either \"hours\" or \"percent\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public AllocationBaseEffort value(@Nullable BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The numeric effort value on the allocation.
   * @return value
   */
  @Valid 
  @Schema(name = "value", example = "50", description = "The numeric effort value on the allocation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AllocationBaseEffort allocationBaseEffort = (AllocationBaseEffort) o;
    return Objects.equals(this.type, allocationBaseEffort.type) &&
        Objects.equals(this.value, allocationBaseEffort.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllocationBaseEffort {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

