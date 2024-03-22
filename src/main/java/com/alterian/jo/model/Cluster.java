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
import java.time.OffsetDateTime;
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
 * Cluster
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class Cluster {
  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_PUBLIC_IP = "public_ip";
  @SerializedName(SERIALIZED_NAME_PUBLIC_IP)
  private String publicIp;

  public static final String SERIALIZED_NAME_LAST_SEEN = "lastSeen";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN)
  private OffsetDateTime lastSeen;

  public static final String SERIALIZED_NAME_RESTART_COUNT = "restartCount";
  @SerializedName(SERIALIZED_NAME_RESTART_COUNT)
  private Integer restartCount;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_FIRST_DOWN_TIME = "firstDownTime";
  @SerializedName(SERIALIZED_NAME_FIRST_DOWN_TIME)
  private String firstDownTime;

  public static final String SERIALIZED_NAME_NODE_DESCRIPTION = "nodeDescription";
  @SerializedName(SERIALIZED_NAME_NODE_DESCRIPTION)
  private String nodeDescription;

  public static final String SERIALIZED_NAME_REPORTED_BY = "reportedBy";
  @SerializedName(SERIALIZED_NAME_REPORTED_BY)
  private String reportedBy;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CONSISTENCY = "consistency";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY)
  private String consistency;

  public static final String SERIALIZED_NAME_BOOTSTRAP_VERSION = "bootstrapVersion";
  @SerializedName(SERIALIZED_NAME_BOOTSTRAP_VERSION)
  private Integer bootstrapVersion;

  public Cluster() {
  }

  public Cluster nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @javax.annotation.Nullable
  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public Cluster publicIp(String publicIp) {
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


  public Cluster lastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
  }


  public Cluster restartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return this;
  }

   /**
   * Get restartCount
   * @return restartCount
  **/
  @javax.annotation.Nullable
  public Integer getRestartCount() {
    return restartCount;
  }

  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }


  public Cluster host(String host) {
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


  public Cluster state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Cluster firstDownTime(String firstDownTime) {
    this.firstDownTime = firstDownTime;
    return this;
  }

   /**
   * Get firstDownTime
   * @return firstDownTime
  **/
  @javax.annotation.Nullable
  public String getFirstDownTime() {
    return firstDownTime;
  }

  public void setFirstDownTime(String firstDownTime) {
    this.firstDownTime = firstDownTime;
  }


  public Cluster nodeDescription(String nodeDescription) {
    this.nodeDescription = nodeDescription;
    return this;
  }

   /**
   * Get nodeDescription
   * @return nodeDescription
  **/
  @javax.annotation.Nullable
  public String getNodeDescription() {
    return nodeDescription;
  }

  public void setNodeDescription(String nodeDescription) {
    this.nodeDescription = nodeDescription;
  }


  public Cluster reportedBy(String reportedBy) {
    this.reportedBy = reportedBy;
    return this;
  }

   /**
   * Get reportedBy
   * @return reportedBy
  **/
  @javax.annotation.Nullable
  public String getReportedBy() {
    return reportedBy;
  }

  public void setReportedBy(String reportedBy) {
    this.reportedBy = reportedBy;
  }


  public Cluster version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The version number of the instance
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public Cluster consistency(String consistency) {
    this.consistency = consistency;
    return this;
  }

   /**
   * Get consistency
   * @return consistency
  **/
  @javax.annotation.Nullable
  public String getConsistency() {
    return consistency;
  }

  public void setConsistency(String consistency) {
    this.consistency = consistency;
  }


  public Cluster bootstrapVersion(Integer bootstrapVersion) {
    this.bootstrapVersion = bootstrapVersion;
    return this;
  }

   /**
   * Get bootstrapVersion
   * @return bootstrapVersion
  **/
  @javax.annotation.Nullable
  public Integer getBootstrapVersion() {
    return bootstrapVersion;
  }

  public void setBootstrapVersion(Integer bootstrapVersion) {
    this.bootstrapVersion = bootstrapVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cluster cluster = (Cluster) o;
    return Objects.equals(this.nodeName, cluster.nodeName) &&
        Objects.equals(this.publicIp, cluster.publicIp) &&
        Objects.equals(this.lastSeen, cluster.lastSeen) &&
        Objects.equals(this.restartCount, cluster.restartCount) &&
        Objects.equals(this.host, cluster.host) &&
        Objects.equals(this.state, cluster.state) &&
        Objects.equals(this.firstDownTime, cluster.firstDownTime) &&
        Objects.equals(this.nodeDescription, cluster.nodeDescription) &&
        Objects.equals(this.reportedBy, cluster.reportedBy) &&
        Objects.equals(this.version, cluster.version) &&
        Objects.equals(this.consistency, cluster.consistency) &&
        Objects.equals(this.bootstrapVersion, cluster.bootstrapVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeName, publicIp, lastSeen, restartCount, host, state, firstDownTime, nodeDescription, reportedBy, version, consistency, bootstrapVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cluster {\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    firstDownTime: ").append(toIndentedString(firstDownTime)).append("\n");
    sb.append("    nodeDescription: ").append(toIndentedString(nodeDescription)).append("\n");
    sb.append("    reportedBy: ").append(toIndentedString(reportedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
    sb.append("    bootstrapVersion: ").append(toIndentedString(bootstrapVersion)).append("\n");
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
    openapiFields.add("nodeName");
    openapiFields.add("public_ip");
    openapiFields.add("lastSeen");
    openapiFields.add("restartCount");
    openapiFields.add("host");
    openapiFields.add("state");
    openapiFields.add("firstDownTime");
    openapiFields.add("nodeDescription");
    openapiFields.add("reportedBy");
    openapiFields.add("version");
    openapiFields.add("consistency");
    openapiFields.add("bootstrapVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Cluster
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Cluster.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Cluster is not found in the empty JSON string", Cluster.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Cluster.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Cluster` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("nodeName") != null && !jsonObj.get("nodeName").isJsonNull()) && !jsonObj.get("nodeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeName").toString()));
      }
      if ((jsonObj.get("public_ip") != null && !jsonObj.get("public_ip").isJsonNull()) && !jsonObj.get("public_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_ip").toString()));
      }
      if ((jsonObj.get("host") != null && !jsonObj.get("host").isJsonNull()) && !jsonObj.get("host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("host").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("firstDownTime") != null && !jsonObj.get("firstDownTime").isJsonNull()) && !jsonObj.get("firstDownTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstDownTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstDownTime").toString()));
      }
      if ((jsonObj.get("nodeDescription") != null && !jsonObj.get("nodeDescription").isJsonNull()) && !jsonObj.get("nodeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeDescription").toString()));
      }
      if ((jsonObj.get("reportedBy") != null && !jsonObj.get("reportedBy").isJsonNull()) && !jsonObj.get("reportedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reportedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reportedBy").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("consistency") != null && !jsonObj.get("consistency").isJsonNull()) && !jsonObj.get("consistency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consistency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consistency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Cluster.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Cluster' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Cluster> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Cluster.class));

       return (TypeAdapter<T>) new TypeAdapter<Cluster>() {
           @Override
           public void write(JsonWriter out, Cluster value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Cluster read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Cluster given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Cluster
  * @throws IOException if the JSON string is invalid with respect to Cluster
  */
  public static Cluster fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Cluster.class);
  }

 /**
  * Convert an instance of Cluster to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
