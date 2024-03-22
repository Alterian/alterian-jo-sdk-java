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
import com.alterian.jo.model.QueueBackendEnum;
import com.alterian.jo.model.QueueField;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * QueueDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class QueueDetails {
  public static final String SERIALIZED_NAME_FIFO = "fifo";
  @SerializedName(SERIALIZED_NAME_FIFO)
  private Boolean fifo;

  public static final String SERIALIZED_NAME_QUEUE_BACKEND = "queueBackend";
  @SerializedName(SERIALIZED_NAME_QUEUE_BACKEND)
  private QueueBackendEnum queueBackend;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private Map<String, List<QueueField>> schema = new HashMap<>();

  public QueueDetails() {
  }

  public QueueDetails fifo(Boolean fifo) {
    this.fifo = fifo;
    return this;
  }

   /**
   * Get fifo
   * @return fifo
  **/
  @javax.annotation.Nullable
  public Boolean getFifo() {
    return fifo;
  }

  public void setFifo(Boolean fifo) {
    this.fifo = fifo;
  }


  public QueueDetails queueBackend(QueueBackendEnum queueBackend) {
    this.queueBackend = queueBackend;
    return this;
  }

   /**
   * Get queueBackend
   * @return queueBackend
  **/
  @javax.annotation.Nullable
  public QueueBackendEnum getQueueBackend() {
    return queueBackend;
  }

  public void setQueueBackend(QueueBackendEnum queueBackend) {
    this.queueBackend = queueBackend;
  }


  public QueueDetails schema(Map<String, List<QueueField>> schema) {
    this.schema = schema;
    return this;
  }

  public QueueDetails putSchemaItem(String key, List<QueueField> schemaItem) {
    if (this.schema == null) {
      this.schema = new HashMap<>();
    }
    this.schema.put(key, schemaItem);
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @javax.annotation.Nullable
  public Map<String, List<QueueField>> getSchema() {
    return schema;
  }

  public void setSchema(Map<String, List<QueueField>> schema) {
    this.schema = schema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueDetails queueDetails = (QueueDetails) o;
    return Objects.equals(this.fifo, queueDetails.fifo) &&
        Objects.equals(this.queueBackend, queueDetails.queueBackend) &&
        Objects.equals(this.schema, queueDetails.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fifo, queueBackend, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueDetails {\n");
    sb.append("    fifo: ").append(toIndentedString(fifo)).append("\n");
    sb.append("    queueBackend: ").append(toIndentedString(queueBackend)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
    openapiFields.add("fifo");
    openapiFields.add("queueBackend");
    openapiFields.add("schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QueueDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QueueDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueueDetails is not found in the empty JSON string", QueueDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QueueDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueueDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `queueBackend`
      if (jsonObj.get("queueBackend") != null && !jsonObj.get("queueBackend").isJsonNull()) {
        QueueBackendEnum.validateJsonElement(jsonObj.get("queueBackend"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueueDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueueDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueueDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueueDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<QueueDetails>() {
           @Override
           public void write(JsonWriter out, QueueDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueueDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueueDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueueDetails
  * @throws IOException if the JSON string is invalid with respect to QueueDetails
  */
  public static QueueDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueueDetails.class);
  }

 /**
  * Convert an instance of QueueDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
