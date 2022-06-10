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
 * UpdateOrAppendEntityAttributesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:44:07.423009+03:00[Europe/Athens]")
public class UpdateOrAppendEntityAttributesRequest {
  public static final String SERIALIZED_NAME_AMBIENT_NOISE = "ambientNoise";
  @SerializedName(SERIALIZED_NAME_AMBIENT_NOISE)
  private Object ambientNoise;

  public UpdateOrAppendEntityAttributesRequest() { 
  }

  public UpdateOrAppendEntityAttributesRequest ambientNoise(Object ambientNoise) {
    
    this.ambientNoise = ambientNoise;
    return this;
  }

   /**
   * 
   * @return ambientNoise
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"value\":31.5}", required = true, value = "")

  public Object getAmbientNoise() {
    return ambientNoise;
  }


  public void setAmbientNoise(Object ambientNoise) {
    this.ambientNoise = ambientNoise;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrAppendEntityAttributesRequest updateOrAppendEntityAttributesRequest = (UpdateOrAppendEntityAttributesRequest) o;
    return Objects.equals(this.ambientNoise, updateOrAppendEntityAttributesRequest.ambientNoise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ambientNoise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrAppendEntityAttributesRequest {\n");
    sb.append("    ambientNoise: ").append(toIndentedString(ambientNoise)).append("\n");
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
    openapiFields.add("ambientNoise");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ambientNoise");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateOrAppendEntityAttributesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateOrAppendEntityAttributesRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateOrAppendEntityAttributesRequest is not found in the empty JSON string", UpdateOrAppendEntityAttributesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateOrAppendEntityAttributesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateOrAppendEntityAttributesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateOrAppendEntityAttributesRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateOrAppendEntityAttributesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateOrAppendEntityAttributesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateOrAppendEntityAttributesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateOrAppendEntityAttributesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateOrAppendEntityAttributesRequest>() {
           @Override
           public void write(JsonWriter out, UpdateOrAppendEntityAttributesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateOrAppendEntityAttributesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateOrAppendEntityAttributesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateOrAppendEntityAttributesRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateOrAppendEntityAttributesRequest
  */
  public static UpdateOrAppendEntityAttributesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateOrAppendEntityAttributesRequest.class);
  }

 /**
  * Convert an instance of UpdateOrAppendEntityAttributesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

