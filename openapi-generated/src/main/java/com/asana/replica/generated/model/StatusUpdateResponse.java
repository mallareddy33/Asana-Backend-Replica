package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.Like;
import com.asana.replica.generated.model.ReactionSummaryItemCompact;
import com.asana.replica.generated.model.StatusUpdateResponseAllOfParent;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * StatusUpdateResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class StatusUpdateResponse {

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

  private @Nullable UserCompact author;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private @Nullable UserCompact createdBy;

  private @Nullable Boolean hearted;

  @Valid
  private List<@Valid Like> hearts = new ArrayList<>();

  private @Nullable Boolean liked;

  @Valid
  private List<@Valid Like> likes = new ArrayList<>();

  @Valid
  private List<@Valid ReactionSummaryItemCompact> reactionSummary = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime modifiedAt;

  private @Nullable Integer numHearts;

  private @Nullable Integer numLikes;

  private @Nullable StatusUpdateResponseAllOfParent parent;

  public StatusUpdateResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatusUpdateResponse(String text, StatusTypeEnum statusType) {
    this.text = text;
    this.statusType = statusType;
  }

  public StatusUpdateResponse gid(@Nullable String gid) {
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

  public StatusUpdateResponse resourceType(@Nullable String resourceType) {
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

  public StatusUpdateResponse title(@Nullable String title) {
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

  public StatusUpdateResponse resourceSubtype(@Nullable ResourceSubtypeEnum resourceSubtype) {
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

  public StatusUpdateResponse text(String text) {
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

  public StatusUpdateResponse htmlText(@Nullable String htmlText) {
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

  public StatusUpdateResponse statusType(StatusTypeEnum statusType) {
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

  public StatusUpdateResponse author(@Nullable UserCompact author) {
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

  public StatusUpdateResponse createdAt(@Nullable OffsetDateTime createdAt) {
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

  public StatusUpdateResponse createdBy(@Nullable UserCompact createdBy) {
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

  public StatusUpdateResponse hearted(@Nullable Boolean hearted) {
    this.hearted = hearted;
    return this;
  }

  /**
   * *Deprecated - please use liked instead* True if the status is hearted by the authorized user, false if not.
   * @return hearted
   */
  
  @Schema(name = "hearted", accessMode = Schema.AccessMode.READ_ONLY, example = "true", description = "*Deprecated - please use liked instead* True if the status is hearted by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearted")
  public @Nullable Boolean getHearted() {
    return hearted;
  }

  public void setHearted(@Nullable Boolean hearted) {
    this.hearted = hearted;
  }

  public StatusUpdateResponse hearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
    return this;
  }

  public StatusUpdateResponse addHeartsItem(Like heartsItem) {
    if (this.hearts == null) {
      this.hearts = new ArrayList<>();
    }
    this.hearts.add(heartsItem);
    return this;
  }

  /**
   * *Deprecated - please use likes instead* Array of likes for users who have hearted this status.
   * @return hearts
   */
  @Valid 
  @Schema(name = "hearts", accessMode = Schema.AccessMode.READ_ONLY, description = "*Deprecated - please use likes instead* Array of likes for users who have hearted this status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearts")
  public List<@Valid Like> getHearts() {
    return hearts;
  }

  public void setHearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
  }

  public StatusUpdateResponse liked(@Nullable Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * True if the status is liked by the authorized user, false if not.
   * @return liked
   */
  
  @Schema(name = "liked", example = "true", description = "True if the status is liked by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liked")
  public @Nullable Boolean getLiked() {
    return liked;
  }

  public void setLiked(@Nullable Boolean liked) {
    this.liked = liked;
  }

  public StatusUpdateResponse likes(List<@Valid Like> likes) {
    this.likes = likes;
    return this;
  }

  public StatusUpdateResponse addLikesItem(Like likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * Array of likes for users who have liked this status.
   * @return likes
   */
  @Valid 
  @Schema(name = "likes", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of likes for users who have liked this status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid Like> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid Like> likes) {
    this.likes = likes;
  }

  public StatusUpdateResponse reactionSummary(List<@Valid ReactionSummaryItemCompact> reactionSummary) {
    this.reactionSummary = reactionSummary;
    return this;
  }

  public StatusUpdateResponse addReactionSummaryItem(ReactionSummaryItemCompact reactionSummaryItem) {
    if (this.reactionSummary == null) {
      this.reactionSummary = new ArrayList<>();
    }
    this.reactionSummary.add(reactionSummaryItem);
    return this;
  }

  /**
   * Summary of emoji reactions on this status.
   * @return reactionSummary
   */
  @Valid 
  @Schema(name = "reaction_summary", accessMode = Schema.AccessMode.READ_ONLY, description = "Summary of emoji reactions on this status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reaction_summary")
  public List<@Valid ReactionSummaryItemCompact> getReactionSummary() {
    return reactionSummary;
  }

  public void setReactionSummary(List<@Valid ReactionSummaryItemCompact> reactionSummary) {
    this.reactionSummary = reactionSummary;
  }

  public StatusUpdateResponse modifiedAt(@Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which this project status was last modified. *Note: This does not currently reflect any changes in associations such as comments that may have been added or removed from the status.*
   * @return modifiedAt
   */
  @Valid 
  @Schema(name = "modified_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this project status was last modified. *Note: This does not currently reflect any changes in associations such as comments that may have been added or removed from the status.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified_at")
  public @Nullable OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(@Nullable OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public StatusUpdateResponse numHearts(@Nullable Integer numHearts) {
    this.numHearts = numHearts;
    return this;
  }

  /**
   * *Deprecated - please use likes instead* The number of users who have hearted this status.
   * @return numHearts
   */
  
  @Schema(name = "num_hearts", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "*Deprecated - please use likes instead* The number of users who have hearted this status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_hearts")
  public @Nullable Integer getNumHearts() {
    return numHearts;
  }

  public void setNumHearts(@Nullable Integer numHearts) {
    this.numHearts = numHearts;
  }

  public StatusUpdateResponse numLikes(@Nullable Integer numLikes) {
    this.numLikes = numLikes;
    return this;
  }

  /**
   * The number of users who have liked this status.
   * @return numLikes
   */
  
  @Schema(name = "num_likes", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "The number of users who have liked this status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_likes")
  public @Nullable Integer getNumLikes() {
    return numLikes;
  }

  public void setNumLikes(@Nullable Integer numLikes) {
    this.numLikes = numLikes;
  }

  public StatusUpdateResponse parent(@Nullable StatusUpdateResponseAllOfParent parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable StatusUpdateResponseAllOfParent getParent() {
    return parent;
  }

  public void setParent(@Nullable StatusUpdateResponseAllOfParent parent) {
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
    StatusUpdateResponse statusUpdateResponse = (StatusUpdateResponse) o;
    return Objects.equals(this.gid, statusUpdateResponse.gid) &&
        Objects.equals(this.resourceType, statusUpdateResponse.resourceType) &&
        Objects.equals(this.title, statusUpdateResponse.title) &&
        Objects.equals(this.resourceSubtype, statusUpdateResponse.resourceSubtype) &&
        Objects.equals(this.text, statusUpdateResponse.text) &&
        Objects.equals(this.htmlText, statusUpdateResponse.htmlText) &&
        Objects.equals(this.statusType, statusUpdateResponse.statusType) &&
        Objects.equals(this.author, statusUpdateResponse.author) &&
        Objects.equals(this.createdAt, statusUpdateResponse.createdAt) &&
        Objects.equals(this.createdBy, statusUpdateResponse.createdBy) &&
        Objects.equals(this.hearted, statusUpdateResponse.hearted) &&
        Objects.equals(this.hearts, statusUpdateResponse.hearts) &&
        Objects.equals(this.liked, statusUpdateResponse.liked) &&
        Objects.equals(this.likes, statusUpdateResponse.likes) &&
        Objects.equals(this.reactionSummary, statusUpdateResponse.reactionSummary) &&
        Objects.equals(this.modifiedAt, statusUpdateResponse.modifiedAt) &&
        Objects.equals(this.numHearts, statusUpdateResponse.numHearts) &&
        Objects.equals(this.numLikes, statusUpdateResponse.numLikes) &&
        Objects.equals(this.parent, statusUpdateResponse.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, title, resourceSubtype, text, htmlText, statusType, author, createdAt, createdBy, hearted, hearts, liked, likes, reactionSummary, modifiedAt, numHearts, numLikes, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusUpdateResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    hearted: ").append(toIndentedString(hearted)).append("\n");
    sb.append("    hearts: ").append(toIndentedString(hearts)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    reactionSummary: ").append(toIndentedString(reactionSummary)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    numHearts: ").append(toIndentedString(numHearts)).append("\n");
    sb.append("    numLikes: ").append(toIndentedString(numLikes)).append("\n");
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

