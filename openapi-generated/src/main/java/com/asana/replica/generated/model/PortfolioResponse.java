package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.CustomFieldCompact;
import com.asana.replica.generated.model.CustomFieldSettingResponse;
import com.asana.replica.generated.model.PortfolioResponseAllOfWorkspace;
import com.asana.replica.generated.model.ProjectTemplateCompact;
import com.asana.replica.generated.model.StatusUpdateCompact;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PortfolioResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class PortfolioResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable Boolean archived;

  /**
   * Color of the portfolio.
   */
  public enum ColorEnum {
    DARK_PINK("dark-pink"),
    
    DARK_GREEN("dark-green"),
    
    DARK_BLUE("dark-blue"),
    
    DARK_RED("dark-red"),
    
    DARK_TEAL("dark-teal"),
    
    DARK_BROWN("dark-brown"),
    
    DARK_ORANGE("dark-orange"),
    
    DARK_PURPLE("dark-purple"),
    
    DARK_WARM_GRAY("dark-warm-gray"),
    
    LIGHT_PINK("light-pink"),
    
    LIGHT_GREEN("light-green"),
    
    LIGHT_BLUE("light-blue"),
    
    LIGHT_RED("light-red"),
    
    LIGHT_TEAL("light-teal"),
    
    LIGHT_BROWN("light-brown"),
    
    LIGHT_ORANGE("light-orange"),
    
    LIGHT_PURPLE("light-purple"),
    
    LIGHT_WARM_GRAY("light-warm-gray");

    private final String value;

    ColorEnum(String value) {
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
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ColorEnum color;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> startOn = JsonNullable.<LocalDate>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> dueOn = JsonNullable.<LocalDate>undefined();

  /**
   * The default access level when inviting new members to the portfolio
   */
  public enum DefaultAccessLevelEnum {
    ADMIN("admin"),
    
    EDITOR("editor"),
    
    VIEWER("viewer");

    private final String value;

    DefaultAccessLevelEnum(String value) {
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
    public static DefaultAccessLevelEnum fromValue(String value) {
      for (DefaultAccessLevelEnum b : DefaultAccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable DefaultAccessLevelEnum defaultAccessLevel;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable UserCompact createdBy;

  @Valid
  private List<CustomFieldSettingResponse> customFieldSettings = new ArrayList<>();

  private JsonNullable<StatusUpdateCompact> currentStatusUpdate = JsonNullable.<StatusUpdateCompact>undefined();

  @Valid
  private List<@Valid CustomFieldCompact> customFields = new ArrayList<>();

  @Valid
  private List<@Valid UserCompact> members = new ArrayList<>();

  private @Nullable UserCompact owner;

  private @Nullable PortfolioResponseAllOfWorkspace workspace;

  private @Nullable String permalinkUrl;

  private @Nullable Boolean _public;

  /**
   * The privacy setting of the portfolio. *Note: Administrators in your organization may restrict the values of `privacy_setting`.*
   */
  public enum PrivacySettingEnum {
    PUBLIC_TO_DOMAIN("public_to_domain"),
    
    MEMBERS_ONLY("members_only");

    private final String value;

    PrivacySettingEnum(String value) {
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
    public static PrivacySettingEnum fromValue(String value) {
      for (PrivacySettingEnum b : PrivacySettingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable PrivacySettingEnum privacySetting;

  @Valid
  private List<@Valid ProjectTemplateCompact> projectTemplates = new ArrayList<>();

  public PortfolioResponse gid(@Nullable String gid) {
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

  public PortfolioResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "portfolio", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public PortfolioResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the portfolio.
   * @return name
   */
  
  @Schema(name = "name", example = "Bug Portfolio", description = "The name of the portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public PortfolioResponse archived(@Nullable Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). True if the portfolio is archived, false if not. Archived portfolios do not show in the UI by default and may be treated differently for queries.
   * @return archived
   */
  
  @Schema(name = "archived", example = "false", description = "[Opt In](/docs/inputoutput-options). True if the portfolio is archived, false if not. Archived portfolios do not show in the UI by default and may be treated differently for queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public @Nullable Boolean getArchived() {
    return archived;
  }

  public void setArchived(@Nullable Boolean archived) {
    this.archived = archived;
  }

  public PortfolioResponse color(@Nullable ColorEnum color) {
    this.color = color;
    return this;
  }

  /**
   * Color of the portfolio.
   * @return color
   */
  
  @Schema(name = "color", example = "light-green", description = "Color of the portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public @Nullable ColorEnum getColor() {
    return color;
  }

  public void setColor(@Nullable ColorEnum color) {
    this.color = color;
  }

  public PortfolioResponse startOn(LocalDate startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*
   * @return startOn
   */
  @Valid 
  @Schema(name = "start_on", example = "2019-09-14", description = "The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<LocalDate> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<LocalDate> startOn) {
    this.startOn = startOn;
  }

  public PortfolioResponse dueOn(LocalDate dueOn) {
    this.dueOn = JsonNullable.of(dueOn);
    return this;
  }

  /**
   * The day on which this portfolio is due. This takes a date with format YYYY-MM-DD.
   * @return dueOn
   */
  @Valid 
  @Schema(name = "due_on", example = "2019-09-15", description = "The day on which this portfolio is due. This takes a date with format YYYY-MM-DD.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public JsonNullable<LocalDate> getDueOn() {
    return dueOn;
  }

  public void setDueOn(JsonNullable<LocalDate> dueOn) {
    this.dueOn = dueOn;
  }

  public PortfolioResponse defaultAccessLevel(@Nullable DefaultAccessLevelEnum defaultAccessLevel) {
    this.defaultAccessLevel = defaultAccessLevel;
    return this;
  }

  /**
   * The default access level when inviting new members to the portfolio
   * @return defaultAccessLevel
   */
  
  @Schema(name = "default_access_level", example = "viewer", description = "The default access level when inviting new members to the portfolio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_access_level")
  public @Nullable DefaultAccessLevelEnum getDefaultAccessLevel() {
    return defaultAccessLevel;
  }

  public void setDefaultAccessLevel(@Nullable DefaultAccessLevelEnum defaultAccessLevel) {
    this.defaultAccessLevel = defaultAccessLevel;
  }

  public PortfolioResponse createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PortfolioResponse createdBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @Valid 
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public @Nullable UserCompact getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
  }

  public PortfolioResponse customFieldSettings(List<CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
    return this;
  }

  public PortfolioResponse addCustomFieldSettingsItem(CustomFieldSettingResponse customFieldSettingsItem) {
    if (this.customFieldSettings == null) {
      this.customFieldSettings = new ArrayList<>();
    }
    this.customFieldSettings.add(customFieldSettingsItem);
    return this;
  }

  /**
   * <p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>custom_fields:read</code></p>  Array of custom field settings applied to the portfolio.
   * @return customFieldSettings
   */
  @Valid 
  @Schema(name = "custom_field_settings", description = "<p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>custom_fields:read</code></p>  Array of custom field settings applied to the portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_field_settings")
  public List<CustomFieldSettingResponse> getCustomFieldSettings() {
    return customFieldSettings;
  }

  public void setCustomFieldSettings(List<CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
  }

  public PortfolioResponse currentStatusUpdate(StatusUpdateCompact currentStatusUpdate) {
    this.currentStatusUpdate = JsonNullable.of(currentStatusUpdate);
    return this;
  }

  /**
   * The latest `status_update` posted to this portfolio.
   * @return currentStatusUpdate
   */
  @Valid 
  @Schema(name = "current_status_update", description = "The latest `status_update` posted to this portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_status_update")
  public JsonNullable<StatusUpdateCompact> getCurrentStatusUpdate() {
    return currentStatusUpdate;
  }

  public void setCurrentStatusUpdate(JsonNullable<StatusUpdateCompact> currentStatusUpdate) {
    this.currentStatusUpdate = currentStatusUpdate;
  }

  public PortfolioResponse customFields(List<@Valid CustomFieldCompact> customFields) {
    this.customFields = customFields;
    return this;
  }

  public PortfolioResponse addCustomFieldsItem(CustomFieldCompact customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * Array of Custom Fields.
   * @return customFields
   */
  @Valid 
  @Schema(name = "custom_fields", description = "Array of Custom Fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_fields")
  public List<@Valid CustomFieldCompact> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<@Valid CustomFieldCompact> customFields) {
    this.customFields = customFields;
  }

  public PortfolioResponse members(List<@Valid UserCompact> members) {
    this.members = members;
    return this;
  }

  public PortfolioResponse addMembersItem(UserCompact membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Get members
   * @return members
   */
  @Valid 
  @Schema(name = "members", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public List<@Valid UserCompact> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid UserCompact> members) {
    this.members = members;
  }

  public PortfolioResponse owner(@Nullable UserCompact owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable UserCompact getOwner() {
    return owner;
  }

  public void setOwner(@Nullable UserCompact owner) {
    this.owner = owner;
  }

  public PortfolioResponse workspace(@Nullable PortfolioResponseAllOfWorkspace workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Get workspace
   * @return workspace
   */
  @Valid 
  @Schema(name = "workspace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public @Nullable PortfolioResponseAllOfWorkspace getWorkspace() {
    return workspace;
  }

  public void setWorkspace(@Nullable PortfolioResponseAllOfWorkspace workspace) {
    this.workspace = workspace;
  }

  public PortfolioResponse permalinkUrl(@Nullable String permalinkUrl) {
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

  public PortfolioResponse _public(@Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * True if the portfolio is public to its workspace members.
   * @return _public
   */
  
  @Schema(name = "public", example = "false", description = "True if the portfolio is public to its workspace members.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public")
  public @Nullable Boolean getPublic() {
    return _public;
  }

  public void setPublic(@Nullable Boolean _public) {
    this._public = _public;
  }

  public PortfolioResponse privacySetting(@Nullable PrivacySettingEnum privacySetting) {
    this.privacySetting = privacySetting;
    return this;
  }

  /**
   * The privacy setting of the portfolio. *Note: Administrators in your organization may restrict the values of `privacy_setting`.*
   * @return privacySetting
   */
  
  @Schema(name = "privacy_setting", example = "members_only", description = "The privacy setting of the portfolio. *Note: Administrators in your organization may restrict the values of `privacy_setting`.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacy_setting")
  public @Nullable PrivacySettingEnum getPrivacySetting() {
    return privacySetting;
  }

  public void setPrivacySetting(@Nullable PrivacySettingEnum privacySetting) {
    this.privacySetting = privacySetting;
  }

  public PortfolioResponse projectTemplates(List<@Valid ProjectTemplateCompact> projectTemplates) {
    this.projectTemplates = projectTemplates;
    return this;
  }

  public PortfolioResponse addProjectTemplatesItem(ProjectTemplateCompact projectTemplatesItem) {
    if (this.projectTemplates == null) {
      this.projectTemplates = new ArrayList<>();
    }
    this.projectTemplates.add(projectTemplatesItem);
    return this;
  }

  /**
   * Array of project templates that are in the portfolio
   * @return projectTemplates
   */
  @Valid 
  @Schema(name = "project_templates", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of project templates that are in the portfolio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project_templates")
  public List<@Valid ProjectTemplateCompact> getProjectTemplates() {
    return projectTemplates;
  }

  public void setProjectTemplates(List<@Valid ProjectTemplateCompact> projectTemplates) {
    this.projectTemplates = projectTemplates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioResponse portfolioResponse = (PortfolioResponse) o;
    return Objects.equals(this.gid, portfolioResponse.gid) &&
        Objects.equals(this.resourceType, portfolioResponse.resourceType) &&
        Objects.equals(this.name, portfolioResponse.name) &&
        Objects.equals(this.archived, portfolioResponse.archived) &&
        Objects.equals(this.color, portfolioResponse.color) &&
        equalsNullable(this.startOn, portfolioResponse.startOn) &&
        equalsNullable(this.dueOn, portfolioResponse.dueOn) &&
        Objects.equals(this.defaultAccessLevel, portfolioResponse.defaultAccessLevel) &&
        Objects.equals(this.createdAt, portfolioResponse.createdAt) &&
        Objects.equals(this.createdBy, portfolioResponse.createdBy) &&
        Objects.equals(this.customFieldSettings, portfolioResponse.customFieldSettings) &&
        equalsNullable(this.currentStatusUpdate, portfolioResponse.currentStatusUpdate) &&
        Objects.equals(this.customFields, portfolioResponse.customFields) &&
        Objects.equals(this.members, portfolioResponse.members) &&
        Objects.equals(this.owner, portfolioResponse.owner) &&
        Objects.equals(this.workspace, portfolioResponse.workspace) &&
        Objects.equals(this.permalinkUrl, portfolioResponse.permalinkUrl) &&
        Objects.equals(this._public, portfolioResponse._public) &&
        Objects.equals(this.privacySetting, portfolioResponse.privacySetting) &&
        Objects.equals(this.projectTemplates, portfolioResponse.projectTemplates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, archived, color, hashCodeNullable(startOn), hashCodeNullable(dueOn), defaultAccessLevel, createdAt, createdBy, customFieldSettings, hashCodeNullable(currentStatusUpdate), customFields, members, owner, workspace, permalinkUrl, _public, privacySetting, projectTemplates);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    defaultAccessLevel: ").append(toIndentedString(defaultAccessLevel)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    customFieldSettings: ").append(toIndentedString(customFieldSettings)).append("\n");
    sb.append("    currentStatusUpdate: ").append(toIndentedString(currentStatusUpdate)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    privacySetting: ").append(toIndentedString(privacySetting)).append("\n");
    sb.append("    projectTemplates: ").append(toIndentedString(projectTemplates)).append("\n");
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

