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
 * DateVariableCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class DateVariableCompact {

  private @Nullable String gid;

  private @Nullable String name;

  private @Nullable String description;

  public DateVariableCompact gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the date field in the project template. A value of `1` refers to the project start date, while `2` refers to the project due date.
   * @return gid
   */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "1", description = "Globally unique identifier of the date field in the project template. A value of `1` refers to the project start date, while `2` refers to the project due date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public DateVariableCompact name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the date variable.
   * @return name
   */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, example = "Start Date", description = "The name of the date variable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public DateVariableCompact description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of what the date variable is used for when instantiating a project.
   * @return description
   */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, example = "Choose a start date for your project.", description = "The description of what the date variable is used for when instantiating a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateVariableCompact dateVariableCompact = (DateVariableCompact) o;
    return Objects.equals(this.gid, dateVariableCompact.gid) &&
        Objects.equals(this.name, dateVariableCompact.name) &&
        Objects.equals(this.description, dateVariableCompact.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateVariableCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

