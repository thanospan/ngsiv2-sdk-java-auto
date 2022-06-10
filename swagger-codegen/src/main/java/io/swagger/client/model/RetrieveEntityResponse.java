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
 * RetrieveEntityResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:41:48.154+03:00")
public class RetrieveEntityResponse {
  @SerializedName("type")
  private String type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("temperature")
  private Object temperature = null;

  @SerializedName("humidity")
  private Object humidity = null;

  @SerializedName("location")
  private Object location = null;

  public RetrieveEntityResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(example = "Room", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RetrieveEntityResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(example = "Bcn_Welt", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RetrieveEntityResponse temperature(Object temperature) {
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

  public RetrieveEntityResponse humidity(Object humidity) {
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

  public RetrieveEntityResponse location(Object location) {
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
    RetrieveEntityResponse retrieveEntityResponse = (RetrieveEntityResponse) o;
    return Objects.equals(this.type, retrieveEntityResponse.type) &&
        Objects.equals(this.id, retrieveEntityResponse.id) &&
        Objects.equals(this.temperature, retrieveEntityResponse.temperature) &&
        Objects.equals(this.humidity, retrieveEntityResponse.humidity) &&
        Objects.equals(this.location, retrieveEntityResponse.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, temperature, humidity, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveEntityResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

