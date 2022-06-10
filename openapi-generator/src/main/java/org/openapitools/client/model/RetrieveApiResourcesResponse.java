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
 * RetrieveApiResourcesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T00:44:07.423009+03:00[Europe/Athens]")
public class RetrieveApiResourcesResponse {
  public static final String SERIALIZED_NAME_ENTITIES_URL = "entities_url";
  @SerializedName(SERIALIZED_NAME_ENTITIES_URL)
  private String entitiesUrl;

  public static final String SERIALIZED_NAME_TYPES_URL = "types_url";
  @SerializedName(SERIALIZED_NAME_TYPES_URL)
  private String typesUrl;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS_URL = "subscriptions_url";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS_URL)
  private String subscriptionsUrl;

  public static final String SERIALIZED_NAME_REGISTRATIONS_URL = "registrations_url";
  @SerializedName(SERIALIZED_NAME_REGISTRATIONS_URL)
  private String registrationsUrl;

  public RetrieveApiResourcesResponse() { 
  }

  public RetrieveApiResourcesResponse entitiesUrl(String entitiesUrl) {
    
    this.entitiesUrl = entitiesUrl;
    return this;
  }

   /**
   * URL which points to the entities resource
   * @return entitiesUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/v2/entities", required = true, value = "URL which points to the entities resource")

  public String getEntitiesUrl() {
    return entitiesUrl;
  }


  public void setEntitiesUrl(String entitiesUrl) {
    this.entitiesUrl = entitiesUrl;
  }


  public RetrieveApiResourcesResponse typesUrl(String typesUrl) {
    
    this.typesUrl = typesUrl;
    return this;
  }

   /**
   * URL which points to the types resource
   * @return typesUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/v2/types", required = true, value = "URL which points to the types resource")

  public String getTypesUrl() {
    return typesUrl;
  }


  public void setTypesUrl(String typesUrl) {
    this.typesUrl = typesUrl;
  }


  public RetrieveApiResourcesResponse subscriptionsUrl(String subscriptionsUrl) {
    
    this.subscriptionsUrl = subscriptionsUrl;
    return this;
  }

   /**
   * URL which points to the subscriptions resource
   * @return subscriptionsUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/v2/subscriptions", required = true, value = "URL which points to the subscriptions resource")

  public String getSubscriptionsUrl() {
    return subscriptionsUrl;
  }


  public void setSubscriptionsUrl(String subscriptionsUrl) {
    this.subscriptionsUrl = subscriptionsUrl;
  }


  public RetrieveApiResourcesResponse registrationsUrl(String registrationsUrl) {
    
    this.registrationsUrl = registrationsUrl;
    return this;
  }

   /**
   * URL which points to the registrations resource
   * @return registrationsUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "/v2/registrations", required = true, value = "URL which points to the registrations resource")

  public String getRegistrationsUrl() {
    return registrationsUrl;
  }


  public void setRegistrationsUrl(String registrationsUrl) {
    this.registrationsUrl = registrationsUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetrieveApiResourcesResponse retrieveApiResourcesResponse = (RetrieveApiResourcesResponse) o;
    return Objects.equals(this.entitiesUrl, retrieveApiResourcesResponse.entitiesUrl) &&
        Objects.equals(this.typesUrl, retrieveApiResourcesResponse.typesUrl) &&
        Objects.equals(this.subscriptionsUrl, retrieveApiResourcesResponse.subscriptionsUrl) &&
        Objects.equals(this.registrationsUrl, retrieveApiResourcesResponse.registrationsUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesUrl, typesUrl, subscriptionsUrl, registrationsUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetrieveApiResourcesResponse {\n");
    sb.append("    entitiesUrl: ").append(toIndentedString(entitiesUrl)).append("\n");
    sb.append("    typesUrl: ").append(toIndentedString(typesUrl)).append("\n");
    sb.append("    subscriptionsUrl: ").append(toIndentedString(subscriptionsUrl)).append("\n");
    sb.append("    registrationsUrl: ").append(toIndentedString(registrationsUrl)).append("\n");
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
    openapiFields.add("entities_url");
    openapiFields.add("types_url");
    openapiFields.add("subscriptions_url");
    openapiFields.add("registrations_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entities_url");
    openapiRequiredFields.add("types_url");
    openapiRequiredFields.add("subscriptions_url");
    openapiRequiredFields.add("registrations_url");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveApiResourcesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RetrieveApiResourcesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RetrieveApiResourcesResponse is not found in the empty JSON string", RetrieveApiResourcesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RetrieveApiResourcesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RetrieveApiResourcesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RetrieveApiResourcesResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("entities_url") != null && !jsonObj.get("entities_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entities_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entities_url").toString()));
      }
      if (jsonObj.get("types_url") != null && !jsonObj.get("types_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `types_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("types_url").toString()));
      }
      if (jsonObj.get("subscriptions_url") != null && !jsonObj.get("subscriptions_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptions_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptions_url").toString()));
      }
      if (jsonObj.get("registrations_url") != null && !jsonObj.get("registrations_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrations_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrations_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RetrieveApiResourcesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RetrieveApiResourcesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RetrieveApiResourcesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RetrieveApiResourcesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RetrieveApiResourcesResponse>() {
           @Override
           public void write(JsonWriter out, RetrieveApiResourcesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RetrieveApiResourcesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RetrieveApiResourcesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveApiResourcesResponse
  * @throws IOException if the JSON string is invalid with respect to RetrieveApiResourcesResponse
  */
  public static RetrieveApiResourcesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveApiResourcesResponse.class);
  }

 /**
  * Convert an instance of RetrieveApiResourcesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

