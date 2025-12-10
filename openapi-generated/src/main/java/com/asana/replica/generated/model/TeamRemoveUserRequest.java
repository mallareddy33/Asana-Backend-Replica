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
 * A user identification object for specification with the addUser/removeUser endpoints.
 */

@Schema(name = "TeamRemoveUserRequest", description = "A user identification object for specification with the addUser/removeUser endpoints.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TeamRemoveUserRequest {

  private @Nullable String user;

  public TeamRemoveUserRequest user(@Nullable String user) {
    this.user = user;
    return this;
  }

  /**
   * A string identifying a user. This can either be the string \"me\", an email, or the gid of a user.
   * @return user
   */
  
  @Schema(name = "user", example = "12345", description = "A string identifying a user. This can either be the string \"me\", an email, or the gid of a user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable String getUser() {
    return user;
  }

  public void setUser(@Nullable String user) {
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
    TeamRemoveUserRequest teamRemoveUserRequest = (TeamRemoveUserRequest) o;
    return Objects.equals(this.user, teamRemoveUserRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRemoveUserRequest {\n");
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

