package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
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
 * Enum options are the possible values which an enum custom field can adopt. An enum custom field must contain at least 1 enum option but no more than 500.  You can add enum options to a custom field by using the &#x60;POST /custom_fields/custom_field_gid/enum_options&#x60; endpoint.  **It is not possible to remove or delete an enum option**. Instead, enum options can be disabled by updating the &#x60;enabled&#x60; field to false with the &#x60;PUT /enum_options/enum_option_gid&#x60; endpoint. Other attributes can be updated similarly.  On creation of an enum option, &#x60;enabled&#x60; is always set to &#x60;true&#x60;, meaning the enum option is a selectable value for the custom field. Setting &#x60;enabled&#x3D;false&#x60; is equivalent to “trashing” the enum option in the Asana web app within the “Edit Fields” dialog. The enum option will no longer be selectable but, if the enum option value was previously set within a task, the task will retain the value.  Enum options are an ordered list and by default new enum options are inserted at the end. Ordering in relation to existing enum options can be specified on creation by using &#x60;insert_before&#x60; or &#x60;insert_after&#x60; to reference an existing enum option. Only one of &#x60;insert_before&#x60; and &#x60;insert_after&#x60; can be provided when creating a new enum option.  An enum options list can be reordered with the &#x60;POST /custom_fields/custom_field_gid/enum_options/insert&#x60; endpoint.
 */

@Schema(name = "EnumOption", description = "Enum options are the possible values which an enum custom field can adopt. An enum custom field must contain at least 1 enum option but no more than 500.  You can add enum options to a custom field by using the `POST /custom_fields/custom_field_gid/enum_options` endpoint.  **It is not possible to remove or delete an enum option**. Instead, enum options can be disabled by updating the `enabled` field to false with the `PUT /enum_options/enum_option_gid` endpoint. Other attributes can be updated similarly.  On creation of an enum option, `enabled` is always set to `true`, meaning the enum option is a selectable value for the custom field. Setting `enabled=false` is equivalent to “trashing” the enum option in the Asana web app within the “Edit Fields” dialog. The enum option will no longer be selectable but, if the enum option value was previously set within a task, the task will retain the value.  Enum options are an ordered list and by default new enum options are inserted at the end. Ordering in relation to existing enum options can be specified on creation by using `insert_before` or `insert_after` to reference an existing enum option. Only one of `insert_before` and `insert_after` can be provided when creating a new enum option.  An enum options list can be reordered with the `POST /custom_fields/custom_field_gid/enum_options/insert` endpoint.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class EnumOption {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable Boolean enabled;

  private @Nullable String color;

  public EnumOption gid(@Nullable String gid) {
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

  public EnumOption resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "enum_option", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public EnumOption name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the enum option.
   * @return name
   */
  
  @Schema(name = "name", example = "Low", description = "The name of the enum option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public EnumOption enabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether or not the enum option is a selectable value for the custom field.
   * @return enabled
   */
  
  @Schema(name = "enabled", example = "true", description = "Whether or not the enum option is a selectable value for the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public @Nullable Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(@Nullable Boolean enabled) {
    this.enabled = enabled;
  }

  public EnumOption color(@Nullable String color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the enum option. Defaults to `none`.
   * @return color
   */
  
  @Schema(name = "color", example = "blue", description = "The color of the enum option. Defaults to `none`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public @Nullable String getColor() {
    return color;
  }

  public void setColor(@Nullable String color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumOption enumOption = (EnumOption) o;
    return Objects.equals(this.gid, enumOption.gid) &&
        Objects.equals(this.resourceType, enumOption.resourceType) &&
        Objects.equals(this.name, enumOption.name) &&
        Objects.equals(this.enabled, enumOption.enabled) &&
        Objects.equals(this.color, enumOption.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, enabled, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumOption {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

