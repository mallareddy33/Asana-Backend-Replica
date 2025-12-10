package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DateVariableRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class DateVariableRequest {

  private @Nullable String gid;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> value = JsonNullable.<OffsetDateTime>undefined();

  public DateVariableRequest gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the date field in the project template. A value of `1` refers to the project start date, while `2` refers to the project due date.
   * @return gid
   */
  
  @Schema(name = "gid", example = "1", description = "Globally unique identifier of the date field in the project template. A value of `1` refers to the project start date, while `2` refers to the project due date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public DateVariableRequest value(OffsetDateTime value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * The date with which the date variable should be replaced when instantiating a project. This takes a date with `YYYY-MM-DD` format.
   * @return value
   */
  @Valid 
  @Schema(name = "value", description = "The date with which the date variable should be replaced when instantiating a project. This takes a date with `YYYY-MM-DD` format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public JsonNullable<OffsetDateTime> getValue() {
    return value;
  }

  public void setValue(JsonNullable<OffsetDateTime> value) {
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
    DateVariableRequest dateVariableRequest = (DateVariableRequest) o;
    return Objects.equals(this.gid, dateVariableRequest.gid) &&
        equalsNullable(this.value, dateVariableRequest.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, hashCodeNullable(value));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateVariableRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
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

