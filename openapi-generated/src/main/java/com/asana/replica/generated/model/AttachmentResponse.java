package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.AttachmentResponseAllOfParent;
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
 * AttachmentResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class AttachmentResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable String name;

  private @Nullable String resourceSubtype;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private JsonNullable<URI> downloadUrl = JsonNullable.<URI>undefined();

  private JsonNullable<URI> permanentUrl = JsonNullable.<URI>undefined();

  private @Nullable String host;

  private @Nullable AttachmentResponseAllOfParent parent;

  private @Nullable Integer size;

  private JsonNullable<URI> viewUrl = JsonNullable.<URI>undefined();

  private @Nullable Boolean connectedToApp;

  public AttachmentResponse gid(@Nullable String gid) {
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

  public AttachmentResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "attachment", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public AttachmentResponse name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the file.
   * @return name
   */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, example = "Screenshot.png", description = "The name of the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public AttachmentResponse resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `onedrive`, `box`, `vimeo`, and `external`.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", example = "dropbox", description = "The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `onedrive`, `box`, `vimeo`, and `external`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public AttachmentResponse createdAt(@Nullable OffsetDateTime createdAt) {
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

  public AttachmentResponse downloadUrl(URI downloadUrl) {
    this.downloadUrl = JsonNullable.of(downloadUrl);
    return this;
  }

  /**
   * The URL containing the content of the attachment. *Note:* May be null if the attachment is hosted by [Box](https://www.box.com/) and will be null if the attachment is a Video Message hosted by [Vimeo](https://vimeo.com/). If present, this URL may only be valid for two minutes from the time of retrieval. You should avoid persisting this URL somewhere and just refresh it on demand to ensure you do not keep stale URLs.
   * @return downloadUrl
   */
  @Valid 
  @Schema(name = "download_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://s3.amazonaws.com/assets/123/Screenshot.png", description = "The URL containing the content of the attachment. *Note:* May be null if the attachment is hosted by [Box](https://www.box.com/) and will be null if the attachment is a Video Message hosted by [Vimeo](https://vimeo.com/). If present, this URL may only be valid for two minutes from the time of retrieval. You should avoid persisting this URL somewhere and just refresh it on demand to ensure you do not keep stale URLs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("download_url")
  public JsonNullable<URI> getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(JsonNullable<URI> downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public AttachmentResponse permanentUrl(URI permanentUrl) {
    this.permanentUrl = JsonNullable.of(permanentUrl);
    return this;
  }

  /**
   * A stable URL for accessing the attachment through the Asana web application. This URL redirects to the file download location (e.g., an S3 link) if the user is authenticated and authorized to view the parent object (e.g., a task). Unauthorized users will receive a `403 Forbidden` response. This link is persistent and does not expire, but requires an active session to resolve.
   * @return permanentUrl
   */
  @Valid 
  @Schema(name = "permanent_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://app.asana.com/app/asana/-/get_asset?asset_id=1234567890", description = "A stable URL for accessing the attachment through the Asana web application. This URL redirects to the file download location (e.g., an S3 link) if the user is authenticated and authorized to view the parent object (e.g., a task). Unauthorized users will receive a `403 Forbidden` response. This link is persistent and does not expire, but requires an active session to resolve.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permanent_url")
  public JsonNullable<URI> getPermanentUrl() {
    return permanentUrl;
  }

  public void setPermanentUrl(JsonNullable<URI> permanentUrl) {
    this.permanentUrl = permanentUrl;
  }

  public AttachmentResponse host(@Nullable String host) {
    this.host = host;
    return this;
  }

  /**
   * The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `onedrive`, `box`, `vimeo`, and `external`.
   * @return host
   */
  
  @Schema(name = "host", accessMode = Schema.AccessMode.READ_ONLY, example = "dropbox", description = "The service hosting the attachment. Valid values are `asana`, `dropbox`, `gdrive`, `onedrive`, `box`, `vimeo`, and `external`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host")
  public @Nullable String getHost() {
    return host;
  }

  public void setHost(@Nullable String host) {
    this.host = host;
  }

  public AttachmentResponse parent(@Nullable AttachmentResponseAllOfParent parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
   */
  @Valid 
  @Schema(name = "parent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent")
  public @Nullable AttachmentResponseAllOfParent getParent() {
    return parent;
  }

  public void setParent(@Nullable AttachmentResponseAllOfParent parent) {
    this.parent = parent;
  }

  public AttachmentResponse size(@Nullable Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the attachment in bytes. Only present when the `resource_subtype` is `asana`.
   * @return size
   */
  
  @Schema(name = "size", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "The size of the attachment in bytes. Only present when the `resource_subtype` is `asana`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public @Nullable Integer getSize() {
    return size;
  }

  public void setSize(@Nullable Integer size) {
    this.size = size;
  }

  public AttachmentResponse viewUrl(URI viewUrl) {
    this.viewUrl = JsonNullable.of(viewUrl);
    return this;
  }

  /**
   * The URL where the attachment can be viewed, which may be friendlier to users in a browser than just directing them to a raw file. May be null if no view URL exists for the service.
   * @return viewUrl
   */
  @Valid 
  @Schema(name = "view_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://www.dropbox.com/s/123/Screenshot.png", description = "The URL where the attachment can be viewed, which may be friendlier to users in a browser than just directing them to a raw file. May be null if no view URL exists for the service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_url")
  public JsonNullable<URI> getViewUrl() {
    return viewUrl;
  }

  public void setViewUrl(JsonNullable<URI> viewUrl) {
    this.viewUrl = viewUrl;
  }

  public AttachmentResponse connectedToApp(@Nullable Boolean connectedToApp) {
    this.connectedToApp = connectedToApp;
    return this;
  }

  /**
   * Whether the attachment is connected to the app making the request for the purposes of showing an app components widget. Only present when the `resource_subtype` is `external` or `gdrive`.
   * @return connectedToApp
   */
  
  @Schema(name = "connected_to_app", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the attachment is connected to the app making the request for the purposes of showing an app components widget. Only present when the `resource_subtype` is `external` or `gdrive`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_to_app")
  public @Nullable Boolean getConnectedToApp() {
    return connectedToApp;
  }

  public void setConnectedToApp(@Nullable Boolean connectedToApp) {
    this.connectedToApp = connectedToApp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentResponse attachmentResponse = (AttachmentResponse) o;
    return Objects.equals(this.gid, attachmentResponse.gid) &&
        Objects.equals(this.resourceType, attachmentResponse.resourceType) &&
        Objects.equals(this.name, attachmentResponse.name) &&
        Objects.equals(this.resourceSubtype, attachmentResponse.resourceSubtype) &&
        Objects.equals(this.createdAt, attachmentResponse.createdAt) &&
        equalsNullable(this.downloadUrl, attachmentResponse.downloadUrl) &&
        equalsNullable(this.permanentUrl, attachmentResponse.permanentUrl) &&
        Objects.equals(this.host, attachmentResponse.host) &&
        Objects.equals(this.parent, attachmentResponse.parent) &&
        Objects.equals(this.size, attachmentResponse.size) &&
        equalsNullable(this.viewUrl, attachmentResponse.viewUrl) &&
        Objects.equals(this.connectedToApp, attachmentResponse.connectedToApp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, resourceSubtype, createdAt, hashCodeNullable(downloadUrl), hashCodeNullable(permanentUrl), host, parent, size, hashCodeNullable(viewUrl), connectedToApp);
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
    sb.append("class AttachmentResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    permanentUrl: ").append(toIndentedString(permanentUrl)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
    sb.append("    connectedToApp: ").append(toIndentedString(connectedToApp)).append("\n");
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

