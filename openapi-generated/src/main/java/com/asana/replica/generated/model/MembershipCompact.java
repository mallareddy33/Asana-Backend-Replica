package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.CustomFieldCompact;
import com.asana.replica.generated.model.CustomFieldMembershipCompact;
import com.asana.replica.generated.model.GoalMembershipBaseGoal;
import com.asana.replica.generated.model.GoalMembershipCompact;
import com.asana.replica.generated.model.MemberCompact;
import com.asana.replica.generated.model.PortfolioMembershipCompactResponse;
import com.asana.replica.generated.model.ProjectMembershipCompactResponse;
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
 * MembershipCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class MembershipCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String resourceSubtype;

  private @Nullable MemberCompact member;

  private @Nullable CustomFieldCompact parent;

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
   * Whether the member has admin, editor, or user access to the custom field.
   */
  public enum AccessLevelEnum {
    ADMIN("admin"),
    
    EDITOR("editor"),
    
    USER("user");

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

  public MembershipCompact gid(@Nullable String gid) {
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

  public MembershipCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "custom_field_membership", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public MembershipCompact resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * Type of the membership.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", example = "custom_field_membership", description = "Type of the membership.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public MembershipCompact member(@Nullable MemberCompact member) {
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

  public MembershipCompact parent(@Nullable CustomFieldCompact parent) {
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
  public @Nullable CustomFieldCompact getParent() {
    return parent;
  }

  public void setParent(@Nullable CustomFieldCompact parent) {
    this.parent = parent;
  }

  public MembershipCompact role(@Nullable RoleEnum role) {
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

  public MembershipCompact accessLevel(@Nullable AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Whether the member has admin, editor, or user access to the custom field.
   * @return accessLevel
   */
  
  @Schema(name = "access_level", accessMode = Schema.AccessMode.READ_ONLY, example = "admin", description = "Whether the member has admin, editor, or user access to the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access_level")
  public @Nullable AccessLevelEnum getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(@Nullable AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
  }

  public MembershipCompact goal(@Nullable GoalMembershipBaseGoal goal) {
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

  public MembershipCompact isCommenter(@Nullable Boolean isCommenter) {
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

  public MembershipCompact isEditor(@Nullable Boolean isEditor) {
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
    MembershipCompact membershipCompact = (MembershipCompact) o;
    return Objects.equals(this.gid, membershipCompact.gid) &&
        Objects.equals(this.resourceType, membershipCompact.resourceType) &&
        Objects.equals(this.resourceSubtype, membershipCompact.resourceSubtype) &&
        Objects.equals(this.member, membershipCompact.member) &&
        Objects.equals(this.parent, membershipCompact.parent) &&
        Objects.equals(this.role, membershipCompact.role) &&
        Objects.equals(this.accessLevel, membershipCompact.accessLevel) &&
        Objects.equals(this.goal, membershipCompact.goal) &&
        Objects.equals(this.isCommenter, membershipCompact.isCommenter) &&
        Objects.equals(this.isEditor, membershipCompact.isEditor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, resourceSubtype, member, parent, role, accessLevel, goal, isCommenter, isEditor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipCompact {\n");
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

