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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CreateRegistrationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T18:33:59.857039+03:00[Europe/Athens]")
public class CreateRegistrationRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATA_PROVIDED = "dataProvided";
  @SerializedName(SERIALIZED_NAME_DATA_PROVIDED)
  private Object dataProvided;

  public static final String SERIALIZED_NAME_PROVIDER = "provider";
  @SerializedName(SERIALIZED_NAME_PROVIDER)
  private Object provider;


  public CreateRegistrationRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(example = "Relative Humidity Context Source", required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateRegistrationRequest dataProvided(Object dataProvided) {
    
    this.dataProvided = dataProvided;
    return this;
  }

   /**
   * 
   * @return dataProvided
  **/
  @ApiModelProperty(example = "{\"entities\":[{\"id\":\"room2\",\"type\":\"Room\"}],\"attrs\":[\"relativeHumidity\"]}", required = true, value = "")

  public Object getDataProvided() {
    return dataProvided;
  }


  public void setDataProvided(Object dataProvided) {
    this.dataProvided = dataProvided;
  }


  public CreateRegistrationRequest provider(Object provider) {
    
    this.provider = provider;
    return this;
  }

   /**
   * 
   * @return provider
  **/
  @ApiModelProperty(example = "{\"http\":{\"url\":\"http://localhost:1234\"}}", required = true, value = "")

  public Object getProvider() {
    return provider;
  }


  public void setProvider(Object provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRegistrationRequest createRegistrationRequest = (CreateRegistrationRequest) o;
    return Objects.equals(this.description, createRegistrationRequest.description) &&
        Objects.equals(this.dataProvided, createRegistrationRequest.dataProvided) &&
        Objects.equals(this.provider, createRegistrationRequest.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, dataProvided, provider);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRegistrationRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataProvided: ").append(toIndentedString(dataProvided)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

