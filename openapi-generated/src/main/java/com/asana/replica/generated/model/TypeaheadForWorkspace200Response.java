package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AsanaNamedResource;
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
 * A generic list of objects, such as those returned by the typeahead search endpoint.
 */

@Schema(name = "typeaheadForWorkspace_200_response", description = "A generic list of objects, such as those returned by the typeahead search endpoint.")
@JsonTypeName("typeaheadForWorkspace_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TypeaheadForWorkspace200Response {

  @Valid
  private List<@Valid AsanaNamedResource> data = new ArrayList<>();

  public TypeaheadForWorkspace200Response data(List<@Valid AsanaNamedResource> data) {
    this.data = data;
    return this;
  }

  public TypeaheadForWorkspace200Response addDataItem(AsanaNamedResource dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid AsanaNamedResource> getData() {
    return data;
  }

  public void setData(List<@Valid AsanaNamedResource> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeaheadForWorkspace200Response typeaheadForWorkspace200Response = (TypeaheadForWorkspace200Response) o;
    return Objects.equals(this.data, typeaheadForWorkspace200Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeaheadForWorkspace200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

