package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.WebhookResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateWebhook201Response
 */

@JsonTypeName("createWebhook_201_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class CreateWebhook201Response {

  private @Nullable WebhookResponse data;

  private @Nullable String xHookSecret;

  public CreateWebhook201Response data(@Nullable WebhookResponse data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public @Nullable WebhookResponse getData() {
    return data;
  }

  public void setData(@Nullable WebhookResponse data) {
    this.data = data;
  }

  public CreateWebhook201Response xHookSecret(@Nullable String xHookSecret) {
    this.xHookSecret = xHookSecret;
    return this;
  }

  /**
   * The secret to be used to verify future webhook event signatures.
   * @return xHookSecret
   */
  
  @Schema(name = "X-Hook-Secret", example = "b537207f20cbfa02357cf448134da559e8bd39d61597dcd5631b8012eae53e81", description = "The secret to be used to verify future webhook event signatures.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("X-Hook-Secret")
  public @Nullable String getxHookSecret() {
    return xHookSecret;
  }

  public void setxHookSecret(@Nullable String xHookSecret) {
    this.xHookSecret = xHookSecret;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWebhook201Response createWebhook201Response = (CreateWebhook201Response) o;
    return Objects.equals(this.data, createWebhook201Response.data) &&
        Objects.equals(this.xHookSecret, createWebhook201Response.xHookSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, xHookSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWebhook201Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    xHookSecret: ").append(toIndentedString(xHookSecret)).append("\n");
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

