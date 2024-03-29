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
import com.alterian.jo.model.ROSCounts;
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
 * Statistics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class Statistics {
  public static final String SERIALIZED_NAME_BULK_LOAD = "bulkLoad";
  @SerializedName(SERIALIZED_NAME_BULK_LOAD)
  private Integer bulkLoad;

  public static final String SERIALIZED_NAME_CUMULATIVE_INVOKE_TIME = "cumulativeInvokeTime";
  @SerializedName(SERIALIZED_NAME_CUMULATIVE_INVOKE_TIME)
  private Integer cumulativeInvokeTime;

  public static final String SERIALIZED_NAME_ERROR_COUNT = "errorCount";
  @SerializedName(SERIALIZED_NAME_ERROR_COUNT)
  private Integer errorCount;

  public static final String SERIALIZED_NAME_ERROR_COUNT_HEALTH_SCORE = "errorCountHealthScore";
  @SerializedName(SERIALIZED_NAME_ERROR_COUNT_HEALTH_SCORE)
  private Integer errorCountHealthScore;

  public static final String SERIALIZED_NAME_HEALTH_SCORE = "healthScore";
  @SerializedName(SERIALIZED_NAME_HEALTH_SCORE)
  private Integer healthScore;

  public static final String SERIALIZED_NAME_INVALID_COUNT = "invalidCount";
  @SerializedName(SERIALIZED_NAME_INVALID_COUNT)
  private Integer invalidCount;

  public static final String SERIALIZED_NAME_INVOKE_COUNT_HEALTH_SCORE = "invokeCountHealthScore";
  @SerializedName(SERIALIZED_NAME_INVOKE_COUNT_HEALTH_SCORE)
  private Integer invokeCountHealthScore;

  public static final String SERIALIZED_NAME_INVALID_DATA_COUNT_HEALTH_SCORE = "invalidDataCountHealthScore";
  @SerializedName(SERIALIZED_NAME_INVALID_DATA_COUNT_HEALTH_SCORE)
  private Integer invalidDataCountHealthScore;

  public static final String SERIALIZED_NAME_INVOKE_COUNT = "invokeCount";
  @SerializedName(SERIALIZED_NAME_INVOKE_COUNT)
  private Integer invokeCount;

  public static final String SERIALIZED_NAME_NEW_ACTIVE_CONVERSATION = "newActiveConversation";
  @SerializedName(SERIALIZED_NAME_NEW_ACTIVE_CONVERSATION)
  private Integer newActiveConversation;

  public static final String SERIALIZED_NAME_NEW_CONVERSATION = "newConversation";
  @SerializedName(SERIALIZED_NAME_NEW_CONVERSATION)
  private Integer newConversation;

  public static final String SERIALIZED_NAME_ROS_COUNTS = "rosCounts";
  @SerializedName(SERIALIZED_NAME_ROS_COUNTS)
  private List<ROSCounts> rosCounts;

  public static final String SERIALIZED_NAME_SERVICE_COST = "serviceCost";
  @SerializedName(SERIALIZED_NAME_SERVICE_COST)
  private Integer serviceCost;

  public static final String SERIALIZED_NAME_TOTAL_TIMEOUTS = "totalTimeouts";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIMEOUTS)
  private Integer totalTimeouts;

  public static final String SERIALIZED_NAME_TOTAL_TIMEOUTS_HEALTH_SCORE = "totalTimeoutsHealthScore";
  @SerializedName(SERIALIZED_NAME_TOTAL_TIMEOUTS_HEALTH_SCORE)
  private Integer totalTimeoutsHealthScore;

  public Statistics() {
  }

  public Statistics bulkLoad(Integer bulkLoad) {
    this.bulkLoad = bulkLoad;
    return this;
  }

   /**
   * Get bulkLoad
   * @return bulkLoad
  **/
  @javax.annotation.Nullable
  public Integer getBulkLoad() {
    return bulkLoad;
  }

  public void setBulkLoad(Integer bulkLoad) {
    this.bulkLoad = bulkLoad;
  }


  public Statistics cumulativeInvokeTime(Integer cumulativeInvokeTime) {
    this.cumulativeInvokeTime = cumulativeInvokeTime;
    return this;
  }

   /**
   * Get cumulativeInvokeTime
   * @return cumulativeInvokeTime
  **/
  @javax.annotation.Nullable
  public Integer getCumulativeInvokeTime() {
    return cumulativeInvokeTime;
  }

  public void setCumulativeInvokeTime(Integer cumulativeInvokeTime) {
    this.cumulativeInvokeTime = cumulativeInvokeTime;
  }


  public Statistics errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

   /**
   * Get errorCount
   * @return errorCount
  **/
  @javax.annotation.Nullable
  public Integer getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  public Statistics errorCountHealthScore(Integer errorCountHealthScore) {
    this.errorCountHealthScore = errorCountHealthScore;
    return this;
  }

   /**
   * Get errorCountHealthScore
   * @return errorCountHealthScore
  **/
  @javax.annotation.Nullable
  public Integer getErrorCountHealthScore() {
    return errorCountHealthScore;
  }

  public void setErrorCountHealthScore(Integer errorCountHealthScore) {
    this.errorCountHealthScore = errorCountHealthScore;
  }


  public Statistics healthScore(Integer healthScore) {
    this.healthScore = healthScore;
    return this;
  }

   /**
   * Get healthScore
   * @return healthScore
  **/
  @javax.annotation.Nullable
  public Integer getHealthScore() {
    return healthScore;
  }

  public void setHealthScore(Integer healthScore) {
    this.healthScore = healthScore;
  }


  public Statistics invalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
    return this;
  }

   /**
   * Get invalidCount
   * @return invalidCount
  **/
  @javax.annotation.Nullable
  public Integer getInvalidCount() {
    return invalidCount;
  }

  public void setInvalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
  }


  public Statistics invokeCountHealthScore(Integer invokeCountHealthScore) {
    this.invokeCountHealthScore = invokeCountHealthScore;
    return this;
  }

   /**
   * Get invokeCountHealthScore
   * @return invokeCountHealthScore
  **/
  @javax.annotation.Nullable
  public Integer getInvokeCountHealthScore() {
    return invokeCountHealthScore;
  }

  public void setInvokeCountHealthScore(Integer invokeCountHealthScore) {
    this.invokeCountHealthScore = invokeCountHealthScore;
  }


  public Statistics invalidDataCountHealthScore(Integer invalidDataCountHealthScore) {
    this.invalidDataCountHealthScore = invalidDataCountHealthScore;
    return this;
  }

   /**
   * Get invalidDataCountHealthScore
   * @return invalidDataCountHealthScore
  **/
  @javax.annotation.Nullable
  public Integer getInvalidDataCountHealthScore() {
    return invalidDataCountHealthScore;
  }

  public void setInvalidDataCountHealthScore(Integer invalidDataCountHealthScore) {
    this.invalidDataCountHealthScore = invalidDataCountHealthScore;
  }


  public Statistics invokeCount(Integer invokeCount) {
    this.invokeCount = invokeCount;
    return this;
  }

   /**
   * Get invokeCount
   * @return invokeCount
  **/
  @javax.annotation.Nullable
  public Integer getInvokeCount() {
    return invokeCount;
  }

  public void setInvokeCount(Integer invokeCount) {
    this.invokeCount = invokeCount;
  }


  public Statistics newActiveConversation(Integer newActiveConversation) {
    this.newActiveConversation = newActiveConversation;
    return this;
  }

   /**
   * Get newActiveConversation
   * @return newActiveConversation
  **/
  @javax.annotation.Nullable
  public Integer getNewActiveConversation() {
    return newActiveConversation;
  }

  public void setNewActiveConversation(Integer newActiveConversation) {
    this.newActiveConversation = newActiveConversation;
  }


  public Statistics newConversation(Integer newConversation) {
    this.newConversation = newConversation;
    return this;
  }

   /**
   * Get newConversation
   * @return newConversation
  **/
  @javax.annotation.Nullable
  public Integer getNewConversation() {
    return newConversation;
  }

  public void setNewConversation(Integer newConversation) {
    this.newConversation = newConversation;
  }


  public Statistics rosCounts(List<ROSCounts> rosCounts) {
    this.rosCounts = rosCounts;
    return this;
  }

  public Statistics addRosCountsItem(ROSCounts rosCountsItem) {
    if (this.rosCounts == null) {
      this.rosCounts = new ArrayList<>();
    }
    this.rosCounts.add(rosCountsItem);
    return this;
  }

   /**
   * Get rosCounts
   * @return rosCounts
  **/
  @javax.annotation.Nullable
  public List<ROSCounts> getRosCounts() {
    return rosCounts;
  }

  public void setRosCounts(List<ROSCounts> rosCounts) {
    this.rosCounts = rosCounts;
  }


  public Statistics serviceCost(Integer serviceCost) {
    this.serviceCost = serviceCost;
    return this;
  }

   /**
   * Get serviceCost
   * @return serviceCost
  **/
  @javax.annotation.Nullable
  public Integer getServiceCost() {
    return serviceCost;
  }

  public void setServiceCost(Integer serviceCost) {
    this.serviceCost = serviceCost;
  }


  public Statistics totalTimeouts(Integer totalTimeouts) {
    this.totalTimeouts = totalTimeouts;
    return this;
  }

   /**
   * Get totalTimeouts
   * @return totalTimeouts
  **/
  @javax.annotation.Nullable
  public Integer getTotalTimeouts() {
    return totalTimeouts;
  }

  public void setTotalTimeouts(Integer totalTimeouts) {
    this.totalTimeouts = totalTimeouts;
  }


  public Statistics totalTimeoutsHealthScore(Integer totalTimeoutsHealthScore) {
    this.totalTimeoutsHealthScore = totalTimeoutsHealthScore;
    return this;
  }

   /**
   * Get totalTimeoutsHealthScore
   * @return totalTimeoutsHealthScore
  **/
  @javax.annotation.Nullable
  public Integer getTotalTimeoutsHealthScore() {
    return totalTimeoutsHealthScore;
  }

  public void setTotalTimeoutsHealthScore(Integer totalTimeoutsHealthScore) {
    this.totalTimeoutsHealthScore = totalTimeoutsHealthScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statistics statistics = (Statistics) o;
    return Objects.equals(this.bulkLoad, statistics.bulkLoad) &&
        Objects.equals(this.cumulativeInvokeTime, statistics.cumulativeInvokeTime) &&
        Objects.equals(this.errorCount, statistics.errorCount) &&
        Objects.equals(this.errorCountHealthScore, statistics.errorCountHealthScore) &&
        Objects.equals(this.healthScore, statistics.healthScore) &&
        Objects.equals(this.invalidCount, statistics.invalidCount) &&
        Objects.equals(this.invokeCountHealthScore, statistics.invokeCountHealthScore) &&
        Objects.equals(this.invalidDataCountHealthScore, statistics.invalidDataCountHealthScore) &&
        Objects.equals(this.invokeCount, statistics.invokeCount) &&
        Objects.equals(this.newActiveConversation, statistics.newActiveConversation) &&
        Objects.equals(this.newConversation, statistics.newConversation) &&
        Objects.equals(this.rosCounts, statistics.rosCounts) &&
        Objects.equals(this.serviceCost, statistics.serviceCost) &&
        Objects.equals(this.totalTimeouts, statistics.totalTimeouts) &&
        Objects.equals(this.totalTimeoutsHealthScore, statistics.totalTimeoutsHealthScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkLoad, cumulativeInvokeTime, errorCount, errorCountHealthScore, healthScore, invalidCount, invokeCountHealthScore, invalidDataCountHealthScore, invokeCount, newActiveConversation, newConversation, rosCounts, serviceCost, totalTimeouts, totalTimeoutsHealthScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statistics {\n");
    sb.append("    bulkLoad: ").append(toIndentedString(bulkLoad)).append("\n");
    sb.append("    cumulativeInvokeTime: ").append(toIndentedString(cumulativeInvokeTime)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    errorCountHealthScore: ").append(toIndentedString(errorCountHealthScore)).append("\n");
    sb.append("    healthScore: ").append(toIndentedString(healthScore)).append("\n");
    sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
    sb.append("    invokeCountHealthScore: ").append(toIndentedString(invokeCountHealthScore)).append("\n");
    sb.append("    invalidDataCountHealthScore: ").append(toIndentedString(invalidDataCountHealthScore)).append("\n");
    sb.append("    invokeCount: ").append(toIndentedString(invokeCount)).append("\n");
    sb.append("    newActiveConversation: ").append(toIndentedString(newActiveConversation)).append("\n");
    sb.append("    newConversation: ").append(toIndentedString(newConversation)).append("\n");
    sb.append("    rosCounts: ").append(toIndentedString(rosCounts)).append("\n");
    sb.append("    serviceCost: ").append(toIndentedString(serviceCost)).append("\n");
    sb.append("    totalTimeouts: ").append(toIndentedString(totalTimeouts)).append("\n");
    sb.append("    totalTimeoutsHealthScore: ").append(toIndentedString(totalTimeoutsHealthScore)).append("\n");
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
    openapiFields.add("bulkLoad");
    openapiFields.add("cumulativeInvokeTime");
    openapiFields.add("errorCount");
    openapiFields.add("errorCountHealthScore");
    openapiFields.add("healthScore");
    openapiFields.add("invalidCount");
    openapiFields.add("invokeCountHealthScore");
    openapiFields.add("invalidDataCountHealthScore");
    openapiFields.add("invokeCount");
    openapiFields.add("newActiveConversation");
    openapiFields.add("newConversation");
    openapiFields.add("rosCounts");
    openapiFields.add("serviceCost");
    openapiFields.add("totalTimeouts");
    openapiFields.add("totalTimeoutsHealthScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Statistics
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Statistics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Statistics is not found in the empty JSON string", Statistics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Statistics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Statistics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("rosCounts") != null && !jsonObj.get("rosCounts").isJsonNull()) {
        JsonArray jsonArrayrosCounts = jsonObj.getAsJsonArray("rosCounts");
        if (jsonArrayrosCounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rosCounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rosCounts` to be an array in the JSON string but got `%s`", jsonObj.get("rosCounts").toString()));
          }

          // validate the optional field `rosCounts` (array)
          for (int i = 0; i < jsonArrayrosCounts.size(); i++) {
            ROSCounts.validateJsonElement(jsonArrayrosCounts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Statistics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Statistics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Statistics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Statistics.class));

       return (TypeAdapter<T>) new TypeAdapter<Statistics>() {
           @Override
           public void write(JsonWriter out, Statistics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Statistics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Statistics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Statistics
  * @throws IOException if the JSON string is invalid with respect to Statistics
  */
  public static Statistics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Statistics.class);
  }

 /**
  * Convert an instance of Statistics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

