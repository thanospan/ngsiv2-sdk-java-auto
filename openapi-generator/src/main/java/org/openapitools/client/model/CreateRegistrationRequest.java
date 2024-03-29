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
 * CreateRegistrationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:44:07.423009+03:00[Europe/Athens]")
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
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"http\":{\"url\":\"http://localhost:1234\"}}", required = true, value = "")

  public Object getProvider() {
    return provider;
  }


  public void setProvider(Object provider) {
    this.provider = provider;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("dataProvided");
    openapiFields.add("provider");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("dataProvided");
    openapiRequiredFields.add("provider");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateRegistrationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateRegistrationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateRegistrationRequest is not found in the empty JSON string", CreateRegistrationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateRegistrationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateRegistrationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateRegistrationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateRegistrationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateRegistrationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateRegistrationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateRegistrationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateRegistrationRequest>() {
           @Override
           public void write(JsonWriter out, CreateRegistrationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateRegistrationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateRegistrationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateRegistrationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateRegistrationRequest
  */
  public static CreateRegistrationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateRegistrationRequest.class);
  }

 /**
  * Convert an instance of CreateRegistrationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

