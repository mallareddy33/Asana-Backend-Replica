package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.NextPage;
import com.asana.replica.generated.model.PortfolioCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * GetPortfolios200Response
 */

@JsonTypeName("getPortfolios_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GetPortfolios200Response {

  @Valid
  private List<@Valid PortfolioCompact> data = new ArrayList<>();

  private JsonNullable<NextPage> nextPage = JsonNullable.<NextPage>undefined();

  public GetPortfolios200Response data(List<@Valid PortfolioCompact> data) {
    this.data = data;
    return this;
  }

  public GetPortfolios200Response addDataItem(PortfolioCompact dataItem) {
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
  public List<@Valid PortfolioCompact> getData() {
    return data;
  }

  public void setData(List<@Valid PortfolioCompact> data) {
    this.data = data;
  }

  public GetPortfolios200Response nextPage(NextPage nextPage) {
    this.nextPage = JsonNullable.of(nextPage);
    return this;
  }

  /**
   * Get nextPage
   * @return nextPage
   */
  @Valid 
  @Schema(name = "next_page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_page")
  public JsonNullable<NextPage> getNextPage() {
    return nextPage;
  }

  public void setNextPage(JsonNullable<NextPage> nextPage) {
    this.nextPage = nextPage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPortfolios200Response getPortfolios200Response = (GetPortfolios200Response) o;
    return Objects.equals(this.data, getPortfolios200Response.data) &&
        equalsNullable(this.nextPage, getPortfolios200Response.nextPage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, hashCodeNullable(nextPage));
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
    sb.append("class GetPortfolios200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

