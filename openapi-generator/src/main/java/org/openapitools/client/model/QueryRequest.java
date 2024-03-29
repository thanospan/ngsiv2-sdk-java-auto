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
 * QueryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:44:07.423009+03:00[Europe/Athens]")
public class QueryRequest {
  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private List<Object> entities = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTRS = "attrs";
  @SerializedName(SERIALIZED_NAME_ATTRS)
  private List<String> attrs = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private Object expression;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<String> metadata = new ArrayList<>();

  public QueryRequest() { 
  }

  public QueryRequest entities(List<Object> entities) {
    
    this.entities = entities;
    return this;
  }

  public QueryRequest addEntitiesItem(Object entitiesItem) {
    this.entities.add(entitiesItem);
    return this;
  }

   /**
   * 
   * @return entities
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{idPattern=.*, type=Room}, {id=Car, type=P-9873-K}]", required = true, value = "")

  public List<Object> getEntities() {
    return entities;
  }


  public void setEntities(List<Object> entities) {
    this.entities = entities;
  }


  public QueryRequest attrs(List<String> attrs) {
    
    this.attrs = attrs;
    return this;
  }

  public QueryRequest addAttrsItem(String attrsItem) {
    this.attrs.add(attrsItem);
    return this;
  }

   /**
   * 
   * @return attrs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[temperature, humidity]", required = true, value = "")

  public List<String> getAttrs() {
    return attrs;
  }


  public void setAttrs(List<String> attrs) {
    this.attrs = attrs;
  }


  public QueryRequest expression(Object expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * 
   * @return expression
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"q\":\"temperature>20\"}", required = true, value = "")

  public Object getExpression() {
    return expression;
  }


  public void setExpression(Object expression) {
    this.expression = expression;
  }


  public QueryRequest metadata(List<String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public QueryRequest addMetadataItem(String metadataItem) {
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * 
   * @return metadata
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[accuracy, timestamp]", required = true, value = "")

  public List<String> getMetadata() {
    return metadata;
  }


  public void setMetadata(List<String> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryRequest queryRequest = (QueryRequest) o;
    return Objects.equals(this.entities, queryRequest.entities) &&
        Objects.equals(this.attrs, queryRequest.attrs) &&
        Objects.equals(this.expression, queryRequest.expression) &&
        Objects.equals(this.metadata, queryRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, attrs, expression, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryRequest {\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    attrs: ").append(toIndentedString(attrs)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("entities");
    openapiFields.add("attrs");
    openapiFields.add("expression");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entities");
    openapiRequiredFields.add("attrs");
    openapiRequiredFields.add("expression");
    openapiRequiredFields.add("metadata");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryRequest is not found in the empty JSON string", QueryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!QueryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QueryRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("entities") != null && !jsonObj.get("entities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entities` to be an array in the JSON string but got `%s`", jsonObj.get("entities").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("attrs") != null && !jsonObj.get("attrs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attrs` to be an array in the JSON string but got `%s`", jsonObj.get("attrs").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryRequest>() {
           @Override
           public void write(JsonWriter out, QueryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryRequest
  * @throws IOException if the JSON string is invalid with respect to QueryRequest
  */
  public static QueryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryRequest.class);
  }

 /**
  * Convert an instance of QueryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

