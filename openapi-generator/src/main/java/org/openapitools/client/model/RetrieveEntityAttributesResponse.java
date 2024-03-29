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
 * RetrieveEntityAttributesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:44:07.423009+03:00[Europe/Athens]")
public class RetrieveEntityAttributesResponse {
  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private Object temperature;

  public static final String SERIALIZED_NAME_HUMIDITY = "humidity";
  @SerializedName(SERIALIZED_NAME_HUMIDITY)
  private Object humidity;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Object location;

  public RetrieveEntityAttributesResponse() { 
  }

  public RetrieveEntityAttributesResponse temperature(Object temperature) {
    
    this.temperature = temperature;
    return this;
  }

   /**
   * 
   * @return temperature
  **/
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"value\":\"41.3763726, 2.1864475\",\"type\":\"geo:point\",\"metadata\":{\"crs\":{\"value\":\"WGS84\",\"type\":\"Text\"}}}", required = true, value = "")

  public Object getLocation() {
    return location;
  }


  public void setLocation(Object location) {
    this.location = location;
  }



  @Override
  public boolean equals(Object o) {
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
    openapiFields.add("temperature");
    openapiFields.add("humidity");
    openapiFields.add("location");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("temperature");
    openapiRequiredFields.add("humidity");
    openapiRequiredFields.add("location");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveEntityAttributesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RetrieveEntityAttributesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveEntityAttributesResponse is not found in the empty JSON string", RetrieveEntityAttributesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveEntityAttributesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveEntityAttributesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveEntityAttributesResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveEntityAttributesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveEntityAttributesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveEntityAttributesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveEntityAttributesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveEntityAttributesResponse>() {
           @Override
           public void write(JsonWriter out, RetrieveEntityAttributesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveEntityAttributesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveEntityAttributesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveEntityAttributesResponse
  * @throws IOException if the JSON string is invalid with respect to RetrieveEntityAttributesResponse
  */
  public static RetrieveEntityAttributesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveEntityAttributesResponse.class);
  }

 /**
  * Convert an instance of RetrieveEntityAttributesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

