package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * GoalRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GoalRequest {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable String htmlNotes;

  private @Nullable String notes;

  private JsonNullable<String> dueOn = JsonNullable.<String>undefined();

  private JsonNullable<String> startOn = JsonNullable.<String>undefined();

  private @Nullable Boolean isWorkspaceLevel;

  private @Nullable Boolean liked;

  private JsonNullable<String> team = JsonNullable.<String>undefined();

  private @Nullable String workspace;

  private JsonNullable<String> timePeriod = JsonNullable.<String>undefined();

  private JsonNullable<String> owner = JsonNullable.<String>undefined();

  @Valid
  private List<String> followers = new ArrayList<>();

  public GoalRequest gid(@Nullable String gid) {
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

  public GoalRequest resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "goal", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public GoalRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the goal.
   * @return name
   */
  
  @Schema(name = "name", example = "Grow web traffic by 30%", description = "The name of the goal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public GoalRequest htmlNotes(@Nullable String htmlNotes) {
    this.htmlNotes = htmlNotes;
    return this;
  }

  /**
   * The notes of the goal with formatting as HTML.
   * @return htmlNotes
   */
  
  @Schema(name = "html_notes", example = "<body>Start building brand awareness.</body>", description = "The notes of the goal with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_notes")
  public @Nullable String getHtmlNotes() {
    return htmlNotes;
  }

  public void setHtmlNotes(@Nullable String htmlNotes) {
    this.htmlNotes = htmlNotes;
  }

  public GoalRequest notes(@Nullable String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Free-form textual information associated with the goal (i.e. its description).
   * @return notes
   */
  
  @Schema(name = "notes", example = "Start building brand awareness.", description = "Free-form textual information associated with the goal (i.e. its description).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public @Nullable String getNotes() {
    return notes;
  }

  public void setNotes(@Nullable String notes) {
    this.notes = notes;
  }

  public GoalRequest dueOn(String dueOn) {
    this.dueOn = JsonNullable.of(dueOn);
    return this;
  }

  /**
   * The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.
   * @return dueOn
   */
  
  @Schema(name = "due_on", example = "2019-09-15", description = "The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public JsonNullable<String> getDueOn() {
    return dueOn;
  }

  public void setDueOn(JsonNullable<String> dueOn) {
    this.dueOn = dueOn;
  }

  public GoalRequest startOn(String startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.
   * @return startOn
   */
  
  @Schema(name = "start_on", example = "2019-09-14", description = "The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<String> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<String> startOn) {
    this.startOn = startOn;
  }

  public GoalRequest isWorkspaceLevel(@Nullable Boolean isWorkspaceLevel) {
    this.isWorkspaceLevel = isWorkspaceLevel;
    return this;
  }

  /**
   * *Conditional*. This property is only present when the `workspace` provided is an organization. Whether the goal belongs to the `workspace` (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team.
   * @return isWorkspaceLevel
   */
  
  @Schema(name = "is_workspace_level", example = "true", description = "*Conditional*. This property is only present when the `workspace` provided is an organization. Whether the goal belongs to the `workspace` (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_workspace_level")
  public @Nullable Boolean getIsWorkspaceLevel() {
    return isWorkspaceLevel;
  }

  public void setIsWorkspaceLevel(@Nullable Boolean isWorkspaceLevel) {
    this.isWorkspaceLevel = isWorkspaceLevel;
  }

  public GoalRequest liked(@Nullable Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * True if the goal is liked by the authorized user, false if not.
   * @return liked
   */
  
  @Schema(name = "liked", example = "false", description = "True if the goal is liked by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liked")
  public @Nullable Boolean getLiked() {
    return liked;
  }

  public void setLiked(@Nullable Boolean liked) {
    this.liked = liked;
  }

  public GoalRequest team(String team) {
    this.team = JsonNullable.of(team);
    return this;
  }

  /**
   * *Conditional*. This property is only present when the `workspace` provided is an organization.
   * @return team
   */
  
  @Schema(name = "team", example = "12345", description = "*Conditional*. This property is only present when the `workspace` provided is an organization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public JsonNullable<String> getTeam() {
    return team;
  }

  public void setTeam(JsonNullable<String> team) {
    this.team = team;
  }

  public GoalRequest workspace(@Nullable String workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * The `gid` of a workspace.
   * @return workspace
   */
  
  @Schema(name = "workspace", example = "12345", description = "The `gid` of a workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public @Nullable String getWorkspace() {
    return workspace;
  }

  public void setWorkspace(@Nullable String workspace) {
    this.workspace = workspace;
  }

  public GoalRequest timePeriod(String timePeriod) {
    this.timePeriod = JsonNullable.of(timePeriod);
    return this;
  }

  /**
   * The `gid` of a time period.
   * @return timePeriod
   */
  
  @Schema(name = "time_period", example = "12345", description = "The `gid` of a time period.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time_period")
  public JsonNullable<String> getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(JsonNullable<String> timePeriod) {
    this.timePeriod = timePeriod;
  }

  public GoalRequest owner(String owner) {
    this.owner = JsonNullable.of(owner);
    return this;
  }

  /**
   * The `gid` of a user.
   * @return owner
   */
  
  @Schema(name = "owner", example = "12345", description = "The `gid` of a user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public JsonNullable<String> getOwner() {
    return owner;
  }

  public void setOwner(JsonNullable<String> owner) {
    this.owner = owner;
  }

  public GoalRequest followers(List<String> followers) {
    this.followers = followers;
    return this;
  }

  public GoalRequest addFollowersItem(String followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

  /**
   * Get followers
   * @return followers
   */
  
  @Schema(name = "followers", example = "[\"12345\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers")
  public List<String> getFollowers() {
    return followers;
  }

  public void setFollowers(List<String> followers) {
    this.followers = followers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalRequest goalRequest = (GoalRequest) o;
    return Objects.equals(this.gid, goalRequest.gid) &&
        Objects.equals(this.resourceType, goalRequest.resourceType) &&
        Objects.equals(this.name, goalRequest.name) &&
        Objects.equals(this.htmlNotes, goalRequest.htmlNotes) &&
        Objects.equals(this.notes, goalRequest.notes) &&
        equalsNullable(this.dueOn, goalRequest.dueOn) &&
        equalsNullable(this.startOn, goalRequest.startOn) &&
        Objects.equals(this.isWorkspaceLevel, goalRequest.isWorkspaceLevel) &&
        Objects.equals(this.liked, goalRequest.liked) &&
        equalsNullable(this.team, goalRequest.team) &&
        Objects.equals(this.workspace, goalRequest.workspace) &&
        equalsNullable(this.timePeriod, goalRequest.timePeriod) &&
        equalsNullable(this.owner, goalRequest.owner) &&
        Objects.equals(this.followers, goalRequest.followers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, htmlNotes, notes, hashCodeNullable(dueOn), hashCodeNullable(startOn), isWorkspaceLevel, liked, hashCodeNullable(team), workspace, hashCodeNullable(timePeriod), hashCodeNullable(owner), followers);
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
    sb.append("class GoalRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    htmlNotes: ").append(toIndentedString(htmlNotes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    isWorkspaceLevel: ").append(toIndentedString(isWorkspaceLevel)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
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

