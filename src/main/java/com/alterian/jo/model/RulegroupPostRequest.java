/*
 * Journey Orchestration API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 4.29.139
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alterian.jo.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alterian.jo.JSON;

/**
 * RulegroupPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RulegroupPostRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLE_INVOKE = "enableInvoke";
  @SerializedName(SERIALIZED_NAME_ENABLE_INVOKE)
  private Boolean enableInvoke;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REFERENCED_RULES = "referencedRules";
  @SerializedName(SERIALIZED_NAME_REFERENCED_RULES)
  private List<String> referencedRules;

  public RulegroupPostRequest() {
  }

  public RulegroupPostRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the rule group
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public RulegroupPostRequest enableInvoke(Boolean enableInvoke) {
    this.enableInvoke = enableInvoke;
    return this;
  }

   /**
   * If you want to allow this rule group to be invoked, set this to true
   * @return enableInvoke
  **/
  @javax.annotation.Nullable
  public Boolean getEnableInvoke() {
    return enableInvoke;
  }

  public void setEnableInvoke(Boolean enableInvoke) {
    this.enableInvoke = enableInvoke;
  }


  public RulegroupPostRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the rule group
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public RulegroupPostRequest referencedRules(List<String> referencedRules) {
    this.referencedRules = referencedRules;
    return this;
  }

  public RulegroupPostRequest addReferencedRulesItem(String referencedRulesItem) {
    if (this.referencedRules == null) {
      this.referencedRules = new ArrayList<>();
    }
    this.referencedRules.add(referencedRulesItem);
    return this;
  }

   /**
   * If you want the rule group to reference rules, provide the list here
   * @return referencedRules
  **/
  @javax.annotation.Nullable
  public List<String> getReferencedRules() {
    return referencedRules;
  }

  public void setReferencedRules(List<String> referencedRules) {
    this.referencedRules = referencedRules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulegroupPostRequest rulegroupPostRequest = (RulegroupPostRequest) o;
    return Objects.equals(this.description, rulegroupPostRequest.description) &&
        Objects.equals(this.enableInvoke, rulegroupPostRequest.enableInvoke) &&
        Objects.equals(this.name, rulegroupPostRequest.name) &&
        Objects.equals(this.referencedRules, rulegroupPostRequest.referencedRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enableInvoke, name, referencedRules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulegroupPostRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enableInvoke: ").append(toIndentedString(enableInvoke)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referencedRules: ").append(toIndentedString(referencedRules)).append("\n");
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
    openapiFields.add("enableInvoke");
    openapiFields.add("name");
    openapiFields.add("referencedRules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RulegroupPostRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RulegroupPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RulegroupPostRequest is not found in the empty JSON string", RulegroupPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RulegroupPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RulegroupPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("referencedRules") != null && !jsonObj.get("referencedRules").isJsonNull() && !jsonObj.get("referencedRules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `referencedRules` to be an array in the JSON string but got `%s`", jsonObj.get("referencedRules").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RulegroupPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RulegroupPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RulegroupPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RulegroupPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RulegroupPostRequest>() {
           @Override
           public void write(JsonWriter out, RulegroupPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RulegroupPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RulegroupPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RulegroupPostRequest
  * @throws IOException if the JSON string is invalid with respect to RulegroupPostRequest
  */
  public static RulegroupPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RulegroupPostRequest.class);
  }

 /**
  * Convert an instance of RulegroupPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

