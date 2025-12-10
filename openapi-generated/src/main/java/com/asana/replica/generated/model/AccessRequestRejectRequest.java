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
 * A request to reject access for a user.
 */

@Schema(name = "AccessRequestRejectRequest", description = "A request to reject access for a user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AccessRequestRejectRequest {

  private @Nullable String accessRequestGid;

  public AccessRequestRejectRequest accessRequestGid(@Nullable String accessRequestGid) {
    this.accessRequestGid = accessRequestGid;
    return this;
  }

  /**
   * The ID of the access request that the user is rejecting.
   * @return accessRequestGid
   */
  
  @Schema(name = "access_request_gid", example = "12345", description = "The ID of the access request that the user is rejecting.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access_request_gid")
  public @Nullable String getAccessRequestGid() {
    return accessRequestGid;
  }

  public void setAccessRequestGid(@Nullable String accessRequestGid) {
    this.accessRequestGid = accessRequestGid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessRequestRejectRequest accessRequestRejectRequest = (AccessRequestRejectRequest) o;
    return Objects.equals(this.accessRequestGid, accessRequestRejectRequest.accessRequestGid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequestGid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRequestRejectRequest {\n");
    sb.append("    accessRequestGid: ").append(toIndentedString(accessRequestGid)).append("\n");
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

