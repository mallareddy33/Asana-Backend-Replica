package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
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
 * RemoveFollowersRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class RemoveFollowersRequest {

  private String followers;

  public RemoveFollowersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RemoveFollowersRequest(String followers) {
    this.followers = followers;
  }

  public RemoveFollowersRequest followers(String followers) {
    this.followers = followers;
    return this;
  }

  /**
   * An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.
   * @return followers
   */
  @NotNull 
  @Schema(name = "followers", example = "521621,621373", description = "An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("followers")
  public String getFollowers() {
    return followers;
  }

  public void setFollowers(String followers) {
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
    RemoveFollowersRequest removeFollowersRequest = (RemoveFollowersRequest) o;
    return Objects.equals(this.followers, removeFollowersRequest.followers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveFollowersRequest {\n");
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

