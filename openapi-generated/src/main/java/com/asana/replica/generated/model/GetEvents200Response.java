package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.EventResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The full record for all events that have occurred since the sync token was created.
 */

@Schema(name = "getEvents_200_response", description = "The full record for all events that have occurred since the sync token was created.")
@JsonTypeName("getEvents_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GetEvents200Response {

  @Valid
  private List<@Valid EventResponse> data = new ArrayList<>();

  private @Nullable String sync;

  private @Nullable Boolean hasMore;

  public GetEvents200Response data(List<@Valid EventResponse> data) {
    this.data = data;
    return this;
  }

  public GetEvents200Response addDataItem(EventResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public List<@Valid EventResponse> getData() {
    return data;
  }

  public void setData(List<@Valid EventResponse> data) {
    this.data = data;
  }

  public GetEvents200Response sync(@Nullable String sync) {
    this.sync = sync;
    return this;
  }

  /**
   * A sync token to be used with the next call to the /events endpoint.
   * @return sync
   */
  
  @Schema(name = "sync", example = "de4774f6915eae04714ca93bb2f5ee81", description = "A sync token to be used with the next call to the /events endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sync")
  public @Nullable String getSync() {
    return sync;
  }

  public void setSync(@Nullable String sync) {
    this.sync = sync;
  }

  public GetEvents200Response hasMore(@Nullable Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  /**
   * Indicates whether there are more events to pull.
   * @return hasMore
   */
  
  @Schema(name = "has_more", example = "true", description = "Indicates whether there are more events to pull.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_more")
  public @Nullable Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(@Nullable Boolean hasMore) {
    this.hasMore = hasMore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEvents200Response getEvents200Response = (GetEvents200Response) o;
    return Objects.equals(this.data, getEvents200Response.data) &&
        Objects.equals(this.sync, getEvents200Response.sync) &&
        Objects.equals(this.hasMore, getEvents200Response.hasMore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, sync, hasMore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEvents200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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

