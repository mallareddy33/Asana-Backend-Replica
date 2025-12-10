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
 * RemoveCustomFieldSettingRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class RemoveCustomFieldSettingRequest {

  private String customField;

  public RemoveCustomFieldSettingRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RemoveCustomFieldSettingRequest(String customField) {
    this.customField = customField;
  }

  public RemoveCustomFieldSettingRequest customField(String customField) {
    this.customField = customField;
    return this;
  }

  /**
   * The custom field to remove from this portfolio.
   * @return customField
   */
  @NotNull 
  @Schema(name = "custom_field", example = "14916", description = "The custom field to remove from this portfolio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("custom_field")
  public String getCustomField() {
    return customField;
  }

  public void setCustomField(String customField) {
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
    RemoveCustomFieldSettingRequest removeCustomFieldSettingRequest = (RemoveCustomFieldSettingRequest) o;
    return Objects.equals(this.customField, removeCustomFieldSettingRequest.customField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveCustomFieldSettingRequest {\n");
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

