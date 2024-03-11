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
import com.alterian.jo.model.CacheFieldType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * CacheField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CacheField {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CacheFieldType type;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_WRITETIME = "writetime";
  @SerializedName(SERIALIZED_NAME_WRITETIME)
  private String writetime;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl;

  public CacheField() {
  }

  public CacheField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CacheField type(CacheFieldType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  public CacheFieldType getType() {
    return type;
  }

  public void setType(CacheFieldType type) {
    this.type = type;
  }


  public CacheField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public CacheField writetime(String writetime) {
    this.writetime = writetime;
    return this;
  }

   /**
   * Get writetime
   * @return writetime
  **/
  @javax.annotation.Nullable
  public String getWritetime() {
    return writetime;
  }

  public void setWritetime(String writetime) {
    this.writetime = writetime;
  }


  public CacheField ttl(String ttl) {
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  public String getTtl() {
    return ttl;
  }

  public void setTtl(String ttl) {
    this.ttl = ttl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheField cacheField = (CacheField) o;
    return Objects.equals(this.name, cacheField.name) &&
        Objects.equals(this.type, cacheField.type) &&
        Objects.equals(this.value, cacheField.value) &&
        Objects.equals(this.writetime, cacheField.writetime) &&
        Objects.equals(this.ttl, cacheField.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, value, writetime, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    writetime: ").append(toIndentedString(writetime)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("value");
    openapiFields.add("writetime");
    openapiFields.add("ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CacheField
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheField.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheField is not found in the empty JSON string", CacheField.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheField` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CacheField.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `type`
      CacheFieldType.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("writetime") != null && !jsonObj.get("writetime").isJsonNull()) && !jsonObj.get("writetime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `writetime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("writetime").toString()));
      }
      if ((jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheField.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheField>() {
           @Override
           public void write(JsonWriter out, CacheField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheField read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CacheField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CacheField
  * @throws IOException if the JSON string is invalid with respect to CacheField
  */
  public static CacheField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheField.class);
  }

 /**
  * Convert an instance of CacheField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

