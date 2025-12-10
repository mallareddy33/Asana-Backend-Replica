package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AddCustomFieldSettingRequestCustomField;
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
 * AddCustomFieldSettingRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AddCustomFieldSettingRequest {

  private AddCustomFieldSettingRequestCustomField customField;

  private @Nullable Boolean isImportant;

  private @Nullable String insertBefore;

  private @Nullable String insertAfter;

  public AddCustomFieldSettingRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddCustomFieldSettingRequest(AddCustomFieldSettingRequestCustomField customField) {
    this.customField = customField;
  }

  public AddCustomFieldSettingRequest customField(AddCustomFieldSettingRequestCustomField customField) {
    this.customField = customField;
    return this;
  }

  /**
   * Get customField
   * @return customField
   */
  @NotNull @Valid 
  @Schema(name = "custom_field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("custom_field")
  public AddCustomFieldSettingRequestCustomField getCustomField() {
    return customField;
  }

  public void setCustomField(AddCustomFieldSettingRequestCustomField customField) {
    this.customField = customField;
  }

  public AddCustomFieldSettingRequest isImportant(@Nullable Boolean isImportant) {
    this.isImportant = isImportant;
    return this;
  }

  /**
   * Whether this field should be considered important to this container (for instance, to display in the list view of items in the container).
   * @return isImportant
   */
  
  @Schema(name = "is_important", example = "true", description = "Whether this field should be considered important to this container (for instance, to display in the list view of items in the container).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_important")
  public @Nullable Boolean getIsImportant() {
    return isImportant;
  }

  public void setIsImportant(@Nullable Boolean isImportant) {
    this.isImportant = isImportant;
  }

  public AddCustomFieldSettingRequest insertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * A gid of a Custom Field Setting on this container, before which the new Custom Field Setting will be added.  `insert_before` and `insert_after` parameters cannot both be specified.
   * @return insertBefore
   */
  
  @Schema(name = "insert_before", example = "1331", description = "A gid of a Custom Field Setting on this container, before which the new Custom Field Setting will be added.  `insert_before` and `insert_after` parameters cannot both be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public @Nullable String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public AddCustomFieldSettingRequest insertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * A gid of a Custom Field Setting on this container, after which the new Custom Field Setting will be added.  `insert_before` and `insert_after` parameters cannot both be specified.
   * @return insertAfter
   */
  
  @Schema(name = "insert_after", example = "1331", description = "A gid of a Custom Field Setting on this container, after which the new Custom Field Setting will be added.  `insert_before` and `insert_after` parameters cannot both be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public @Nullable String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddCustomFieldSettingRequest addCustomFieldSettingRequest = (AddCustomFieldSettingRequest) o;
    return Objects.equals(this.customField, addCustomFieldSettingRequest.customField) &&
        Objects.equals(this.isImportant, addCustomFieldSettingRequest.isImportant) &&
        Objects.equals(this.insertBefore, addCustomFieldSettingRequest.insertBefore) &&
        Objects.equals(this.insertAfter, addCustomFieldSettingRequest.insertAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customField, isImportant, insertBefore, insertAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddCustomFieldSettingRequest {\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    isImportant: ").append(toIndentedString(isImportant)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
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

