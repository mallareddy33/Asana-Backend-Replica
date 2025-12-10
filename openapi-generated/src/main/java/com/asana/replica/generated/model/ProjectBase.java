package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.CustomFieldSettingResponse;
import com.asana.replica.generated.model.ProjectBaseAllOfCurrentStatus;
import com.asana.replica.generated.model.ProjectBaseAllOfCurrentStatusUpdate;
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
 * ProjectBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectBase {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable Boolean archived;

  /**
   * Color of the project.
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
    
    LIGHT_WARM_GRAY("light-warm-gray"),
    
    NONE("none");

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
      return null;
    }
  }

  private JsonNullable<ColorEnum> color = JsonNullable.<ColorEnum>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable ProjectBaseAllOfCurrentStatus currentStatus;

  private @Nullable ProjectBaseAllOfCurrentStatusUpdate currentStatusUpdate;

  @Valid
  private List<CustomFieldSettingResponse> customFieldSettings = new ArrayList<>();

  /**
   * The default view (list, board, calendar, or timeline) of a project.
   */
  public enum DefaultViewEnum {
    LIST("list"),
    
    BOARD("board"),
    
    CALENDAR("calendar"),
    
    TIMELINE("timeline");

    private final String value;

    DefaultViewEnum(String value) {
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
    public static DefaultViewEnum fromValue(String value) {
      for (DefaultViewEnum b : DefaultViewEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable DefaultViewEnum defaultView;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> dueDate = JsonNullable.<LocalDate>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> dueOn = JsonNullable.<LocalDate>undefined();

  private @Nullable String htmlNotes;

  @Valid
  private List<@Valid UserCompact> members = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime modifiedAt;

  private @Nullable String notes;

  @Deprecated
  private @Nullable Boolean _public;

  /**
   * The privacy setting of the project. *Note: Administrators in your organization may restrict the values of `privacy_setting`.*
   */
  public enum PrivacySettingEnum {
    PUBLIC_TO_WORKSPACE("public_to_workspace"),
    
    PRIVATE_TO_TEAM("private_to_team"),
    
    PRIVATE("private");

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> startOn = JsonNullable.<LocalDate>undefined();

  /**
   * The default access for users or teams who join or are added as members to the project.
   */
  public enum DefaultAccessLevelEnum {
    ADMIN("admin"),
    
    EDITOR("editor"),
    
    COMMENTER("commenter"),
    
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

  /**
   * The minimum access level needed for project members to modify this project's workflow and appearance.
   */
  public enum MinimumAccessLevelForCustomizationEnum {
    ADMIN("admin"),
    
    EDITOR("editor");

    private final String value;

    MinimumAccessLevelForCustomizationEnum(String value) {
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
    public static MinimumAccessLevelForCustomizationEnum fromValue(String value) {
      for (MinimumAccessLevelForCustomizationEnum b : MinimumAccessLevelForCustomizationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable MinimumAccessLevelForCustomizationEnum minimumAccessLevelForCustomization;

  /**
   * The minimum access level needed for project members to share the project and manage project memberships.
   */
  public enum MinimumAccessLevelForSharingEnum {
    ADMIN("admin"),
    
    EDITOR("editor");

    private final String value;

    MinimumAccessLevelForSharingEnum(String value) {
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
    public static MinimumAccessLevelForSharingEnum fromValue(String value) {
      for (MinimumAccessLevelForSharingEnum b : MinimumAccessLevelForSharingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable MinimumAccessLevelForSharingEnum minimumAccessLevelForSharing;

  public ProjectBase gid(@Nullable String gid) {
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

  public ProjectBase resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "project", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public ProjectBase name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the project. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.
   * @return name
   */
  
  @Schema(name = "name", example = "Stuff to buy", description = "Name of the project. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public ProjectBase archived(@Nullable Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * True if the project is archived, false if not. Archived projects do not show in the UI by default and may be treated differently for queries.
   * @return archived
   */
  
  @Schema(name = "archived", example = "false", description = "True if the project is archived, false if not. Archived projects do not show in the UI by default and may be treated differently for queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public @Nullable Boolean getArchived() {
    return archived;
  }

  public void setArchived(@Nullable Boolean archived) {
    this.archived = archived;
  }

  public ProjectBase color(ColorEnum color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * Color of the project.
   * @return color
   */
  
  @Schema(name = "color", example = "light-green", description = "Color of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public JsonNullable<ColorEnum> getColor() {
    return color;
  }

  public void setColor(JsonNullable<ColorEnum> color) {
    this.color = color;
  }

  public ProjectBase createdAt(@Nullable OffsetDateTime createdAt) {
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

  public ProjectBase currentStatus(@Nullable ProjectBaseAllOfCurrentStatus currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

  /**
   * Get currentStatus
   * @return currentStatus
   */
  @Valid 
  @Schema(name = "current_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_status")
  public @Nullable ProjectBaseAllOfCurrentStatus getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(@Nullable ProjectBaseAllOfCurrentStatus currentStatus) {
    this.currentStatus = currentStatus;
  }

  public ProjectBase currentStatusUpdate(@Nullable ProjectBaseAllOfCurrentStatusUpdate currentStatusUpdate) {
    this.currentStatusUpdate = currentStatusUpdate;
    return this;
  }

  /**
   * Get currentStatusUpdate
   * @return currentStatusUpdate
   */
  @Valid 
  @Schema(name = "current_status_update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_status_update")
  public @Nullable ProjectBaseAllOfCurrentStatusUpdate getCurrentStatusUpdate() {
    return currentStatusUpdate;
  }

  public void setCurrentStatusUpdate(@Nullable ProjectBaseAllOfCurrentStatusUpdate currentStatusUpdate) {
    this.currentStatusUpdate = currentStatusUpdate;
  }

  public ProjectBase customFieldSettings(List<CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
    return this;
  }

  public ProjectBase addCustomFieldSettingsItem(CustomFieldSettingResponse customFieldSettingsItem) {
    if (this.customFieldSettings == null) {
      this.customFieldSettings = new ArrayList<>();
    }
    this.customFieldSettings.add(customFieldSettingsItem);
    return this;
  }

  /**
   * <p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>custom_fields:read</code></p>  Array of Custom Field Settings (in compact form).
   * @return customFieldSettings
   */
  @Valid 
  @Schema(name = "custom_field_settings", accessMode = Schema.AccessMode.READ_ONLY, description = "<p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>custom_fields:read</code></p>  Array of Custom Field Settings (in compact form).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_field_settings")
  public List<CustomFieldSettingResponse> getCustomFieldSettings() {
    return customFieldSettings;
  }

  public void setCustomFieldSettings(List<CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
  }

  public ProjectBase defaultView(@Nullable DefaultViewEnum defaultView) {
    this.defaultView = defaultView;
    return this;
  }

  /**
   * The default view (list, board, calendar, or timeline) of a project.
   * @return defaultView
   */
  
  @Schema(name = "default_view", example = "calendar", description = "The default view (list, board, calendar, or timeline) of a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_view")
  public @Nullable DefaultViewEnum getDefaultView() {
    return defaultView;
  }

  public void setDefaultView(@Nullable DefaultViewEnum defaultView) {
    this.defaultView = defaultView;
  }

  public ProjectBase dueDate(LocalDate dueDate) {
    this.dueDate = JsonNullable.of(dueDate);
    return this;
  }

  /**
   * *Deprecated: new integrations should prefer the `due_on` field.*
   * @return dueDate
   */
  @Valid 
  @Schema(name = "due_date", example = "2019-09-15", description = "*Deprecated: new integrations should prefer the `due_on` field.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_date")
  public JsonNullable<LocalDate> getDueDate() {
    return dueDate;
  }

  public void setDueDate(JsonNullable<LocalDate> dueDate) {
    this.dueDate = dueDate;
  }

  public ProjectBase dueOn(LocalDate dueOn) {
    this.dueOn = JsonNullable.of(dueOn);
    return this;
  }

  /**
   * The day on which this project is due. This takes a date with format YYYY-MM-DD.
   * @return dueOn
   */
  @Valid 
  @Schema(name = "due_on", example = "2019-09-15", description = "The day on which this project is due. This takes a date with format YYYY-MM-DD.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public JsonNullable<LocalDate> getDueOn() {
    return dueOn;
  }

  public void setDueOn(JsonNullable<LocalDate> dueOn) {
    this.dueOn = dueOn;
  }

  public ProjectBase htmlNotes(@Nullable String htmlNotes) {
    this.htmlNotes = htmlNotes;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). The notes of the project with formatting as HTML.
   * @return htmlNotes
   */
  
  @Schema(name = "html_notes", example = "<body>These are things we need to purchase.</body>", description = "[Opt In](/docs/inputoutput-options). The notes of the project with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_notes")
  public @Nullable String getHtmlNotes() {
    return htmlNotes;
  }

  public void setHtmlNotes(@Nullable String htmlNotes) {
    this.htmlNotes = htmlNotes;
  }

  public ProjectBase members(List<@Valid UserCompact> members) {
    this.members = members;
    return this;
  }

  public ProjectBase addMembersItem(UserCompact membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Array of users who are members of this project.
   * @return members
   */
  @Valid 
  @Schema(name = "members", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of users who are members of this project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public List<@Valid UserCompact> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid UserCompact> members) {
    this.members = members;
  }

  public ProjectBase modifiedAt(@Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which this project was last modified. *Note: This does not currently reflect any changes in associations such as tasks or comments that may have been added or removed from the project.*
   * @return modifiedAt
   */
  @Valid 
  @Schema(name = "modified_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this project was last modified. *Note: This does not currently reflect any changes in associations such as tasks or comments that may have been added or removed from the project.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified_at")
  public @Nullable OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(@Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public ProjectBase notes(@Nullable String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Free-form textual information associated with the project (ie., its description).
   * @return notes
   */
  
  @Schema(name = "notes", example = "These are things we need to purchase.", description = "Free-form textual information associated with the project (ie., its description).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public @Nullable String getNotes() {
    return notes;
  }

  public void setNotes(@Nullable String notes) {
    this.notes = notes;
  }

  public ProjectBase _public(@Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * *Deprecated:* new integrations use `privacy_setting` instead.
   * @return _public
   * @deprecated
   */
  
  @Schema(name = "public", example = "false", description = "*Deprecated:* new integrations use `privacy_setting` instead.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public")
  @Deprecated
  public @Nullable Boolean getPublic() {
    return _public;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setPublic(@Nullable Boolean _public) {
    this._public = _public;
  }

  public ProjectBase privacySetting(@Nullable PrivacySettingEnum privacySetting) {
    this.privacySetting = privacySetting;
    return this;
  }

  /**
   * The privacy setting of the project. *Note: Administrators in your organization may restrict the values of `privacy_setting`.*
   * @return privacySetting
   */
  
  @Schema(name = "privacy_setting", example = "public_to_workspace", description = "The privacy setting of the project. *Note: Administrators in your organization may restrict the values of `privacy_setting`.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacy_setting")
  public @Nullable PrivacySettingEnum getPrivacySetting() {
    return privacySetting;
  }

  public void setPrivacySetting(@Nullable PrivacySettingEnum privacySetting) {
    this.privacySetting = privacySetting;
  }

  public ProjectBase startOn(LocalDate startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work for this project begins, or null if the project has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` or `due_at` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*
   * @return startOn
   */
  @Valid 
  @Schema(name = "start_on", example = "2019-09-14", description = "The day on which work for this project begins, or null if the project has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` or `due_at` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<LocalDate> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<LocalDate> startOn) {
    this.startOn = startOn;
  }

  public ProjectBase defaultAccessLevel(@Nullable DefaultAccessLevelEnum defaultAccessLevel) {
    this.defaultAccessLevel = defaultAccessLevel;
    return this;
  }

  /**
   * The default access for users or teams who join or are added as members to the project.
   * @return defaultAccessLevel
   */
  
  @Schema(name = "default_access_level", example = "admin", description = "The default access for users or teams who join or are added as members to the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_access_level")
  public @Nullable DefaultAccessLevelEnum getDefaultAccessLevel() {
    return defaultAccessLevel;
  }

  public void setDefaultAccessLevel(@Nullable DefaultAccessLevelEnum defaultAccessLevel) {
    this.defaultAccessLevel = defaultAccessLevel;
  }

  public ProjectBase minimumAccessLevelForCustomization(@Nullable MinimumAccessLevelForCustomizationEnum minimumAccessLevelForCustomization) {
    this.minimumAccessLevelForCustomization = minimumAccessLevelForCustomization;
    return this;
  }

  /**
   * The minimum access level needed for project members to modify this project's workflow and appearance.
   * @return minimumAccessLevelForCustomization
   */
  
  @Schema(name = "minimum_access_level_for_customization", example = "admin", description = "The minimum access level needed for project members to modify this project's workflow and appearance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimum_access_level_for_customization")
  public @Nullable MinimumAccessLevelForCustomizationEnum getMinimumAccessLevelForCustomization() {
    return minimumAccessLevelForCustomization;
  }

  public void setMinimumAccessLevelForCustomization(@Nullable MinimumAccessLevelForCustomizationEnum minimumAccessLevelForCustomization) {
    this.minimumAccessLevelForCustomization = minimumAccessLevelForCustomization;
  }

  public ProjectBase minimumAccessLevelForSharing(@Nullable MinimumAccessLevelForSharingEnum minimumAccessLevelForSharing) {
    this.minimumAccessLevelForSharing = minimumAccessLevelForSharing;
    return this;
  }

  /**
   * The minimum access level needed for project members to share the project and manage project memberships.
   * @return minimumAccessLevelForSharing
   */
  
  @Schema(name = "minimum_access_level_for_sharing", example = "admin", description = "The minimum access level needed for project members to share the project and manage project memberships.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimum_access_level_for_sharing")
  public @Nullable MinimumAccessLevelForSharingEnum getMinimumAccessLevelForSharing() {
    return minimumAccessLevelForSharing;
  }

  public void setMinimumAccessLevelForSharing(@Nullable MinimumAccessLevelForSharingEnum minimumAccessLevelForSharing) {
    this.minimumAccessLevelForSharing = minimumAccessLevelForSharing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectBase projectBase = (ProjectBase) o;
    return Objects.equals(this.gid, projectBase.gid) &&
        Objects.equals(this.resourceType, projectBase.resourceType) &&
        Objects.equals(this.name, projectBase.name) &&
        Objects.equals(this.archived, projectBase.archived) &&
        equalsNullable(this.color, projectBase.color) &&
        Objects.equals(this.createdAt, projectBase.createdAt) &&
        Objects.equals(this.currentStatus, projectBase.currentStatus) &&
        Objects.equals(this.currentStatusUpdate, projectBase.currentStatusUpdate) &&
        Objects.equals(this.customFieldSettings, projectBase.customFieldSettings) &&
        Objects.equals(this.defaultView, projectBase.defaultView) &&
        equalsNullable(this.dueDate, projectBase.dueDate) &&
        equalsNullable(this.dueOn, projectBase.dueOn) &&
        Objects.equals(this.htmlNotes, projectBase.htmlNotes) &&
        Objects.equals(this.members, projectBase.members) &&
        Objects.equals(this.modifiedAt, projectBase.modifiedAt) &&
        Objects.equals(this.notes, projectBase.notes) &&
        Objects.equals(this._public, projectBase._public) &&
        Objects.equals(this.privacySetting, projectBase.privacySetting) &&
        equalsNullable(this.startOn, projectBase.startOn) &&
        Objects.equals(this.defaultAccessLevel, projectBase.defaultAccessLevel) &&
        Objects.equals(this.minimumAccessLevelForCustomization, projectBase.minimumAccessLevelForCustomization) &&
        Objects.equals(this.minimumAccessLevelForSharing, projectBase.minimumAccessLevelForSharing);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, archived, hashCodeNullable(color), createdAt, currentStatus, currentStatusUpdate, customFieldSettings, defaultView, hashCodeNullable(dueDate), hashCodeNullable(dueOn), htmlNotes, members, modifiedAt, notes, _public, privacySetting, hashCodeNullable(startOn), defaultAccessLevel, minimumAccessLevelForCustomization, minimumAccessLevelForSharing);
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
    sb.append("class ProjectBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    currentStatusUpdate: ").append(toIndentedString(currentStatusUpdate)).append("\n");
    sb.append("    customFieldSettings: ").append(toIndentedString(customFieldSettings)).append("\n");
    sb.append("    defaultView: ").append(toIndentedString(defaultView)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    htmlNotes: ").append(toIndentedString(htmlNotes)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    privacySetting: ").append(toIndentedString(privacySetting)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    defaultAccessLevel: ").append(toIndentedString(defaultAccessLevel)).append("\n");
    sb.append("    minimumAccessLevelForCustomization: ").append(toIndentedString(minimumAccessLevelForCustomization)).append("\n");
    sb.append("    minimumAccessLevelForSharing: ").append(toIndentedString(minimumAccessLevelForSharing)).append("\n");
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

