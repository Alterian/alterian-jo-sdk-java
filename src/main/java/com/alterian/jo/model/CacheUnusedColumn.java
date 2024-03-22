/*
 * Journey Orchestration API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 4.30.49
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
 * CacheUnusedColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CacheUnusedColumn {
  public static final String SERIALIZED_NAME_FIRST_REPORTED_NOT_SEEN = "firstReportedNotSeen";
  @SerializedName(SERIALIZED_NAME_FIRST_REPORTED_NOT_SEEN)
  private String firstReportedNotSeen;

  public static final String SERIALIZED_NAME_COLUMN_NAME = "columnName";
  @SerializedName(SERIALIZED_NAME_COLUMN_NAME)
  private String columnName;

  public CacheUnusedColumn() {
  }

  public CacheUnusedColumn firstReportedNotSeen(String firstReportedNotSeen) {
    this.firstReportedNotSeen = firstReportedNotSeen;
    return this;
  }

   /**
   * Get firstReportedNotSeen
   * @return firstReportedNotSeen
  **/
  @javax.annotation.Nullable
  public String getFirstReportedNotSeen() {
    return firstReportedNotSeen;
  }

  public void setFirstReportedNotSeen(String firstReportedNotSeen) {
    this.firstReportedNotSeen = firstReportedNotSeen;
  }


  public CacheUnusedColumn columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

   /**
   * Get columnName
   * @return columnName
  **/
  @javax.annotation.Nullable
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheUnusedColumn cacheUnusedColumn = (CacheUnusedColumn) o;
    return Objects.equals(this.firstReportedNotSeen, cacheUnusedColumn.firstReportedNotSeen) &&
        Objects.equals(this.columnName, cacheUnusedColumn.columnName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstReportedNotSeen, columnName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheUnusedColumn {\n");
    sb.append("    firstReportedNotSeen: ").append(toIndentedString(firstReportedNotSeen)).append("\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
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
    openapiFields.add("firstReportedNotSeen");
    openapiFields.add("columnName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CacheUnusedColumn
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheUnusedColumn.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheUnusedColumn is not found in the empty JSON string", CacheUnusedColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheUnusedColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheUnusedColumn` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("firstReportedNotSeen") != null && !jsonObj.get("firstReportedNotSeen").isJsonNull()) && !jsonObj.get("firstReportedNotSeen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstReportedNotSeen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstReportedNotSeen").toString()));
      }
      if ((jsonObj.get("columnName") != null && !jsonObj.get("columnName").isJsonNull()) && !jsonObj.get("columnName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `columnName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("columnName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheUnusedColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheUnusedColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheUnusedColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheUnusedColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheUnusedColumn>() {
           @Override
           public void write(JsonWriter out, CacheUnusedColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheUnusedColumn read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CacheUnusedColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CacheUnusedColumn
  * @throws IOException if the JSON string is invalid with respect to CacheUnusedColumn
  */
  public static CacheUnusedColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheUnusedColumn.class);
  }

 /**
  * Convert an instance of CacheUnusedColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

