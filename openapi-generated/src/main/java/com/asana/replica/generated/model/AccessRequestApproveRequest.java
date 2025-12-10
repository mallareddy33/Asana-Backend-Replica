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
 * A request to approve access for a user.
 */

@Schema(name = "AccessRequestApproveRequest", description = "A request to approve access for a user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AccessRequestApproveRequest {

  private @Nullable String accessRequestGid;

  public AccessRequestApproveRequest accessRequestGid(@Nullable String accessRequestGid) {
    this.accessRequestGid = accessRequestGid;
    return this;
  }

  /**
   * The ID of the access request that the user is approving.
   * @return accessRequestGid
   */
  
  @Schema(name = "access_request_gid", example = "12345", description = "The ID of the access request that the user is approving.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AccessRequestApproveRequest accessRequestApproveRequest = (AccessRequestApproveRequest) o;
    return Objects.equals(this.accessRequestGid, accessRequestApproveRequest.accessRequestGid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequestGid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRequestApproveRequest {\n");
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

