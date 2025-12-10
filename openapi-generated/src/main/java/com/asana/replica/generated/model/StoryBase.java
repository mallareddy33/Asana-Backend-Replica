package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * A story represents an activity associated with an object in the Asana system.
 */

@Schema(name = "StoryBase", description = "A story represents an activity associated with an object in the Asana system.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class StoryBase {

  private @Nullable String gid;

  private @Nullable String resourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable String resourceSubtype;

  private @Nullable String text;

  private @Nullable String htmlText;

  private @Nullable Boolean isPinned;

  /**
   * The name of the sticker in this story. `null` if there is no sticker.
   */
  public enum StickerNameEnum {
    GREEN_CHECKMARK("green_checkmark"),
    
    PEOPLE_DANCING("people_dancing"),
    
    DANCING_UNICORN("dancing_unicorn"),
    
    HEART("heart"),
    
    PARTY_POPPER("party_popper"),
    
    PEOPLE_WAVING_FLAGS("people_waving_flags"),
    
    SPLASHING_NARWHAL("splashing_narwhal"),
    
    TROPHY("trophy"),
    
    YETI_RIDING_UNICORN("yeti_riding_unicorn"),
    
    CELEBRATING_PEOPLE("celebrating_people"),
    
    DETERMINED_CLIMBERS("determined_climbers"),
    
    PHOENIX_SPREADING_LOVE("phoenix_spreading_love");

    private final String value;

    StickerNameEnum(String value) {
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
    public static StickerNameEnum fromValue(String value) {
      for (StickerNameEnum b : StickerNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable StickerNameEnum stickerName;

  public StoryBase gid(@Nullable String gid) {
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

  public StoryBase resourceType(@Nullable String resourceType) {
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

  public StoryBase createdAt(@Nullable OffsetDateTime createdAt) {
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

  public StoryBase resourceSubtype(@Nullable String resourceSubtype) {
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

  public StoryBase text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * The plain text of the comment to add. Cannot be used with html_text.
   * @return text
   */
  
  @Schema(name = "text", example = "This is a comment.", description = "The plain text of the comment to add. Cannot be used with html_text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  public StoryBase htmlText(@Nullable String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

  /**
   * [Opt In](/docs/inputoutput-options). HTML formatted text for a comment. This will not include the name of the creator.
   * @return htmlText
   */
  
  @Schema(name = "html_text", example = "<body>This is a comment.</body>", description = "[Opt In](/docs/inputoutput-options). HTML formatted text for a comment. This will not include the name of the creator.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_text")
  public @Nullable String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(@Nullable String htmlText) {
    this.htmlText = htmlText;
  }

  public StoryBase isPinned(@Nullable Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  /**
   * *Conditional*. Whether the story should be pinned on the resource.
   * @return isPinned
   */
  
  @Schema(name = "is_pinned", example = "false", description = "*Conditional*. Whether the story should be pinned on the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_pinned")
  public @Nullable Boolean getIsPinned() {
    return isPinned;
  }

  public void setIsPinned(@Nullable Boolean isPinned) {
    this.isPinned = isPinned;
  }

  public StoryBase stickerName(@Nullable StickerNameEnum stickerName) {
    this.stickerName = stickerName;
    return this;
  }

  /**
   * The name of the sticker in this story. `null` if there is no sticker.
   * @return stickerName
   */
  
  @Schema(name = "sticker_name", example = "dancing_unicorn", description = "The name of the sticker in this story. `null` if there is no sticker.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sticker_name")
  public @Nullable StickerNameEnum getStickerName() {
    return stickerName;
  }

  public void setStickerName(@Nullable StickerNameEnum stickerName) {
    this.stickerName = stickerName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoryBase storyBase = (StoryBase) o;
    return Objects.equals(this.gid, storyBase.gid) &&
        Objects.equals(this.resourceType, storyBase.resourceType) &&
        Objects.equals(this.createdAt, storyBase.createdAt) &&
        Objects.equals(this.resourceSubtype, storyBase.resourceSubtype) &&
        Objects.equals(this.text, storyBase.text) &&
        Objects.equals(this.htmlText, storyBase.htmlText) &&
        Objects.equals(this.isPinned, storyBase.isPinned) &&
        Objects.equals(this.stickerName, storyBase.stickerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, createdAt, resourceSubtype, text, htmlText, isPinned, stickerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    stickerName: ").append(toIndentedString(stickerName)).append("\n");
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

