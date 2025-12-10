package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.MemberCompact;
import com.asana.replica.generated.model.PortfolioCompact;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PortfolioMembershipCompactResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class PortfolioMembershipCompactResponse {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable PortfolioCompact parent;

  private @Nullable MemberCompact member;

  /**
   * Whether the member has admin, editor, or viewer access to the portfolio. Portfolios do not support commenter access yet.
   */
  public enum AccessLevelEnum {
    ADMIN("admin"),
    
    EDITOR("editor"),
    
    VIEWER("viewer");

    private final String value;

    AccessLevelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccessLevelEnum fromValue(String value) {
      for (AccessLevelEnum b : AccessLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable AccessLevelEnum accessLevel;

  private @Nullable String resourceSubtype;

  public PortfolioMembershipCompactResponse gid(@Nullable String gid) {
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

  public PortfolioMembershipCompactResponse resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", example = "membership", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public PortfolioMembershipCompactResponse parent(@Nullable PortfolioCompact parent) {
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
  public @Nullable PortfolioCompact getParent() {
    return parent;
  }

  public void setParent(@Nullable PortfolioCompact parent) {
    this.parent = parent;
  }

  public PortfolioMembershipCompactResponse member(@Nullable MemberCompact member) {
    this.member = member;
    return this;
  }

  /**
   * Get member
   * @return member
   */
  @Valid 
  @Schema(name = "member", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("member")
  public @Nullable MemberCompact getMember() {
    return member;
  }

  public void setMember(@Nullable MemberCompact member) {
    this.member = member;
  }

  public PortfolioMembershipCompactResponse accessLevel(@Nullable AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
    return this;
  }

  /**
   * Whether the member has admin, editor, or viewer access to the portfolio. Portfolios do not support commenter access yet.
   * @return accessLevel
   */
  
  @Schema(name = "access_level", accessMode = Schema.AccessMode.READ_ONLY, example = "admin", description = "Whether the member has admin, editor, or viewer access to the portfolio. Portfolios do not support commenter access yet.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("access_level")
  public @Nullable AccessLevelEnum getAccessLevel() {
    return accessLevel;
  }

  public void setAccessLevel(@Nullable AccessLevelEnum accessLevel) {
    this.accessLevel = accessLevel;
  }

  public PortfolioMembershipCompactResponse resourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * Type of the membership.
   * @return resourceSubtype
   */
  
  @Schema(name = "resource_subtype", example = "portfolio_membership", description = "Type of the membership.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public @Nullable String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(@Nullable String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioMembershipCompactResponse portfolioMembershipCompactResponse = (PortfolioMembershipCompactResponse) o;
    return Objects.equals(this.gid, portfolioMembershipCompactResponse.gid) &&
        Objects.equals(this.resourceType, portfolioMembershipCompactResponse.resourceType) &&
        Objects.equals(this.parent, portfolioMembershipCompactResponse.parent) &&
        Objects.equals(this.member, portfolioMembershipCompactResponse.member) &&
        Objects.equals(this.accessLevel, portfolioMembershipCompactResponse.accessLevel) &&
        Objects.equals(this.resourceSubtype, portfolioMembershipCompactResponse.resourceSubtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, parent, member, accessLevel, resourceSubtype);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioMembershipCompactResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
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

