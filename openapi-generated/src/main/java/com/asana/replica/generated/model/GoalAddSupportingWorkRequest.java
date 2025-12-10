package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GoalAddSupportingWorkRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GoalAddSupportingWorkRequest {

  private String supportingWork;

  public GoalAddSupportingWorkRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoalAddSupportingWorkRequest(String supportingWork) {
    this.supportingWork = supportingWork;
  }

  public GoalAddSupportingWorkRequest supportingWork(String supportingWork) {
    this.supportingWork = supportingWork;
    return this;
  }

  /**
   * The project/task/portfolio gid to add as supporting work for a goal
   * @return supportingWork
   */
  @NotNull 
  @Schema(name = "supporting_work", example = "1331", description = "The project/task/portfolio gid to add as supporting work for a goal", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("supporting_work")
  public String getSupportingWork() {
    return supportingWork;
  }

  public void setSupportingWork(String supportingWork) {
    this.supportingWork = supportingWork;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalAddSupportingWorkRequest goalAddSupportingWorkRequest = (GoalAddSupportingWorkRequest) o;
    return Objects.equals(this.supportingWork, goalAddSupportingWorkRequest.supportingWork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportingWork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalAddSupportingWorkRequest {\n");
    sb.append("    supportingWork: ").append(toIndentedString(supportingWork)).append("\n");
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

