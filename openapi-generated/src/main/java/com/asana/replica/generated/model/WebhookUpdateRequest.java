package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.WebhookResponseAllOfFilters;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * WebhookUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class WebhookUpdateRequest {

  @Valid
  private List<WebhookResponseAllOfFilters> filters = new ArrayList<>();

  public WebhookUpdateRequest filters(List<WebhookResponseAllOfFilters> filters) {
    this.filters = filters;
    return this;
  }

  public WebhookUpdateRequest addFiltersItem(WebhookResponseAllOfFilters filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * An array of WebhookFilter objects to specify a whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.
   * @return filters
   */
  @Valid 
  @Schema(name = "filters", description = "An array of WebhookFilter objects to specify a whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<WebhookResponseAllOfFilters> getFilters() {
    return filters;
  }

  public void setFilters(List<WebhookResponseAllOfFilters> filters) {
    this.filters = filters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUpdateRequest webhookUpdateRequest = (WebhookUpdateRequest) o;
    return Objects.equals(this.filters, webhookUpdateRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUpdateRequest {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

