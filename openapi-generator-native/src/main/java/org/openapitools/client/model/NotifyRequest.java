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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * NotifyRequest
 */
@JsonPropertyOrder({
  NotifyRequest.JSON_PROPERTY_SUBSCRIPTION_ID,
  NotifyRequest.JSON_PROPERTY_DATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:46:31.524327+03:00[Europe/Athens]")
public class NotifyRequest {
  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private String subscriptionId;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<Object> data = new ArrayList<>();

  public NotifyRequest() { 
  }

  public NotifyRequest subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * 
   * @return subscriptionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5aeb0ee97d4ef10a12a0262f", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public NotifyRequest data(List<Object> data) {
    this.data = data;
    return this;
  }

  public NotifyRequest addDataItem(Object dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * 
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{type=Room, id=DC_S1-D41, temperature={value=35.6, type=Number}}, {type=Room, id=Boe-Idearium, temperature={value=22.5, type=Number}}]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(List<Object> data) {
    this.data = data;
  }


  /**
   * Return true if this NotifyRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyRequest notifyRequest = (NotifyRequest) o;
    return Objects.equals(this.subscriptionId, notifyRequest.subscriptionId) &&
        Objects.equals(this.data, notifyRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyRequest {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

