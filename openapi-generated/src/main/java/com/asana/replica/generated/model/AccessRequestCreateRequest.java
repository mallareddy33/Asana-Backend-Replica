package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A request to create shareable access for a user.
 */

@Schema(name = "AccessRequestCreateRequest", description = "A request to create shareable access for a user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AccessRequestCreateRequest {

  private String target;

  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public AccessRequestCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccessRequestCreateRequest(String target) {
    this.target = target;
  }

  public AccessRequestCreateRequest target(String target) {
    this.target = target;
    return this;
  }

  /**
   * The access requestable object that the user is requesting access to. This is the gid of the target. Supports projects and portfolios.
   * @return target
   */
  @NotNull 
  @Schema(name = "target", example = "12345", description = "The access requestable object that the user is requesting access to. This is the gid of the target. Supports projects and portfolios.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public AccessRequestCreateRequest message(String message) {
    this.message = JsonNullable.of(message);
    return this;
  }

  /**
   * The optional message to include with the access request. This can be used to provide context or additional information about the request.
   * @return message
   */
  
  @Schema(name = "message", example = "I'm looking to request access to this item.", description = "The optional message to include with the access request. This can be used to provide context or additional information about the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public JsonNullable<String> getMessage() {
    return message;
  }

  public void setMessage(JsonNullable<String> message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessRequestCreateRequest accessRequestCreateRequest = (AccessRequestCreateRequest) o;
    return Objects.equals(this.target, accessRequestCreateRequest.target) &&
        equalsNullable(this.message, accessRequestCreateRequest.message);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, hashCodeNullable(message));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRequestCreateRequest {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

