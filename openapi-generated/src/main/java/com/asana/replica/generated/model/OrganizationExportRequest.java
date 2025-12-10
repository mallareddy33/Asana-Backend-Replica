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
 * An *organization_export* request starts a job to export the complete data of the given Organization.
 */

@Schema(name = "OrganizationExportRequest", description = "An *organization_export* request starts a job to export the complete data of the given Organization.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class OrganizationExportRequest {

  private @Nullable String organization;

  public OrganizationExportRequest organization(@Nullable String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * Globally unique identifier for the workspace or organization.
   * @return organization
   */
  
  @Schema(name = "organization", example = "1331", description = "Globally unique identifier for the workspace or organization.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization")
  public @Nullable String getOrganization() {
    return organization;
  }

  public void setOrganization(@Nullable String organization) {
    this.organization = organization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationExportRequest organizationExportRequest = (OrganizationExportRequest) o;
    return Objects.equals(this.organization, organizationExportRequest.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationExportRequest {\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

