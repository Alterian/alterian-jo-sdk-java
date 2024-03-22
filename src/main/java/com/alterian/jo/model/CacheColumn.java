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
import com.alterian.jo.model.CacheFieldType;
import com.alterian.jo.model.CacheTableDirectionEnum;
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
 * CacheColumn
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CacheColumn {
  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private CacheTableDirectionEnum direction;

  public static final String SERIALIZED_NAME_IS_CLUSTERING_COLUMN = "isClusteringColumn";
  @SerializedName(SERIALIZED_NAME_IS_CLUSTERING_COLUMN)
  private Boolean isClusteringColumn = false;

  public static final String SERIALIZED_NAME_IS_PARTITION_KEY = "isPartitionKey";
  @SerializedName(SERIALIZED_NAME_IS_PARTITION_KEY)
  private Boolean isPartitionKey = false;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CacheFieldType type;

  public CacheColumn() {
  }

  public CacheColumn direction(CacheTableDirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  public CacheTableDirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(CacheTableDirectionEnum direction) {
    this.direction = direction;
  }


  public CacheColumn isClusteringColumn(Boolean isClusteringColumn) {
    this.isClusteringColumn = isClusteringColumn;
    return this;
  }

   /**
   * Is this field something that the data is physically clustered on?
   * @return isClusteringColumn
  **/
  @javax.annotation.Nullable
  public Boolean getIsClusteringColumn() {
    return isClusteringColumn;
  }

  public void setIsClusteringColumn(Boolean isClusteringColumn) {
    this.isClusteringColumn = isClusteringColumn;
  }


  public CacheColumn isPartitionKey(Boolean isPartitionKey) {
    this.isPartitionKey = isPartitionKey;
    return this;
  }

   /**
   * Is this field part of the partition key?
   * @return isPartitionKey
  **/
  @javax.annotation.Nullable
  public Boolean getIsPartitionKey() {
    return isPartitionKey;
  }

  public void setIsPartitionKey(Boolean isPartitionKey) {
    this.isPartitionKey = isPartitionKey;
  }


  public CacheColumn name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the field
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CacheColumn type(CacheFieldType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public CacheFieldType getType() {
    return type;
  }

  public void setType(CacheFieldType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheColumn cacheColumn = (CacheColumn) o;
    return Objects.equals(this.direction, cacheColumn.direction) &&
        Objects.equals(this.isClusteringColumn, cacheColumn.isClusteringColumn) &&
        Objects.equals(this.isPartitionKey, cacheColumn.isPartitionKey) &&
        Objects.equals(this.name, cacheColumn.name) &&
        Objects.equals(this.type, cacheColumn.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, isClusteringColumn, isPartitionKey, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheColumn {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    isClusteringColumn: ").append(toIndentedString(isClusteringColumn)).append("\n");
    sb.append("    isPartitionKey: ").append(toIndentedString(isPartitionKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("direction");
    openapiFields.add("isClusteringColumn");
    openapiFields.add("isPartitionKey");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CacheColumn
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CacheColumn.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CacheColumn is not found in the empty JSON string", CacheColumn.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CacheColumn.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CacheColumn` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `direction`
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonNull()) {
        CacheTableDirectionEnum.validateJsonElement(jsonObj.get("direction"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        CacheFieldType.validateJsonElement(jsonObj.get("type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CacheColumn.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CacheColumn' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CacheColumn> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CacheColumn.class));

       return (TypeAdapter<T>) new TypeAdapter<CacheColumn>() {
           @Override
           public void write(JsonWriter out, CacheColumn value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CacheColumn read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CacheColumn given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CacheColumn
  * @throws IOException if the JSON string is invalid with respect to CacheColumn
  */
  public static CacheColumn fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CacheColumn.class);
  }

 /**
  * Convert an instance of CacheColumn to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

