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
import com.alterian.jo.model.CacheColumn;
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
 * CacheExecuteData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CacheExecuteData {
  public static final String SERIALIZED_NAME_WAS_APPLIED = "wasApplied";
  @SerializedName(SERIALIZED_NAME_WAS_APPLIED)
  private Boolean wasApplied;

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private List<CacheColumn> columns;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<List<String>> rows;

  public CacheExecuteData() {
  }

  public CacheExecuteData wasApplied(Boolean wasApplied) {
    this.wasApplied = wasApplied;
    return this;
  }

   /**
   * Get wasApplied
   * @return wasApplied
  **/
  @javax.annotation.Nullable
  public Boolean getWasApplied() {
    return wasApplied;
  }

  public void setWasApplied(Boolean wasApplied) {
    this.wasApplied = wasApplied;
  }


  public CacheExecuteData columns(List<CacheColumn> columns) {
    this.columns = columns;
    return this;
  }

  public CacheExecuteData addColumnsItem(CacheColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nullable
  public List<CacheColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<CacheColumn> columns) {
    this.columns = columns;
  }


  public CacheExecuteData rows(List<List<String>> rows) {
    this.rows = rows;
    return this;
  }

  public CacheExecuteData addRowsItem(List<String> rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  public List<List<String>> getRows() {
    return rows;
  }

  public void setRows(List<List<String>> rows) {
    this.rows = rows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheExecuteData cacheExecuteData = (CacheExecuteData) o;
    return Objects.equals(this.wasApplied, cacheExecuteData.wasApplied) &&
        Objects.equals(this.columns, cacheExecuteData.columns) &&
        Objects.equals(this.rows, cacheExecuteData.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wasApplied, columns, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheExecuteData {\n");
    sb.append("    wasApplied: ").append(toIndentedString(wasApplied)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
    openapiFields.add("wasApplied");
    openapiFields.add("columns");
    openapiFields.add("rows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CacheExecuteData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheExecuteData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheExecuteData is not found in the empty JSON string", CacheExecuteData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheExecuteData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheExecuteData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("columns") != null && !jsonObj.get("columns").isJsonNull()) {
        JsonArray jsonArraycolumns = jsonObj.getAsJsonArray("columns");
        if (jsonArraycolumns != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columns").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columns` to be an array in the JSON string but got `%s`", jsonObj.get("columns").toString()));
          }

          // validate the optional field `columns` (array)
          for (int i = 0; i < jsonArraycolumns.size(); i++) {
            CacheColumn.validateJsonElement(jsonArraycolumns.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("rows") != null && !jsonObj.get("rows").isJsonNull() && !jsonObj.get("rows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `rows` to be an array in the JSON string but got `%s`", jsonObj.get("rows").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheExecuteData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheExecuteData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheExecuteData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheExecuteData.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheExecuteData>() {
           @Override
           public void write(JsonWriter out, CacheExecuteData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheExecuteData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CacheExecuteData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CacheExecuteData
  * @throws IOException if the JSON string is invalid with respect to CacheExecuteData
  */
  public static CacheExecuteData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheExecuteData.class);
  }

 /**
  * Convert an instance of CacheExecuteData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

