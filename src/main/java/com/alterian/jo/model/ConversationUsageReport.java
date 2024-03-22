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
 * ConversationUsageReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ConversationUsageReport {
  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_CONVERSATIONS = "conversations";
  @SerializedName(SERIALIZED_NAME_CONVERSATIONS)
  private Integer conversations;

  public static final String SERIALIZED_NAME_ACTIVE_CONVERSATIONS = "activeConversations";
  @SerializedName(SERIALIZED_NAME_ACTIVE_CONVERSATIONS)
  private Integer activeConversations;

  public static final String SERIALIZED_NAME_BULK_LOADS = "bulkLoads";
  @SerializedName(SERIALIZED_NAME_BULK_LOADS)
  private Integer bulkLoads;

  public ConversationUsageReport() {
  }

  public ConversationUsageReport timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public ConversationUsageReport conversations(Integer conversations) {
    this.conversations = conversations;
    return this;
  }

   /**
   * Get conversations
   * @return conversations
  **/
  @javax.annotation.Nullable
  public Integer getConversations() {
    return conversations;
  }

  public void setConversations(Integer conversations) {
    this.conversations = conversations;
  }


  public ConversationUsageReport activeConversations(Integer activeConversations) {
    this.activeConversations = activeConversations;
    return this;
  }

   /**
   * Get activeConversations
   * @return activeConversations
  **/
  @javax.annotation.Nullable
  public Integer getActiveConversations() {
    return activeConversations;
  }

  public void setActiveConversations(Integer activeConversations) {
    this.activeConversations = activeConversations;
  }


  public ConversationUsageReport bulkLoads(Integer bulkLoads) {
    this.bulkLoads = bulkLoads;
    return this;
  }

   /**
   * Get bulkLoads
   * @return bulkLoads
  **/
  @javax.annotation.Nullable
  public Integer getBulkLoads() {
    return bulkLoads;
  }

  public void setBulkLoads(Integer bulkLoads) {
    this.bulkLoads = bulkLoads;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationUsageReport conversationUsageReport = (ConversationUsageReport) o;
    return Objects.equals(this.timestamp, conversationUsageReport.timestamp) &&
        Objects.equals(this.conversations, conversationUsageReport.conversations) &&
        Objects.equals(this.activeConversations, conversationUsageReport.activeConversations) &&
        Objects.equals(this.bulkLoads, conversationUsageReport.bulkLoads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, conversations, activeConversations, bulkLoads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationUsageReport {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
    sb.append("    activeConversations: ").append(toIndentedString(activeConversations)).append("\n");
    sb.append("    bulkLoads: ").append(toIndentedString(bulkLoads)).append("\n");
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
    openapiFields.add("timestamp");
    openapiFields.add("conversations");
    openapiFields.add("activeConversations");
    openapiFields.add("bulkLoads");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConversationUsageReport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConversationUsageReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationUsageReport is not found in the empty JSON string", ConversationUsageReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ConversationUsageReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationUsageReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("timestamp") != null && !jsonObj.get("timestamp").isJsonNull()) && !jsonObj.get("timestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timestamp").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationUsageReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationUsageReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationUsageReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationUsageReport.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationUsageReport>() {
           @Override
           public void write(JsonWriter out, ConversationUsageReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationUsageReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConversationUsageReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationUsageReport
  * @throws IOException if the JSON string is invalid with respect to ConversationUsageReport
  */
  public static ConversationUsageReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationUsageReport.class);
  }

 /**
  * Convert an instance of ConversationUsageReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
