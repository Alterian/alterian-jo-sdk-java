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
 * FieldUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class FieldUsage {
  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private String step;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private String other;

  public FieldUsage() {
  }

  public FieldUsage step(String step) {
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @javax.annotation.Nullable
  public String getStep() {
    return step;
  }

  public void setStep(String step) {
    this.step = step;
  }


  public FieldUsage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public FieldUsage action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }


  public FieldUsage other(String other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nullable
  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldUsage fieldUsage = (FieldUsage) o;
    return Objects.equals(this.step, fieldUsage.step) &&
        Objects.equals(this.type, fieldUsage.type) &&
        Objects.equals(this.action, fieldUsage.action) &&
        Objects.equals(this.other, fieldUsage.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, type, action, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldUsage {\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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
    openapiFields.add("step");
    openapiFields.add("type");
    openapiFields.add("action");
    openapiFields.add("other");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FieldUsage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FieldUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldUsage is not found in the empty JSON string", FieldUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FieldUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldUsage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("step") != null && !jsonObj.get("step").isJsonNull()) && !jsonObj.get("step").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `step` to be a primitive type in the JSON string but got `%s`", jsonObj.get("step").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("other") != null && !jsonObj.get("other").isJsonNull()) && !jsonObj.get("other").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `other` to be a primitive type in the JSON string but got `%s`", jsonObj.get("other").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldUsage>() {
           @Override
           public void write(JsonWriter out, FieldUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldUsage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FieldUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldUsage
  * @throws IOException if the JSON string is invalid with respect to FieldUsage
  */
  public static FieldUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldUsage.class);
  }

 /**
  * Convert an instance of FieldUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
