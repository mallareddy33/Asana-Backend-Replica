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
 * StatusUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class StatusUpdateRequest {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String title;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.
   */
  public enum ResourceSubtypeEnum {
    PROJECT_STATUS_UPDATE("project_status_update"),
    
    PORTFOLIO_STATUS_UPDATE("portfolio_status_update"),
    
    GOAL_STATUS_UPDATE("goal_status_update");

    private final String value;

    ResourceSubtypeEnum(String value) {
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
    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ResourceSubtypeEnum resourceSubtype;

  private String text;

  private @Nullable String htmlText;

  /**
   * The type associated with the status update. This represents the current state of the object this object is on.
   */
  public enum StatusTypeEnum {
    ON_TRACK("on_track"),
    
    AT_RISK("at_risk"),
    
    OFF_TRACK("off_track"),
    
    ON_HOLD("on_hold"),
    
    COMPLETE("complete"),
    
    ACHIEVED("achieved"),
    
    PARTIAL("partial"),
    
    MISSED("missed"),
    
    DROPPED("dropped");

    private final String value;

    StatusTypeEnum(String value) {
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
    public static StatusTypeEnum fromValue(String value) {
      for (StatusTypeEnum b : StatusTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusTypeEnum statusType;

  private String parent;

  public StatusUpdateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatusUpdateRequest(String text, StatusTypeEnum statusType, String parent) {
    this.text = text;
    this.statusType = statusType;
    this.parent = parent;
  }

  public StatusUpdateRequest gid(@Nullable String gid) {
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

  public StatusUpdateRequest resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "status_update", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public StatusUpdateRequest title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the status update.
   * @return title
   */
  
  @Schema(name = "title", example = "Status Update - Jun 15", description = "The title of the status update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public StatusUpdateRequest resourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "project_status_update", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The `resource_subtype`s for `status` objects represent the type of their parent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public StatusUpdateRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text content of the status update.
   * @return text
   */
  @NotNull 
  @Schema(name = "text", example = "The project is moving forward according to plan...", description = "The text content of the status update.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public StatusUpdateRequest htmlText(@Nullable String htmlText) {
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

  public StatusUpdateRequest statusType(StatusTypeEnum statusType) {
    this.statusType = statusType;
    return this;
  }

  /**
   * The type associated with the status update. This represents the current state of the object this object is on.
   * @return statusType
   */
  @NotNull 
  @Schema(name = "status_type", description = "The type associated with the status update. This represents the current state of the object this object is on.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status_type")
  public StatusTypeEnum getStatusType() {
    return statusType;
  }

  public void setStatusType(StatusTypeEnum statusType) {
    this.statusType = statusType;
  }

  public StatusUpdateRequest parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * The id of parent to send this status update to. This can be a project, goal or portfolio.
   * @return parent
   */
  @NotNull 
  @Schema(name = "parent", description = "The id of parent to send this status update to. This can be a project, goal or portfolio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusUpdateRequest statusUpdateRequest = (StatusUpdateRequest) o;
    return Objects.equals(this.gid, statusUpdateRequest.gid) &&
        Objects.equals(this.resourceType, statusUpdateRequest.resourceType) &&
        Objects.equals(this.title, statusUpdateRequest.title) &&
        Objects.equals(this.resourceSubtype, statusUpdateRequest.resourceSubtype) &&
        Objects.equals(this.text, statusUpdateRequest.text) &&
        Objects.equals(this.htmlText, statusUpdateRequest.htmlText) &&
        Objects.equals(this.statusType, statusUpdateRequest.statusType) &&
        Objects.equals(this.parent, statusUpdateRequest.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, title, resourceSubtype, text, htmlText, statusType, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusUpdateRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

