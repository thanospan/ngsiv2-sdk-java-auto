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
 * RetrieveEntityAttributesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:41:48.154+03:00")
public class RetrieveEntityAttributesResponse {
  @SerializedName("temperature")
  private Object temperature = null;

  @SerializedName("humidity")
  private Object humidity = null;

  @SerializedName("location")
  private Object location = null;

  public RetrieveEntityAttributesResponse temperature(Object temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * 
   * @return temperature
  **/
  @ApiModelProperty(example = "{\"value\":21.7,\"type\":\"Number\"}", required = true, value = "")
  public Object getTemperature() {
    return temperature;
  }

  public void setTemperature(Object temperature) {
    this.temperature = temperature;
  }

  public RetrieveEntityAttributesResponse humidity(Object humidity) {
    this.humidity = humidity;
    return this;
  }

   /**
   * 
   * @return humidity
  **/
  @ApiModelProperty(example = "{\"value\":60,\"type\":\"Number\"}", required = true, value = "")
  public Object getHumidity() {
    return humidity;
  }

  public void setHumidity(Object humidity) {
    this.humidity = humidity;
  }

  public RetrieveEntityAttributesResponse location(Object location) {
    this.location = location;
    return this;
  }

   /**
   * 
   * @return location
  **/
  @ApiModelProperty(example = "{\"value\":\"41.3763726, 2.1864475\",\"type\":\"geo:point\",\"metadata\":{\"crs\":{\"value\":\"WGS84\",\"type\":\"Text\"}}}", required = true, value = "")
  public Object getLocation() {
    return location;
  }

  public void setLocation(Object location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveEntityAttributesResponse retrieveEntityAttributesResponse = (RetrieveEntityAttributesResponse) o;
    return Objects.equals(this.temperature, retrieveEntityAttributesResponse.temperature) &&
        Objects.equals(this.humidity, retrieveEntityAttributesResponse.humidity) &&
        Objects.equals(this.location, retrieveEntityAttributesResponse.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temperature, humidity, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEntityAttributesResponse {\n");
    
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

