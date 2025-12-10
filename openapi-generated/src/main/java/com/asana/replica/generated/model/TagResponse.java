package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.UserCompact;
import com.asana.replica.generated.model.WorkspaceCompact;
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
 * TagResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TagResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  /**
   * Color of the tag.
   */
  public enum ColorEnum {
    DARK_PINK("dark-pink"),
    
    DARK_GREEN("dark-green"),
    
    DARK_BLUE("dark-blue"),
    
    DARK_RED("dark-red"),
    
    DARK_TEAL("dark-teal"),
    
    DARK_BROWN("dark-brown"),
    
    DARK_ORANGE("dark-orange"),
    
    DARK_PURPLE("dark-purple"),
    
    DARK_WARM_GRAY("dark-warm-gray"),
    
    LIGHT_PINK("light-pink"),
    
    LIGHT_GREEN("light-green"),
    
    LIGHT_BLUE("light-blue"),
    
    LIGHT_RED("light-red"),
    
    LIGHT_TEAL("light-teal"),
    
    LIGHT_BROWN("light-brown"),
    
    LIGHT_ORANGE("light-orange"),
    
    LIGHT_PURPLE("light-purple"),
    
    LIGHT_WARM_GRAY("light-warm-gray");

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
      return null;
    }
  }

  private JsonNullable<ColorEnum> color = JsonNullable.<ColorEnum>undefined();

  private @Nullable String notes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  @Valid
  private List<@Valid UserCompact> followers = new ArrayList<>();

  private @Nullable WorkspaceCompact workspace;

  private @Nullable String permalinkUrl;

  public TagResponse gid(@Nullable String gid) {
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

  public TagResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "tag", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public TagResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the tag. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.
   * @return name
   */
  
  @Schema(name = "name", example = "Stuff to buy", description = "Name of the tag. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public TagResponse color(ColorEnum color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * Color of the tag.
   * @return color
   */
  
  @Schema(name = "color", example = "light-green", description = "Color of the tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public JsonNullable<ColorEnum> getColor() {
    return color;
  }

  public void setColor(JsonNullable<ColorEnum> color) {
    this.color = color;
  }

  public TagResponse notes(@Nullable String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Free-form textual information associated with the tag (i.e. its description).
   * @return notes
   */
  
  @Schema(name = "notes", example = "Mittens really likes the stuff from Humboldt.", description = "Free-form textual information associated with the tag (i.e. its description).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public @Nullable String getNotes() {
    return notes;
  }

  public void setNotes(@Nullable String notes) {
    this.notes = notes;
  }

  public TagResponse createdAt(@Nullable OffsetDateTime createdAt) {
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

  public TagResponse followers(List<@Valid UserCompact> followers) {
    this.followers = followers;
    return this;
  }

  public TagResponse addFollowersItem(UserCompact followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

  /**
   * Array of users following this tag.
   * @return followers
   */
  @Valid 
  @Schema(name = "followers", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of users following this tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers")
  public List<@Valid UserCompact> getFollowers() {
    return followers;
  }

  public void setFollowers(List<@Valid UserCompact> followers) {
    this.followers = followers;
  }

  public TagResponse workspace(@Nullable WorkspaceCompact workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Get workspace
   * @return workspace
   */
  @Valid 
  @Schema(name = "workspace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public @Nullable WorkspaceCompact getWorkspace() {
    return workspace;
  }

  public void setWorkspace(@Nullable WorkspaceCompact workspace) {
    this.workspace = workspace;
  }

  public TagResponse permalinkUrl(@Nullable String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
    return this;
  }

  /**
   * A url that points directly to the object within Asana.
   * @return permalinkUrl
   */
  
  @Schema(name = "permalink_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://app.asana.com/0/resource/123456789/list", description = "A url that points directly to the object within Asana.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permalink_url")
  public @Nullable String getPermalinkUrl() {
    return permalinkUrl;
  }

  public void setPermalinkUrl(@Nullable String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagResponse tagResponse = (TagResponse) o;
    return Objects.equals(this.gid, tagResponse.gid) &&
        Objects.equals(this.resourceType, tagResponse.resourceType) &&
        Objects.equals(this.name, tagResponse.name) &&
        equalsNullable(this.color, tagResponse.color) &&
        Objects.equals(this.notes, tagResponse.notes) &&
        Objects.equals(this.createdAt, tagResponse.createdAt) &&
        Objects.equals(this.followers, tagResponse.followers) &&
        Objects.equals(this.workspace, tagResponse.workspace) &&
        Objects.equals(this.permalinkUrl, tagResponse.permalinkUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, hashCodeNullable(color), notes, createdAt, followers, workspace, permalinkUrl);
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
    sb.append("class TagResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
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

