package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskAddProjectRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskAddProjectRequest {

  private String project;

  private JsonNullable<String> insertAfter = JsonNullable.<String>undefined();

  private JsonNullable<String> insertBefore = JsonNullable.<String>undefined();

  private JsonNullable<String> section = JsonNullable.<String>undefined();

  public TaskAddProjectRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskAddProjectRequest(String project) {
    this.project = project;
  }

  public TaskAddProjectRequest project(String project) {
    this.project = project;
    return this;
  }

  /**
   * The project to add the task to.
   * @return project
   */
  @NotNull 
  @Schema(name = "project", example = "13579", description = "The project to add the task to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("project")
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public TaskAddProjectRequest insertAfter(String insertAfter) {
    this.insertAfter = JsonNullable.of(insertAfter);
    return this;
  }

  /**
   * A task in the project to insert the task after, or `null` to insert at the beginning of the list.
   * @return insertAfter
   */
  
  @Schema(name = "insert_after", example = "124816", description = "A task in the project to insert the task after, or `null` to insert at the beginning of the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public JsonNullable<String> getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(JsonNullable<String> insertAfter) {
    this.insertAfter = insertAfter;
  }

  public TaskAddProjectRequest insertBefore(String insertBefore) {
    this.insertBefore = JsonNullable.of(insertBefore);
    return this;
  }

  /**
   * A task in the project to insert the task before, or `null` to insert at the end of the list.
   * @return insertBefore
   */
  
  @Schema(name = "insert_before", example = "432134", description = "A task in the project to insert the task before, or `null` to insert at the end of the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public JsonNullable<String> getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(JsonNullable<String> insertBefore) {
    this.insertBefore = insertBefore;
  }

  public TaskAddProjectRequest section(String section) {
    this.section = JsonNullable.of(section);
    return this;
  }

  /**
   * A section in the project to insert the task into. The task will be inserted at the bottom of the section.
   * @return section
   */
  
  @Schema(name = "section", example = "987654", description = "A section in the project to insert the task into. The task will be inserted at the bottom of the section.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("section")
  public JsonNullable<String> getSection() {
    return section;
  }

  public void setSection(JsonNullable<String> section) {
    this.section = section;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskAddProjectRequest taskAddProjectRequest = (TaskAddProjectRequest) o;
    return Objects.equals(this.project, taskAddProjectRequest.project) &&
        equalsNullable(this.insertAfter, taskAddProjectRequest.insertAfter) &&
        equalsNullable(this.insertBefore, taskAddProjectRequest.insertBefore) &&
        equalsNullable(this.section, taskAddProjectRequest.section);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, hashCodeNullable(insertAfter), hashCodeNullable(insertBefore), hashCodeNullable(section));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskAddProjectRequest {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
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

