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
 * A *graph_export* request starts a job to export data starting from a parent object.
 */

@Schema(name = "GraphExportRequest", description = "A *graph_export* request starts a job to export data starting from a parent object.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GraphExportRequest {

  private @Nullable String parent;

  public GraphExportRequest parent(@Nullable String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Globally unique ID of the parent object: goal, project, portfolio, or team.
   * @return parent
   */
  
  @Schema(name = "parent", example = "181636", description = "Globally unique ID of the parent object: goal, project, portfolio, or team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable String getParent() {
    return parent;
  }

  public void setParent(@Nullable String parent) {
    this.parent = parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphExportRequest graphExportRequest = (GraphExportRequest) o;
    return Objects.equals(this.parent, graphExportRequest.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphExportRequest {\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

