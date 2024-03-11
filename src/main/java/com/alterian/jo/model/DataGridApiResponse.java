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
import com.alterian.jo.model.DataGridApiResponseAllOfData;
import com.alterian.jo.model.SuccessCursor;
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
 * DataGridApiResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class DataGridApiResponse {
  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private SuccessCursor cursor;

  public static final String SERIALIZED_NAME_DEBUG = "debug";
  @SerializedName(SERIALIZED_NAME_DEBUG)
  private String debug;

  public static final String SERIALIZED_NAME_EXCEPTION_TYPE = "exceptionType";
  @SerializedName(SERIALIZED_NAME_EXCEPTION_TYPE)
  private String exceptionType;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private DataGridApiResponseAllOfData data;

  public DataGridApiResponse() {
  }

  public DataGridApiResponse cursor(SuccessCursor cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @javax.annotation.Nullable
  public SuccessCursor getCursor() {
    return cursor;
  }

  public void setCursor(SuccessCursor cursor) {
    this.cursor = cursor;
  }


  public DataGridApiResponse debug(String debug) {
    this.debug = debug;
    return this;
  }

   /**
   * Get debug
   * @return debug
  **/
  @javax.annotation.Nullable
  public String getDebug() {
    return debug;
  }

  public void setDebug(String debug) {
    this.debug = debug;
  }


  public DataGridApiResponse exceptionType(String exceptionType) {
    this.exceptionType = exceptionType;
    return this;
  }

   /**
   * Get exceptionType
   * @return exceptionType
  **/
  @javax.annotation.Nullable
  public String getExceptionType() {
    return exceptionType;
  }

  public void setExceptionType(String exceptionType) {
    this.exceptionType = exceptionType;
  }


  public DataGridApiResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public DataGridApiResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public DataGridApiResponse data(DataGridApiResponseAllOfData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  public DataGridApiResponseAllOfData getData() {
    return data;
  }

  public void setData(DataGridApiResponseAllOfData data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataGridApiResponse dataGridApiResponse = (DataGridApiResponse) o;
    return Objects.equals(this.cursor, dataGridApiResponse.cursor) &&
        Objects.equals(this.debug, dataGridApiResponse.debug) &&
        Objects.equals(this.exceptionType, dataGridApiResponse.exceptionType) &&
        Objects.equals(this.message, dataGridApiResponse.message) &&
        Objects.equals(this.status, dataGridApiResponse.status) &&
        Objects.equals(this.data, dataGridApiResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, debug, exceptionType, message, status, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataGridApiResponse {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    exceptionType: ").append(toIndentedString(exceptionType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("cursor");
    openapiFields.add("debug");
    openapiFields.add("exceptionType");
    openapiFields.add("message");
    openapiFields.add("status");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DataGridApiResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DataGridApiResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DataGridApiResponse is not found in the empty JSON string", DataGridApiResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DataGridApiResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DataGridApiResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cursor`
      if (jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) {
        SuccessCursor.validateJsonElement(jsonObj.get("cursor"));
      }
      if ((jsonObj.get("debug") != null && !jsonObj.get("debug").isJsonNull()) && !jsonObj.get("debug").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `debug` to be a primitive type in the JSON string but got `%s`", jsonObj.get("debug").toString()));
      }
      if ((jsonObj.get("exceptionType") != null && !jsonObj.get("exceptionType").isJsonNull()) && !jsonObj.get("exceptionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exceptionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exceptionType").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        DataGridApiResponseAllOfData.validateJsonElement(jsonObj.get("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DataGridApiResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DataGridApiResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DataGridApiResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DataGridApiResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DataGridApiResponse>() {
           @Override
           public void write(JsonWriter out, DataGridApiResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DataGridApiResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DataGridApiResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DataGridApiResponse
  * @throws IOException if the JSON string is invalid with respect to DataGridApiResponse
  */
  public static DataGridApiResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DataGridApiResponse.class);
  }

 /**
  * Convert an instance of DataGridApiResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

