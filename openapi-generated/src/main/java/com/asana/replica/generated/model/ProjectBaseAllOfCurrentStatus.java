package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProjectBaseAllOfCurrentStatus
 */

@JsonTypeName("ProjectBase_allOf_current_status")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectBaseAllOfCurrentStatus {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String title;

  private @Nullable String text;

  private @Nullable String htmlText;

  /**
   * The color associated with the status update.
   */
  public enum ColorEnum {
    GREEN("green"),
    
    YELLOW("yellow"),
    
    RED("red"),
    
    BLUE("blue"),
    
    COMPLETE("complete");

    private final String value;

    ColorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ColorEnum color;

  private @Nullable UserCompact author;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable UserCompact createdBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime modifiedAt;

  public ProjectBaseAllOfCurrentStatus gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
   */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public ProjectBaseAllOfCurrentStatus resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "project_status", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public ProjectBaseAllOfCurrentStatus title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the project status update.
   * @return title
   */
  
  @Schema(name = "title", example = "Status Update - Jun 15", description = "The title of the project status update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public ProjectBaseAllOfCurrentStatus text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * The text content of the status update.
   * @return text
   */
  
  @Schema(name = "text", example = "The project is moving forward according to plan...", description = "The text content of the status update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  public ProjectBaseAllOfCurrentStatus htmlText(@Nullable String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). The text content of the status update with formatting as HTML.
   * @return htmlText
   */
  
  @Schema(name = "html_text", example = "<body>The project <strong>is</strong> moving forward according to plan...</body>", description = "[Opt In](/docs/inputoutput-options). The text content of the status update with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_text")
  public @Nullable String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(@Nullable String htmlText) {
    this.htmlText = htmlText;
  }

  public ProjectBaseAllOfCurrentStatus color(@Nullable ColorEnum color) {
    this.color = color;
    return this;
  }

  /**
   * The color associated with the status update.
   * @return color
   */
  
  @Schema(name = "color", description = "The color associated with the status update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public @Nullable ColorEnum getColor() {
    return color;
  }

  public void setColor(@Nullable ColorEnum color) {
    this.color = color;
  }

  public ProjectBaseAllOfCurrentStatus author(@Nullable UserCompact author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
   */
  @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public @Nullable UserCompact getAuthor() {
    return author;
  }

  public void setAuthor(@Nullable UserCompact author) {
    this.author = author;
  }

  public ProjectBaseAllOfCurrentStatus createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ProjectBaseAllOfCurrentStatus createdBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   */
  @Valid 
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public @Nullable UserCompact getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(@Nullable UserCompact createdBy) {
    this.createdBy = createdBy;
  }

  public ProjectBaseAllOfCurrentStatus modifiedAt(@Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which this project status was last modified. *Note: This does not currently reflect any changes in associations such as comments that may have been added or removed from the project status.*
   * @return modifiedAt
   */
  @Valid 
  @Schema(name = "modified_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this project status was last modified. *Note: This does not currently reflect any changes in associations such as comments that may have been added or removed from the project status.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified_at")
  public @Nullable OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(@Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectBaseAllOfCurrentStatus projectBaseAllOfCurrentStatus = (ProjectBaseAllOfCurrentStatus) o;
    return Objects.equals(this.gid, projectBaseAllOfCurrentStatus.gid) &&
        Objects.equals(this.resourceType, projectBaseAllOfCurrentStatus.resourceType) &&
        Objects.equals(this.title, projectBaseAllOfCurrentStatus.title) &&
        Objects.equals(this.text, projectBaseAllOfCurrentStatus.text) &&
        Objects.equals(this.htmlText, projectBaseAllOfCurrentStatus.htmlText) &&
        Objects.equals(this.color, projectBaseAllOfCurrentStatus.color) &&
        Objects.equals(this.author, projectBaseAllOfCurrentStatus.author) &&
        Objects.equals(this.createdAt, projectBaseAllOfCurrentStatus.createdAt) &&
        Objects.equals(this.createdBy, projectBaseAllOfCurrentStatus.createdBy) &&
        Objects.equals(this.modifiedAt, projectBaseAllOfCurrentStatus.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, title, text, htmlText, color, author, createdAt, createdBy, modifiedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectBaseAllOfCurrentStatus {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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

