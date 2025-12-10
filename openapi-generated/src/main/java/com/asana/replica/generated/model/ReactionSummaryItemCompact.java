package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A summary of an emoji reaction on an object.
 */

@Schema(name = "ReactionSummaryItemCompact", description = "A summary of an emoji reaction on an object.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class ReactionSummaryItemCompact {

  private @Nullable String emojiBase;

  private @Nullable String variant;

  private @Nullable BigDecimal count;

  private @Nullable Boolean reacted;

  public ReactionSummaryItemCompact emojiBase(@Nullable String emojiBase) {
    this.emojiBase = emojiBase;
    return this;
  }

  /**
   * The emoji base character used in the reaction.
   * @return emojiBase
   */
  
  @Schema(name = "emoji_base", example = "👎", description = "The emoji base character used in the reaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emoji_base")
  public @Nullable String getEmojiBase() {
    return emojiBase;
  }

  public void setEmojiBase(@Nullable String emojiBase) {
    this.emojiBase = emojiBase;
  }

  public ReactionSummaryItemCompact variant(@Nullable String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * The full emoji string used in the reaction.
   * @return variant
   */
  
  @Schema(name = "variant", example = "👎🏼", description = "The full emoji string used in the reaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variant")
  public @Nullable String getVariant() {
    return variant;
  }

  public void setVariant(@Nullable String variant) {
    this.variant = variant;
  }

  public ReactionSummaryItemCompact count(@Nullable BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * The number of reactions with the emoji variant on the object.
   * @return count
   */
  @Valid 
  @Schema(name = "count", example = "1", description = "The number of reactions with the emoji variant on the object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public @Nullable BigDecimal getCount() {
    return count;
  }

  public void setCount(@Nullable BigDecimal count) {
    this.count = count;
  }

  public ReactionSummaryItemCompact reacted(@Nullable Boolean reacted) {
    this.reacted = reacted;
    return this;
  }

  /**
   * Whether the current user has reacted with the emoji variant on the object.
   * @return reacted
   */
  
  @Schema(name = "reacted", example = "false", description = "Whether the current user has reacted with the emoji variant on the object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reacted")
  public @Nullable Boolean getReacted() {
    return reacted;
  }

  public void setReacted(@Nullable Boolean reacted) {
    this.reacted = reacted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReactionSummaryItemCompact reactionSummaryItemCompact = (ReactionSummaryItemCompact) o;
    return Objects.equals(this.emojiBase, reactionSummaryItemCompact.emojiBase) &&
        Objects.equals(this.variant, reactionSummaryItemCompact.variant) &&
        Objects.equals(this.count, reactionSummaryItemCompact.count) &&
        Objects.equals(this.reacted, reactionSummaryItemCompact.reacted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emojiBase, variant, count, reacted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReactionSummaryItemCompact {\n");
    sb.append("    emojiBase: ").append(toIndentedString(emojiBase)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    reacted: ").append(toIndentedString(reacted)).append("\n");
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

