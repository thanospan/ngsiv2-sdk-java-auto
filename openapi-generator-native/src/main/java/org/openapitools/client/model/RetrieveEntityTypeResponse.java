/*
 * FIWARE-NGSI v2 Specification
 * TODO: Add a description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * RetrieveEntityTypeResponse
 */
@JsonPropertyOrder({
  RetrieveEntityTypeResponse.JSON_PROPERTY_ATTRS,
  RetrieveEntityTypeResponse.JSON_PROPERTY_COUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T18:35:25.798686+03:00[Europe/Athens]")
public class RetrieveEntityTypeResponse {
  public static final String JSON_PROPERTY_ATTRS = "attrs";
  private Object attrs;

  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;


  public RetrieveEntityTypeResponse attrs(Object attrs) {
    
    this.attrs = attrs;
    return this;
  }

   /**
   * 
   * @return attrs
  **/
  @ApiModelProperty(example = "{\"pressure\":{\"types\":[\"Number\"]},\"humidity\":{\"types\":[\"percentage\"]},\"temperature\":{\"types\":[\"urn:phenomenum:temperature\"]}}", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ATTRS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAttrs() {
    return attrs;
  }


  public void setAttrs(Object attrs) {
    this.attrs = attrs;
  }


  public RetrieveEntityTypeResponse count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * 
   * @return count
  **/
  @ApiModelProperty(example = "7", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveEntityTypeResponse retrieveEntityTypeResponse = (RetrieveEntityTypeResponse) o;
    return Objects.equals(this.attrs, retrieveEntityTypeResponse.attrs) &&
        Objects.equals(this.count, retrieveEntityTypeResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrs, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEntityTypeResponse {\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

