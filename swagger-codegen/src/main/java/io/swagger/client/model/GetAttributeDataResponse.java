/*
 * FIWARE-NGSI v2 Specification
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetAttributeDataResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:41:48.154+03:00")
public class GetAttributeDataResponse {
  @SerializedName("value")
  private Double value = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("metadata")
  private Object metadata = null;

  public GetAttributeDataResponse value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @ApiModelProperty(example = "21.7", required = true, value = "")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public GetAttributeDataResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(example = "Number", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetAttributeDataResponse metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * 
   * @return metadata
  **/
  @ApiModelProperty(example = "{}", required = true, value = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAttributeDataResponse getAttributeDataResponse = (GetAttributeDataResponse) o;
    return Objects.equals(this.value, getAttributeDataResponse.value) &&
        Objects.equals(this.type, getAttributeDataResponse.type) &&
        Objects.equals(this.metadata, getAttributeDataResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttributeDataResponse {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

