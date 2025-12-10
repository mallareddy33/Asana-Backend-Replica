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
 * SectionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class SectionRequest {

  private String name;

  private @Nullable String insertBefore;

  private @Nullable String insertAfter;

  public SectionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SectionRequest(String name) {
    this.name = name;
  }

  public SectionRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The text to be displayed as the section name. This cannot be an empty string.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "Next Actions", description = "The text to be displayed as the section name. This cannot be an empty string.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SectionRequest insertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * An existing section within this project before which the added section should be inserted. Cannot be provided together with insert_after.
   * @return insertBefore
   */
  
  @Schema(name = "insert_before", example = "86420", description = "An existing section within this project before which the added section should be inserted. Cannot be provided together with insert_after.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public @Nullable String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(@Nullable String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public SectionRequest insertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * An existing section within this project after which the added section should be inserted. Cannot be provided together with insert_before.
   * @return insertAfter
   */
  
  @Schema(name = "insert_after", example = "987654", description = "An existing section within this project after which the added section should be inserted. Cannot be provided together with insert_before.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public @Nullable String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(@Nullable String insertAfter) {
    this.insertAfter = insertAfter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionRequest sectionRequest = (SectionRequest) o;
    return Objects.equals(this.name, sectionRequest.name) &&
        Objects.equals(this.insertBefore, sectionRequest.insertBefore) &&
        Objects.equals(this.insertAfter, sectionRequest.insertAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, insertBefore, insertAfter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
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

