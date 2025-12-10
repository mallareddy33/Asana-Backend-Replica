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
 * TaskAddTagRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskAddTagRequest {

  private String tag;

  public TaskAddTagRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskAddTagRequest(String tag) {
    this.tag = tag;
  }

  public TaskAddTagRequest tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The tag's gid to add to the task.
   * @return tag
   */
  @NotNull 
  @Schema(name = "tag", example = "13579", description = "The tag's gid to add to the task.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    TaskAddTagRequest taskAddTagRequest = (TaskAddTagRequest) o;
    return Objects.equals(this.tag, taskAddTagRequest.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskAddTagRequest {\n");
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

