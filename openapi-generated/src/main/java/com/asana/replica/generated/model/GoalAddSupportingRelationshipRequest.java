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
 * GoalAddSupportingRelationshipRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GoalAddSupportingRelationshipRequest {

  private String supportingResource;

  private @Nullable String insertBefore;

  private @Nullable String insertAfter;

  private @Nullable BigDecimal contributionWeight;

  public GoalAddSupportingRelationshipRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoalAddSupportingRelationshipRequest(String supportingResource) {
    this.supportingResource = supportingResource;
  }

  public GoalAddSupportingRelationshipRequest supportingResource(String supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  /**
   * The gid of the supporting resource to add to the parent goal. Must be the gid of a goal, project, task, or portfolio.
   * @return supportingResource
   */
  @NotNull 
  @Schema(name = "supporting_resource", example = "12345", description = "The gid of the supporting resource to add to the parent goal. Must be the gid of a goal, project, task, or portfolio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("supporting_resource")
  public String getSupportingResource() {
    return supportingResource;
  }

  public void setSupportingResource(String supportingResource) {
    this.supportingResource = supportingResource;
  }

  public GoalAddSupportingRelationshipRequest insertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * An id of a subgoal of this parent goal. The new subgoal will be added before the one specified here. `insert_before` and `insert_after` parameters cannot both be specified. Currently only supported when adding a subgoal.
   * @return insertBefore
   */
  
  @Schema(name = "insert_before", example = "1331", description = "An id of a subgoal of this parent goal. The new subgoal will be added before the one specified here. `insert_before` and `insert_after` parameters cannot both be specified. Currently only supported when adding a subgoal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public @Nullable String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public GoalAddSupportingRelationshipRequest insertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * An id of a subgoal of this parent goal. The new subgoal will be added after the one specified here. `insert_before` and `insert_after` parameters cannot both be specified. Currently only supported when adding a subgoal.
   * @return insertAfter
   */
  
  @Schema(name = "insert_after", example = "1331", description = "An id of a subgoal of this parent goal. The new subgoal will be added after the one specified here. `insert_before` and `insert_after` parameters cannot both be specified. Currently only supported when adding a subgoal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public @Nullable String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public GoalAddSupportingRelationshipRequest contributionWeight(@Nullable BigDecimal contributionWeight) {
    this.contributionWeight = contributionWeight;
    return this;
  }

  /**
   * Defines how much the supporting goal’s progress contributes to the parent goal’s overall progress. When used with automatically calculated [Goal Metrics](/reference/creategoalmetric) (such as `progress_source = subgoal_progress`), this value must be greater than 0 for the subgoal to count toward the parent goal’s progress. Accepts a number between 0 and 1 (inclusive). Defaults to `0`.
   * @return contributionWeight
   */
  @Valid 
  @Schema(name = "contribution_weight", example = "0", description = "Defines how much the supporting goal’s progress contributes to the parent goal’s overall progress. When used with automatically calculated [Goal Metrics](/reference/creategoalmetric) (such as `progress_source = subgoal_progress`), this value must be greater than 0 for the subgoal to count toward the parent goal’s progress. Accepts a number between 0 and 1 (inclusive). Defaults to `0`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contribution_weight")
  public @Nullable BigDecimal getContributionWeight() {
    return contributionWeight;
  }

  public void setContributionWeight(@Nullable BigDecimal contributionWeight) {
    this.contributionWeight = contributionWeight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalAddSupportingRelationshipRequest goalAddSupportingRelationshipRequest = (GoalAddSupportingRelationshipRequest) o;
    return Objects.equals(this.supportingResource, goalAddSupportingRelationshipRequest.supportingResource) &&
        Objects.equals(this.insertBefore, goalAddSupportingRelationshipRequest.insertBefore) &&
        Objects.equals(this.insertAfter, goalAddSupportingRelationshipRequest.insertAfter) &&
        Objects.equals(this.contributionWeight, goalAddSupportingRelationshipRequest.contributionWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportingResource, insertBefore, insertAfter, contributionWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalAddSupportingRelationshipRequest {\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    contributionWeight: ").append(toIndentedString(contributionWeight)).append("\n");
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

