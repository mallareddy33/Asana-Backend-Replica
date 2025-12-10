package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.DateVariableRequest;
import com.asana.replica.generated.model.RequestedRoleRequest;
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
 * ProjectTemplateInstantiateProjectRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectTemplateInstantiateProjectRequest {

  private String name;

  private @Nullable String team;

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

  private @Nullable Boolean isStrict;

  @Valid
  private List<@Valid DateVariableRequest> requestedDates = new ArrayList<>();

  @Valid
  private List<@Valid RequestedRoleRequest> requestedRoles = new ArrayList<>();

  public ProjectTemplateInstantiateProjectRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectTemplateInstantiateProjectRequest(String name) {
    this.name = name;
  }

  public ProjectTemplateInstantiateProjectRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the new project.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "New Project Name", description = "The name of the new project.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectTemplateInstantiateProjectRequest team(@Nullable String team) {
    this.team = team;
    return this;
  }

  /**
   * *Optional*. Sets the team of the new project. If the project template exists in an _organization_, you may specify a value for `team`. If no value is provided then it defaults to the same team as the project template.
   * @return team
   */
  
  @Schema(name = "team", example = "12345", description = "*Optional*. Sets the team of the new project. If the project template exists in an _organization_, you may specify a value for `team`. If no value is provided then it defaults to the same team as the project template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public @Nullable String getTeam() {
    return team;
  }

  public void setTeam(@Nullable String team) {
    this.team = team;
  }

  public ProjectTemplateInstantiateProjectRequest _public(@Nullable Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * *Deprecated:* new integrations use `privacy_setting` instead.
   * @return _public
   * @deprecated
   */
  
  @Schema(name = "public", example = "true", description = "*Deprecated:* new integrations use `privacy_setting` instead.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

  public ProjectTemplateInstantiateProjectRequest privacySetting(@Nullable PrivacySettingEnum privacySetting) {
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

  public ProjectTemplateInstantiateProjectRequest isStrict(@Nullable Boolean isStrict) {
    this.isStrict = isStrict;
    return this;
  }

  /**
   * *Optional*. If set to `true`, the endpoint returns an \"Unprocessable Entity\" error if you fail to provide a calendar date value for any date variable. If set to `false`, a default date is used for each unfulfilled date variable (e.g., the current date is used as the Start Date of a project).
   * @return isStrict
   */
  
  @Schema(name = "is_strict", example = "true", description = "*Optional*. If set to `true`, the endpoint returns an \"Unprocessable Entity\" error if you fail to provide a calendar date value for any date variable. If set to `false`, a default date is used for each unfulfilled date variable (e.g., the current date is used as the Start Date of a project).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_strict")
  public @Nullable Boolean getIsStrict() {
    return isStrict;
  }

  public void setIsStrict(@Nullable Boolean isStrict) {
    this.isStrict = isStrict;
  }

  public ProjectTemplateInstantiateProjectRequest requestedDates(List<@Valid DateVariableRequest> requestedDates) {
    this.requestedDates = requestedDates;
    return this;
  }

  public ProjectTemplateInstantiateProjectRequest addRequestedDatesItem(DateVariableRequest requestedDatesItem) {
    if (this.requestedDates == null) {
      this.requestedDates = new ArrayList<>();
    }
    this.requestedDates.add(requestedDatesItem);
    return this;
  }

  /**
   * *Conditional*. Array of mappings of date variables to calendar dates. This property is required in the instantiation request if the project template includes dates (e.g., a start date on a task).
   * @return requestedDates
   */
  @Valid 
  @Schema(name = "requested_dates", description = "*Conditional*. Array of mappings of date variables to calendar dates. This property is required in the instantiation request if the project template includes dates (e.g., a start date on a task).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requested_dates")
  public List<@Valid DateVariableRequest> getRequestedDates() {
    return requestedDates;
  }

  public void setRequestedDates(List<@Valid DateVariableRequest> requestedDates) {
    this.requestedDates = requestedDates;
  }

  public ProjectTemplateInstantiateProjectRequest requestedRoles(List<@Valid RequestedRoleRequest> requestedRoles) {
    this.requestedRoles = requestedRoles;
    return this;
  }

  public ProjectTemplateInstantiateProjectRequest addRequestedRolesItem(RequestedRoleRequest requestedRolesItem) {
    if (this.requestedRoles == null) {
      this.requestedRoles = new ArrayList<>();
    }
    this.requestedRoles.add(requestedRolesItem);
    return this;
  }

  /**
   * Array of mappings of template roles to user ids
   * @return requestedRoles
   */
  @Valid 
  @Schema(name = "requested_roles", description = "Array of mappings of template roles to user ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requested_roles")
  public List<@Valid RequestedRoleRequest> getRequestedRoles() {
    return requestedRoles;
  }

  public void setRequestedRoles(List<@Valid RequestedRoleRequest> requestedRoles) {
    this.requestedRoles = requestedRoles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectTemplateInstantiateProjectRequest projectTemplateInstantiateProjectRequest = (ProjectTemplateInstantiateProjectRequest) o;
    return Objects.equals(this.name, projectTemplateInstantiateProjectRequest.name) &&
        Objects.equals(this.team, projectTemplateInstantiateProjectRequest.team) &&
        Objects.equals(this._public, projectTemplateInstantiateProjectRequest._public) &&
        Objects.equals(this.privacySetting, projectTemplateInstantiateProjectRequest.privacySetting) &&
        Objects.equals(this.isStrict, projectTemplateInstantiateProjectRequest.isStrict) &&
        Objects.equals(this.requestedDates, projectTemplateInstantiateProjectRequest.requestedDates) &&
        Objects.equals(this.requestedRoles, projectTemplateInstantiateProjectRequest.requestedRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, team, _public, privacySetting, isStrict, requestedDates, requestedRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectTemplateInstantiateProjectRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    privacySetting: ").append(toIndentedString(privacySetting)).append("\n");
    sb.append("    isStrict: ").append(toIndentedString(isStrict)).append("\n");
    sb.append("    requestedDates: ").append(toIndentedString(requestedDates)).append("\n");
    sb.append("    requestedRoles: ").append(toIndentedString(requestedRoles)).append("\n");
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

