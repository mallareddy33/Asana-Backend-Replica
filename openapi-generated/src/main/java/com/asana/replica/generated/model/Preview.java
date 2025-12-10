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
 * A collection of rich text that will be displayed as a preview to another app.  This is read-only except for a small group of whitelisted apps.
 */

@Schema(name = "Preview", description = "A collection of rich text that will be displayed as a preview to another app.  This is read-only except for a small group of whitelisted apps.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.17.0")
public class Preview {

  private @Nullable String fallback;

  private @Nullable String footer;

  private @Nullable String header;

  private @Nullable String headerLink;

  private @Nullable String htmlText;

  private @Nullable String text;

  private @Nullable String title;

  private @Nullable String titleLink;

  public Preview fallback(@Nullable String fallback) {
    this.fallback = fallback;
    return this;
  }

  /**
   * Some fallback text to display if unable to display the full preview.
   * @return fallback
   */
  
  @Schema(name = "fallback", example = "Greg: Great! I like this idea.\\n\\nhttps//a_company.slack.com/archives/ABCDEFG/12345678", description = "Some fallback text to display if unable to display the full preview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fallback")
  public @Nullable String getFallback() {
    return fallback;
  }

  public void setFallback(@Nullable String fallback) {
    this.fallback = fallback;
  }

  public Preview footer(@Nullable String footer) {
    this.footer = footer;
    return this;
  }

  /**
   * Text to display in the footer.
   * @return footer
   */
  
  @Schema(name = "footer", example = "Mar 17, 2019 1:25 PM", description = "Text to display in the footer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("footer")
  public @Nullable String getFooter() {
    return footer;
  }

  public void setFooter(@Nullable String footer) {
    this.footer = footer;
  }

  public Preview header(@Nullable String header) {
    this.header = header;
    return this;
  }

  /**
   * Text to display in the header.
   * @return header
   */
  
  @Schema(name = "header", example = "Asana for Slack", description = "Text to display in the header.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header")
  public @Nullable String getHeader() {
    return header;
  }

  public void setHeader(@Nullable String header) {
    this.header = header;
  }

  public Preview headerLink(@Nullable String headerLink) {
    this.headerLink = headerLink;
    return this;
  }

  /**
   * Where the header will link to.
   * @return headerLink
   */
  
  @Schema(name = "header_link", example = "https://asana.comn/apps/slack", description = "Where the header will link to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("header_link")
  public @Nullable String getHeaderLink() {
    return headerLink;
  }

  public void setHeaderLink(@Nullable String headerLink) {
    this.headerLink = headerLink;
  }

  public Preview htmlText(@Nullable String htmlText) {
    this.htmlText = htmlText;
    return this;
  }

  /**
   * HTML formatted text for the body of the preview.
   * @return htmlText
   */
  
  @Schema(name = "html_text", example = "<body>Great! I like this idea.</body>", description = "HTML formatted text for the body of the preview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_text")
  public @Nullable String getHtmlText() {
    return htmlText;
  }

  public void setHtmlText(@Nullable String htmlText) {
    this.htmlText = htmlText;
  }

  public Preview text(@Nullable String text) {
    this.text = text;
    return this;
  }

  /**
   * Text for the body of the preview.
   * @return text
   */
  
  @Schema(name = "text", example = "Great! I like this idea.", description = "Text for the body of the preview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public @Nullable String getText() {
    return text;
  }

  public void setText(@Nullable String text) {
    this.text = text;
  }

  public Preview title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Text to display as the title.
   * @return title
   */
  
  @Schema(name = "title", example = "Greg", description = "Text to display as the title.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public Preview titleLink(@Nullable String titleLink) {
    this.titleLink = titleLink;
    return this;
  }

  /**
   * Where to title will link to.
   * @return titleLink
   */
  
  @Schema(name = "title_link", example = "https://asana.slack.com/archives/ABCDEFG/12345678", description = "Where to title will link to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title_link")
  public @Nullable String getTitleLink() {
    return titleLink;
  }

  public void setTitleLink(@Nullable String titleLink) {
    this.titleLink = titleLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Preview preview = (Preview) o;
    return Objects.equals(this.fallback, preview.fallback) &&
        Objects.equals(this.footer, preview.footer) &&
        Objects.equals(this.header, preview.header) &&
        Objects.equals(this.headerLink, preview.headerLink) &&
        Objects.equals(this.htmlText, preview.htmlText) &&
        Objects.equals(this.text, preview.text) &&
        Objects.equals(this.title, preview.title) &&
        Objects.equals(this.titleLink, preview.titleLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fallback, footer, header, headerLink, htmlText, text, title, titleLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Preview {\n");
    sb.append("    fallback: ").append(toIndentedString(fallback)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    headerLink: ").append(toIndentedString(headerLink)).append("\n");
    sb.append("    htmlText: ").append(toIndentedString(htmlText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleLink: ").append(toIndentedString(titleLink)).append("\n");
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

