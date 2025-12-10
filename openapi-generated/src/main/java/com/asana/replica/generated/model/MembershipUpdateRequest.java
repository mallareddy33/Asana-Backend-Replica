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
 * MembershipUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class MembershipUpdateRequest {

  private @Nullable String accessLevel;

  public MembershipUpdateRequest accessLevel(@Nullable String accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * The role given to the member. Goals can have access levels `editor` or `commenter`. Projects can have access levels `admin`, `editor` or `commenter`. Portfolios can have access levels `admin`, `editor` or `viewer`.
   * @return accessLevel
   */
  
  @Schema(name = "access_level", example = "editor", description = "The role given to the member. Goals can have access levels `editor` or `commenter`. Projects can have access levels `admin`, `editor` or `commenter`. Portfolios can have access levels `admin`, `editor` or `viewer`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    MembershipUpdateRequest membershipUpdateRequest = (MembershipUpdateRequest) o;
    return Objects.equals(this.accessLevel, membershipUpdateRequest.accessLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipUpdateRequest {\n");
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

