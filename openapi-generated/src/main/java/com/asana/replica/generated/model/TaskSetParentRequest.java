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
 * TaskSetParentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskSetParentRequest {

  private String parent;

  private @Nullable String insertAfter;

  private @Nullable String insertBefore;

  public TaskSetParentRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskSetParentRequest(String parent) {
    this.parent = parent;
  }

  public TaskSetParentRequest parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The new parent of the task, or `null` for no parent.
   * @return parent
   */
  @NotNull 
  @Schema(name = "parent", example = "987654", description = "The new parent of the task, or `null` for no parent.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public TaskSetParentRequest insertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * A subtask of the parent to insert the task after, or `null` to insert at the beginning of the list.
   * @return insertAfter
   */
  
  @Schema(name = "insert_after", description = "A subtask of the parent to insert the task after, or `null` to insert at the beginning of the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public @Nullable String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public TaskSetParentRequest insertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * A subtask of the parent to insert the task before, or `null` to insert at the end of the list.
   * @return insertBefore
   */
  
  @Schema(name = "insert_before", example = "124816", description = "A subtask of the parent to insert the task before, or `null` to insert at the end of the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public @Nullable String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSetParentRequest taskSetParentRequest = (TaskSetParentRequest) o;
    return Objects.equals(this.parent, taskSetParentRequest.parent) &&
        Objects.equals(this.insertAfter, taskSetParentRequest.insertAfter) &&
        Objects.equals(this.insertBefore, taskSetParentRequest.insertBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, insertAfter, insertBefore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSetParentRequest {\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
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

