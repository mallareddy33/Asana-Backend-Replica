package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.MemberCompact;
import com.asana.replica.generated.model.ProjectCompact;
import com.asana.replica.generated.model.UserCompact;
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
 * ProjectMembershipNormalResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectMembershipNormalResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable ProjectCompact parent;

  private @Nullable MemberCompact member;

  /**
   * Whether the member has admin, editor, commenter, or viewer access to the project.
   */
  public enum AccessLevelEnum {
    ADMIN("admin"),
    
    EDITOR("editor"),
    
    COMMENTER("commenter"),
    
    VIEWER("viewer");

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

  private @Nullable UserCompact user;

  private @Nullable ProjectCompact project;

  /**
   * Whether the member has full access or comment-only access to the project.
   */
  public enum WriteAccessEnum {
    FULL_WRITE("full_write"),
    
    COMMENT_ONLY("comment_only");

    private final String value;

    WriteAccessEnum(String value) {
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
    public static WriteAccessEnum fromValue(String value) {
      for (WriteAccessEnum b : WriteAccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable WriteAccessEnum writeAccess;

  public ProjectMembershipNormalResponse gid(@Nullable String gid) {
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

  public ProjectMembershipNormalResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", example = "project_membership", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public ProjectMembershipNormalResponse parent(@Nullable ProjectCompact parent) {
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
  public @Nullable ProjectCompact getParent() {
    return parent;
  }

  public void setParent(@Nullable ProjectCompact parent) {
    this.parent = parent;
  }

  public ProjectMembershipNormalResponse member(@Nullable MemberCompact member) {
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

  public ProjectMembershipNormalResponse accessLevel(@Nullable AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Whether the member has admin, editor, commenter, or viewer access to the project.
   * @return accessLevel
   */
  
  @Schema(name = "access_level", accessMode = Schema.AccessMode.READ_ONLY, example = "admin", description = "Whether the member has admin, editor, commenter, or viewer access to the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access_level")
  public @Nullable AccessLevelEnum getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(@Nullable AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
  }

  public ProjectMembershipNormalResponse user(@Nullable UserCompact user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable UserCompact getUser() {
    return user;
  }

  public void setUser(@Nullable UserCompact user) {
    this.user = user;
  }

  public ProjectMembershipNormalResponse project(@Nullable ProjectCompact project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public @Nullable ProjectCompact getProject() {
    return project;
  }

  public void setProject(@Nullable ProjectCompact project) {
    this.project = project;
  }

  public ProjectMembershipNormalResponse writeAccess(@Nullable WriteAccessEnum writeAccess) {
    this.writeAccess = writeAccess;
    return this;
  }

  /**
   * Whether the member has full access or comment-only access to the project.
   * @return writeAccess
   */
  
  @Schema(name = "write_access", accessMode = Schema.AccessMode.READ_ONLY, example = "full_write", description = "Whether the member has full access or comment-only access to the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("write_access")
  public @Nullable WriteAccessEnum getWriteAccess() {
    return writeAccess;
  }

  public void setWriteAccess(@Nullable WriteAccessEnum writeAccess) {
    this.writeAccess = writeAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectMembershipNormalResponse projectMembershipNormalResponse = (ProjectMembershipNormalResponse) o;
    return Objects.equals(this.gid, projectMembershipNormalResponse.gid) &&
        Objects.equals(this.resourceType, projectMembershipNormalResponse.resourceType) &&
        Objects.equals(this.parent, projectMembershipNormalResponse.parent) &&
        Objects.equals(this.member, projectMembershipNormalResponse.member) &&
        Objects.equals(this.accessLevel, projectMembershipNormalResponse.accessLevel) &&
        Objects.equals(this.user, projectMembershipNormalResponse.user) &&
        Objects.equals(this.project, projectMembershipNormalResponse.project) &&
        Objects.equals(this.writeAccess, projectMembershipNormalResponse.writeAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, parent, member, accessLevel, user, project, writeAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectMembershipNormalResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    writeAccess: ").append(toIndentedString(writeAccess)).append("\n");
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

