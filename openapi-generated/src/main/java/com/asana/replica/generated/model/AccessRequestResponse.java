package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AccessRequestTargetIdCompact;
import com.asana.replica.generated.model.UserCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A *access request* object represents a request to access a shareable resource within Asana. It includes the requester&#39;s information, approval status, and target resource details.
 */

@Schema(name = "AccessRequestResponse", description = "A *access request* object represents a request to access a shareable resource within Asana. It includes the requester's information, approval status, and target resource details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AccessRequestResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String message;

  /**
   * The current approval status of the request.
   */
  public enum ApprovalStatusEnum {
    PENDING("pending"),
    
    APPROVED("approved"),
    
    DENIED("denied");

    private final String value;

    ApprovalStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApprovalStatusEnum fromValue(String value) {
      for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ApprovalStatusEnum approvalStatus;

  private @Nullable UserCompact requester;

  private @Nullable AccessRequestTargetIdCompact target;

  public AccessRequestResponse gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
   */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public AccessRequestResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "access_request", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public AccessRequestResponse message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * The message included in the access request, if any.
   * @return message
   */
  
  @Schema(name = "message", example = "Please grant me access to this resource.", description = "The message included in the access request, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public AccessRequestResponse approvalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * The current approval status of the request.
   * @return approvalStatus
   */
  
  @Schema(name = "approval_status", example = "pending", description = "The current approval status of the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approval_status")
  public @Nullable ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(@Nullable ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public AccessRequestResponse requester(@Nullable UserCompact requester) {
    this.requester = requester;
    return this;
  }

  /**
   * Get requester
   * @return requester
   */
  @Valid 
  @Schema(name = "requester", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requester")
  public @Nullable UserCompact getRequester() {
    return requester;
  }

  public void setRequester(@Nullable UserCompact requester) {
    this.requester = requester;
  }

  public AccessRequestResponse target(@Nullable AccessRequestTargetIdCompact target) {
    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   */
  @Valid 
  @Schema(name = "target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public @Nullable AccessRequestTargetIdCompact getTarget() {
    return target;
  }

  public void setTarget(@Nullable AccessRequestTargetIdCompact target) {
    this.target = target;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessRequestResponse accessRequestResponse = (AccessRequestResponse) o;
    return Objects.equals(this.gid, accessRequestResponse.gid) &&
        Objects.equals(this.resourceType, accessRequestResponse.resourceType) &&
        Objects.equals(this.message, accessRequestResponse.message) &&
        Objects.equals(this.approvalStatus, accessRequestResponse.approvalStatus) &&
        Objects.equals(this.requester, accessRequestResponse.requester) &&
        Objects.equals(this.target, accessRequestResponse.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, message, approvalStatus, requester, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRequestResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

