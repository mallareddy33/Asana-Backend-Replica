package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.ResourceExportFilters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ResourceExportRequestParameter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ResourceExportRequestParameter {

  private @Nullable String resourceType;

  private @Nullable ResourceExportFilters filters;

  @Valid
  private List<String> fields = new ArrayList<>();

  public ResourceExportRequestParameter resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of the resource to be exported. This can be a task, team, or message.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", example = "task", description = "The type of the resource to be exported. This can be a task, team, or message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public ResourceExportRequestParameter filters(@Nullable ResourceExportFilters filters) {
    this.filters = filters;
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  @Valid 
  @Schema(name = "filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public @Nullable ResourceExportFilters getFilters() {
    return filters;
  }

  public void setFilters(@Nullable ResourceExportFilters filters) {
    this.filters = filters;
  }

  public ResourceExportRequestParameter fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public ResourceExportRequestParameter addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * An array of fields to include for the resource type. If not provided, all non-optional fields for the resource type will be included. This conforms to the fields optional parameter available for all Asana endpoints which is documented [here](https://developers.asana.com/docs/inputoutput-options)
   * @return fields
   */
  
  @Schema(name = "fields", description = "An array of fields to include for the resource type. If not provided, all non-optional fields for the resource type will be included. This conforms to the fields optional parameter available for all Asana endpoints which is documented [here](https://developers.asana.com/docs/inputoutput-options)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ResourceExportRequestParameter resourceExportRequestParameter = (ResourceExportRequestParameter) o;
    return Objects.equals(this.resourceType, resourceExportRequestParameter.resourceType) &&
        Objects.equals(this.filters, resourceExportRequestParameter.filters) &&
        Objects.equals(this.fields, resourceExportRequestParameter.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, filters, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceExportRequestParameter {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

