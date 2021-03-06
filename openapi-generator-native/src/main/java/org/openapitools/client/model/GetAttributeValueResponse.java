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
 * GetAttributeValueResponse
 */
@JsonPropertyOrder({
  GetAttributeValueResponse.JSON_PROPERTY_ADDRESS,
  GetAttributeValueResponse.JSON_PROPERTY_ZIP_CODE,
  GetAttributeValueResponse.JSON_PROPERTY_CITY,
  GetAttributeValueResponse.JSON_PROPERTY_COUNTRY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-15T18:35:25.798686+03:00[Europe/Athens]")
public class GetAttributeValueResponse {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_ZIP_CODE = "zipCode";
  private Integer zipCode;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;


  public GetAttributeValueResponse address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 
   * @return address
  **/
  @ApiModelProperty(example = "Ronda de la Comunicacion s/n", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public GetAttributeValueResponse zipCode(Integer zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * 
   * @return zipCode
  **/
  @ApiModelProperty(example = "28050", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getZipCode() {
    return zipCode;
  }


  public void setZipCode(Integer zipCode) {
    this.zipCode = zipCode;
  }


  public GetAttributeValueResponse city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @ApiModelProperty(example = "Madrid", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public GetAttributeValueResponse country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @ApiModelProperty(example = "Spain", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAttributeValueResponse getAttributeValueResponse = (GetAttributeValueResponse) o;
    return Objects.equals(this.address, getAttributeValueResponse.address) &&
        Objects.equals(this.zipCode, getAttributeValueResponse.zipCode) &&
        Objects.equals(this.city, getAttributeValueResponse.city) &&
        Objects.equals(this.country, getAttributeValueResponse.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, zipCode, city, country);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttributeValueResponse {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

