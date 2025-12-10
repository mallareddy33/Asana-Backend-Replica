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
 * RemoveMembersRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class RemoveMembersRequest {

  private String members;

  public RemoveMembersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RemoveMembersRequest(String members) {
    this.members = members;
  }

  public RemoveMembersRequest members(String members) {
    this.members = members;
    return this;
  }

  /**
   * An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.
   * @return members
   */
  @NotNull 
  @Schema(name = "members", example = "521621,621373", description = "An array of strings identifying users. These can either be the string \"me\", an email, or the gid of a user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("members")
  public String getMembers() {
    return members;
  }

  public void setMembers(String members) {
    this.members = members;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveMembersRequest removeMembersRequest = (RemoveMembersRequest) o;
    return Objects.equals(this.members, removeMembersRequest.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveMembersRequest {\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

