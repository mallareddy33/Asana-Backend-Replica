package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.ProjectBriefResponseAllOfProject;
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
 * ProjectBriefResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ProjectBriefResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String title;

  private @Nullable String htmlText;

  private @Nullable String text;

  private @Nullable String permalinkUrl;

  private @Nullable ProjectBriefResponseAllOfProject project;

  public ProjectBriefResponse gid(@Nullable String gid) {
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

  public ProjectBriefResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "project_brief", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public ProjectBriefResponse title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the project brief.
   * @return title
   */
  
  @Schema(name = "title", example = "Stuff to buy — Project Brief", description = "The title of the project brief.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public ProjectBriefResponse htmlText(@Nullable String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

  /**
   * HTML formatted text for the project brief.
   * @return htmlText
   */
  
  @Schema(name = "html_text", example = "<body>This is a <strong>project brief</strong>.</body>", description = "HTML formatted text for the project brief.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_text")
  public @Nullable String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(@Nullable String htmlText) {
    this.htmlText = htmlText;
  }

  public ProjectBriefResponse text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). The plain text of the project brief.
   * @return text
   */
  
  @Schema(name = "text", example = "This is a project brief.", description = "[Opt In](/docs/inputoutput-options). The plain text of the project brief.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  public ProjectBriefResponse permalinkUrl(@Nullable String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
    return this;
  }

  /**
   * A url that points directly to the object within Asana.
   * @return permalinkUrl
   */
  
  @Schema(name = "permalink_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://app.asana.com/0/11111111/22222222", description = "A url that points directly to the object within Asana.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permalink_url")
  public @Nullable String getPermalinkUrl() {
    return permalinkUrl;
  }

  public void setPermalinkUrl(@Nullable String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
  }

  public ProjectBriefResponse project(@Nullable ProjectBriefResponseAllOfProject project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
   */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public @Nullable ProjectBriefResponseAllOfProject getProject() {
    return project;
  }

  public void setProject(@Nullable ProjectBriefResponseAllOfProject project) {
    this.project = project;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectBriefResponse projectBriefResponse = (ProjectBriefResponse) o;
    return Objects.equals(this.gid, projectBriefResponse.gid) &&
        Objects.equals(this.resourceType, projectBriefResponse.resourceType) &&
        Objects.equals(this.title, projectBriefResponse.title) &&
        Objects.equals(this.htmlText, projectBriefResponse.htmlText) &&
        Objects.equals(this.text, projectBriefResponse.text) &&
        Objects.equals(this.permalinkUrl, projectBriefResponse.permalinkUrl) &&
        Objects.equals(this.project, projectBriefResponse.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, title, htmlText, text, permalinkUrl, project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectBriefResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

