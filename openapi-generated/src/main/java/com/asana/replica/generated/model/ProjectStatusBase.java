package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProjectStatusBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectStatusBase {

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

  public ProjectStatusBase gid(@Nullable String gid) {
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

  public ProjectStatusBase resourceType(@Nullable String resourceType) {
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

  public ProjectStatusBase title(@Nullable String title) {
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

  public ProjectStatusBase text(@Nullable String text) {
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

  public ProjectStatusBase htmlText(@Nullable String htmlText) {
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

  public ProjectStatusBase color(@Nullable ColorEnum color) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStatusBase projectStatusBase = (ProjectStatusBase) o;
    return Objects.equals(this.gid, projectStatusBase.gid) &&
        Objects.equals(this.resourceType, projectStatusBase.resourceType) &&
        Objects.equals(this.title, projectStatusBase.title) &&
        Objects.equals(this.text, projectStatusBase.text) &&
        Objects.equals(this.htmlText, projectStatusBase.htmlText) &&
        Objects.equals(this.color, projectStatusBase.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, title, text, htmlText, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatusBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

