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
import com.alterian.jo.model.QuotaUsageHistory;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * LicenseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class LicenseData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  public static final String SERIALIZED_NAME_HAS_AVAILABLE_QUOTA = "hasAvailableQuota";
  @SerializedName(SERIALIZED_NAME_HAS_AVAILABLE_QUOTA)
  private Boolean hasAvailableQuota;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_CONVERSATION_QUOTA_USED = "conversationQuotaUsed";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_QUOTA_USED)
  private Integer conversationQuotaUsed;

  public static final String SERIALIZED_NAME_CONVERSATION_QUOTA = "conversationQuota";
  @SerializedName(SERIALIZED_NAME_CONVERSATION_QUOTA)
  private Integer conversationQuota;

  public static final String SERIALIZED_NAME_BLOCK_OVERAGE = "blockOverage";
  @SerializedName(SERIALIZED_NAME_BLOCK_OVERAGE)
  private Boolean blockOverage;

  public static final String SERIALIZED_NAME_QUOTA_USAGE_HISTORY = "quotaUsageHistory";
  @SerializedName(SERIALIZED_NAME_QUOTA_USAGE_HISTORY)
  private List<QuotaUsageHistory> quotaUsageHistory;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_IS_ACTIVE = "isActive";
  @SerializedName(SERIALIZED_NAME_IS_ACTIVE)
  private Boolean isActive;

  public LicenseData() {
  }

  public LicenseData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the license
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public LicenseData client(String client) {
    this.client = client;
    return this;
  }

   /**
   * Name of the license client
   * @return client
  **/
  @javax.annotation.Nonnull
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }


  public LicenseData hasAvailableQuota(Boolean hasAvailableQuota) {
    this.hasAvailableQuota = hasAvailableQuota;
    return this;
  }

   /**
   * Has available quota remaining
   * @return hasAvailableQuota
  **/
  @javax.annotation.Nullable
  public Boolean getHasAvailableQuota() {
    return hasAvailableQuota;
  }

  public void setHasAvailableQuota(Boolean hasAvailableQuota) {
    this.hasAvailableQuota = hasAvailableQuota;
  }


  public LicenseData startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the license
   * @return startDate
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public LicenseData endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the license
   * @return endDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public LicenseData conversationQuotaUsed(Integer conversationQuotaUsed) {
    this.conversationQuotaUsed = conversationQuotaUsed;
    return this;
  }

   /**
   * Current conversation quota used
   * @return conversationQuotaUsed
  **/
  @javax.annotation.Nonnull
  public Integer getConversationQuotaUsed() {
    return conversationQuotaUsed;
  }

  public void setConversationQuotaUsed(Integer conversationQuotaUsed) {
    this.conversationQuotaUsed = conversationQuotaUsed;
  }


  public LicenseData conversationQuota(Integer conversationQuota) {
    this.conversationQuota = conversationQuota;
    return this;
  }

   /**
   * Conversation quota
   * @return conversationQuota
  **/
  @javax.annotation.Nonnull
  public Integer getConversationQuota() {
    return conversationQuota;
  }

  public void setConversationQuota(Integer conversationQuota) {
    this.conversationQuota = conversationQuota;
  }


  public LicenseData blockOverage(Boolean blockOverage) {
    this.blockOverage = blockOverage;
    return this;
  }

   /**
   * Does this license block overage once quota has been reached?
   * @return blockOverage
  **/
  @javax.annotation.Nonnull
  public Boolean getBlockOverage() {
    return blockOverage;
  }

  public void setBlockOverage(Boolean blockOverage) {
    this.blockOverage = blockOverage;
  }


  public LicenseData quotaUsageHistory(List<QuotaUsageHistory> quotaUsageHistory) {
    this.quotaUsageHistory = quotaUsageHistory;
    return this;
  }

  public LicenseData addQuotaUsageHistoryItem(QuotaUsageHistory quotaUsageHistoryItem) {
    if (this.quotaUsageHistory == null) {
      this.quotaUsageHistory = new ArrayList<>();
    }
    this.quotaUsageHistory.add(quotaUsageHistoryItem);
    return this;
  }

   /**
   * History of quota usage
   * @return quotaUsageHistory
  **/
  @javax.annotation.Nullable
  public List<QuotaUsageHistory> getQuotaUsageHistory() {
    return quotaUsageHistory;
  }

  public void setQuotaUsageHistory(List<QuotaUsageHistory> quotaUsageHistory) {
    this.quotaUsageHistory = quotaUsageHistory;
  }


  public LicenseData signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * License signature
   * @return signature
  **/
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  public LicenseData isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @javax.annotation.Nonnull
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseData licenseData = (LicenseData) o;
    return Objects.equals(this.name, licenseData.name) &&
        Objects.equals(this.client, licenseData.client) &&
        Objects.equals(this.hasAvailableQuota, licenseData.hasAvailableQuota) &&
        Objects.equals(this.startDate, licenseData.startDate) &&
        Objects.equals(this.endDate, licenseData.endDate) &&
        Objects.equals(this.conversationQuotaUsed, licenseData.conversationQuotaUsed) &&
        Objects.equals(this.conversationQuota, licenseData.conversationQuota) &&
        Objects.equals(this.blockOverage, licenseData.blockOverage) &&
        Objects.equals(this.quotaUsageHistory, licenseData.quotaUsageHistory) &&
        Objects.equals(this.signature, licenseData.signature) &&
        Objects.equals(this.isActive, licenseData.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, client, hasAvailableQuota, startDate, endDate, conversationQuotaUsed, conversationQuota, blockOverage, quotaUsageHistory, signature, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    hasAvailableQuota: ").append(toIndentedString(hasAvailableQuota)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    conversationQuotaUsed: ").append(toIndentedString(conversationQuotaUsed)).append("\n");
    sb.append("    conversationQuota: ").append(toIndentedString(conversationQuota)).append("\n");
    sb.append("    blockOverage: ").append(toIndentedString(blockOverage)).append("\n");
    sb.append("    quotaUsageHistory: ").append(toIndentedString(quotaUsageHistory)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
    openapiFields.add("client");
    openapiFields.add("hasAvailableQuota");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("conversationQuotaUsed");
    openapiFields.add("conversationQuota");
    openapiFields.add("blockOverage");
    openapiFields.add("quotaUsageHistory");
    openapiFields.add("signature");
    openapiFields.add("isActive");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("client");
    openapiRequiredFields.add("startDate");
    openapiRequiredFields.add("conversationQuotaUsed");
    openapiRequiredFields.add("conversationQuota");
    openapiRequiredFields.add("blockOverage");
    openapiRequiredFields.add("isActive");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LicenseData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LicenseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LicenseData is not found in the empty JSON string", LicenseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LicenseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LicenseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LicenseData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("client").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client").toString()));
      }
      if (jsonObj.get("quotaUsageHistory") != null && !jsonObj.get("quotaUsageHistory").isJsonNull()) {
        JsonArray jsonArrayquotaUsageHistory = jsonObj.getAsJsonArray("quotaUsageHistory");
        if (jsonArrayquotaUsageHistory != null) {
          // ensure the json data is an array
          if (!jsonObj.get("quotaUsageHistory").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `quotaUsageHistory` to be an array in the JSON string but got `%s`", jsonObj.get("quotaUsageHistory").toString()));
          }

          // validate the optional field `quotaUsageHistory` (array)
          for (int i = 0; i < jsonArrayquotaUsageHistory.size(); i++) {
            QuotaUsageHistory.validateJsonElement(jsonArrayquotaUsageHistory.get(i));
          };
        }
      }
      if ((jsonObj.get("signature") != null && !jsonObj.get("signature").isJsonNull()) && !jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LicenseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LicenseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LicenseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LicenseData.class));

       return (TypeAdapter<T>) new TypeAdapter<LicenseData>() {
           @Override
           public void write(JsonWriter out, LicenseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LicenseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LicenseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LicenseData
  * @throws IOException if the JSON string is invalid with respect to LicenseData
  */
  public static LicenseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LicenseData.class);
  }

 /**
  * Convert an instance of LicenseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

