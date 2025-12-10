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
 * PortfolioRemoveItemRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class PortfolioRemoveItemRequest {

  private String item;

  public PortfolioRemoveItemRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PortfolioRemoveItemRequest(String item) {
    this.item = item;
  }

  public PortfolioRemoveItemRequest item(String item) {
    this.item = item;
    return this;
  }

  /**
   * The item to remove from the portfolio.
   * @return item
   */
  @NotNull 
  @Schema(name = "item", example = "1331", description = "The item to remove from the portfolio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioRemoveItemRequest portfolioRemoveItemRequest = (PortfolioRemoveItemRequest) o;
    return Objects.equals(this.item, portfolioRemoveItemRequest.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioRemoveItemRequest {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

