package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * A story represents an activity associated with an object in the Asana system.
 */

@Schema(name = "StoryCompact", description = "A story represents an activity associated with an object in the Asana system.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class StoryCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable UserCompact createdBy;

  private @Nullable String resourceSubtype;

  private @Nullable String text;

  public StoryCompact gid(@Nullable String gid) {
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

  public StoryCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "story", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public StoryCompact createdAt(@Nullable OffsetDateTime createdAt) {
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

  public StoryCompact createdBy(@Nullable UserCompact createdBy) {
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

  public StoryCompact resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "comment_added", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public StoryCompact text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * *Create-only*. Human-readable text for the story or comment. This will not include the name of the creator. *Note: This is not guaranteed to be stable for a given type of story. For example, text for a reassignment may not always say “assigned to …” as the text for a story can both be edited and change based on the language settings of the user making the request.* Use the `resource_subtype` property to discover the action that created the story.
   * @return text
   */
  
  @Schema(name = "text", example = "marked today", description = "*Create-only*. Human-readable text for the story or comment. This will not include the name of the creator. *Note: This is not guaranteed to be stable for a given type of story. For example, text for a reassignment may not always say “assigned to …” as the text for a story can both be edited and change based on the language settings of the user making the request.* Use the `resource_subtype` property to discover the action that created the story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoryCompact storyCompact = (StoryCompact) o;
    return Objects.equals(this.gid, storyCompact.gid) &&
        Objects.equals(this.resourceType, storyCompact.resourceType) &&
        Objects.equals(this.createdAt, storyCompact.createdAt) &&
        Objects.equals(this.createdBy, storyCompact.createdBy) &&
        Objects.equals(this.resourceSubtype, storyCompact.resourceSubtype) &&
        Objects.equals(this.text, storyCompact.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, createdAt, createdBy, resourceSubtype, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

