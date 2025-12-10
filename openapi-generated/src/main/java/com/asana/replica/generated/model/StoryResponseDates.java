package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
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
 * *Conditional*
 */

@Schema(name = "StoryResponseDates", description = "*Conditional*")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class StoryResponseDates {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> startOn = JsonNullable.<LocalDate>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dueAt = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate dueOn;

  public StoryResponseDates startOn(LocalDate startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.
   * @return startOn
   */
  @Valid 
  @Schema(name = "start_on", example = "2019-09-14", description = "The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<LocalDate> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<LocalDate> startOn) {
    this.startOn = startOn;
  }

  public StoryResponseDates dueAt(OffsetDateTime dueAt) {
    this.dueAt = JsonNullable.of(dueAt);
    return this;
  }

  /**
   * The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.
   * @return dueAt
   */
  @Valid 
  @Schema(name = "due_at", example = "2019-09-15T02:06:58.158Z", description = "The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_at")
  public JsonNullable<OffsetDateTime> getDueAt() {
    return dueAt;
  }

  public void setDueAt(JsonNullable<OffsetDateTime> dueAt) {
    this.dueAt = dueAt;
  }

  public StoryResponseDates dueOn(@Nullable LocalDate dueOn) {
    this.dueOn = dueOn;
    return this;
  }

  /**
   * The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.
   * @return dueOn
   */
  @Valid 
  @Schema(name = "due_on", example = "2019-09-15", description = "The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public @Nullable LocalDate getDueOn() {
    return dueOn;
  }

  public void setDueOn(@Nullable LocalDate dueOn) {
    this.dueOn = dueOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoryResponseDates storyResponseDates = (StoryResponseDates) o;
    return equalsNullable(this.startOn, storyResponseDates.startOn) &&
        equalsNullable(this.dueAt, storyResponseDates.dueAt) &&
        Objects.equals(this.dueOn, storyResponseDates.dueOn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(startOn), hashCodeNullable(dueAt), dueOn);
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
    sb.append("class StoryResponseDates {\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
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

