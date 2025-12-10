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
 * A response object returned from a batch request.
 */

@Schema(name = "BatchResponse", description = "A response object returned from a batch request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class BatchResponse {

  private @Nullable Integer statusCode;

  private @Nullable Object headers;

  private @Nullable Object body;

  public BatchResponse statusCode(@Nullable Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The HTTP status code that the invoked endpoint returned.
   * @return statusCode
   */
  
  @Schema(name = "status_code", example = "200", description = "The HTTP status code that the invoked endpoint returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status_code")
  public @Nullable Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(@Nullable Integer statusCode) {
    this.statusCode = statusCode;
  }

  public BatchResponse headers(@Nullable Object headers) {
    this.headers = headers;
    return this;
  }

  /**
   * A map of HTTP headers specific to this result. This is primarily used for returning a `Location` header to accompany a `201 Created` result.  The parent HTTP response will contain all common headers.
   * @return headers
   */
  
  @Schema(name = "headers", example = "{\"location\":\"/tasks/1234\"}", description = "A map of HTTP headers specific to this result. This is primarily used for returning a `Location` header to accompany a `201 Created` result.  The parent HTTP response will contain all common headers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("headers")
  public @Nullable Object getHeaders() {
    return headers;
  }

  public void setHeaders(@Nullable Object headers) {
    this.headers = headers;
  }

  public BatchResponse body(@Nullable Object body) {
    this.body = body;
    return this;
  }

  /**
   * The JSON body that the invoked endpoint returned.
   * @return body
   */
  
  @Schema(name = "body", example = "{\"data\":{\"gid\":\"1967\",\"completed\":false,\"name\":\"Hello, world!\",\"notes\":\"How are you today?\"}}", description = "The JSON body that the invoked endpoint returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public @Nullable Object getBody() {
    return body;
  }

  public void setBody(@Nullable Object body) {
    this.body = body;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchResponse batchResponse = (BatchResponse) o;
    return Objects.equals(this.statusCode, batchResponse.statusCode) &&
        Objects.equals(this.headers, batchResponse.headers) &&
        Objects.equals(this.body, batchResponse.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, headers, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchResponse {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

