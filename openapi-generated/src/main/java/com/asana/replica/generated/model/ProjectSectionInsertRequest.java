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
 * ProjectSectionInsertRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectSectionInsertRequest {

  private String section;

  private @Nullable String beforeSection;

  private @Nullable String afterSection;

  public ProjectSectionInsertRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProjectSectionInsertRequest(String section) {
    this.section = section;
  }

  public ProjectSectionInsertRequest section(String section) {
    this.section = section;
    return this;
  }

  /**
   * The section to reorder.
   * @return section
   */
  @NotNull 
  @Schema(name = "section", example = "321654", description = "The section to reorder.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("section")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public ProjectSectionInsertRequest beforeSection(@Nullable String beforeSection) {
    this.beforeSection = beforeSection;
    return this;
  }

  /**
   * Insert the given section immediately before the section specified by this parameter.
   * @return beforeSection
   */
  
  @Schema(name = "before_section", example = "86420", description = "Insert the given section immediately before the section specified by this parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("before_section")
  public @Nullable String getBeforeSection() {
    return beforeSection;
  }

  public void setBeforeSection(@Nullable String beforeSection) {
    this.beforeSection = beforeSection;
  }

  public ProjectSectionInsertRequest afterSection(@Nullable String afterSection) {
    this.afterSection = afterSection;
    return this;
  }

  /**
   * Insert the given section immediately after the section specified by this parameter.
   * @return afterSection
   */
  
  @Schema(name = "after_section", example = "987654", description = "Insert the given section immediately after the section specified by this parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("after_section")
  public @Nullable String getAfterSection() {
    return afterSection;
  }

  public void setAfterSection(@Nullable String afterSection) {
    this.afterSection = afterSection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSectionInsertRequest projectSectionInsertRequest = (ProjectSectionInsertRequest) o;
    return Objects.equals(this.section, projectSectionInsertRequest.section) &&
        Objects.equals(this.beforeSection, projectSectionInsertRequest.beforeSection) &&
        Objects.equals(this.afterSection, projectSectionInsertRequest.afterSection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(section, beforeSection, afterSection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSectionInsertRequest {\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    beforeSection: ").append(toIndentedString(beforeSection)).append("\n");
    sb.append("    afterSection: ").append(toIndentedString(afterSection)).append("\n");
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

