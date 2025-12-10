package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.CustomFieldSettingResponseAllOfCustomField;
import com.asana.replica.generated.model.CustomFieldSettingResponseAllOfParent;
import com.asana.replica.generated.model.CustomFieldSettingResponseAllOfProject;
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
 * CustomFieldSettingResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class CustomFieldSettingResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable CustomFieldSettingResponseAllOfProject project;

  private @Nullable Boolean isImportant;

  private @Nullable CustomFieldSettingResponseAllOfParent parent;

  private @Nullable CustomFieldSettingResponseAllOfCustomField customField;

  public CustomFieldSettingResponse gid(@Nullable String gid) {
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

  public CustomFieldSettingResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "custom_field_setting", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public CustomFieldSettingResponse project(@Nullable CustomFieldSettingResponseAllOfProject project) {
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
  public @Nullable CustomFieldSettingResponseAllOfProject getProject() {
    return project;
  }

  public void setProject(@Nullable CustomFieldSettingResponseAllOfProject project) {
    this.project = project;
  }

  public CustomFieldSettingResponse isImportant(@Nullable Boolean isImportant) {
    this.isImportant = isImportant;
    return this;
  }

  /**
   * `is_important` is used in the Asana web application to determine if this custom field is displayed in the list/grid view of a project or portfolio.
   * @return isImportant
   */
  
  @Schema(name = "is_important", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "`is_important` is used in the Asana web application to determine if this custom field is displayed in the list/grid view of a project or portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_important")
  public @Nullable Boolean getIsImportant() {
    return isImportant;
  }

  public void setIsImportant(@Nullable Boolean isImportant) {
    this.isImportant = isImportant;
  }

  public CustomFieldSettingResponse parent(@Nullable CustomFieldSettingResponseAllOfParent parent) {
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
  public @Nullable CustomFieldSettingResponseAllOfParent getParent() {
    return parent;
  }

  public void setParent(@Nullable CustomFieldSettingResponseAllOfParent parent) {
    this.parent = parent;
  }

  public CustomFieldSettingResponse customField(@Nullable CustomFieldSettingResponseAllOfCustomField customField) {
    this.customField = customField;
    return this;
  }

  /**
   * Get customField
   * @return customField
   */
  @Valid 
  @Schema(name = "custom_field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_field")
  public @Nullable CustomFieldSettingResponseAllOfCustomField getCustomField() {
    return customField;
  }

  public void setCustomField(@Nullable CustomFieldSettingResponseAllOfCustomField customField) {
    this.customField = customField;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldSettingResponse customFieldSettingResponse = (CustomFieldSettingResponse) o;
    return Objects.equals(this.gid, customFieldSettingResponse.gid) &&
        Objects.equals(this.resourceType, customFieldSettingResponse.resourceType) &&
        Objects.equals(this.project, customFieldSettingResponse.project) &&
        Objects.equals(this.isImportant, customFieldSettingResponse.isImportant) &&
        Objects.equals(this.parent, customFieldSettingResponse.parent) &&
        Objects.equals(this.customField, customFieldSettingResponse.customField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, project, isImportant, parent, customField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldSettingResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    isImportant: ").append(toIndentedString(isImportant)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
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

