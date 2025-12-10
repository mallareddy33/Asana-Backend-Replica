package com.asana.replica.generated.model;

import java.net.URI;
import java.util.Objects;
import com.asana.replica.generated.model.PortfolioCompact;
import com.asana.replica.generated.model.UserCompact;
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
 * This object determines if a user is a member of a portfolio.
 */

@Schema(name = "DeprecatedPortfolioMembershipCompact", description = "This object determines if a user is a member of a portfolio.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class DeprecatedPortfolioMembershipCompact {

  private @Nullable String gid;

  private @Nullable String resourceType;

  private @Nullable PortfolioCompact portfolio;

  private @Nullable UserCompact user;

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

  public DeprecatedPortfolioMembershipCompact gid(@Nullable String gid) {
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

  public DeprecatedPortfolioMembershipCompact resourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
   */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "portfolio_membership", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public @Nullable String getResourceType() {
    return resourceType;
  }

  public void setResourceType(@Nullable String resourceType) {
    this.resourceType = resourceType;
  }

  public DeprecatedPortfolioMembershipCompact portfolio(@Nullable PortfolioCompact portfolio) {
    this.portfolio = portfolio;
    return this;
  }

  /**
   * Get portfolio
   * @return portfolio
   */
  @Valid 
  @Schema(name = "portfolio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("portfolio")
  public @Nullable PortfolioCompact getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(@Nullable PortfolioCompact portfolio) {
    this.portfolio = portfolio;
  }

  public DeprecatedPortfolioMembershipCompact user(@Nullable UserCompact user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable UserCompact getUser() {
    return user;
  }

  public void setUser(@Nullable UserCompact user) {
    this.user = user;
  }

  public DeprecatedPortfolioMembershipCompact accessLevel(@Nullable AccessLevelEnum accessLevel) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeprecatedPortfolioMembershipCompact deprecatedPortfolioMembershipCompact = (DeprecatedPortfolioMembershipCompact) o;
    return Objects.equals(this.gid, deprecatedPortfolioMembershipCompact.gid) &&
        Objects.equals(this.resourceType, deprecatedPortfolioMembershipCompact.resourceType) &&
        Objects.equals(this.portfolio, deprecatedPortfolioMembershipCompact.portfolio) &&
        Objects.equals(this.user, deprecatedPortfolioMembershipCompact.user) &&
        Objects.equals(this.accessLevel, deprecatedPortfolioMembershipCompact.accessLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, portfolio, user, accessLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeprecatedPortfolioMembershipCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
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

