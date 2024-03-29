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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CreateRegistrationRequest
 */
@JsonPropertyOrder({
  CreateRegistrationRequest.JSON_PROPERTY_DESCRIPTION,
  CreateRegistrationRequest.JSON_PROPERTY_DATA_PROVIDED,
  CreateRegistrationRequest.JSON_PROPERTY_PROVIDER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:46:31.524327+03:00[Europe/Athens]")
public class CreateRegistrationRequest {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DATA_PROVIDED = "dataProvided";
  private Object dataProvided;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private Object provider;

  public CreateRegistrationRequest() { 
  }

  public CreateRegistrationRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Relative Humidity Context Source", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"entities\":[{\"id\":\"room2\",\"type\":\"Room\"}],\"attrs\":[\"relativeHumidity\"]}", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA_PROVIDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDataProvided() {
    return dataProvided;
  }


  @JsonProperty(JSON_PROPERTY_DATA_PROVIDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"http\":{\"url\":\"http://localhost:1234\"}}", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(Object provider) {
    this.provider = provider;
  }


  /**
   * Return true if this CreateRegistrationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

