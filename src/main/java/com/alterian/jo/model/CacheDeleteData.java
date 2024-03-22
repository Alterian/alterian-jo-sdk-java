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
import com.alterian.jo.model.CacheColumnListing;
import com.alterian.jo.model.CacheTableListing;
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
 * CacheDeleteData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CacheDeleteData {
  public static final String SERIALIZED_NAME_COLUMNS_DROPPED = "columnsDropped";
  @SerializedName(SERIALIZED_NAME_COLUMNS_DROPPED)
  private List<CacheColumnListing> columnsDropped;

  public static final String SERIALIZED_NAME_TABLES_DROPPED = "tablesDropped";
  @SerializedName(SERIALIZED_NAME_TABLES_DROPPED)
  private List<CacheTableListing> tablesDropped;

  public CacheDeleteData() {
  }

  public CacheDeleteData columnsDropped(List<CacheColumnListing> columnsDropped) {
    this.columnsDropped = columnsDropped;
    return this;
  }

  public CacheDeleteData addColumnsDroppedItem(CacheColumnListing columnsDroppedItem) {
    if (this.columnsDropped == null) {
      this.columnsDropped = new ArrayList<>();
    }
    this.columnsDropped.add(columnsDroppedItem);
    return this;
  }

   /**
   * Get columnsDropped
   * @return columnsDropped
  **/
  @javax.annotation.Nullable
  public List<CacheColumnListing> getColumnsDropped() {
    return columnsDropped;
  }

  public void setColumnsDropped(List<CacheColumnListing> columnsDropped) {
    this.columnsDropped = columnsDropped;
  }


  public CacheDeleteData tablesDropped(List<CacheTableListing> tablesDropped) {
    this.tablesDropped = tablesDropped;
    return this;
  }

  public CacheDeleteData addTablesDroppedItem(CacheTableListing tablesDroppedItem) {
    if (this.tablesDropped == null) {
      this.tablesDropped = new ArrayList<>();
    }
    this.tablesDropped.add(tablesDroppedItem);
    return this;
  }

   /**
   * Get tablesDropped
   * @return tablesDropped
  **/
  @javax.annotation.Nullable
  public List<CacheTableListing> getTablesDropped() {
    return tablesDropped;
  }

  public void setTablesDropped(List<CacheTableListing> tablesDropped) {
    this.tablesDropped = tablesDropped;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheDeleteData cacheDeleteData = (CacheDeleteData) o;
    return Objects.equals(this.columnsDropped, cacheDeleteData.columnsDropped) &&
        Objects.equals(this.tablesDropped, cacheDeleteData.tablesDropped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnsDropped, tablesDropped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheDeleteData {\n");
    sb.append("    columnsDropped: ").append(toIndentedString(columnsDropped)).append("\n");
    sb.append("    tablesDropped: ").append(toIndentedString(tablesDropped)).append("\n");
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
    openapiFields.add("columnsDropped");
    openapiFields.add("tablesDropped");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CacheDeleteData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheDeleteData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheDeleteData is not found in the empty JSON string", CacheDeleteData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheDeleteData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheDeleteData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("columnsDropped") != null && !jsonObj.get("columnsDropped").isJsonNull()) {
        JsonArray jsonArraycolumnsDropped = jsonObj.getAsJsonArray("columnsDropped");
        if (jsonArraycolumnsDropped != null) {
          // ensure the json data is an array
          if (!jsonObj.get("columnsDropped").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `columnsDropped` to be an array in the JSON string but got `%s`", jsonObj.get("columnsDropped").toString()));
          }

          // validate the optional field `columnsDropped` (array)
          for (int i = 0; i < jsonArraycolumnsDropped.size(); i++) {
            CacheColumnListing.validateJsonElement(jsonArraycolumnsDropped.get(i));
          };
        }
      }
      if (jsonObj.get("tablesDropped") != null && !jsonObj.get("tablesDropped").isJsonNull()) {
        JsonArray jsonArraytablesDropped = jsonObj.getAsJsonArray("tablesDropped");
        if (jsonArraytablesDropped != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tablesDropped").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tablesDropped` to be an array in the JSON string but got `%s`", jsonObj.get("tablesDropped").toString()));
          }

          // validate the optional field `tablesDropped` (array)
          for (int i = 0; i < jsonArraytablesDropped.size(); i++) {
            CacheTableListing.validateJsonElement(jsonArraytablesDropped.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheDeleteData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheDeleteData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheDeleteData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheDeleteData.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheDeleteData>() {
           @Override
           public void write(JsonWriter out, CacheDeleteData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheDeleteData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CacheDeleteData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CacheDeleteData
  * @throws IOException if the JSON string is invalid with respect to CacheDeleteData
  */
  public static CacheDeleteData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheDeleteData.class);
  }

 /**
  * Convert an instance of CacheDeleteData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

