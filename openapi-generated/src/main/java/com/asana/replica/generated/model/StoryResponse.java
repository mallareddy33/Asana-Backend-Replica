package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.CustomFieldCompact;
import com.asana.replica.generated.model.EnumOption;
import com.asana.replica.generated.model.Like;
import com.asana.replica.generated.model.Preview;
import com.asana.replica.generated.model.ProjectCompact;
import com.asana.replica.generated.model.ReactionSummaryItemCompact;
import com.asana.replica.generated.model.SectionCompact;
import com.asana.replica.generated.model.StoryCompact;
import com.asana.replica.generated.model.StoryResponseAllOfTarget;
import com.asana.replica.generated.model.StoryResponseDates;
import com.asana.replica.generated.model.TagCompact;
import com.asana.replica.generated.model.TaskCompact;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
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
 * StoryResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class StoryResponse {

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

  private @Nullable UserCompact createdBy;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    COMMENT("comment"),
    
    SYSTEM("system");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

  private @Nullable Boolean isEditable;

  private @Nullable Boolean isEdited;

  private @Nullable Boolean hearted;

  @Valid
  private List<@Valid Like> hearts = new ArrayList<>();

  private @Nullable Integer numHearts;

  private @Nullable Boolean liked;

  @Valid
  private List<@Valid Like> likes = new ArrayList<>();

  private @Nullable Integer numLikes;

  @Valid
  private List<@Valid ReactionSummaryItemCompact> reactionSummary = new ArrayList<>();

  @Valid
  private List<@Valid Preview> previews = new ArrayList<>();

  private @Nullable String oldName;

  private JsonNullable<String> newName = JsonNullable.<String>undefined();

  private @Nullable StoryResponseDates oldDates;

  private @Nullable StoryResponseDates newDates;

  private @Nullable String oldResourceSubtype;

  private @Nullable String newResourceSubtype;

  private @Nullable StoryCompact story;

  private @Nullable UserCompact assignee;

  private @Nullable UserCompact follower;

  private @Nullable SectionCompact oldSection;

  private @Nullable SectionCompact newSection;

  private @Nullable TaskCompact task;

  private @Nullable ProjectCompact project;

  private @Nullable TagCompact tag;

  private @Nullable CustomFieldCompact customField;

  private @Nullable String oldTextValue;

  private @Nullable String newTextValue;

  private JsonNullable<Integer> oldNumberValue = JsonNullable.<Integer>undefined();

  private @Nullable Integer newNumberValue;

  private @Nullable EnumOption oldEnumValue;

  private @Nullable EnumOption newEnumValue;

  private @Nullable StoryResponseDates oldDateValue;

  private @Nullable StoryResponseDates newDateValue;

  @Valid
  private List<@Valid UserCompact> oldPeopleValue = new ArrayList<>();

  @Valid
  private List<@Valid UserCompact> newPeopleValue = new ArrayList<>();

  @Valid
  private List<@Valid EnumOption> oldMultiEnumValues = new ArrayList<>();

  @Valid
  private List<@Valid EnumOption> newMultiEnumValues = new ArrayList<>();

  private @Nullable String newApprovalStatus;

  private @Nullable String oldApprovalStatus;

  private @Nullable TaskCompact duplicateOf;

  private @Nullable TaskCompact duplicatedFrom;

  private @Nullable TaskCompact dependency;

  /**
   * The component of the Asana product the user used to trigger the story.
   */
  public enum SourceEnum {
    WEB("web"),
    
    EMAIL("email"),
    
    MOBILE("mobile"),
    
    API("api"),
    
    UNKNOWN("unknown");

    private final String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String value) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SourceEnum source;

  private @Nullable StoryResponseAllOfTarget target;

  public StoryResponse gid(@Nullable String gid) {
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

  public StoryResponse resourceType(@Nullable String resourceType) {
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

  public StoryResponse createdAt(@Nullable OffsetDateTime createdAt) {
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

  public StoryResponse resourceSubtype(@Nullable String resourceSubtype) {
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

  public StoryResponse text(@Nullable String text) {
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

  public StoryResponse htmlText(@Nullable String htmlText) {
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

  public StoryResponse isPinned(@Nullable Boolean isPinned) {
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

  public StoryResponse stickerName(@Nullable StickerNameEnum stickerName) {
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

  public StoryResponse createdBy(@Nullable UserCompact createdBy) {
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

  public StoryResponse type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, example = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public StoryResponse isEditable(@Nullable Boolean isEditable) {
    this.isEditable = isEditable;
    return this;
  }

  /**
   * *Conditional*. Whether the text of the story can be edited after creation.
   * @return isEditable
   */
  
  @Schema(name = "is_editable", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Conditional*. Whether the text of the story can be edited after creation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_editable")
  public @Nullable Boolean getIsEditable() {
    return isEditable;
  }

  public void setIsEditable(@Nullable Boolean isEditable) {
    this.isEditable = isEditable;
  }

  public StoryResponse isEdited(@Nullable Boolean isEdited) {
    this.isEdited = isEdited;
    return this;
  }

  /**
   * *Conditional*. Whether the text of the story has been edited after creation.
   * @return isEdited
   */
  
  @Schema(name = "is_edited", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Conditional*. Whether the text of the story has been edited after creation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_edited")
  public @Nullable Boolean getIsEdited() {
    return isEdited;
  }

  public void setIsEdited(@Nullable Boolean isEdited) {
    this.isEdited = isEdited;
  }

  public StoryResponse hearted(@Nullable Boolean hearted) {
    this.hearted = hearted;
    return this;
  }

  /**
   * *Deprecated - please use likes instead* *Conditional*. True if the story is hearted by the authorized user, false if not.
   * @return hearted
   */
  
  @Schema(name = "hearted", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Deprecated - please use likes instead* *Conditional*. True if the story is hearted by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearted")
  public @Nullable Boolean getHearted() {
    return hearted;
  }

  public void setHearted(@Nullable Boolean hearted) {
    this.hearted = hearted;
  }

  public StoryResponse hearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
    return this;
  }

  public StoryResponse addHeartsItem(Like heartsItem) {
    if (this.hearts == null) {
      this.hearts = new ArrayList<>();
    }
    this.hearts.add(heartsItem);
    return this;
  }

  /**
   * *Deprecated - please use likes instead*  *Conditional*. Array of likes for users who have hearted this story.
   * @return hearts
   */
  @Valid 
  @Schema(name = "hearts", accessMode = Schema.AccessMode.READ_ONLY, description = "*Deprecated - please use likes instead*  *Conditional*. Array of likes for users who have hearted this story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearts")
  public List<@Valid Like> getHearts() {
    return hearts;
  }

  public void setHearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
  }

  public StoryResponse numHearts(@Nullable Integer numHearts) {
    this.numHearts = numHearts;
    return this;
  }

  /**
   * *Deprecated - please use likes instead*  *Conditional*. The number of users who have hearted this story.
   * @return numHearts
   */
  
  @Schema(name = "num_hearts", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "*Deprecated - please use likes instead*  *Conditional*. The number of users who have hearted this story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_hearts")
  public @Nullable Integer getNumHearts() {
    return numHearts;
  }

  public void setNumHearts(@Nullable Integer numHearts) {
    this.numHearts = numHearts;
  }

  public StoryResponse liked(@Nullable Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * *Conditional*. True if the story is liked by the authorized user, false if not.
   * @return liked
   */
  
  @Schema(name = "liked", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "*Conditional*. True if the story is liked by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liked")
  public @Nullable Boolean getLiked() {
    return liked;
  }

  public void setLiked(@Nullable Boolean liked) {
    this.liked = liked;
  }

  public StoryResponse likes(List<@Valid Like> likes) {
    this.likes = likes;
    return this;
  }

  public StoryResponse addLikesItem(Like likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * *Conditional*. Array of likes for users who have liked this story.
   * @return likes
   */
  @Valid 
  @Schema(name = "likes", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. Array of likes for users who have liked this story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid Like> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid Like> likes) {
    this.likes = likes;
  }

  public StoryResponse numLikes(@Nullable Integer numLikes) {
    this.numLikes = numLikes;
    return this;
  }

  /**
   * *Conditional*. The number of users who have liked this story.
   * @return numLikes
   */
  
  @Schema(name = "num_likes", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "*Conditional*. The number of users who have liked this story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_likes")
  public @Nullable Integer getNumLikes() {
    return numLikes;
  }

  public void setNumLikes(@Nullable Integer numLikes) {
    this.numLikes = numLikes;
  }

  public StoryResponse reactionSummary(List<@Valid ReactionSummaryItemCompact> reactionSummary) {
    this.reactionSummary = reactionSummary;
    return this;
  }

  public StoryResponse addReactionSummaryItem(ReactionSummaryItemCompact reactionSummaryItem) {
    if (this.reactionSummary == null) {
      this.reactionSummary = new ArrayList<>();
    }
    this.reactionSummary.add(reactionSummaryItem);
    return this;
  }

  /**
   * Summary of emoji reactions on this story.
   * @return reactionSummary
   */
  @Valid 
  @Schema(name = "reaction_summary", accessMode = Schema.AccessMode.READ_ONLY, description = "Summary of emoji reactions on this story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reaction_summary")
  public List<@Valid ReactionSummaryItemCompact> getReactionSummary() {
    return reactionSummary;
  }

  public void setReactionSummary(List<@Valid ReactionSummaryItemCompact> reactionSummary) {
    this.reactionSummary = reactionSummary;
  }

  public StoryResponse previews(List<@Valid Preview> previews) {
    this.previews = previews;
    return this;
  }

  public StoryResponse addPreviewsItem(Preview previewsItem) {
    if (this.previews == null) {
      this.previews = new ArrayList<>();
    }
    this.previews.add(previewsItem);
    return this;
  }

  /**
   * <p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>attachments:read</code></p>  *Conditional*. A collection of previews to be displayed in the story.  *Note: This property only exists for comment stories.*
   * @return previews
   */
  @Valid 
  @Schema(name = "previews", accessMode = Schema.AccessMode.READ_ONLY, description = "<p><strong style={{ color: \"#4573D2\" }}>Full object requires scope: </strong><code>attachments:read</code></p>  *Conditional*. A collection of previews to be displayed in the story.  *Note: This property only exists for comment stories.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previews")
  public List<@Valid Preview> getPreviews() {
    return previews;
  }

  public void setPreviews(List<@Valid Preview> previews) {
    this.previews = previews;
  }

  public StoryResponse oldName(@Nullable String oldName) {
    this.oldName = oldName;
    return this;
  }

  /**
   * *Conditional* The previous name of the task before a name change.
   * @return oldName
   */
  
  @Schema(name = "old_name", example = "This was the old name", description = "*Conditional* The previous name of the task before a name change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_name")
  public @Nullable String getOldName() {
    return oldName;
  }

  public void setOldName(@Nullable String oldName) {
    this.oldName = oldName;
  }

  public StoryResponse newName(String newName) {
    this.newName = JsonNullable.of(newName);
    return this;
  }

  /**
   * *Conditional* The updated name of the task after a name change.
   * @return newName
   */
  
  @Schema(name = "new_name", accessMode = Schema.AccessMode.READ_ONLY, example = "This is the new name", description = "*Conditional* The updated name of the task after a name change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_name")
  public JsonNullable<String> getNewName() {
    return newName;
  }

  public void setNewName(JsonNullable<String> newName) {
    this.newName = newName;
  }

  public StoryResponse oldDates(@Nullable StoryResponseDates oldDates) {
    this.oldDates = oldDates;
    return this;
  }

  /**
   * Get oldDates
   * @return oldDates
   */
  @Valid 
  @Schema(name = "old_dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_dates")
  public @Nullable StoryResponseDates getOldDates() {
    return oldDates;
  }

  public void setOldDates(@Nullable StoryResponseDates oldDates) {
    this.oldDates = oldDates;
  }

  public StoryResponse newDates(@Nullable StoryResponseDates newDates) {
    this.newDates = newDates;
    return this;
  }

  /**
   * Get newDates
   * @return newDates
   */
  @Valid 
  @Schema(name = "new_dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_dates")
  public @Nullable StoryResponseDates getNewDates() {
    return newDates;
  }

  public void setNewDates(@Nullable StoryResponseDates newDates) {
    this.newDates = newDates;
  }

  public StoryResponse oldResourceSubtype(@Nullable String oldResourceSubtype) {
    this.oldResourceSubtype = oldResourceSubtype;
    return this;
  }

  /**
   * *Conditional*
   * @return oldResourceSubtype
   */
  
  @Schema(name = "old_resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "default_task", description = "*Conditional*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_resource_subtype")
  public @Nullable String getOldResourceSubtype() {
    return oldResourceSubtype;
  }

  public void setOldResourceSubtype(@Nullable String oldResourceSubtype) {
    this.oldResourceSubtype = oldResourceSubtype;
  }

  public StoryResponse newResourceSubtype(@Nullable String newResourceSubtype) {
    this.newResourceSubtype = newResourceSubtype;
    return this;
  }

  /**
   * *Conditional*
   * @return newResourceSubtype
   */
  
  @Schema(name = "new_resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "milestone", description = "*Conditional*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_resource_subtype")
  public @Nullable String getNewResourceSubtype() {
    return newResourceSubtype;
  }

  public void setNewResourceSubtype(@Nullable String newResourceSubtype) {
    this.newResourceSubtype = newResourceSubtype;
  }

  public StoryResponse story(@Nullable StoryCompact story) {
    this.story = story;
    return this;
  }

  /**
   * Get story
   * @return story
   */
  @Valid 
  @Schema(name = "story", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("story")
  public @Nullable StoryCompact getStory() {
    return story;
  }

  public void setStory(@Nullable StoryCompact story) {
    this.story = story;
  }

  public StoryResponse assignee(@Nullable UserCompact assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
   */
  @Valid 
  @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee")
  public @Nullable UserCompact getAssignee() {
    return assignee;
  }

  public void setAssignee(@Nullable UserCompact assignee) {
    this.assignee = assignee;
  }

  public StoryResponse follower(@Nullable UserCompact follower) {
    this.follower = follower;
    return this;
  }

  /**
   * Get follower
   * @return follower
   */
  @Valid 
  @Schema(name = "follower", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("follower")
  public @Nullable UserCompact getFollower() {
    return follower;
  }

  public void setFollower(@Nullable UserCompact follower) {
    this.follower = follower;
  }

  public StoryResponse oldSection(@Nullable SectionCompact oldSection) {
    this.oldSection = oldSection;
    return this;
  }

  /**
   * Get oldSection
   * @return oldSection
   */
  @Valid 
  @Schema(name = "old_section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_section")
  public @Nullable SectionCompact getOldSection() {
    return oldSection;
  }

  public void setOldSection(@Nullable SectionCompact oldSection) {
    this.oldSection = oldSection;
  }

  public StoryResponse newSection(@Nullable SectionCompact newSection) {
    this.newSection = newSection;
    return this;
  }

  /**
   * Get newSection
   * @return newSection
   */
  @Valid 
  @Schema(name = "new_section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_section")
  public @Nullable SectionCompact getNewSection() {
    return newSection;
  }

  public void setNewSection(@Nullable SectionCompact newSection) {
    this.newSection = newSection;
  }

  public StoryResponse task(@Nullable TaskCompact task) {
    this.task = task;
    return this;
  }

  /**
   * Get task
   * @return task
   */
  @Valid 
  @Schema(name = "task", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("task")
  public @Nullable TaskCompact getTask() {
    return task;
  }

  public void setTask(@Nullable TaskCompact task) {
    this.task = task;
  }

  public StoryResponse project(@Nullable ProjectCompact project) {
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
  public @Nullable ProjectCompact getProject() {
    return project;
  }

  public void setProject(@Nullable ProjectCompact project) {
    this.project = project;
  }

  public StoryResponse tag(@Nullable TagCompact tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   */
  @Valid 
  @Schema(name = "tag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tag")
  public @Nullable TagCompact getTag() {
    return tag;
  }

  public void setTag(@Nullable TagCompact tag) {
    this.tag = tag;
  }

  public StoryResponse customField(@Nullable CustomFieldCompact customField) {
    this.customField = customField;
    return this;
  }

  /**
   * Get customField
   * @return customField
   */
  @Valid 
  @Schema(name = "custom_field", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_field")
  public @Nullable CustomFieldCompact getCustomField() {
    return customField;
  }

  public void setCustomField(@Nullable CustomFieldCompact customField) {
    this.customField = customField;
  }

  public StoryResponse oldTextValue(@Nullable String oldTextValue) {
    this.oldTextValue = oldTextValue;
    return this;
  }

  /**
   * *Conditional* The previous value of a text-type field before it was updated.
   * @return oldTextValue
   */
  
  @Schema(name = "old_text_value", accessMode = Schema.AccessMode.READ_ONLY, example = "This was the old text", description = "*Conditional* The previous value of a text-type field before it was updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_text_value")
  public @Nullable String getOldTextValue() {
    return oldTextValue;
  }

  public void setOldTextValue(@Nullable String oldTextValue) {
    this.oldTextValue = oldTextValue;
  }

  public StoryResponse newTextValue(@Nullable String newTextValue) {
    this.newTextValue = newTextValue;
    return this;
  }

  /**
   * *Conditional* The new value of a text-type field after it was updated.
   * @return newTextValue
   */
  
  @Schema(name = "new_text_value", accessMode = Schema.AccessMode.READ_ONLY, example = "This is the new text", description = "*Conditional* The new value of a text-type field after it was updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_text_value")
  public @Nullable String getNewTextValue() {
    return newTextValue;
  }

  public void setNewTextValue(@Nullable String newTextValue) {
    this.newTextValue = newTextValue;
  }

  public StoryResponse oldNumberValue(Integer oldNumberValue) {
    this.oldNumberValue = JsonNullable.of(oldNumberValue);
    return this;
  }

  /**
   * *Conditional* The previous value of a number-type custom field before the update.
   * @return oldNumberValue
   */
  
  @Schema(name = "old_number_value", accessMode = Schema.AccessMode.READ_ONLY, example = "1", description = "*Conditional* The previous value of a number-type custom field before the update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_number_value")
  public JsonNullable<Integer> getOldNumberValue() {
    return oldNumberValue;
  }

  public void setOldNumberValue(JsonNullable<Integer> oldNumberValue) {
    this.oldNumberValue = oldNumberValue;
  }

  public StoryResponse newNumberValue(@Nullable Integer newNumberValue) {
    this.newNumberValue = newNumberValue;
    return this;
  }

  /**
   * *Conditional* The new value of a number-type custom field after the update.
   * @return newNumberValue
   */
  
  @Schema(name = "new_number_value", accessMode = Schema.AccessMode.READ_ONLY, example = "2", description = "*Conditional* The new value of a number-type custom field after the update.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_number_value")
  public @Nullable Integer getNewNumberValue() {
    return newNumberValue;
  }

  public void setNewNumberValue(@Nullable Integer newNumberValue) {
    this.newNumberValue = newNumberValue;
  }

  public StoryResponse oldEnumValue(@Nullable EnumOption oldEnumValue) {
    this.oldEnumValue = oldEnumValue;
    return this;
  }

  /**
   * Get oldEnumValue
   * @return oldEnumValue
   */
  @Valid 
  @Schema(name = "old_enum_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_enum_value")
  public @Nullable EnumOption getOldEnumValue() {
    return oldEnumValue;
  }

  public void setOldEnumValue(@Nullable EnumOption oldEnumValue) {
    this.oldEnumValue = oldEnumValue;
  }

  public StoryResponse newEnumValue(@Nullable EnumOption newEnumValue) {
    this.newEnumValue = newEnumValue;
    return this;
  }

  /**
   * Get newEnumValue
   * @return newEnumValue
   */
  @Valid 
  @Schema(name = "new_enum_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_enum_value")
  public @Nullable EnumOption getNewEnumValue() {
    return newEnumValue;
  }

  public void setNewEnumValue(@Nullable EnumOption newEnumValue) {
    this.newEnumValue = newEnumValue;
  }

  public StoryResponse oldDateValue(@Nullable StoryResponseDates oldDateValue) {
    this.oldDateValue = oldDateValue;
    return this;
  }

  /**
   * *Conditional*. The old value of a date custom field story.
   * @return oldDateValue
   */
  @Valid 
  @Schema(name = "old_date_value", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. The old value of a date custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_date_value")
  public @Nullable StoryResponseDates getOldDateValue() {
    return oldDateValue;
  }

  public void setOldDateValue(@Nullable StoryResponseDates oldDateValue) {
    this.oldDateValue = oldDateValue;
  }

  public StoryResponse newDateValue(@Nullable StoryResponseDates newDateValue) {
    this.newDateValue = newDateValue;
    return this;
  }

  /**
   * *Conditional* The new value of a date custom field story.
   * @return newDateValue
   */
  @Valid 
  @Schema(name = "new_date_value", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional* The new value of a date custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_date_value")
  public @Nullable StoryResponseDates getNewDateValue() {
    return newDateValue;
  }

  public void setNewDateValue(@Nullable StoryResponseDates newDateValue) {
    this.newDateValue = newDateValue;
  }

  public StoryResponse oldPeopleValue(List<@Valid UserCompact> oldPeopleValue) {
    this.oldPeopleValue = oldPeopleValue;
    return this;
  }

  public StoryResponse addOldPeopleValueItem(UserCompact oldPeopleValueItem) {
    if (this.oldPeopleValue == null) {
      this.oldPeopleValue = new ArrayList<>();
    }
    this.oldPeopleValue.add(oldPeopleValueItem);
    return this;
  }

  /**
   * *Conditional*. The old value of a people custom field story.
   * @return oldPeopleValue
   */
  @Valid 
  @Schema(name = "old_people_value", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. The old value of a people custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_people_value")
  public List<@Valid UserCompact> getOldPeopleValue() {
    return oldPeopleValue;
  }

  public void setOldPeopleValue(List<@Valid UserCompact> oldPeopleValue) {
    this.oldPeopleValue = oldPeopleValue;
  }

  public StoryResponse newPeopleValue(List<@Valid UserCompact> newPeopleValue) {
    this.newPeopleValue = newPeopleValue;
    return this;
  }

  public StoryResponse addNewPeopleValueItem(UserCompact newPeopleValueItem) {
    if (this.newPeopleValue == null) {
      this.newPeopleValue = new ArrayList<>();
    }
    this.newPeopleValue.add(newPeopleValueItem);
    return this;
  }

  /**
   * *Conditional*. The new value of a people custom field story.
   * @return newPeopleValue
   */
  @Valid 
  @Schema(name = "new_people_value", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. The new value of a people custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_people_value")
  public List<@Valid UserCompact> getNewPeopleValue() {
    return newPeopleValue;
  }

  public void setNewPeopleValue(List<@Valid UserCompact> newPeopleValue) {
    this.newPeopleValue = newPeopleValue;
  }

  public StoryResponse oldMultiEnumValues(List<@Valid EnumOption> oldMultiEnumValues) {
    this.oldMultiEnumValues = oldMultiEnumValues;
    return this;
  }

  public StoryResponse addOldMultiEnumValuesItem(EnumOption oldMultiEnumValuesItem) {
    if (this.oldMultiEnumValues == null) {
      this.oldMultiEnumValues = new ArrayList<>();
    }
    this.oldMultiEnumValues.add(oldMultiEnumValuesItem);
    return this;
  }

  /**
   * *Conditional*. The old value of a multi-enum custom field story.
   * @return oldMultiEnumValues
   */
  @Valid 
  @Schema(name = "old_multi_enum_values", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. The old value of a multi-enum custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_multi_enum_values")
  public List<@Valid EnumOption> getOldMultiEnumValues() {
    return oldMultiEnumValues;
  }

  public void setOldMultiEnumValues(List<@Valid EnumOption> oldMultiEnumValues) {
    this.oldMultiEnumValues = oldMultiEnumValues;
  }

  public StoryResponse newMultiEnumValues(List<@Valid EnumOption> newMultiEnumValues) {
    this.newMultiEnumValues = newMultiEnumValues;
    return this;
  }

  public StoryResponse addNewMultiEnumValuesItem(EnumOption newMultiEnumValuesItem) {
    if (this.newMultiEnumValues == null) {
      this.newMultiEnumValues = new ArrayList<>();
    }
    this.newMultiEnumValues.add(newMultiEnumValuesItem);
    return this;
  }

  /**
   * *Conditional*. The new value of a multi-enum custom field story.
   * @return newMultiEnumValues
   */
  @Valid 
  @Schema(name = "new_multi_enum_values", accessMode = Schema.AccessMode.READ_ONLY, description = "*Conditional*. The new value of a multi-enum custom field story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_multi_enum_values")
  public List<@Valid EnumOption> getNewMultiEnumValues() {
    return newMultiEnumValues;
  }

  public void setNewMultiEnumValues(List<@Valid EnumOption> newMultiEnumValues) {
    this.newMultiEnumValues = newMultiEnumValues;
  }

  public StoryResponse newApprovalStatus(@Nullable String newApprovalStatus) {
    this.newApprovalStatus = newApprovalStatus;
    return this;
  }

  /**
   * *Conditional*. The new value of approval status.
   * @return newApprovalStatus
   */
  
  @Schema(name = "new_approval_status", accessMode = Schema.AccessMode.READ_ONLY, example = "approved", description = "*Conditional*. The new value of approval status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_approval_status")
  public @Nullable String getNewApprovalStatus() {
    return newApprovalStatus;
  }

  public void setNewApprovalStatus(@Nullable String newApprovalStatus) {
    this.newApprovalStatus = newApprovalStatus;
  }

  public StoryResponse oldApprovalStatus(@Nullable String oldApprovalStatus) {
    this.oldApprovalStatus = oldApprovalStatus;
    return this;
  }

  /**
   * *Conditional*. The old value of approval status.
   * @return oldApprovalStatus
   */
  
  @Schema(name = "old_approval_status", accessMode = Schema.AccessMode.READ_ONLY, example = "pending", description = "*Conditional*. The old value of approval status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("old_approval_status")
  public @Nullable String getOldApprovalStatus() {
    return oldApprovalStatus;
  }

  public void setOldApprovalStatus(@Nullable String oldApprovalStatus) {
    this.oldApprovalStatus = oldApprovalStatus;
  }

  public StoryResponse duplicateOf(@Nullable TaskCompact duplicateOf) {
    this.duplicateOf = duplicateOf;
    return this;
  }

  /**
   * Get duplicateOf
   * @return duplicateOf
   */
  @Valid 
  @Schema(name = "duplicate_of", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duplicate_of")
  public @Nullable TaskCompact getDuplicateOf() {
    return duplicateOf;
  }

  public void setDuplicateOf(@Nullable TaskCompact duplicateOf) {
    this.duplicateOf = duplicateOf;
  }

  public StoryResponse duplicatedFrom(@Nullable TaskCompact duplicatedFrom) {
    this.duplicatedFrom = duplicatedFrom;
    return this;
  }

  /**
   * Get duplicatedFrom
   * @return duplicatedFrom
   */
  @Valid 
  @Schema(name = "duplicated_from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duplicated_from")
  public @Nullable TaskCompact getDuplicatedFrom() {
    return duplicatedFrom;
  }

  public void setDuplicatedFrom(@Nullable TaskCompact duplicatedFrom) {
    this.duplicatedFrom = duplicatedFrom;
  }

  public StoryResponse dependency(@Nullable TaskCompact dependency) {
    this.dependency = dependency;
    return this;
  }

  /**
   * Get dependency
   * @return dependency
   */
  @Valid 
  @Schema(name = "dependency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependency")
  public @Nullable TaskCompact getDependency() {
    return dependency;
  }

  public void setDependency(@Nullable TaskCompact dependency) {
    this.dependency = dependency;
  }

  public StoryResponse source(@Nullable SourceEnum source) {
    this.source = source;
    return this;
  }

  /**
   * The component of the Asana product the user used to trigger the story.
   * @return source
   */
  
  @Schema(name = "source", accessMode = Schema.AccessMode.READ_ONLY, example = "web", description = "The component of the Asana product the user used to trigger the story.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source")
  public @Nullable SourceEnum getSource() {
    return source;
  }

  public void setSource(@Nullable SourceEnum source) {
    this.source = source;
  }

  public StoryResponse target(@Nullable StoryResponseAllOfTarget target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @Valid 
  @Schema(name = "target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public @Nullable StoryResponseAllOfTarget getTarget() {
    return target;
  }

  public void setTarget(@Nullable StoryResponseAllOfTarget target) {
    this.target = target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoryResponse storyResponse = (StoryResponse) o;
    return Objects.equals(this.gid, storyResponse.gid) &&
        Objects.equals(this.resourceType, storyResponse.resourceType) &&
        Objects.equals(this.createdAt, storyResponse.createdAt) &&
        Objects.equals(this.resourceSubtype, storyResponse.resourceSubtype) &&
        Objects.equals(this.text, storyResponse.text) &&
        Objects.equals(this.htmlText, storyResponse.htmlText) &&
        Objects.equals(this.isPinned, storyResponse.isPinned) &&
        Objects.equals(this.stickerName, storyResponse.stickerName) &&
        Objects.equals(this.createdBy, storyResponse.createdBy) &&
        Objects.equals(this.type, storyResponse.type) &&
        Objects.equals(this.isEditable, storyResponse.isEditable) &&
        Objects.equals(this.isEdited, storyResponse.isEdited) &&
        Objects.equals(this.hearted, storyResponse.hearted) &&
        Objects.equals(this.hearts, storyResponse.hearts) &&
        Objects.equals(this.numHearts, storyResponse.numHearts) &&
        Objects.equals(this.liked, storyResponse.liked) &&
        Objects.equals(this.likes, storyResponse.likes) &&
        Objects.equals(this.numLikes, storyResponse.numLikes) &&
        Objects.equals(this.reactionSummary, storyResponse.reactionSummary) &&
        Objects.equals(this.previews, storyResponse.previews) &&
        Objects.equals(this.oldName, storyResponse.oldName) &&
        equalsNullable(this.newName, storyResponse.newName) &&
        Objects.equals(this.oldDates, storyResponse.oldDates) &&
        Objects.equals(this.newDates, storyResponse.newDates) &&
        Objects.equals(this.oldResourceSubtype, storyResponse.oldResourceSubtype) &&
        Objects.equals(this.newResourceSubtype, storyResponse.newResourceSubtype) &&
        Objects.equals(this.story, storyResponse.story) &&
        Objects.equals(this.assignee, storyResponse.assignee) &&
        Objects.equals(this.follower, storyResponse.follower) &&
        Objects.equals(this.oldSection, storyResponse.oldSection) &&
        Objects.equals(this.newSection, storyResponse.newSection) &&
        Objects.equals(this.task, storyResponse.task) &&
        Objects.equals(this.project, storyResponse.project) &&
        Objects.equals(this.tag, storyResponse.tag) &&
        Objects.equals(this.customField, storyResponse.customField) &&
        Objects.equals(this.oldTextValue, storyResponse.oldTextValue) &&
        Objects.equals(this.newTextValue, storyResponse.newTextValue) &&
        equalsNullable(this.oldNumberValue, storyResponse.oldNumberValue) &&
        Objects.equals(this.newNumberValue, storyResponse.newNumberValue) &&
        Objects.equals(this.oldEnumValue, storyResponse.oldEnumValue) &&
        Objects.equals(this.newEnumValue, storyResponse.newEnumValue) &&
        Objects.equals(this.oldDateValue, storyResponse.oldDateValue) &&
        Objects.equals(this.newDateValue, storyResponse.newDateValue) &&
        Objects.equals(this.oldPeopleValue, storyResponse.oldPeopleValue) &&
        Objects.equals(this.newPeopleValue, storyResponse.newPeopleValue) &&
        Objects.equals(this.oldMultiEnumValues, storyResponse.oldMultiEnumValues) &&
        Objects.equals(this.newMultiEnumValues, storyResponse.newMultiEnumValues) &&
        Objects.equals(this.newApprovalStatus, storyResponse.newApprovalStatus) &&
        Objects.equals(this.oldApprovalStatus, storyResponse.oldApprovalStatus) &&
        Objects.equals(this.duplicateOf, storyResponse.duplicateOf) &&
        Objects.equals(this.duplicatedFrom, storyResponse.duplicatedFrom) &&
        Objects.equals(this.dependency, storyResponse.dependency) &&
        Objects.equals(this.source, storyResponse.source) &&
        Objects.equals(this.target, storyResponse.target);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, createdAt, resourceSubtype, text, htmlText, isPinned, stickerName, createdBy, type, isEditable, isEdited, hearted, hearts, numHearts, liked, likes, numLikes, reactionSummary, previews, oldName, hashCodeNullable(newName), oldDates, newDates, oldResourceSubtype, newResourceSubtype, story, assignee, follower, oldSection, newSection, task, project, tag, customField, oldTextValue, newTextValue, hashCodeNullable(oldNumberValue), newNumberValue, oldEnumValue, newEnumValue, oldDateValue, newDateValue, oldPeopleValue, newPeopleValue, oldMultiEnumValues, newMultiEnumValues, newApprovalStatus, oldApprovalStatus, duplicateOf, duplicatedFrom, dependency, source, target);
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
    sb.append("class StoryResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    stickerName: ").append(toIndentedString(stickerName)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isEditable: ").append(toIndentedString(isEditable)).append("\n");
    sb.append("    isEdited: ").append(toIndentedString(isEdited)).append("\n");
    sb.append("    hearted: ").append(toIndentedString(hearted)).append("\n");
    sb.append("    hearts: ").append(toIndentedString(hearts)).append("\n");
    sb.append("    numHearts: ").append(toIndentedString(numHearts)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    numLikes: ").append(toIndentedString(numLikes)).append("\n");
    sb.append("    reactionSummary: ").append(toIndentedString(reactionSummary)).append("\n");
    sb.append("    previews: ").append(toIndentedString(previews)).append("\n");
    sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
    sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
    sb.append("    oldDates: ").append(toIndentedString(oldDates)).append("\n");
    sb.append("    newDates: ").append(toIndentedString(newDates)).append("\n");
    sb.append("    oldResourceSubtype: ").append(toIndentedString(oldResourceSubtype)).append("\n");
    sb.append("    newResourceSubtype: ").append(toIndentedString(newResourceSubtype)).append("\n");
    sb.append("    story: ").append(toIndentedString(story)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    follower: ").append(toIndentedString(follower)).append("\n");
    sb.append("    oldSection: ").append(toIndentedString(oldSection)).append("\n");
    sb.append("    newSection: ").append(toIndentedString(newSection)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
    sb.append("    oldTextValue: ").append(toIndentedString(oldTextValue)).append("\n");
    sb.append("    newTextValue: ").append(toIndentedString(newTextValue)).append("\n");
    sb.append("    oldNumberValue: ").append(toIndentedString(oldNumberValue)).append("\n");
    sb.append("    newNumberValue: ").append(toIndentedString(newNumberValue)).append("\n");
    sb.append("    oldEnumValue: ").append(toIndentedString(oldEnumValue)).append("\n");
    sb.append("    newEnumValue: ").append(toIndentedString(newEnumValue)).append("\n");
    sb.append("    oldDateValue: ").append(toIndentedString(oldDateValue)).append("\n");
    sb.append("    newDateValue: ").append(toIndentedString(newDateValue)).append("\n");
    sb.append("    oldPeopleValue: ").append(toIndentedString(oldPeopleValue)).append("\n");
    sb.append("    newPeopleValue: ").append(toIndentedString(newPeopleValue)).append("\n");
    sb.append("    oldMultiEnumValues: ").append(toIndentedString(oldMultiEnumValues)).append("\n");
    sb.append("    newMultiEnumValues: ").append(toIndentedString(newMultiEnumValues)).append("\n");
    sb.append("    newApprovalStatus: ").append(toIndentedString(newApprovalStatus)).append("\n");
    sb.append("    oldApprovalStatus: ").append(toIndentedString(oldApprovalStatus)).append("\n");
    sb.append("    duplicateOf: ").append(toIndentedString(duplicateOf)).append("\n");
    sb.append("    duplicatedFrom: ").append(toIndentedString(duplicatedFrom)).append("\n");
    sb.append("    dependency: ").append(toIndentedString(dependency)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

