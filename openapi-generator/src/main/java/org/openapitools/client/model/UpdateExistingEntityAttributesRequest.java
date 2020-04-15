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
 * UpdateExistingEntityAttributesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T18:33:59.857039+03:00[Europe/Athens]")
public class UpdateExistingEntityAttributesRequest {
  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private Object temperature;

  public static final String SERIALIZED_NAME_SEAT_NUMBER = "seatNumber";
  @SerializedName(SERIALIZED_NAME_SEAT_NUMBER)
  private Object seatNumber;


  public UpdateExistingEntityAttributesRequest temperature(Object temperature) {
    
    this.temperature = temperature;
    return this;
  }

   /**
   * 
   * @return temperature
  **/
  @ApiModelProperty(example = "{\"value\":25.5}", required = true, value = "")

  public Object getTemperature() {
    return temperature;
  }


  public void setTemperature(Object temperature) {
    this.temperature = temperature;
  }


  public UpdateExistingEntityAttributesRequest seatNumber(Object seatNumber) {
    
    this.seatNumber = seatNumber;
    return this;
  }

   /**
   * 
   * @return seatNumber
  **/
  @ApiModelProperty(example = "{\"value\":6}", required = true, value = "")

  public Object getSeatNumber() {
    return seatNumber;
  }


  public void setSeatNumber(Object seatNumber) {
    this.seatNumber = seatNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateExistingEntityAttributesRequest updateExistingEntityAttributesRequest = (UpdateExistingEntityAttributesRequest) o;
    return Objects.equals(this.temperature, updateExistingEntityAttributesRequest.temperature) &&
        Objects.equals(this.seatNumber, updateExistingEntityAttributesRequest.seatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temperature, seatNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateExistingEntityAttributesRequest {\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    seatNumber: ").append(toIndentedString(seatNumber)).append("\n");
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

