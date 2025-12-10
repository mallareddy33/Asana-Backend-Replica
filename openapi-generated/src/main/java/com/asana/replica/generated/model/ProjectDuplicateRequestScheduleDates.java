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
 * A dictionary of options to auto-shift dates. &#x60;task_dates&#x60; must be included to use this option. Requires &#x60;should_skip_weekends&#x60; and either &#x60;start_on&#x60; or &#x60;due_on&#x60;, but not both.
 */

@Schema(name = "ProjectDuplicateRequest_schedule_dates", description = "A dictionary of options to auto-shift dates. `task_dates` must be included to use this option. Requires `should_skip_weekends` and either `start_on` or `due_on`, but not both.")
@JsonTypeName("ProjectDuplicateRequest_schedule_dates")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectDuplicateRequestScheduleDates {

  private @Nullable Boolean shouldSkipWeekends;

  private @Nullable String dueOn;

  private @Nullable String startOn;

  public ProjectDuplicateRequestScheduleDates shouldSkipWeekends(@Nullable Boolean shouldSkipWeekends) {
    this.shouldSkipWeekends = shouldSkipWeekends;
    return this;
  }

  /**
   * **Required**: Determines if the auto-shifted dates should skip weekends.
   * @return shouldSkipWeekends
   */
  
  @Schema(name = "should_skip_weekends", example = "true", description = "**Required**: Determines if the auto-shifted dates should skip weekends.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("should_skip_weekends")
  public @Nullable Boolean getShouldSkipWeekends() {
    return shouldSkipWeekends;
  }

  public void setShouldSkipWeekends(@Nullable Boolean shouldSkipWeekends) {
    this.shouldSkipWeekends = shouldSkipWeekends;
  }

  public ProjectDuplicateRequestScheduleDates dueOn(@Nullable String dueOn) {
    this.dueOn = dueOn;
    return this;
  }

  /**
   * Sets the last due date in the duplicated project to the given date. The rest of the due dates will be offset by the same amount as the due dates in the original project.
   * @return dueOn
   */
  
  @Schema(name = "due_on", example = "2019-05-21", description = "Sets the last due date in the duplicated project to the given date. The rest of the due dates will be offset by the same amount as the due dates in the original project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public @Nullable String getDueOn() {
    return dueOn;
  }

  public void setDueOn(@Nullable String dueOn) {
    this.dueOn = dueOn;
  }

  public ProjectDuplicateRequestScheduleDates startOn(@Nullable String startOn) {
    this.startOn = startOn;
    return this;
  }

  /**
   * Sets the first start date in the duplicated project to the given date. The rest of the start dates will be offset by the same amount as the start dates in the original project.
   * @return startOn
   */
  
  @Schema(name = "start_on", example = "2019-05-21", description = "Sets the first start date in the duplicated project to the given date. The rest of the start dates will be offset by the same amount as the start dates in the original project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public @Nullable String getStartOn() {
    return startOn;
  }

  public void setStartOn(@Nullable String startOn) {
    this.startOn = startOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDuplicateRequestScheduleDates projectDuplicateRequestScheduleDates = (ProjectDuplicateRequestScheduleDates) o;
    return Objects.equals(this.shouldSkipWeekends, projectDuplicateRequestScheduleDates.shouldSkipWeekends) &&
        Objects.equals(this.dueOn, projectDuplicateRequestScheduleDates.dueOn) &&
        Objects.equals(this.startOn, projectDuplicateRequestScheduleDates.startOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shouldSkipWeekends, dueOn, startOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDuplicateRequestScheduleDates {\n");
    sb.append("    shouldSkipWeekends: ").append(toIndentedString(shouldSkipWeekends)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
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

