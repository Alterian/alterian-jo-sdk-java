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
 * Role
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class Role {
  public static final String SERIALIZED_NAME_LAST_MODIFIED_DATE = "lastModifiedDate";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_DATE)
  private String lastModifiedDate;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_USER = "lastModifiedUser";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_USER)
  private String lastModifiedUser;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private Boolean system;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions;

  public Role() {
  }

  public Role lastModifiedDate(String lastModifiedDate) {
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


  public Role lastModifiedUser(String lastModifiedUser) {
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


  public Role name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name of this role
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Role system(Boolean system) {
    this.system = system;
    return this;
  }

   /**
   * Is this a system role?
   * @return system
  **/
  @javax.annotation.Nullable
  public Boolean getSystem() {
    return system;
  }

  public void setSystem(Boolean system) {
    this.system = system;
  }


  public Role permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public Role addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The names of the permissions that a user will be granted if they have this role
   * @return permissions
  **/
  @javax.annotation.Nullable
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.lastModifiedDate, role.lastModifiedDate) &&
        Objects.equals(this.lastModifiedUser, role.lastModifiedUser) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.system, role.system) &&
        Objects.equals(this.permissions, role.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModifiedDate, lastModifiedUser, name, system, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("system");
    openapiFields.add("permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Role
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Role.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Role is not found in the empty JSON string", Role.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Role.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Role` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lastModifiedDate") != null && !jsonObj.get("lastModifiedDate").isJsonNull()) && !jsonObj.get("lastModifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedDate").toString()));
      }
      if ((jsonObj.get("lastModifiedUser") != null && !jsonObj.get("lastModifiedUser").isJsonNull()) && !jsonObj.get("lastModifiedUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedUser").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull() && !jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Role.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Role' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Role> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Role.class));

       return (TypeAdapter<T>) new TypeAdapter<Role>() {
           @Override
           public void write(JsonWriter out, Role value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Role read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Role given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Role
  * @throws IOException if the JSON string is invalid with respect to Role
  */
  public static Role fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Role.class);
  }

 /**
  * Convert an instance of Role to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

