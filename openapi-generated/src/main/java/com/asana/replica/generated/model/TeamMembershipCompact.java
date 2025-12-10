package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.TeamCompact;
import com.asana.replica.generated.model.UserCompact;
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
 * This object represents a user&#39;s connection to a team.
 */

@Schema(name = "TeamMembershipCompact", description = "This object represents a user's connection to a team.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TeamMembershipCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable UserCompact user;

  private @Nullable TeamCompact team;

  private @Nullable Boolean isGuest;

  private @Nullable Boolean isLimitedAccess;

  private @Nullable Boolean isAdmin;

  public TeamMembershipCompact gid(@Nullable String gid) {
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

  public TeamMembershipCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "team_membership", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public TeamMembershipCompact user(@Nullable UserCompact user) {
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

  public TeamMembershipCompact team(@Nullable TeamCompact team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
   */
  @Valid 
  @Schema(name = "team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public @Nullable TeamCompact getTeam() {
    return team;
  }

  public void setTeam(@Nullable TeamCompact team) {
    this.team = team;
  }

  public TeamMembershipCompact isGuest(@Nullable Boolean isGuest) {
    this.isGuest = isGuest;
    return this;
  }

  /**
   * Describes if the user is a guest in the team.
   * @return isGuest
   */
  
  @Schema(name = "is_guest", example = "false", description = "Describes if the user is a guest in the team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_guest")
  public @Nullable Boolean getIsGuest() {
    return isGuest;
  }

  public void setIsGuest(@Nullable Boolean isGuest) {
    this.isGuest = isGuest;
  }

  public TeamMembershipCompact isLimitedAccess(@Nullable Boolean isLimitedAccess) {
    this.isLimitedAccess = isLimitedAccess;
    return this;
  }

  /**
   * Describes if the user has limited access to the team.
   * @return isLimitedAccess
   */
  
  @Schema(name = "is_limited_access", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "Describes if the user has limited access to the team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_limited_access")
  public @Nullable Boolean getIsLimitedAccess() {
    return isLimitedAccess;
  }

  public void setIsLimitedAccess(@Nullable Boolean isLimitedAccess) {
    this.isLimitedAccess = isLimitedAccess;
  }

  public TeamMembershipCompact isAdmin(@Nullable Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Describes if the user is a team admin.
   * @return isAdmin
   */
  
  @Schema(name = "is_admin", example = "false", description = "Describes if the user is a team admin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_admin")
  public @Nullable Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(@Nullable Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMembershipCompact teamMembershipCompact = (TeamMembershipCompact) o;
    return Objects.equals(this.gid, teamMembershipCompact.gid) &&
        Objects.equals(this.resourceType, teamMembershipCompact.resourceType) &&
        Objects.equals(this.user, teamMembershipCompact.user) &&
        Objects.equals(this.team, teamMembershipCompact.team) &&
        Objects.equals(this.isGuest, teamMembershipCompact.isGuest) &&
        Objects.equals(this.isLimitedAccess, teamMembershipCompact.isLimitedAccess) &&
        Objects.equals(this.isAdmin, teamMembershipCompact.isAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, user, team, isGuest, isLimitedAccess, isAdmin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMembershipCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    isGuest: ").append(toIndentedString(isGuest)).append("\n");
    sb.append("    isLimitedAccess: ").append(toIndentedString(isLimitedAccess)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
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

