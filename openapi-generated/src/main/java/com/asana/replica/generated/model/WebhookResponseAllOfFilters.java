package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * A set of filters to specify a whitelist for what types of events will be delivered.
 */

@Schema(name = "WebhookResponse_allOf_filters", description = "A set of filters to specify a whitelist for what types of events will be delivered.")
@JsonTypeName("WebhookResponse_allOf_filters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class WebhookResponseAllOfFilters {

  private @Nullable String resourceType;

  private @Nullable String resourceSubtype;

  private @Nullable String action;

  @Valid
  private List<String> fields = new ArrayList<>();

  public WebhookResponseAllOfFilters resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of the resource which created the event when modified; for example, to filter to changes on regular tasks this field should be set to `task`.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", example = "task", description = "The type of the resource which created the event when modified; for example, to filter to changes on regular tasks this field should be set to `task`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public WebhookResponseAllOfFilters resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The resource subtype of the resource that the filter applies to. This should be set to the same value as is returned on the `resource_subtype` field on the resources themselves.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", example = "milestone", description = "The resource subtype of the resource that the filter applies to. This should be set to the same value as is returned on the `resource_subtype` field on the resources themselves.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public WebhookResponseAllOfFilters action(@Nullable String action) {
    this.action = action;
    return this;
  }

  /**
   * The type of change on the **resource** to pass through the filter. For more information refer to `Event.action` in the [event](/reference/events) schema. This can be one of `changed`, `added`, `removed`, `deleted`, and `undeleted` depending on the nature of what has occurred on the resource.
   * @return action
   */
  
  @Schema(name = "action", example = "changed", description = "The type of change on the **resource** to pass through the filter. For more information refer to `Event.action` in the [event](/reference/events) schema. This can be one of `changed`, `added`, `removed`, `deleted`, and `undeleted` depending on the nature of what has occurred on the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public @Nullable String getAction() {
    return action;
  }

  public void setAction(@Nullable String action) {
    this.action = action;
  }

  public WebhookResponseAllOfFilters fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public WebhookResponseAllOfFilters addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * *Conditional.* A whitelist of fields for events which will pass the filter when the resource is changed. These can be any combination of the fields on the resources themselves. This field is only valid for `action` of type `changed` *Note: Subscriptions created on higher-level resources such as a Workspace, Team, or Portfolio do not support fields.*
   * @return fields
   */
  
  @Schema(name = "fields", example = "[due_at, due_on, dependencies]", description = "*Conditional.* A whitelist of fields for events which will pass the filter when the resource is changed. These can be any combination of the fields on the resources themselves. This field is only valid for `action` of type `changed` *Note: Subscriptions created on higher-level resources such as a Workspace, Team, or Portfolio do not support fields.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponseAllOfFilters webhookResponseAllOfFilters = (WebhookResponseAllOfFilters) o;
    return Objects.equals(this.resourceType, webhookResponseAllOfFilters.resourceType) &&
        Objects.equals(this.resourceSubtype, webhookResponseAllOfFilters.resourceSubtype) &&
        Objects.equals(this.action, webhookResponseAllOfFilters.action) &&
        Objects.equals(this.fields, webhookResponseAllOfFilters.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, resourceSubtype, action, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponseAllOfFilters {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

