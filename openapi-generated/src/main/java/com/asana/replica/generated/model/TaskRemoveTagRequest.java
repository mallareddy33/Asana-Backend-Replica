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
 * TaskRemoveTagRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskRemoveTagRequest {

  private String tag;

  public TaskRemoveTagRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskRemoveTagRequest(String tag) {
    this.tag = tag;
  }

  public TaskRemoveTagRequest tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The tag's gid to remove from the task.
   * @return tag
   */
  @NotNull 
  @Schema(name = "tag", example = "13579", description = "The tag's gid to remove from the task.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskRemoveTagRequest taskRemoveTagRequest = (TaskRemoveTagRequest) o;
    return Objects.equals(this.tag, taskRemoveTagRequest.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskRemoveTagRequest {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

