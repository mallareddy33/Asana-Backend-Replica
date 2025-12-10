package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class UserUpdateRequest {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  @Valid
  private Map<String, String> customFields = new HashMap<>();

  public UserUpdateRequest gid(@Nullable String gid) {
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

  public UserUpdateRequest resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "user", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public UserUpdateRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * *Read-only except when same user as requester*. The user's name.
   * @return name
   */
  
  @Schema(name = "name", example = "Greg Sanchez", description = "*Read-only except when same user as requester*. The user's name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public UserUpdateRequest customFields(Map<String, String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public UserUpdateRequest putCustomFieldsItem(String key, String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

  /**
   * An object where each key is the GID of a custom field and its corresponding value is either an enum GID, string, number, or object (depending on the custom field type). See the [custom fields guide](/docs/custom-fields-guide) for details on creating and updating custom field values.
   * @return customFields
   */
  
  @Schema(name = "custom_fields", example = "{\"5678904321\":\"On Hold\",\"4578152156\":\"Not Started\"}", description = "An object where each key is the GID of a custom field and its corresponding value is either an enum GID, string, number, or object (depending on the custom field type). See the [custom fields guide](/docs/custom-fields-guide) for details on creating and updating custom field values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_fields")
  public Map<String, String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateRequest userUpdateRequest = (UserUpdateRequest) o;
    return Objects.equals(this.gid, userUpdateRequest.gid) &&
        Objects.equals(this.resourceType, userUpdateRequest.resourceType) &&
        Objects.equals(this.name, userUpdateRequest.name) &&
        Objects.equals(this.customFields, userUpdateRequest.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

