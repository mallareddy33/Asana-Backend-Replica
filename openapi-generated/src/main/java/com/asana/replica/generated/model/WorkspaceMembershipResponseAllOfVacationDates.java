package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * Contains keys &#x60;start_on&#x60; and &#x60;end_on&#x60; for the vacation dates for the user in this workspace. If &#x60;start_on&#x60; is null, the entire &#x60;vacation_dates&#x60; object will be null. If &#x60;end_on&#x60; is before today, the entire &#x60;vacation_dates&#x60; object will be null.
 */

@Schema(name = "WorkspaceMembershipResponse_allOf_vacation_dates", description = "Contains keys `start_on` and `end_on` for the vacation dates for the user in this workspace. If `start_on` is null, the entire `vacation_dates` object will be null. If `end_on` is before today, the entire `vacation_dates` object will be null.")
@JsonTypeName("WorkspaceMembershipResponse_allOf_vacation_dates")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class WorkspaceMembershipResponseAllOfVacationDates {

  private @Nullable String startOn;

  private JsonNullable<String> endOn = JsonNullable.<String>undefined();

  public WorkspaceMembershipResponseAllOfVacationDates startOn(@Nullable String startOn) {
    this.startOn = startOn;
    return this;
  }

  /**
   * The day on which the user's vacation in this workspace starts. This is a date with `YYYY-MM-DD` format.
   * @return startOn
   */
  
  @Schema(name = "start_on", example = "2022-11-05", description = "The day on which the user's vacation in this workspace starts. This is a date with `YYYY-MM-DD` format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public @Nullable String getStartOn() {
    return startOn;
  }

  public void setStartOn(@Nullable String startOn) {
    this.startOn = startOn;
  }

  public WorkspaceMembershipResponseAllOfVacationDates endOn(String endOn) {
    this.endOn = JsonNullable.of(endOn);
    return this;
  }

  /**
   * The day on which the user's vacation in this workspace ends, or null if there is no end date. This is a date with `YYYY-MM-DD` format.
   * @return endOn
   */
  
  @Schema(name = "end_on", example = "2022-11-07", description = "The day on which the user's vacation in this workspace ends, or null if there is no end date. This is a date with `YYYY-MM-DD` format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_on")
  public JsonNullable<String> getEndOn() {
    return endOn;
  }

  public void setEndOn(JsonNullable<String> endOn) {
    this.endOn = endOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceMembershipResponseAllOfVacationDates workspaceMembershipResponseAllOfVacationDates = (WorkspaceMembershipResponseAllOfVacationDates) o;
    return Objects.equals(this.startOn, workspaceMembershipResponseAllOfVacationDates.startOn) &&
        equalsNullable(this.endOn, workspaceMembershipResponseAllOfVacationDates.endOn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startOn, hashCodeNullable(endOn));
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
    sb.append("class WorkspaceMembershipResponseAllOfVacationDates {\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    endOn: ").append(toIndentedString(endOn)).append("\n");
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

