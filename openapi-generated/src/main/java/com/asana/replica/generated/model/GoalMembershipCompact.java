package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.GoalMembershipBaseGoal;
import com.asana.replica.generated.model.GoalMembershipBaseParent;
import com.asana.replica.generated.model.MemberCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GoalMembershipCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GoalMembershipCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String resourceSubtype;

  private @Nullable MemberCompact member;

  private @Nullable GoalMembershipBaseParent parent;

  /**
   * *Deprecated: Describes if the member is a commenter or editor in goal.*
   */
  public enum RoleEnum {
    COMMENTER("commenter"),
    
    EDITOR("editor");

    private final String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Deprecated
  private @Nullable RoleEnum role;

  /**
   * \"Describes the membership access level for the goal. (`admin` and `viewer` are currently only available when you include the header: `Asana-Enable: goal_sals_api`.) This is preferred over role.\"
   */
  public enum AccessLevelEnum {
    VIEWER("viewer"),
    
    COMMENTER("commenter"),
    
    EDITOR("editor"),
    
    ADMIN("admin");

    private final String value;

    AccessLevelEnum(String value) {
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
    public static AccessLevelEnum fromValue(String value) {
      for (AccessLevelEnum b : AccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable AccessLevelEnum accessLevel;

  private @Nullable GoalMembershipBaseGoal goal;

  @Deprecated
  private @Nullable Boolean isCommenter;

  @Deprecated
  private @Nullable Boolean isEditor;

  public GoalMembershipCompact gid(@Nullable String gid) {
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

  public GoalMembershipCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", example = "membership", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public GoalMembershipCompact resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The type of membership.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "goal_membership", description = "The type of membership.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public GoalMembershipCompact member(@Nullable MemberCompact member) {
    this.member = member;
    return this;
  }

  /**
   * Get member
   * @return member
   */
  @Valid 
  @Schema(name = "member", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("member")
  public @Nullable MemberCompact getMember() {
    return member;
  }

  public void setMember(@Nullable MemberCompact member) {
    this.member = member;
  }

  public GoalMembershipCompact parent(@Nullable GoalMembershipBaseParent parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable GoalMembershipBaseParent getParent() {
    return parent;
  }

  public void setParent(@Nullable GoalMembershipBaseParent parent) {
    this.parent = parent;
  }

  public GoalMembershipCompact role(@Nullable RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * *Deprecated: Describes if the member is a commenter or editor in goal.*
   * @return role
   * @deprecated
   */
  
  @Schema(name = "role", example = "editor", description = "*Deprecated: Describes if the member is a commenter or editor in goal.*", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  @Deprecated
  public @Nullable RoleEnum getRole() {
    return role;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setRole(@Nullable RoleEnum role) {
    this.role = role;
  }

  public GoalMembershipCompact accessLevel(@Nullable AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * \"Describes the membership access level for the goal. (`admin` and `viewer` are currently only available when you include the header: `Asana-Enable: goal_sals_api`.) This is preferred over role.\"
   * @return accessLevel
   */
  
  @Schema(name = "access_level", example = "editor", description = "\"Describes the membership access level for the goal. (`admin` and `viewer` are currently only available when you include the header: `Asana-Enable: goal_sals_api`.) This is preferred over role.\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access_level")
  public @Nullable AccessLevelEnum getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(@Nullable AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
  }

  public GoalMembershipCompact goal(@Nullable GoalMembershipBaseGoal goal) {
    this.goal = goal;
    return this;
  }

  /**
   * Get goal
   * @return goal
   */
  @Valid 
  @Schema(name = "goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goal")
  public @Nullable GoalMembershipBaseGoal getGoal() {
    return goal;
  }

  public void setGoal(@Nullable GoalMembershipBaseGoal goal) {
    this.goal = goal;
  }

  public GoalMembershipCompact isCommenter(@Nullable Boolean isCommenter) {
    this.isCommenter = isCommenter;
    return this;
  }

  /**
   * *Deprecated: new integrations should prefer the `role` field.* Describes if the member is comment only in goal. Will be null if the `goal_sals_api` change flag is enabled.
   * @return isCommenter
   * @deprecated
   */
  
  @Schema(name = "is_commenter", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Deprecated: new integrations should prefer the `role` field.* Describes if the member is comment only in goal. Will be null if the `goal_sals_api` change flag is enabled.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_commenter")
  @Deprecated
  public @Nullable Boolean getIsCommenter() {
    return isCommenter;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setIsCommenter(@Nullable Boolean isCommenter) {
    this.isCommenter = isCommenter;
  }

  public GoalMembershipCompact isEditor(@Nullable Boolean isEditor) {
    this.isEditor = isEditor;
    return this;
  }

  /**
   * *Deprecated: new integrations should prefer the `role` field.* Describes if the member is editor in goal. Will be null if the `goal_sals_api` change flag is enabled.
   * @return isEditor
   * @deprecated
   */
  
  @Schema(name = "is_editor", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Deprecated: new integrations should prefer the `role` field.* Describes if the member is editor in goal. Will be null if the `goal_sals_api` change flag is enabled.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_editor")
  @Deprecated
  public @Nullable Boolean getIsEditor() {
    return isEditor;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setIsEditor(@Nullable Boolean isEditor) {
    this.isEditor = isEditor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalMembershipCompact goalMembershipCompact = (GoalMembershipCompact) o;
    return Objects.equals(this.gid, goalMembershipCompact.gid) &&
        Objects.equals(this.resourceType, goalMembershipCompact.resourceType) &&
        Objects.equals(this.resourceSubtype, goalMembershipCompact.resourceSubtype) &&
        Objects.equals(this.member, goalMembershipCompact.member) &&
        Objects.equals(this.parent, goalMembershipCompact.parent) &&
        Objects.equals(this.role, goalMembershipCompact.role) &&
        Objects.equals(this.accessLevel, goalMembershipCompact.accessLevel) &&
        Objects.equals(this.goal, goalMembershipCompact.goal) &&
        Objects.equals(this.isCommenter, goalMembershipCompact.isCommenter) &&
        Objects.equals(this.isEditor, goalMembershipCompact.isEditor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, resourceSubtype, member, parent, role, accessLevel, goal, isCommenter, isEditor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalMembershipCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    isCommenter: ").append(toIndentedString(isCommenter)).append("\n");
    sb.append("    isEditor: ").append(toIndentedString(isEditor)).append("\n");
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

