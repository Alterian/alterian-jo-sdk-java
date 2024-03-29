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
 * Site
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class Site {
  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private String lastModifiedDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_USER = "lastModifiedUser";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_USER)
  private String lastModifiedUser;

  public static final String SERIALIZED_NAME_SITE_ID = "siteId";
  @SerializedName(SERIALIZED_NAME_SITE_ID)
  private String siteId;

  public static final String SERIALIZED_NAME_EXTENDED_INFO = "extendedInfo";
  @SerializedName(SERIALIZED_NAME_EXTENDED_INFO)
  private String extendedInfo;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<String> users;

  public Site() {
  }

  public Site lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * When was this object last modified? Timestamp in ISO-8601 format
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public Site lastModifiedUser(String lastModifiedUser) {
    this.lastModifiedUser = lastModifiedUser;
    return this;
  }

   /**
   * What is the name of the user who last modified this object?
   * @return lastModifiedUser
  **/
  @javax.annotation.Nullable
  public String getLastModifiedUser() {
    return lastModifiedUser;
  }

  public void setLastModifiedUser(String lastModifiedUser) {
    this.lastModifiedUser = lastModifiedUser;
  }


  public Site siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

   /**
   * A UUID to uniquely identify this site
   * @return siteId
  **/
  @javax.annotation.Nullable
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }


  public Site extendedInfo(String extendedInfo) {
    this.extendedInfo = extendedInfo;
    return this;
  }

   /**
   * Additional site-specific information
   * @return extendedInfo
  **/
  @javax.annotation.Nullable
  public String getExtendedInfo() {
    return extendedInfo;
  }

  public void setExtendedInfo(String extendedInfo) {
    this.extendedInfo = extendedInfo;
  }


  public Site users(List<String> users) {
    this.users = users;
    return this;
  }

  public Site addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @javax.annotation.Nullable
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Site site = (Site) o;
    return Objects.equals(this.lastModifiedDate, site.lastModifiedDate) &&
        Objects.equals(this.lastModifiedUser, site.lastModifiedUser) &&
        Objects.equals(this.siteId, site.siteId) &&
        Objects.equals(this.extendedInfo, site.extendedInfo) &&
        Objects.equals(this.users, site.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModifiedDate, lastModifiedUser, siteId, extendedInfo, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    extendedInfo: ").append(toIndentedString(extendedInfo)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
    openapiFields.add("lastModifiedDate");
    openapiFields.add("lastModifiedUser");
    openapiFields.add("siteId");
    openapiFields.add("extendedInfo");
    openapiFields.add("users");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Site
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Site.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Site is not found in the empty JSON string", Site.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Site.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Site` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lastModifiedDate") != null && !jsonObj.get("lastModifiedDate").isJsonNull()) && !jsonObj.get("lastModifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedDate").toString()));
      }
      if ((jsonObj.get("lastModifiedUser") != null && !jsonObj.get("lastModifiedUser").isJsonNull()) && !jsonObj.get("lastModifiedUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedUser").toString()));
      }
      if ((jsonObj.get("siteId") != null && !jsonObj.get("siteId").isJsonNull()) && !jsonObj.get("siteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `siteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("siteId").toString()));
      }
      if ((jsonObj.get("extendedInfo") != null && !jsonObj.get("extendedInfo").isJsonNull()) && !jsonObj.get("extendedInfo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extendedInfo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extendedInfo").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull() && !jsonObj.get("users").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Site.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Site' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Site> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Site.class));

       return (TypeAdapter<T>) new TypeAdapter<Site>() {
           @Override
           public void write(JsonWriter out, Site value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Site read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Site given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Site
  * @throws IOException if the JSON string is invalid with respect to Site
  */
  public static Site fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Site.class);
  }

 /**
  * Convert an instance of Site to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

