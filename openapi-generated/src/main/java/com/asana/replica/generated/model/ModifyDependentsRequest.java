package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
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
 * A set of dependent tasks.
 */

@Schema(name = "ModifyDependentsRequest", description = "A set of dependent tasks.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ModifyDependentsRequest {

  @Valid
  private List<String> dependents = new ArrayList<>();

  public ModifyDependentsRequest dependents(List<String> dependents) {
    this.dependents = dependents;
    return this;
  }

  public ModifyDependentsRequest addDependentsItem(String dependentsItem) {
    if (this.dependents == null) {
      this.dependents = new ArrayList<>();
    }
    this.dependents.add(dependentsItem);
    return this;
  }

  /**
   * An array of task gids that are dependents of the given task.
   * @return dependents
   */
  
  @Schema(name = "dependents", description = "An array of task gids that are dependents of the given task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependents")
  public List<String> getDependents() {
    return dependents;
  }

  public void setDependents(List<String> dependents) {
    this.dependents = dependents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModifyDependentsRequest modifyDependentsRequest = (ModifyDependentsRequest) o;
    return Objects.equals(this.dependents, modifyDependentsRequest.dependents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyDependentsRequest {\n");
    sb.append("    dependents: ").append(toIndentedString(dependents)).append("\n");
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

