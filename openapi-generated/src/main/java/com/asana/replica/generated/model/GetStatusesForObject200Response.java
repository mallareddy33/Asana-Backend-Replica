package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.NextPage;
import com.asana.replica.generated.model.StatusUpdateCompact;
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
 * GetStatusesForObject200Response
 */

@JsonTypeName("getStatusesForObject_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class GetStatusesForObject200Response {

  @Valid
  private List<@Valid StatusUpdateCompact> data = new ArrayList<>();

  private JsonNullable<NextPage> nextPage = JsonNullable.<NextPage>undefined();

  public GetStatusesForObject200Response data(List<@Valid StatusUpdateCompact> data) {
    this.data = data;
    return this;
  }

  public GetStatusesForObject200Response addDataItem(StatusUpdateCompact dataItem) {
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
  public List<@Valid StatusUpdateCompact> getData() {
    return data;
  }

  public void setData(List<@Valid StatusUpdateCompact> data) {
    this.data = data;
  }

  public GetStatusesForObject200Response nextPage(NextPage nextPage) {
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
    GetStatusesForObject200Response getStatusesForObject200Response = (GetStatusesForObject200Response) o;
    return Objects.equals(this.data, getStatusesForObject200Response.data) &&
        equalsNullable(this.nextPage, getStatusesForObject200Response.nextPage);
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
    sb.append("class GetStatusesForObject200Response {\n");
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

