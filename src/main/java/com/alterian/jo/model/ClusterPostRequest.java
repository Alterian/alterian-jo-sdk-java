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
 * ClusterPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ClusterPostRequest {
  public static final String SERIALIZED_NAME_BOOTSTRAP_VERSION = "bootstrapVersion";
  @SerializedName(SERIALIZED_NAME_BOOTSTRAP_VERSION)
  private Integer bootstrapVersion;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_PUBLIC_IP = "public_ip";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public ClusterPostRequest() {
  }

  public ClusterPostRequest bootstrapVersion(Integer bootstrapVersion) {
    this.bootstrapVersion = bootstrapVersion;
    return this;
  }

   /**
   * When adding a new node, pass this as 0
   * @return bootstrapVersion
  **/
  @javax.annotation.Nullable
  public Integer getBootstrapVersion() {
    return bootstrapVersion;
  }

  public void setBootstrapVersion(Integer bootstrapVersion) {
    this.bootstrapVersion = bootstrapVersion;
  }


  public ClusterPostRequest host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The internal ip address of the new instance
   * @return host
  **/
  @javax.annotation.Nullable
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }


  public ClusterPostRequest publicIp(String publicIp) {
    this.publicIp = publicIp;
    return this;
  }

   /**
   * The public ip of the new instance
   * @return publicIp
  **/
  @javax.annotation.Nullable
  public String getPublicIp() {
    return publicIp;
  }

  public void setPublicIp(String publicIp) {
    this.publicIp = publicIp;
  }


  public ClusterPostRequest version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version number of the new instance
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterPostRequest clusterPostRequest = (ClusterPostRequest) o;
    return Objects.equals(this.bootstrapVersion, clusterPostRequest.bootstrapVersion) &&
        Objects.equals(this.host, clusterPostRequest.host) &&
        Objects.equals(this.publicIp, clusterPostRequest.publicIp) &&
        Objects.equals(this.version, clusterPostRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootstrapVersion, host, publicIp, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterPostRequest {\n");
    sb.append("    bootstrapVersion: ").append(toIndentedString(bootstrapVersion)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("bootstrapVersion");
    openapiFields.add("host");
    openapiFields.add("public_ip");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ClusterPostRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClusterPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClusterPostRequest is not found in the empty JSON string", ClusterPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClusterPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClusterPostRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if ((jsonObj.get("public_ip") != null && !jsonObj.get("public_ip").isJsonNull()) && !jsonObj.get("public_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_ip").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClusterPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClusterPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClusterPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClusterPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ClusterPostRequest>() {
           @Override
           public void write(JsonWriter out, ClusterPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClusterPostRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClusterPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClusterPostRequest
  * @throws IOException if the JSON string is invalid with respect to ClusterPostRequest
  */
  public static ClusterPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClusterPostRequest.class);
  }

 /**
  * Convert an instance of ClusterPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
