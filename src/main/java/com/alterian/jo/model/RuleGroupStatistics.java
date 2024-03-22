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
 * RuleGroupStatistics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class RuleGroupStatistics {
  public static final String SERIALIZED_NAME_RELATIVE_TIME = "relativeTime";
  @SerializedName(SERIALIZED_NAME_RELATIVE_TIME)
  private String relativeTime;

  public static final String SERIALIZED_NAME_LAST_SEEN = "lastSeen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private String lastSeen;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private String cost;

  public static final String SERIALIZED_NAME_TOTAL_TIME = "totalTime";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIME)
  private String totalTime;

  public static final String SERIALIZED_NAME_NEW_ACTIVE_CONVERSATION = "newActiveConversation";
  @SerializedName(SERIALIZED_NAME_NEW_ACTIVE_CONVERSATION)
  private String newActiveConversation;

  public static final String SERIALIZED_NAME_BULK_LOAD = "bulkLoad";
  @SerializedName(SERIALIZED_NAME_BULK_LOAD)
  private String bulkLoad;

  public static final String SERIALIZED_NAME_INVALID_COUNT = "invalidCount";
  @SerializedName(SERIALIZED_NAME_INVALID_COUNT)
  private String invalidCount;

  public static final String SERIALIZED_NAME_MATCHED_COUNT = "matchedCount";
  @SerializedName(SERIALIZED_NAME_MATCHED_COUNT)
  private String matchedCount;

  public static final String SERIALIZED_NAME_NEW_CONVERSATION = "newConversation";
  @SerializedName(SERIALIZED_NAME_NEW_CONVERSATION)
  private String newConversation;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private String totalCount;

  public static final String SERIALIZED_NAME_TIMEOUT_COUNT = "timeoutCount";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_COUNT)
  private String timeoutCount;

  public static final String SERIALIZED_NAME_ERROR_COUNT = "errorCount";
  @SerializedName(SERIALIZED_NAME_ERROR_COUNT)
  private String errorCount;

  public RuleGroupStatistics() {
  }

  public RuleGroupStatistics relativeTime(String relativeTime) {
    this.relativeTime = relativeTime;
    return this;
  }

   /**
   * Get relativeTime
   * @return relativeTime
  **/
  @javax.annotation.Nullable
  public String getRelativeTime() {
    return relativeTime;
  }

  public void setRelativeTime(String relativeTime) {
    this.relativeTime = relativeTime;
  }


  public RuleGroupStatistics lastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  public String getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }


  public RuleGroupStatistics cost(String cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  public String getCost() {
    return cost;
  }

  public void setCost(String cost) {
    this.cost = cost;
  }


  public RuleGroupStatistics totalTime(String totalTime) {
    this.totalTime = totalTime;
    return this;
  }

   /**
   * Get totalTime
   * @return totalTime
  **/
  @javax.annotation.Nullable
  public String getTotalTime() {
    return totalTime;
  }

  public void setTotalTime(String totalTime) {
    this.totalTime = totalTime;
  }


  public RuleGroupStatistics newActiveConversation(String newActiveConversation) {
    this.newActiveConversation = newActiveConversation;
    return this;
  }

   /**
   * Get newActiveConversation
   * @return newActiveConversation
  **/
  @javax.annotation.Nullable
  public String getNewActiveConversation() {
    return newActiveConversation;
  }

  public void setNewActiveConversation(String newActiveConversation) {
    this.newActiveConversation = newActiveConversation;
  }


  public RuleGroupStatistics bulkLoad(String bulkLoad) {
    this.bulkLoad = bulkLoad;
    return this;
  }

   /**
   * Get bulkLoad
   * @return bulkLoad
  **/
  @javax.annotation.Nullable
  public String getBulkLoad() {
    return bulkLoad;
  }

  public void setBulkLoad(String bulkLoad) {
    this.bulkLoad = bulkLoad;
  }


  public RuleGroupStatistics invalidCount(String invalidCount) {
    this.invalidCount = invalidCount;
    return this;
  }

   /**
   * Get invalidCount
   * @return invalidCount
  **/
  @javax.annotation.Nullable
  public String getInvalidCount() {
    return invalidCount;
  }

  public void setInvalidCount(String invalidCount) {
    this.invalidCount = invalidCount;
  }


  public RuleGroupStatistics matchedCount(String matchedCount) {
    this.matchedCount = matchedCount;
    return this;
  }

   /**
   * Get matchedCount
   * @return matchedCount
  **/
  @javax.annotation.Nullable
  public String getMatchedCount() {
    return matchedCount;
  }

  public void setMatchedCount(String matchedCount) {
    this.matchedCount = matchedCount;
  }


  public RuleGroupStatistics newConversation(String newConversation) {
    this.newConversation = newConversation;
    return this;
  }

   /**
   * Get newConversation
   * @return newConversation
  **/
  @javax.annotation.Nullable
  public String getNewConversation() {
    return newConversation;
  }

  public void setNewConversation(String newConversation) {
    this.newConversation = newConversation;
  }


  public RuleGroupStatistics totalCount(String totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public String getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(String totalCount) {
    this.totalCount = totalCount;
  }


  public RuleGroupStatistics timeoutCount(String timeoutCount) {
    this.timeoutCount = timeoutCount;
    return this;
  }

   /**
   * Get timeoutCount
   * @return timeoutCount
  **/
  @javax.annotation.Nullable
  public String getTimeoutCount() {
    return timeoutCount;
  }

  public void setTimeoutCount(String timeoutCount) {
    this.timeoutCount = timeoutCount;
  }


  public RuleGroupStatistics errorCount(String errorCount) {
    this.errorCount = errorCount;
    return this;
  }

   /**
   * Get errorCount
   * @return errorCount
  **/
  @javax.annotation.Nullable
  public String getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(String errorCount) {
    this.errorCount = errorCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleGroupStatistics ruleGroupStatistics = (RuleGroupStatistics) o;
    return Objects.equals(this.relativeTime, ruleGroupStatistics.relativeTime) &&
        Objects.equals(this.lastSeen, ruleGroupStatistics.lastSeen) &&
        Objects.equals(this.cost, ruleGroupStatistics.cost) &&
        Objects.equals(this.totalTime, ruleGroupStatistics.totalTime) &&
        Objects.equals(this.newActiveConversation, ruleGroupStatistics.newActiveConversation) &&
        Objects.equals(this.bulkLoad, ruleGroupStatistics.bulkLoad) &&
        Objects.equals(this.invalidCount, ruleGroupStatistics.invalidCount) &&
        Objects.equals(this.matchedCount, ruleGroupStatistics.matchedCount) &&
        Objects.equals(this.newConversation, ruleGroupStatistics.newConversation) &&
        Objects.equals(this.totalCount, ruleGroupStatistics.totalCount) &&
        Objects.equals(this.timeoutCount, ruleGroupStatistics.timeoutCount) &&
        Objects.equals(this.errorCount, ruleGroupStatistics.errorCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relativeTime, lastSeen, cost, totalTime, newActiveConversation, bulkLoad, invalidCount, matchedCount, newConversation, totalCount, timeoutCount, errorCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleGroupStatistics {\n");
    sb.append("    relativeTime: ").append(toIndentedString(relativeTime)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
    sb.append("    newActiveConversation: ").append(toIndentedString(newActiveConversation)).append("\n");
    sb.append("    bulkLoad: ").append(toIndentedString(bulkLoad)).append("\n");
    sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
    sb.append("    matchedCount: ").append(toIndentedString(matchedCount)).append("\n");
    sb.append("    newConversation: ").append(toIndentedString(newConversation)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    timeoutCount: ").append(toIndentedString(timeoutCount)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
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
    openapiFields.add("relativeTime");
    openapiFields.add("lastSeen");
    openapiFields.add("cost");
    openapiFields.add("totalTime");
    openapiFields.add("newActiveConversation");
    openapiFields.add("bulkLoad");
    openapiFields.add("invalidCount");
    openapiFields.add("matchedCount");
    openapiFields.add("newConversation");
    openapiFields.add("totalCount");
    openapiFields.add("timeoutCount");
    openapiFields.add("errorCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RuleGroupStatistics
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RuleGroupStatistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RuleGroupStatistics is not found in the empty JSON string", RuleGroupStatistics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RuleGroupStatistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RuleGroupStatistics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("relativeTime") != null && !jsonObj.get("relativeTime").isJsonNull()) && !jsonObj.get("relativeTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relativeTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relativeTime").toString()));
      }
      if ((jsonObj.get("lastSeen") != null && !jsonObj.get("lastSeen").isJsonNull()) && !jsonObj.get("lastSeen").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastSeen` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastSeen").toString()));
      }
      if ((jsonObj.get("cost") != null && !jsonObj.get("cost").isJsonNull()) && !jsonObj.get("cost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cost").toString()));
      }
      if ((jsonObj.get("totalTime") != null && !jsonObj.get("totalTime").isJsonNull()) && !jsonObj.get("totalTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalTime").toString()));
      }
      if ((jsonObj.get("newActiveConversation") != null && !jsonObj.get("newActiveConversation").isJsonNull()) && !jsonObj.get("newActiveConversation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newActiveConversation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newActiveConversation").toString()));
      }
      if ((jsonObj.get("bulkLoad") != null && !jsonObj.get("bulkLoad").isJsonNull()) && !jsonObj.get("bulkLoad").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bulkLoad` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bulkLoad").toString()));
      }
      if ((jsonObj.get("invalidCount") != null && !jsonObj.get("invalidCount").isJsonNull()) && !jsonObj.get("invalidCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invalidCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invalidCount").toString()));
      }
      if ((jsonObj.get("matchedCount") != null && !jsonObj.get("matchedCount").isJsonNull()) && !jsonObj.get("matchedCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchedCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("matchedCount").toString()));
      }
      if ((jsonObj.get("newConversation") != null && !jsonObj.get("newConversation").isJsonNull()) && !jsonObj.get("newConversation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `newConversation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("newConversation").toString()));
      }
      if ((jsonObj.get("totalCount") != null && !jsonObj.get("totalCount").isJsonNull()) && !jsonObj.get("totalCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalCount").toString()));
      }
      if ((jsonObj.get("timeoutCount") != null && !jsonObj.get("timeoutCount").isJsonNull()) && !jsonObj.get("timeoutCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeoutCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeoutCount").toString()));
      }
      if ((jsonObj.get("errorCount") != null && !jsonObj.get("errorCount").isJsonNull()) && !jsonObj.get("errorCount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RuleGroupStatistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RuleGroupStatistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RuleGroupStatistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RuleGroupStatistics.class));

       return (TypeAdapter<T>) new TypeAdapter<RuleGroupStatistics>() {
           @Override
           public void write(JsonWriter out, RuleGroupStatistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RuleGroupStatistics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RuleGroupStatistics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RuleGroupStatistics
  * @throws IOException if the JSON string is invalid with respect to RuleGroupStatistics
  */
  public static RuleGroupStatistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RuleGroupStatistics.class);
  }

 /**
  * Convert an instance of RuleGroupStatistics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
