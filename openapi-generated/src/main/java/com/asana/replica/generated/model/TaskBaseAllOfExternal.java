package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
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
 * *OAuth Required*. *Conditional*. This field is returned only if external values are set or included by using [Opt In] (/docs/inputoutput-options). The external field allows you to store app-specific metadata on tasks, including a gid that can be used to retrieve tasks and a data blob that can store app-specific character strings. Note that you will need to authenticate with Oauth to access or modify this data. Once an external gid is set, you can use the notation &#x60;external:custom_gid&#x60; to reference your object anywhere in the API where you may use the original object gid. See the page on Custom External Data for more details.
 */

@Schema(name = "TaskBase_allOf_external", description = "*OAuth Required*. *Conditional*. This field is returned only if external values are set or included by using [Opt In] (/docs/inputoutput-options). The external field allows you to store app-specific metadata on tasks, including a gid that can be used to retrieve tasks and a data blob that can store app-specific character strings. Note that you will need to authenticate with Oauth to access or modify this data. Once an external gid is set, you can use the notation `external:custom_gid` to reference your object anywhere in the API where you may use the original object gid. See the page on Custom External Data for more details.")
@JsonTypeName("TaskBase_allOf_external")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class TaskBaseAllOfExternal {

  private @Nullable String gid;

  private @Nullable String data;

  public TaskBaseAllOfExternal gid(@Nullable String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Get gid
   * @return gid
   */
  
  @Schema(name = "gid", example = "1234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public @Nullable String getGid() {
    return gid;
  }

  public void setGid(@Nullable String gid) {
    this.gid = gid;
  }

  public TaskBaseAllOfExternal data(@Nullable String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  
  @Schema(name = "data", example = "A blob of information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public @Nullable String getData() {
    return data;
  }

  public void setData(@Nullable String data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskBaseAllOfExternal taskBaseAllOfExternal = (TaskBaseAllOfExternal) o;
    return Objects.equals(this.gid, taskBaseAllOfExternal.gid) &&
        Objects.equals(this.data, taskBaseAllOfExternal.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskBaseAllOfExternal {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

