package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskAddFollowersRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskAddFollowersRequest {

  @Valid
  private List<String> followers = new ArrayList<>();

  public TaskAddFollowersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TaskAddFollowersRequest(List<String> followers) {
    this.followers = followers;
  }

  public TaskAddFollowersRequest followers(List<String> followers) {
    this.followers = followers;
    return this;
  }

  public TaskAddFollowersRequest addFollowersItem(String followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

  /**
   * An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.
   * @return followers
   */
  @NotNull 
  @Schema(name = "followers", example = "[\"13579\",\"321654\"]", description = "An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    TaskAddFollowersRequest taskAddFollowersRequest = (TaskAddFollowersRequest) o;
    return Objects.equals(this.followers, taskAddFollowersRequest.followers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskAddFollowersRequest {\n");
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

