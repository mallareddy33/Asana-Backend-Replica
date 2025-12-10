package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * *Conditional*. Only relevant for custom fields of type &#x60;date&#x60;. This object reflects the chosen date (and optionally, time) value of a &#x60;date&#x60; custom field. If no date is selected, the value of &#x60;date_value&#x60; will be &#x60;null&#x60;.
 */

@Schema(name = "CustomFieldCompact_date_value", description = "*Conditional*. Only relevant for custom fields of type `date`. This object reflects the chosen date (and optionally, time) value of a `date` custom field. If no date is selected, the value of `date_value` will be `null`.")
@JsonTypeName("CustomFieldCompact_date_value")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class CustomFieldCompactDateValue {

  private @Nullable String date;

  private @Nullable String dateTime;

  public CustomFieldCompactDateValue date(@Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * A string representing the date in YYYY-MM-DD format.
   * @return date
   */
  
  @Schema(name = "date", example = "2024-08-23", description = "A string representing the date in YYYY-MM-DD format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public @Nullable String getDate() {
    return date;
  }

  public void setDate(@Nullable String date) {
    this.date = date;
  }

  public CustomFieldCompactDateValue dateTime(@Nullable String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * A string representing the date in ISO 8601 format. If no time value is selected, the value of `date-time` will be `null`.
   * @return dateTime
   */
  
  @Schema(name = "date_time", example = "2024-08-23T22:00:00.000Z", description = "A string representing the date in ISO 8601 format. If no time value is selected, the value of `date-time` will be `null`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_time")
  public @Nullable String getDateTime() {
    return dateTime;
  }

  public void setDateTime(@Nullable String dateTime) {
    this.dateTime = dateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldCompactDateValue customFieldCompactDateValue = (CustomFieldCompactDateValue) o;
    return Objects.equals(this.date, customFieldCompactDateValue.date) &&
        Objects.equals(this.dateTime, customFieldCompactDateValue.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldCompactDateValue {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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

