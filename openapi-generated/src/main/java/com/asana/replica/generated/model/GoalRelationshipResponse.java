package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.GoalRelationshipBaseAllOfSupportedGoal;
import com.asana.replica.generated.model.GoalRelationshipCompactSupportingResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * GoalRelationshipResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GoalRelationshipResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   */
  public enum ResourceSubtypeEnum {
    SUBGOAL("subgoal"),
    
    SUPPORTING_WORK("supporting_work");

    private final String value;

    ResourceSubtypeEnum(String value) {
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
    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ResourceSubtypeEnum resourceSubtype;

  private @Nullable GoalRelationshipCompactSupportingResource supportingResource;

  private @Nullable BigDecimal contributionWeight;

  private @Nullable GoalRelationshipBaseAllOfSupportedGoal supportedGoal;

  public GoalRelationshipResponse gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
   */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public GoalRelationshipResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "goal_relationship", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public GoalRelationshipResponse resourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "subgoal", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public GoalRelationshipResponse supportingResource(@Nullable GoalRelationshipCompactSupportingResource supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  /**
   * Get supportingResource
   * @return supportingResource
   */
  @Valid 
  @Schema(name = "supporting_resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supporting_resource")
  public @Nullable GoalRelationshipCompactSupportingResource getSupportingResource() {
    return supportingResource;
  }

  public void setSupportingResource(@Nullable GoalRelationshipCompactSupportingResource supportingResource) {
    this.supportingResource = supportingResource;
  }

  public GoalRelationshipResponse contributionWeight(@Nullable BigDecimal contributionWeight) {
    this.contributionWeight = contributionWeight;
    return this;
  }

  /**
   * The weight that the supporting resource's progress contributes to the supported goal's progress. This can be 0, 1, or any value in between.
   * @return contributionWeight
   */
  @Valid 
  @Schema(name = "contribution_weight", example = "1.0", description = "The weight that the supporting resource's progress contributes to the supported goal's progress. This can be 0, 1, or any value in between.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contribution_weight")
  public @Nullable BigDecimal getContributionWeight() {
    return contributionWeight;
  }

  public void setContributionWeight(@Nullable BigDecimal contributionWeight) {
    this.contributionWeight = contributionWeight;
  }

  public GoalRelationshipResponse supportedGoal(@Nullable GoalRelationshipBaseAllOfSupportedGoal supportedGoal) {
    this.supportedGoal = supportedGoal;
    return this;
  }

  /**
   * Get supportedGoal
   * @return supportedGoal
   */
  @Valid 
  @Schema(name = "supported_goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supported_goal")
  public @Nullable GoalRelationshipBaseAllOfSupportedGoal getSupportedGoal() {
    return supportedGoal;
  }

  public void setSupportedGoal(@Nullable GoalRelationshipBaseAllOfSupportedGoal supportedGoal) {
    this.supportedGoal = supportedGoal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalRelationshipResponse goalRelationshipResponse = (GoalRelationshipResponse) o;
    return Objects.equals(this.gid, goalRelationshipResponse.gid) &&
        Objects.equals(this.resourceType, goalRelationshipResponse.resourceType) &&
        Objects.equals(this.resourceSubtype, goalRelationshipResponse.resourceSubtype) &&
        Objects.equals(this.supportingResource, goalRelationshipResponse.supportingResource) &&
        Objects.equals(this.contributionWeight, goalRelationshipResponse.contributionWeight) &&
        Objects.equals(this.supportedGoal, goalRelationshipResponse.supportedGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, resourceSubtype, supportingResource, contributionWeight, supportedGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalRelationshipResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
    sb.append("    contributionWeight: ").append(toIndentedString(contributionWeight)).append("\n");
    sb.append("    supportedGoal: ").append(toIndentedString(supportedGoal)).append("\n");
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

