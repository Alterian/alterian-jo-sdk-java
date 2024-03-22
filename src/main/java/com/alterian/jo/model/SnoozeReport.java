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
import com.alterian.jo.model.TargetEnum;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * SnoozeReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SnoozeReport {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private TargetEnum target;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DAYS_BEFORE_SNOOZE = "daysBeforeSnooze";
  @SerializedName(SERIALIZED_NAME_DAYS_BEFORE_SNOOZE)
  private BigDecimal daysBeforeSnooze;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private List<String> reason;

  public SnoozeReport() {
  }

  public SnoozeReport name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SnoozeReport target(TargetEnum target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  public TargetEnum getTarget() {
    return target;
  }

  public void setTarget(TargetEnum target) {
    this.target = target;
  }


  public SnoozeReport client(String client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }


  public SnoozeReport url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public SnoozeReport daysBeforeSnooze(BigDecimal daysBeforeSnooze) {
    this.daysBeforeSnooze = daysBeforeSnooze;
    return this;
  }

   /**
   * Get daysBeforeSnooze
   * @return daysBeforeSnooze
  **/
  @javax.annotation.Nullable
  public BigDecimal getDaysBeforeSnooze() {
    return daysBeforeSnooze;
  }

  public void setDaysBeforeSnooze(BigDecimal daysBeforeSnooze) {
    this.daysBeforeSnooze = daysBeforeSnooze;
  }


  public SnoozeReport reason(List<String> reason) {
    this.reason = reason;
    return this;
  }

  public SnoozeReport addReasonItem(String reasonItem) {
    if (this.reason == null) {
      this.reason = new ArrayList<>();
    }
    this.reason.add(reasonItem);
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  public List<String> getReason() {
    return reason;
  }

  public void setReason(List<String> reason) {
    this.reason = reason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnoozeReport snoozeReport = (SnoozeReport) o;
    return Objects.equals(this.name, snoozeReport.name) &&
        Objects.equals(this.target, snoozeReport.target) &&
        Objects.equals(this.client, snoozeReport.client) &&
        Objects.equals(this.url, snoozeReport.url) &&
        Objects.equals(this.daysBeforeSnooze, snoozeReport.daysBeforeSnooze) &&
        Objects.equals(this.reason, snoozeReport.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, target, client, url, daysBeforeSnooze, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnoozeReport {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    daysBeforeSnooze: ").append(toIndentedString(daysBeforeSnooze)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("target");
    openapiFields.add("client");
    openapiFields.add("url");
    openapiFields.add("daysBeforeSnooze");
    openapiFields.add("reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SnoozeReport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SnoozeReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SnoozeReport is not found in the empty JSON string", SnoozeReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SnoozeReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SnoozeReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `target`
      if (jsonObj.get("target") != null && !jsonObj.get("target").isJsonNull()) {
        TargetEnum.validateJsonElement(jsonObj.get("target"));
      }
      if ((jsonObj.get("client") != null && !jsonObj.get("client").isJsonNull()) && !jsonObj.get("client").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull() && !jsonObj.get("reason").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be an array in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SnoozeReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SnoozeReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SnoozeReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SnoozeReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SnoozeReport>() {
           @Override
           public void write(JsonWriter out, SnoozeReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SnoozeReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SnoozeReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SnoozeReport
  * @throws IOException if the JSON string is invalid with respect to SnoozeReport
  */
  public static SnoozeReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SnoozeReport.class);
  }

 /**
  * Convert an instance of SnoozeReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
