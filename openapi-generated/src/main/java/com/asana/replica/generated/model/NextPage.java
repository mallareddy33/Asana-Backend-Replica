package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * *Conditional*. This property is only present when a limit query parameter is provided in the request. When making a paginated request, the API will return a number of results as specified by the limit parameter. If more results exist, then the response will contain a next_page attribute, which will include an offset, a relative path attribute, and a full uri attribute. If there are no more pages available, next_page will be null and no offset will be provided. Note that an offset token will expire after some time, as data may have changed.
 */

@Schema(name = "NextPage", description = "*Conditional*. This property is only present when a limit query parameter is provided in the request. When making a paginated request, the API will return a number of results as specified by the limit parameter. If more results exist, then the response will contain a next_page attribute, which will include an offset, a relative path attribute, and a full uri attribute. If there are no more pages available, next_page will be null and no offset will be provided. Note that an offset token will expire after some time, as data may have changed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class NextPage {

  private @Nullable String offset;

  private @Nullable String path;

  private @Nullable URI uri;

  public NextPage offset(@Nullable String offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Pagination offset for the request.
   * @return offset
   */
  
  @Schema(name = "offset", accessMode = Schema.AccessMode.READ_ONLY, example = "eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9", description = "Pagination offset for the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public @Nullable String getOffset() {
    return offset;
  }

  public void setOffset(@Nullable String offset) {
    this.offset = offset;
  }

  public NextPage path(@Nullable String path) {
    this.path = path;
    return this;
  }

  /**
   * A relative path containing the query parameters to fetch for next_page
   * @return path
   */
  
  @Schema(name = "path", accessMode = Schema.AccessMode.READ_ONLY, example = "/tasks/12345/attachments?limit=2&offset=eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9", description = "A relative path containing the query parameters to fetch for next_page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public @Nullable String getPath() {
    return path;
  }

  public void setPath(@Nullable String path) {
    this.path = path;
  }

  public NextPage uri(@Nullable URI uri) {
    this.uri = uri;
    return this;
  }

  /**
   * A full uri containing the query parameters to fetch for next_page
   * @return uri
   */
  @Valid 
  @Schema(name = "uri", accessMode = Schema.AccessMode.READ_ONLY, example = "https://app.asana.com/api/1.0/tasks/12345/attachments?limit=2&offset=eyJ0eXAiOJiKV1iQLCJhbGciOiJIUzI1NiJ9", description = "A full uri containing the query parameters to fetch for next_page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uri")
  public @Nullable URI getUri() {
    return uri;
  }

  public void setUri(@Nullable URI uri) {
    this.uri = uri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NextPage nextPage = (NextPage) o;
    return Objects.equals(this.offset, nextPage.offset) &&
        Objects.equals(this.path, nextPage.path) &&
        Objects.equals(this.uri, nextPage.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, path, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NextPage {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

