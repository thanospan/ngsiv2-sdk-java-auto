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
 * ListEntityTypesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:44:07.423009+03:00[Europe/Athens]")
public class ListEntityTypesResponse {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ATTRS = "attrs";
  @SerializedName(SERIALIZED_NAME_ATTRS)
  private Object attrs;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public ListEntityTypesResponse() { 
  }

  public ListEntityTypesResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Car", required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ListEntityTypesResponse attrs(Object attrs) {
    
    this.attrs = attrs;
    return this;
  }

   /**
   * 
   * @return attrs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"speed\":{\"types\":[\"Number\"]},\"fuel\":{\"types\":[\"gasoline\",\"diesel\"]},\"temperature\":{\"types\":[\"urn:phenomenum:temperature\"]}}", required = true, value = "")

  public Object getAttrs() {
    return attrs;
  }


  public void setAttrs(Object attrs) {
    this.attrs = attrs;
  }


  public ListEntityTypesResponse count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * 
   * @return count
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12", required = true, value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListEntityTypesResponse listEntityTypesResponse = (ListEntityTypesResponse) o;
    return Objects.equals(this.type, listEntityTypesResponse.type) &&
        Objects.equals(this.attrs, listEntityTypesResponse.attrs) &&
        Objects.equals(this.count, listEntityTypesResponse.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attrs, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEntityTypesResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("attrs");
    openapiFields.add("count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("attrs");
    openapiRequiredFields.add("count");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListEntityTypesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListEntityTypesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListEntityTypesResponse is not found in the empty JSON string", ListEntityTypesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListEntityTypesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListEntityTypesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListEntityTypesResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListEntityTypesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListEntityTypesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListEntityTypesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListEntityTypesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListEntityTypesResponse>() {
           @Override
           public void write(JsonWriter out, ListEntityTypesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListEntityTypesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListEntityTypesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListEntityTypesResponse
  * @throws IOException if the JSON string is invalid with respect to ListEntityTypesResponse
  */
  public static ListEntityTypesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListEntityTypesResponse.class);
  }

 /**
  * Convert an instance of ListEntityTypesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

