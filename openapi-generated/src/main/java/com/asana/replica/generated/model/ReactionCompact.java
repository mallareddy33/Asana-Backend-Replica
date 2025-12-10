package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.UserCompact;
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
 * An emoji reaction on an object.
 */

@Schema(name = "ReactionCompact", description = "An emoji reaction on an object.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ReactionCompact {

  private @Nullable String gid;

  private @Nullable String emoji;

  private @Nullable UserCompact user;

  public ReactionCompact gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * The ID of the reaction object.
   * @return gid
   */
  
  @Schema(name = "gid", example = "12345", description = "The ID of the reaction object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public ReactionCompact emoji(@Nullable String emoji) {
    this.emoji = emoji;
    return this;
  }

  /**
   * The emoji string used in the reaction.
   * @return emoji
   */
  
  @Schema(name = "emoji", example = "👍", description = "The emoji string used in the reaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emoji")
  public @Nullable String getEmoji() {
    return emoji;
  }

  public void setEmoji(@Nullable String emoji) {
    this.emoji = emoji;
  }

  public ReactionCompact user(@Nullable UserCompact user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable UserCompact getUser() {
    return user;
  }

  public void setUser(@Nullable UserCompact user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReactionCompact reactionCompact = (ReactionCompact) o;
    return Objects.equals(this.gid, reactionCompact.gid) &&
        Objects.equals(this.emoji, reactionCompact.emoji) &&
        Objects.equals(this.user, reactionCompact.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, emoji, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReactionCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

