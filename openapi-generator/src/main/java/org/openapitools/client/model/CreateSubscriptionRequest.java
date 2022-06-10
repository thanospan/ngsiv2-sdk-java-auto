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
 * CreateSubscriptionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:44:07.423009+03:00[Europe/Athens]")
public class CreateSubscriptionRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private Object subject;

  public static final String SERIALIZED_NAME_NOTIFICATION = "notification";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION)
  private Object notification;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private String expires;

  public static final String SERIALIZED_NAME_THROTTLING = "throttling";
  @SerializedName(SERIALIZED_NAME_THROTTLING)
  private Integer throttling;

  public CreateSubscriptionRequest() { 
  }

  public CreateSubscriptionRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "One subscription to rule them all", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateSubscriptionRequest subject(Object subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * 
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"entities\":[{\"idPattern\":\".*\",\"type\":\"Room\"}],\"condition\":{\"attrs\":[\"temperature\"],\"expression\":{\"q\":\"temperature>40\"}}}", required = true, value = "")

  public Object getSubject() {
    return subject;
  }


  public void setSubject(Object subject) {
    this.subject = subject;
  }


  public CreateSubscriptionRequest notification(Object notification) {
    
    this.notification = notification;
    return this;
  }

   /**
   * 
   * @return notification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"http\":{\"url\":\"http://localhost:1234\"},\"attrs\":[\"temperature\",\"humidity\"]}", required = true, value = "")

  public Object getNotification() {
    return notification;
  }


  public void setNotification(Object notification) {
    this.notification = notification;
  }


  public CreateSubscriptionRequest expires(String expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * 
   * @return expires
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4/5/2016 2:00:00 PM", value = "")

  public String getExpires() {
    return expires;
  }


  public void setExpires(String expires) {
    this.expires = expires;
  }


  public CreateSubscriptionRequest throttling(Integer throttling) {
    
    this.throttling = throttling;
    return this;
  }

   /**
   * 
   * @return throttling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getThrottling() {
    return throttling;
  }


  public void setThrottling(Integer throttling) {
    this.throttling = throttling;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSubscriptionRequest createSubscriptionRequest = (CreateSubscriptionRequest) o;
    return Objects.equals(this.description, createSubscriptionRequest.description) &&
        Objects.equals(this.subject, createSubscriptionRequest.subject) &&
        Objects.equals(this.notification, createSubscriptionRequest.notification) &&
        Objects.equals(this.expires, createSubscriptionRequest.expires) &&
        Objects.equals(this.throttling, createSubscriptionRequest.throttling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, subject, notification, expires, throttling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSubscriptionRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    throttling: ").append(toIndentedString(throttling)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("subject");
    openapiFields.add("notification");
    openapiFields.add("expires");
    openapiFields.add("throttling");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subject");
    openapiRequiredFields.add("notification");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSubscriptionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateSubscriptionRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSubscriptionRequest is not found in the empty JSON string", CreateSubscriptionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateSubscriptionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateSubscriptionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSubscriptionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("expires") != null && !jsonObj.get("expires").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSubscriptionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSubscriptionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSubscriptionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSubscriptionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSubscriptionRequest>() {
           @Override
           public void write(JsonWriter out, CreateSubscriptionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateSubscriptionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateSubscriptionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSubscriptionRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSubscriptionRequest
  */
  public static CreateSubscriptionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSubscriptionRequest.class);
  }

 /**
  * Convert an instance of CreateSubscriptionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

