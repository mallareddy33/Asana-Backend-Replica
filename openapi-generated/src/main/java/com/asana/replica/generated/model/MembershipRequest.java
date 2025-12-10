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
 * MembershipRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class MembershipRequest {

  private @Nullable String accessLevel;

  public MembershipRequest accessLevel(@Nullable String accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Sets the access level for the member. Goals can have access levels `viewer`, `commenter`, `editor` or `admin` (`viewer` and `admin` are currently only available for Goals when you include the `Asana-Enable: goal_sals_api` change flag header). Projects can have access levels `admin`, `editor` or `commenter`. Portfolios can have access levels `admin`, `editor` or `viewer`. Custom Fields can have access levels `admin`, `editor` or `user`.
   * @return accessLevel
   */
  
  @Schema(name = "access_level", example = "editor", description = "Sets the access level for the member. Goals can have access levels `viewer`, `commenter`, `editor` or `admin` (`viewer` and `admin` are currently only available for Goals when you include the `Asana-Enable: goal_sals_api` change flag header). Projects can have access levels `admin`, `editor` or `commenter`. Portfolios can have access levels `admin`, `editor` or `viewer`. Custom Fields can have access levels `admin`, `editor` or `user`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access_level")
  public @Nullable String getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(@Nullable String accessLevel) {
    this.accessLevel = accessLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembershipRequest membershipRequest = (MembershipRequest) o;
    return Objects.equals(this.accessLevel, membershipRequest.accessLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipRequest {\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
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

