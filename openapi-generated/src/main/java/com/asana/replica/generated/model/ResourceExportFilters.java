package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Filters to apply to a resource that will be exported. These filters can be used to narrow down the resources that are included in the export.
 */

@Schema(name = "ResourceExportFilters", description = "Filters to apply to a resource that will be exported. These filters can be used to narrow down the resources that are included in the export.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ResourceExportFilters {

  @Valid
  private List<String> assignedByAny = new ArrayList<>();

  @Valid
  private List<String> assigneeAny = new ArrayList<>();

  @Valid
  private List<String> commentedOnByAny = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAtAfter;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAtBefore;

  @Valid
  private List<String> createdByAny = new ArrayList<>();

  @Valid
  private List<String> followersAny = new ArrayList<>();

  @Valid
  private List<String> likedByAny = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime modifiedAtAfter;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime modifiedAtBefore;

  public ResourceExportFilters assignedByAny(List<String> assignedByAny) {
    this.assignedByAny = assignedByAny;
    return this;
  }

  public ResourceExportFilters addAssignedByAnyItem(String assignedByAnyItem) {
    if (this.assignedByAny == null) {
      this.assignedByAny = new ArrayList<>();
    }
    this.assignedByAny.add(assignedByAnyItem);
    return this;
  }

  /**
   * Filter by the users who assigned the resource. This array accepts a list of user GIDs. This is only applicable to tasks.
   * @return assignedByAny
   */
  
  @Schema(name = "assigned_by.any", description = "Filter by the users who assigned the resource. This array accepts a list of user GIDs. This is only applicable to tasks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assigned_by.any")
  public List<String> getAssignedByAny() {
    return assignedByAny;
  }

  public void setAssignedByAny(List<String> assignedByAny) {
    this.assignedByAny = assignedByAny;
  }

  public ResourceExportFilters assigneeAny(List<String> assigneeAny) {
    this.assigneeAny = assigneeAny;
    return this;
  }

  public ResourceExportFilters addAssigneeAnyItem(String assigneeAnyItem) {
    if (this.assigneeAny == null) {
      this.assigneeAny = new ArrayList<>();
    }
    this.assigneeAny.add(assigneeAnyItem);
    return this;
  }

  /**
   * Filter by the users who are assigned to the resource. This array accepts a list of user GIDs. This is only applicable to tasks.
   * @return assigneeAny
   */
  
  @Schema(name = "assignee.any", description = "Filter by the users who are assigned to the resource. This array accepts a list of user GIDs. This is only applicable to tasks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee.any")
  public List<String> getAssigneeAny() {
    return assigneeAny;
  }

  public void setAssigneeAny(List<String> assigneeAny) {
    this.assigneeAny = assigneeAny;
  }

  public ResourceExportFilters commentedOnByAny(List<String> commentedOnByAny) {
    this.commentedOnByAny = commentedOnByAny;
    return this;
  }

  public ResourceExportFilters addCommentedOnByAnyItem(String commentedOnByAnyItem) {
    if (this.commentedOnByAny == null) {
      this.commentedOnByAny = new ArrayList<>();
    }
    this.commentedOnByAny.add(commentedOnByAnyItem);
    return this;
  }

  /**
   * Filter by the users who commented on the resource. This array accepts a list of user GIDs.
   * @return commentedOnByAny
   */
  
  @Schema(name = "commented_on_by.any", description = "Filter by the users who commented on the resource. This array accepts a list of user GIDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commented_on_by.any")
  public List<String> getCommentedOnByAny() {
    return commentedOnByAny;
  }

  public void setCommentedOnByAny(List<String> commentedOnByAny) {
    this.commentedOnByAny = commentedOnByAny;
  }

  public ResourceExportFilters createdAtAfter(@Nullable OffsetDateTime createdAtAfter) {
    this.createdAtAfter = createdAtAfter;
    return this;
  }

  /**
   * Filter results to resources created after a specified date and time.
   * @return createdAtAfter
   */
  @Valid 
  @Schema(name = "created_at.after", example = "2023-01-01T00:00Z", description = "Filter results to resources created after a specified date and time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at.after")
  public @Nullable OffsetDateTime getCreatedAtAfter() {
    return createdAtAfter;
  }

  public void setCreatedAtAfter(@Nullable OffsetDateTime createdAtAfter) {
    this.createdAtAfter = createdAtAfter;
  }

  public ResourceExportFilters createdAtBefore(@Nullable OffsetDateTime createdAtBefore) {
    this.createdAtBefore = createdAtBefore;
    return this;
  }

  /**
   * Filter results to resources created before a specified date and time.
   * @return createdAtBefore
   */
  @Valid 
  @Schema(name = "created_at.before", example = "2023-01-01T00:00Z", description = "Filter results to resources created before a specified date and time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at.before")
  public @Nullable OffsetDateTime getCreatedAtBefore() {
    return createdAtBefore;
  }

  public void setCreatedAtBefore(@Nullable OffsetDateTime createdAtBefore) {
    this.createdAtBefore = createdAtBefore;
  }

  public ResourceExportFilters createdByAny(List<String> createdByAny) {
    this.createdByAny = createdByAny;
    return this;
  }

  public ResourceExportFilters addCreatedByAnyItem(String createdByAnyItem) {
    if (this.createdByAny == null) {
      this.createdByAny = new ArrayList<>();
    }
    this.createdByAny.add(createdByAnyItem);
    return this;
  }

  /**
   * Filter by the users who created the resource. This array accepts a list of user GIDs.
   * @return createdByAny
   */
  
  @Schema(name = "created_by.any", description = "Filter by the users who created the resource. This array accepts a list of user GIDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by.any")
  public List<String> getCreatedByAny() {
    return createdByAny;
  }

  public void setCreatedByAny(List<String> createdByAny) {
    this.createdByAny = createdByAny;
  }

  public ResourceExportFilters followersAny(List<String> followersAny) {
    this.followersAny = followersAny;
    return this;
  }

  public ResourceExportFilters addFollowersAnyItem(String followersAnyItem) {
    if (this.followersAny == null) {
      this.followersAny = new ArrayList<>();
    }
    this.followersAny.add(followersAnyItem);
    return this;
  }

  /**
   * Filter by the users who are following the resource. This array accepts a list of user GIDs.
   * @return followersAny
   */
  
  @Schema(name = "followers.any", description = "Filter by the users who are following the resource. This array accepts a list of user GIDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers.any")
  public List<String> getFollowersAny() {
    return followersAny;
  }

  public void setFollowersAny(List<String> followersAny) {
    this.followersAny = followersAny;
  }

  public ResourceExportFilters likedByAny(List<String> likedByAny) {
    this.likedByAny = likedByAny;
    return this;
  }

  public ResourceExportFilters addLikedByAnyItem(String likedByAnyItem) {
    if (this.likedByAny == null) {
      this.likedByAny = new ArrayList<>();
    }
    this.likedByAny.add(likedByAnyItem);
    return this;
  }

  /**
   * Filter by the users who liked the resource. This array accepts a list of user GIDs.
   * @return likedByAny
   */
  
  @Schema(name = "liked_by.any", description = "Filter by the users who liked the resource. This array accepts a list of user GIDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liked_by.any")
  public List<String> getLikedByAny() {
    return likedByAny;
  }

  public void setLikedByAny(List<String> likedByAny) {
    this.likedByAny = likedByAny;
  }

  public ResourceExportFilters modifiedAtAfter(@Nullable OffsetDateTime modifiedAtAfter) {
    this.modifiedAtAfter = modifiedAtAfter;
    return this;
  }

  /**
   * Filter results to resources modified after a specified date and time.
   * @return modifiedAtAfter
   */
  @Valid 
  @Schema(name = "modified_at.after", example = "2023-01-01T00:00Z", description = "Filter results to resources modified after a specified date and time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified_at.after")
  public @Nullable OffsetDateTime getModifiedAtAfter() {
    return modifiedAtAfter;
  }

  public void setModifiedAtAfter(@Nullable OffsetDateTime modifiedAtAfter) {
    this.modifiedAtAfter = modifiedAtAfter;
  }

  public ResourceExportFilters modifiedAtBefore(@Nullable OffsetDateTime modifiedAtBefore) {
    this.modifiedAtBefore = modifiedAtBefore;
    return this;
  }

  /**
   * Filter results to resources modified before a specified date and time.
   * @return modifiedAtBefore
   */
  @Valid 
  @Schema(name = "modified_at.before", example = "2023-01-01T00:00Z", description = "Filter results to resources modified before a specified date and time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified_at.before")
  public @Nullable OffsetDateTime getModifiedAtBefore() {
    return modifiedAtBefore;
  }

  public void setModifiedAtBefore(@Nullable OffsetDateTime modifiedAtBefore) {
    this.modifiedAtBefore = modifiedAtBefore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceExportFilters resourceExportFilters = (ResourceExportFilters) o;
    return Objects.equals(this.assignedByAny, resourceExportFilters.assignedByAny) &&
        Objects.equals(this.assigneeAny, resourceExportFilters.assigneeAny) &&
        Objects.equals(this.commentedOnByAny, resourceExportFilters.commentedOnByAny) &&
        Objects.equals(this.createdAtAfter, resourceExportFilters.createdAtAfter) &&
        Objects.equals(this.createdAtBefore, resourceExportFilters.createdAtBefore) &&
        Objects.equals(this.createdByAny, resourceExportFilters.createdByAny) &&
        Objects.equals(this.followersAny, resourceExportFilters.followersAny) &&
        Objects.equals(this.likedByAny, resourceExportFilters.likedByAny) &&
        Objects.equals(this.modifiedAtAfter, resourceExportFilters.modifiedAtAfter) &&
        Objects.equals(this.modifiedAtBefore, resourceExportFilters.modifiedAtBefore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedByAny, assigneeAny, commentedOnByAny, createdAtAfter, createdAtBefore, createdByAny, followersAny, likedByAny, modifiedAtAfter, modifiedAtBefore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceExportFilters {\n");
    sb.append("    assignedByAny: ").append(toIndentedString(assignedByAny)).append("\n");
    sb.append("    assigneeAny: ").append(toIndentedString(assigneeAny)).append("\n");
    sb.append("    commentedOnByAny: ").append(toIndentedString(commentedOnByAny)).append("\n");
    sb.append("    createdAtAfter: ").append(toIndentedString(createdAtAfter)).append("\n");
    sb.append("    createdAtBefore: ").append(toIndentedString(createdAtBefore)).append("\n");
    sb.append("    createdByAny: ").append(toIndentedString(createdByAny)).append("\n");
    sb.append("    followersAny: ").append(toIndentedString(followersAny)).append("\n");
    sb.append("    likedByAny: ").append(toIndentedString(likedByAny)).append("\n");
    sb.append("    modifiedAtAfter: ").append(toIndentedString(modifiedAtAfter)).append("\n");
    sb.append("    modifiedAtBefore: ").append(toIndentedString(modifiedAtBefore)).append("\n");
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

