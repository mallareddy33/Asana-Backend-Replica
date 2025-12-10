package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.CustomFieldSettingResponse;
import com.asana.replica.generated.model.TeamResponseAllOfOrganization;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TeamResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TeamResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable String description;

  private @Nullable String htmlDescription;

  private @Nullable TeamResponseAllOfOrganization organization;

  private @Nullable String permalinkUrl;

  /**
   * The visibility of the team to users in the same organization 
   */
  public enum VisibilityEnum {
    SECRET("secret"),
    
    REQUEST_TO_JOIN("request_to_join"),
    
    PUBLIC("public");

    private final String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable VisibilityEnum visibility;

  /**
   * Controls who can edit team name and description 
   */
  public enum EditTeamNameOrDescriptionAccessLevelEnum {
    ALL_TEAM_MEMBERS("all_team_members"),
    
    ONLY_TEAM_ADMINS("only_team_admins");

    private final String value;

    EditTeamNameOrDescriptionAccessLevelEnum(String value) {
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
    public static EditTeamNameOrDescriptionAccessLevelEnum fromValue(String value) {
      for (EditTeamNameOrDescriptionAccessLevelEnum b : EditTeamNameOrDescriptionAccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable EditTeamNameOrDescriptionAccessLevelEnum editTeamNameOrDescriptionAccessLevel;

  /**
   * Controls who can edit team visibility and trash teams 
   */
  public enum EditTeamVisibilityOrTrashTeamAccessLevelEnum {
    ALL_TEAM_MEMBERS("all_team_members"),
    
    ONLY_TEAM_ADMINS("only_team_admins");

    private final String value;

    EditTeamVisibilityOrTrashTeamAccessLevelEnum(String value) {
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
    public static EditTeamVisibilityOrTrashTeamAccessLevelEnum fromValue(String value) {
      for (EditTeamVisibilityOrTrashTeamAccessLevelEnum b : EditTeamVisibilityOrTrashTeamAccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable EditTeamVisibilityOrTrashTeamAccessLevelEnum editTeamVisibilityOrTrashTeamAccessLevel;

  /**
   * Controls who can accept or deny member invites for a given team 
   */
  public enum MemberInviteManagementAccessLevelEnum {
    ALL_TEAM_MEMBERS("all_team_members"),
    
    ONLY_TEAM_ADMINS("only_team_admins");

    private final String value;

    MemberInviteManagementAccessLevelEnum(String value) {
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
    public static MemberInviteManagementAccessLevelEnum fromValue(String value) {
      for (MemberInviteManagementAccessLevelEnum b : MemberInviteManagementAccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable MemberInviteManagementAccessLevelEnum memberInviteManagementAccessLevel;

  /**
   * Controls who can accept or deny guest invites for a given team 
   */
  public enum GuestInviteManagementAccessLevelEnum {
    ALL_TEAM_MEMBERS("all_team_members"),
    
    ONLY_TEAM_ADMINS("only_team_admins");

    private final String value;

    GuestInviteManagementAccessLevelEnum(String value) {
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
    public static GuestInviteManagementAccessLevelEnum fromValue(String value) {
      for (GuestInviteManagementAccessLevelEnum b : GuestInviteManagementAccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable GuestInviteManagementAccessLevelEnum guestInviteManagementAccessLevel;

  /**
   * Controls who can accept or deny join team requests for a Membership by Request team. This field can only be updated when the team's `visibility` field is `request_to_join`. 
   */
  public enum JoinRequestManagementAccessLevelEnum {
    ALL_TEAM_MEMBERS("all_team_members"),
    
    ONLY_TEAM_ADMINS("only_team_admins");

    private final String value;

    JoinRequestManagementAccessLevelEnum(String value) {
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
    public static JoinRequestManagementAccessLevelEnum fromValue(String value) {
      for (JoinRequestManagementAccessLevelEnum b : JoinRequestManagementAccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable JoinRequestManagementAccessLevelEnum joinRequestManagementAccessLevel;

  /**
   * Controls who can remove team members 
   */
  public enum TeamMemberRemovalAccessLevelEnum {
    ALL_TEAM_MEMBERS("all_team_members"),
    
    ONLY_TEAM_ADMINS("only_team_admins");

    private final String value;

    TeamMemberRemovalAccessLevelEnum(String value) {
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
    public static TeamMemberRemovalAccessLevelEnum fromValue(String value) {
      for (TeamMemberRemovalAccessLevelEnum b : TeamMemberRemovalAccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TeamMemberRemovalAccessLevelEnum teamMemberRemovalAccessLevel;

  /**
   * Controls who can create and share content with the team 
   */
  public enum TeamContentManagementAccessLevelEnum {
    NO_RESTRICTION("no_restriction"),
    
    ONLY_TEAM_ADMINS("only_team_admins");

    private final String value;

    TeamContentManagementAccessLevelEnum(String value) {
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
    public static TeamContentManagementAccessLevelEnum fromValue(String value) {
      for (TeamContentManagementAccessLevelEnum b : TeamContentManagementAccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TeamContentManagementAccessLevelEnum teamContentManagementAccessLevel;

  private @Nullable Boolean endorsed;

  @Valid
  private List<CustomFieldSettingResponse> customFieldSettings = new ArrayList<>();

  public TeamResponse gid(@Nullable String gid) {
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

  public TeamResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "team", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public TeamResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the team.
   * @return name
   */
  
  @Schema(name = "name", example = "Marketing", description = "The name of the team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TeamResponse description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). The description of the team. 
   * @return description
   */
  
  @Schema(name = "description", example = "All developers should be members of this team.", description = "[Opt In](/docs/inputoutput-options). The description of the team. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public TeamResponse htmlDescription(@Nullable String htmlDescription) {
    this.htmlDescription = htmlDescription;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). The description of the team with formatting as HTML. 
   * @return htmlDescription
   */
  
  @Schema(name = "html_description", example = "<body><em>All</em> developers should be members of this team.</body>", description = "[Opt In](/docs/inputoutput-options). The description of the team with formatting as HTML. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_description")
  public @Nullable String getHtmlDescription() {
    return htmlDescription;
  }

  public void setHtmlDescription(@Nullable String htmlDescription) {
    this.htmlDescription = htmlDescription;
  }

  public TeamResponse organization(@Nullable TeamResponseAllOfOrganization organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Get organization
   * @return organization
   */
  @Valid 
  @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization")
  public @Nullable TeamResponseAllOfOrganization getOrganization() {
    return organization;
  }

  public void setOrganization(@Nullable TeamResponseAllOfOrganization organization) {
    this.organization = organization;
  }

  public TeamResponse permalinkUrl(@Nullable String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
    return this;
  }

  /**
   * A url that points directly to the object within Asana.
   * @return permalinkUrl
   */
  
  @Schema(name = "permalink_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://app.asana.com/0/resource/123456789/list", description = "A url that points directly to the object within Asana.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permalink_url")
  public @Nullable String getPermalinkUrl() {
    return permalinkUrl;
  }

  public void setPermalinkUrl(@Nullable String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
  }

  public TeamResponse visibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * The visibility of the team to users in the same organization 
   * @return visibility
   */
  
  @Schema(name = "visibility", description = "The visibility of the team to users in the same organization ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public @Nullable VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(@Nullable VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public TeamResponse editTeamNameOrDescriptionAccessLevel(@Nullable EditTeamNameOrDescriptionAccessLevelEnum editTeamNameOrDescriptionAccessLevel) {
    this.editTeamNameOrDescriptionAccessLevel = editTeamNameOrDescriptionAccessLevel;
    return this;
  }

  /**
   * Controls who can edit team name and description 
   * @return editTeamNameOrDescriptionAccessLevel
   */
  
  @Schema(name = "edit_team_name_or_description_access_level", description = "Controls who can edit team name and description ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("edit_team_name_or_description_access_level")
  public @Nullable EditTeamNameOrDescriptionAccessLevelEnum getEditTeamNameOrDescriptionAccessLevel() {
    return editTeamNameOrDescriptionAccessLevel;
  }

  public void setEditTeamNameOrDescriptionAccessLevel(@Nullable EditTeamNameOrDescriptionAccessLevelEnum editTeamNameOrDescriptionAccessLevel) {
    this.editTeamNameOrDescriptionAccessLevel = editTeamNameOrDescriptionAccessLevel;
  }

  public TeamResponse editTeamVisibilityOrTrashTeamAccessLevel(@Nullable EditTeamVisibilityOrTrashTeamAccessLevelEnum editTeamVisibilityOrTrashTeamAccessLevel) {
    this.editTeamVisibilityOrTrashTeamAccessLevel = editTeamVisibilityOrTrashTeamAccessLevel;
    return this;
  }

  /**
   * Controls who can edit team visibility and trash teams 
   * @return editTeamVisibilityOrTrashTeamAccessLevel
   */
  
  @Schema(name = "edit_team_visibility_or_trash_team_access_level", description = "Controls who can edit team visibility and trash teams ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("edit_team_visibility_or_trash_team_access_level")
  public @Nullable EditTeamVisibilityOrTrashTeamAccessLevelEnum getEditTeamVisibilityOrTrashTeamAccessLevel() {
    return editTeamVisibilityOrTrashTeamAccessLevel;
  }

  public void setEditTeamVisibilityOrTrashTeamAccessLevel(@Nullable EditTeamVisibilityOrTrashTeamAccessLevelEnum editTeamVisibilityOrTrashTeamAccessLevel) {
    this.editTeamVisibilityOrTrashTeamAccessLevel = editTeamVisibilityOrTrashTeamAccessLevel;
  }

  public TeamResponse memberInviteManagementAccessLevel(@Nullable MemberInviteManagementAccessLevelEnum memberInviteManagementAccessLevel) {
    this.memberInviteManagementAccessLevel = memberInviteManagementAccessLevel;
    return this;
  }

  /**
   * Controls who can accept or deny member invites for a given team 
   * @return memberInviteManagementAccessLevel
   */
  
  @Schema(name = "member_invite_management_access_level", description = "Controls who can accept or deny member invites for a given team ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("member_invite_management_access_level")
  public @Nullable MemberInviteManagementAccessLevelEnum getMemberInviteManagementAccessLevel() {
    return memberInviteManagementAccessLevel;
  }

  public void setMemberInviteManagementAccessLevel(@Nullable MemberInviteManagementAccessLevelEnum memberInviteManagementAccessLevel) {
    this.memberInviteManagementAccessLevel = memberInviteManagementAccessLevel;
  }

  public TeamResponse guestInviteManagementAccessLevel(@Nullable GuestInviteManagementAccessLevelEnum guestInviteManagementAccessLevel) {
    this.guestInviteManagementAccessLevel = guestInviteManagementAccessLevel;
    return this;
  }

  /**
   * Controls who can accept or deny guest invites for a given team 
   * @return guestInviteManagementAccessLevel
   */
  
  @Schema(name = "guest_invite_management_access_level", description = "Controls who can accept or deny guest invites for a given team ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guest_invite_management_access_level")
  public @Nullable GuestInviteManagementAccessLevelEnum getGuestInviteManagementAccessLevel() {
    return guestInviteManagementAccessLevel;
  }

  public void setGuestInviteManagementAccessLevel(@Nullable GuestInviteManagementAccessLevelEnum guestInviteManagementAccessLevel) {
    this.guestInviteManagementAccessLevel = guestInviteManagementAccessLevel;
  }

  public TeamResponse joinRequestManagementAccessLevel(@Nullable JoinRequestManagementAccessLevelEnum joinRequestManagementAccessLevel) {
    this.joinRequestManagementAccessLevel = joinRequestManagementAccessLevel;
    return this;
  }

  /**
   * Controls who can accept or deny join team requests for a Membership by Request team. This field can only be updated when the team's `visibility` field is `request_to_join`. 
   * @return joinRequestManagementAccessLevel
   */
  
  @Schema(name = "join_request_management_access_level", description = "Controls who can accept or deny join team requests for a Membership by Request team. This field can only be updated when the team's `visibility` field is `request_to_join`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("join_request_management_access_level")
  public @Nullable JoinRequestManagementAccessLevelEnum getJoinRequestManagementAccessLevel() {
    return joinRequestManagementAccessLevel;
  }

  public void setJoinRequestManagementAccessLevel(@Nullable JoinRequestManagementAccessLevelEnum joinRequestManagementAccessLevel) {
    this.joinRequestManagementAccessLevel = joinRequestManagementAccessLevel;
  }

  public TeamResponse teamMemberRemovalAccessLevel(@Nullable TeamMemberRemovalAccessLevelEnum teamMemberRemovalAccessLevel) {
    this.teamMemberRemovalAccessLevel = teamMemberRemovalAccessLevel;
    return this;
  }

  /**
   * Controls who can remove team members 
   * @return teamMemberRemovalAccessLevel
   */
  
  @Schema(name = "team_member_removal_access_level", description = "Controls who can remove team members ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_member_removal_access_level")
  public @Nullable TeamMemberRemovalAccessLevelEnum getTeamMemberRemovalAccessLevel() {
    return teamMemberRemovalAccessLevel;
  }

  public void setTeamMemberRemovalAccessLevel(@Nullable TeamMemberRemovalAccessLevelEnum teamMemberRemovalAccessLevel) {
    this.teamMemberRemovalAccessLevel = teamMemberRemovalAccessLevel;
  }

  public TeamResponse teamContentManagementAccessLevel(@Nullable TeamContentManagementAccessLevelEnum teamContentManagementAccessLevel) {
    this.teamContentManagementAccessLevel = teamContentManagementAccessLevel;
    return this;
  }

  /**
   * Controls who can create and share content with the team 
   * @return teamContentManagementAccessLevel
   */
  
  @Schema(name = "team_content_management_access_level", description = "Controls who can create and share content with the team ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team_content_management_access_level")
  public @Nullable TeamContentManagementAccessLevelEnum getTeamContentManagementAccessLevel() {
    return teamContentManagementAccessLevel;
  }

  public void setTeamContentManagementAccessLevel(@Nullable TeamContentManagementAccessLevelEnum teamContentManagementAccessLevel) {
    this.teamContentManagementAccessLevel = teamContentManagementAccessLevel;
  }

  public TeamResponse endorsed(@Nullable Boolean endorsed) {
    this.endorsed = endorsed;
    return this;
  }

  /**
   * Whether the team has been endorsed 
   * @return endorsed
   */
  
  @Schema(name = "endorsed", example = "false", description = "Whether the team has been endorsed ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endorsed")
  public @Nullable Boolean getEndorsed() {
    return endorsed;
  }

  public void setEndorsed(@Nullable Boolean endorsed) {
    this.endorsed = endorsed;
  }

  public TeamResponse customFieldSettings(List<CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
    return this;
  }

  public TeamResponse addCustomFieldSettingsItem(CustomFieldSettingResponse customFieldSettingsItem) {
    if (this.customFieldSettings == null) {
      this.customFieldSettings = new ArrayList<>();
    }
    this.customFieldSettings.add(customFieldSettingsItem);
    return this;
  }

  /**
   * Array of Custom Field Settings applied to the team.
   * @return customFieldSettings
   */
  @Valid 
  @Schema(name = "custom_field_settings", description = "Array of Custom Field Settings applied to the team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_field_settings")
  public List<CustomFieldSettingResponse> getCustomFieldSettings() {
    return customFieldSettings;
  }

  public void setCustomFieldSettings(List<CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamResponse teamResponse = (TeamResponse) o;
    return Objects.equals(this.gid, teamResponse.gid) &&
        Objects.equals(this.resourceType, teamResponse.resourceType) &&
        Objects.equals(this.name, teamResponse.name) &&
        Objects.equals(this.description, teamResponse.description) &&
        Objects.equals(this.htmlDescription, teamResponse.htmlDescription) &&
        Objects.equals(this.organization, teamResponse.organization) &&
        Objects.equals(this.permalinkUrl, teamResponse.permalinkUrl) &&
        Objects.equals(this.visibility, teamResponse.visibility) &&
        Objects.equals(this.editTeamNameOrDescriptionAccessLevel, teamResponse.editTeamNameOrDescriptionAccessLevel) &&
        Objects.equals(this.editTeamVisibilityOrTrashTeamAccessLevel, teamResponse.editTeamVisibilityOrTrashTeamAccessLevel) &&
        Objects.equals(this.memberInviteManagementAccessLevel, teamResponse.memberInviteManagementAccessLevel) &&
        Objects.equals(this.guestInviteManagementAccessLevel, teamResponse.guestInviteManagementAccessLevel) &&
        Objects.equals(this.joinRequestManagementAccessLevel, teamResponse.joinRequestManagementAccessLevel) &&
        Objects.equals(this.teamMemberRemovalAccessLevel, teamResponse.teamMemberRemovalAccessLevel) &&
        Objects.equals(this.teamContentManagementAccessLevel, teamResponse.teamContentManagementAccessLevel) &&
        Objects.equals(this.endorsed, teamResponse.endorsed) &&
        Objects.equals(this.customFieldSettings, teamResponse.customFieldSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, description, htmlDescription, organization, permalinkUrl, visibility, editTeamNameOrDescriptionAccessLevel, editTeamVisibilityOrTrashTeamAccessLevel, memberInviteManagementAccessLevel, guestInviteManagementAccessLevel, joinRequestManagementAccessLevel, teamMemberRemovalAccessLevel, teamContentManagementAccessLevel, endorsed, customFieldSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    htmlDescription: ").append(toIndentedString(htmlDescription)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    editTeamNameOrDescriptionAccessLevel: ").append(toIndentedString(editTeamNameOrDescriptionAccessLevel)).append("\n");
    sb.append("    editTeamVisibilityOrTrashTeamAccessLevel: ").append(toIndentedString(editTeamVisibilityOrTrashTeamAccessLevel)).append("\n");
    sb.append("    memberInviteManagementAccessLevel: ").append(toIndentedString(memberInviteManagementAccessLevel)).append("\n");
    sb.append("    guestInviteManagementAccessLevel: ").append(toIndentedString(guestInviteManagementAccessLevel)).append("\n");
    sb.append("    joinRequestManagementAccessLevel: ").append(toIndentedString(joinRequestManagementAccessLevel)).append("\n");
    sb.append("    teamMemberRemovalAccessLevel: ").append(toIndentedString(teamMemberRemovalAccessLevel)).append("\n");
    sb.append("    teamContentManagementAccessLevel: ").append(toIndentedString(teamContentManagementAccessLevel)).append("\n");
    sb.append("    endorsed: ").append(toIndentedString(endorsed)).append("\n");
    sb.append("    customFieldSettings: ").append(toIndentedString(customFieldSettings)).append("\n");
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

