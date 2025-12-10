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
 * A response object returned from the task count endpoint.
 */

@Schema(name = "TaskCountResponse", description = "A response object returned from the task count endpoint.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskCountResponse {

  private @Nullable Integer numTasks;

  private @Nullable Integer numIncompleteTasks;

  private @Nullable Integer numCompletedTasks;

  private @Nullable Integer numMilestones;

  private @Nullable Integer numIncompleteMilestones;

  private @Nullable Integer numCompletedMilestones;

  public TaskCountResponse numTasks(@Nullable Integer numTasks) {
    this.numTasks = numTasks;
    return this;
  }

  /**
   * The number of tasks in a project.
   * @return numTasks
   */
  
  @Schema(name = "num_tasks", example = "200", description = "The number of tasks in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_tasks")
  public @Nullable Integer getNumTasks() {
    return numTasks;
  }

  public void setNumTasks(@Nullable Integer numTasks) {
    this.numTasks = numTasks;
  }

  public TaskCountResponse numIncompleteTasks(@Nullable Integer numIncompleteTasks) {
    this.numIncompleteTasks = numIncompleteTasks;
    return this;
  }

  /**
   * The number of incomplete tasks in a project.
   * @return numIncompleteTasks
   */
  
  @Schema(name = "num_incomplete_tasks", example = "50", description = "The number of incomplete tasks in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_incomplete_tasks")
  public @Nullable Integer getNumIncompleteTasks() {
    return numIncompleteTasks;
  }

  public void setNumIncompleteTasks(@Nullable Integer numIncompleteTasks) {
    this.numIncompleteTasks = numIncompleteTasks;
  }

  public TaskCountResponse numCompletedTasks(@Nullable Integer numCompletedTasks) {
    this.numCompletedTasks = numCompletedTasks;
    return this;
  }

  /**
   * The number of completed tasks in a project.
   * @return numCompletedTasks
   */
  
  @Schema(name = "num_completed_tasks", example = "150", description = "The number of completed tasks in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_completed_tasks")
  public @Nullable Integer getNumCompletedTasks() {
    return numCompletedTasks;
  }

  public void setNumCompletedTasks(@Nullable Integer numCompletedTasks) {
    this.numCompletedTasks = numCompletedTasks;
  }

  public TaskCountResponse numMilestones(@Nullable Integer numMilestones) {
    this.numMilestones = numMilestones;
    return this;
  }

  /**
   * The number of milestones in a project.
   * @return numMilestones
   */
  
  @Schema(name = "num_milestones", example = "10", description = "The number of milestones in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_milestones")
  public @Nullable Integer getNumMilestones() {
    return numMilestones;
  }

  public void setNumMilestones(@Nullable Integer numMilestones) {
    this.numMilestones = numMilestones;
  }

  public TaskCountResponse numIncompleteMilestones(@Nullable Integer numIncompleteMilestones) {
    this.numIncompleteMilestones = numIncompleteMilestones;
    return this;
  }

  /**
   * The number of incomplete milestones in a project.
   * @return numIncompleteMilestones
   */
  
  @Schema(name = "num_incomplete_milestones", example = "7", description = "The number of incomplete milestones in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_incomplete_milestones")
  public @Nullable Integer getNumIncompleteMilestones() {
    return numIncompleteMilestones;
  }

  public void setNumIncompleteMilestones(@Nullable Integer numIncompleteMilestones) {
    this.numIncompleteMilestones = numIncompleteMilestones;
  }

  public TaskCountResponse numCompletedMilestones(@Nullable Integer numCompletedMilestones) {
    this.numCompletedMilestones = numCompletedMilestones;
    return this;
  }

  /**
   * The number of completed milestones in a project.
   * @return numCompletedMilestones
   */
  
  @Schema(name = "num_completed_milestones", example = "3", description = "The number of completed milestones in a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_completed_milestones")
  public @Nullable Integer getNumCompletedMilestones() {
    return numCompletedMilestones;
  }

  public void setNumCompletedMilestones(@Nullable Integer numCompletedMilestones) {
    this.numCompletedMilestones = numCompletedMilestones;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskCountResponse taskCountResponse = (TaskCountResponse) o;
    return Objects.equals(this.numTasks, taskCountResponse.numTasks) &&
        Objects.equals(this.numIncompleteTasks, taskCountResponse.numIncompleteTasks) &&
        Objects.equals(this.numCompletedTasks, taskCountResponse.numCompletedTasks) &&
        Objects.equals(this.numMilestones, taskCountResponse.numMilestones) &&
        Objects.equals(this.numIncompleteMilestones, taskCountResponse.numIncompleteMilestones) &&
        Objects.equals(this.numCompletedMilestones, taskCountResponse.numCompletedMilestones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numTasks, numIncompleteTasks, numCompletedTasks, numMilestones, numIncompleteMilestones, numCompletedMilestones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskCountResponse {\n");
    sb.append("    numTasks: ").append(toIndentedString(numTasks)).append("\n");
    sb.append("    numIncompleteTasks: ").append(toIndentedString(numIncompleteTasks)).append("\n");
    sb.append("    numCompletedTasks: ").append(toIndentedString(numCompletedTasks)).append("\n");
    sb.append("    numMilestones: ").append(toIndentedString(numMilestones)).append("\n");
    sb.append("    numIncompleteMilestones: ").append(toIndentedString(numIncompleteMilestones)).append("\n");
    sb.append("    numCompletedMilestones: ").append(toIndentedString(numCompletedMilestones)).append("\n");
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

