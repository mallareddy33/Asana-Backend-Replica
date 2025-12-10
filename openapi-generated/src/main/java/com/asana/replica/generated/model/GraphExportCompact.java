package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
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
 * A *graph_export* object represents a request to export the data starting from a parent object
 */

@Schema(name = "GraphExportCompact", description = "A *graph_export* object represents a request to export the data starting from a parent object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GraphExportCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private JsonNullable<URI> downloadUrl = JsonNullable.<URI>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime completedAt;

  public GraphExportCompact gid(@Nullable String gid) {
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

  public GraphExportCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "graph_export", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public GraphExportCompact createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public GraphExportCompact downloadUrl(URI downloadUrl) {
    this.downloadUrl = JsonNullable.of(downloadUrl);
    return this;
  }

  /**
   * Download this URL to retrieve the full export in JSON format. It will be compressed in a gzip (.gz) container.  *Note: May be null if the export is still in progress or failed.  If present, this URL may only be valid for 1 hour from the time of retrieval. You should avoid persisting this URL somewhere and rather refresh on demand to ensure you do not keep stale URLs.*
   * @return downloadUrl
   */
  @Valid 
  @Schema(name = "download_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://asana-export-us-east-1.s3.us-east-1.amazonaws.com/2563645399633793/domain_export/7588024658887731/download/ domain_export_2563645399633793_7588024658887731_2023018-201726.json.gz?X-Amz-Algorithm=AWS4-HMAC-SHA256& X-Amz-Content-Sha256=xxxxxxxx&X-Amz-Date=xxxxxxxx&X-Amz-Expires=300&X-Amz-Security-Token=xxxxxxxx& X-Amz-Signature=xxxxxxxx&X-Amz-SignedHeaders=host&x-id=GetObject#_=_", description = "Download this URL to retrieve the full export in JSON format. It will be compressed in a gzip (.gz) container.  *Note: May be null if the export is still in progress or failed.  If present, this URL may only be valid for 1 hour from the time of retrieval. You should avoid persisting this URL somewhere and rather refresh on demand to ensure you do not keep stale URLs.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("download_url")
  public JsonNullable<URI> getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(JsonNullable<URI> downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public GraphExportCompact completedAt(@Nullable OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The time at which this resource was completed.
   * @return completedAt
   */
  @Valid 
  @Schema(name = "completed_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T03:06:58.147Z", description = "The time at which this resource was completed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_at")
  public @Nullable OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(@Nullable OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphExportCompact graphExportCompact = (GraphExportCompact) o;
    return Objects.equals(this.gid, graphExportCompact.gid) &&
        Objects.equals(this.resourceType, graphExportCompact.resourceType) &&
        Objects.equals(this.createdAt, graphExportCompact.createdAt) &&
        equalsNullable(this.downloadUrl, graphExportCompact.downloadUrl) &&
        Objects.equals(this.completedAt, graphExportCompact.completedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, createdAt, hashCodeNullable(downloadUrl), completedAt);
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
    sb.append("class GraphExportCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
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

