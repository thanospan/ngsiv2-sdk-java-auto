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
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * NotifyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:44:07.423009+03:00[Europe/Athens]")
public class NotifyRequest {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  private String subscriptionId;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
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

  public String getSubscriptionId() {
    return subscriptionId;
  }


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

  public List<Object> getData() {
    return data;
  }


  public void setData(List<Object> data) {
    this.data = data;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("subscriptionId");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscriptionId");
    openapiRequiredFields.add("data");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotifyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NotifyRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotifyRequest is not found in the empty JSON string", NotifyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NotifyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotifyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NotifyRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("subscriptionId") != null && !jsonObj.get("subscriptionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionId").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotifyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotifyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotifyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotifyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<NotifyRequest>() {
           @Override
           public void write(JsonWriter out, NotifyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotifyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotifyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotifyRequest
  * @throws IOException if the JSON string is invalid with respect to NotifyRequest
  */
  public static NotifyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotifyRequest.class);
  }

 /**
  * Convert an instance of NotifyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

