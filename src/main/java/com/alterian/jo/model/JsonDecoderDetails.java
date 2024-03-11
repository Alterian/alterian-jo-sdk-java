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
import com.alterian.jo.model.JsonDecoderField;
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
 * JsonDecoderDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class JsonDecoderDetails {
  public static final String SERIALIZED_NAME_EXPAND_SIZE_ONE_ARRAYS = "expandSizeOneArrays";
  @SerializedName(SERIALIZED_NAME_EXPAND_SIZE_ONE_ARRAYS)
  private Boolean expandSizeOneArrays;

  public static final String SERIALIZED_NAME_FIELD_TO_DECODE = "fieldToDecode";
  @SerializedName(SERIALIZED_NAME_FIELD_TO_DECODE)
  private String fieldToDecode;

  public static final String SERIALIZED_NAME_STEP_NAME = "stepName";
  @SerializedName(SERIALIZED_NAME_STEP_NAME)
  private String stepName;

  public static final String SERIALIZED_NAME_DELIMITER = "delimiter";
  @SerializedName(SERIALIZED_NAME_DELIMITER)
  private String delimiter;

  public static final String SERIALIZED_NAME_FLATTEN_MULTIPLE_ROWS = "flattenMultipleRows";
  @SerializedName(SERIALIZED_NAME_FLATTEN_MULTIPLE_ROWS)
  private Boolean flattenMultipleRows;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<JsonDecoderField> fields;

  public static final String SERIALIZED_NAME_PARSE_AS_NAME_VALUE = "parseAsNameValue";
  @SerializedName(SERIALIZED_NAME_PARSE_AS_NAME_VALUE)
  private Boolean parseAsNameValue;

  public JsonDecoderDetails() {
  }

  public JsonDecoderDetails expandSizeOneArrays(Boolean expandSizeOneArrays) {
    this.expandSizeOneArrays = expandSizeOneArrays;
    return this;
  }

   /**
   * Get expandSizeOneArrays
   * @return expandSizeOneArrays
  **/
  @javax.annotation.Nullable
  public Boolean getExpandSizeOneArrays() {
    return expandSizeOneArrays;
  }

  public void setExpandSizeOneArrays(Boolean expandSizeOneArrays) {
    this.expandSizeOneArrays = expandSizeOneArrays;
  }


  public JsonDecoderDetails fieldToDecode(String fieldToDecode) {
    this.fieldToDecode = fieldToDecode;
    return this;
  }

   /**
   * Get fieldToDecode
   * @return fieldToDecode
  **/
  @javax.annotation.Nullable
  public String getFieldToDecode() {
    return fieldToDecode;
  }

  public void setFieldToDecode(String fieldToDecode) {
    this.fieldToDecode = fieldToDecode;
  }


  public JsonDecoderDetails stepName(String stepName) {
    this.stepName = stepName;
    return this;
  }

   /**
   * Get stepName
   * @return stepName
  **/
  @javax.annotation.Nullable
  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) {
    this.stepName = stepName;
  }


  public JsonDecoderDetails delimiter(String delimiter) {
    this.delimiter = delimiter;
    return this;
  }

   /**
   * Get delimiter
   * @return delimiter
  **/
  @javax.annotation.Nullable
  public String getDelimiter() {
    return delimiter;
  }

  public void setDelimiter(String delimiter) {
    this.delimiter = delimiter;
  }


  public JsonDecoderDetails flattenMultipleRows(Boolean flattenMultipleRows) {
    this.flattenMultipleRows = flattenMultipleRows;
    return this;
  }

   /**
   * Get flattenMultipleRows
   * @return flattenMultipleRows
  **/
  @javax.annotation.Nullable
  public Boolean getFlattenMultipleRows() {
    return flattenMultipleRows;
  }

  public void setFlattenMultipleRows(Boolean flattenMultipleRows) {
    this.flattenMultipleRows = flattenMultipleRows;
  }


  public JsonDecoderDetails fields(List<JsonDecoderField> fields) {
    this.fields = fields;
    return this;
  }

  public JsonDecoderDetails addFieldsItem(JsonDecoderField fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  public List<JsonDecoderField> getFields() {
    return fields;
  }

  public void setFields(List<JsonDecoderField> fields) {
    this.fields = fields;
  }


  public JsonDecoderDetails parseAsNameValue(Boolean parseAsNameValue) {
    this.parseAsNameValue = parseAsNameValue;
    return this;
  }

   /**
   * Get parseAsNameValue
   * @return parseAsNameValue
  **/
  @javax.annotation.Nullable
  public Boolean getParseAsNameValue() {
    return parseAsNameValue;
  }

  public void setParseAsNameValue(Boolean parseAsNameValue) {
    this.parseAsNameValue = parseAsNameValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonDecoderDetails jsonDecoderDetails = (JsonDecoderDetails) o;
    return Objects.equals(this.expandSizeOneArrays, jsonDecoderDetails.expandSizeOneArrays) &&
        Objects.equals(this.fieldToDecode, jsonDecoderDetails.fieldToDecode) &&
        Objects.equals(this.stepName, jsonDecoderDetails.stepName) &&
        Objects.equals(this.delimiter, jsonDecoderDetails.delimiter) &&
        Objects.equals(this.flattenMultipleRows, jsonDecoderDetails.flattenMultipleRows) &&
        Objects.equals(this.fields, jsonDecoderDetails.fields) &&
        Objects.equals(this.parseAsNameValue, jsonDecoderDetails.parseAsNameValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expandSizeOneArrays, fieldToDecode, stepName, delimiter, flattenMultipleRows, fields, parseAsNameValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonDecoderDetails {\n");
    sb.append("    expandSizeOneArrays: ").append(toIndentedString(expandSizeOneArrays)).append("\n");
    sb.append("    fieldToDecode: ").append(toIndentedString(fieldToDecode)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    delimiter: ").append(toIndentedString(delimiter)).append("\n");
    sb.append("    flattenMultipleRows: ").append(toIndentedString(flattenMultipleRows)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    parseAsNameValue: ").append(toIndentedString(parseAsNameValue)).append("\n");
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
    openapiFields.add("expandSizeOneArrays");
    openapiFields.add("fieldToDecode");
    openapiFields.add("stepName");
    openapiFields.add("delimiter");
    openapiFields.add("flattenMultipleRows");
    openapiFields.add("fields");
    openapiFields.add("parseAsNameValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to JsonDecoderDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!JsonDecoderDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JsonDecoderDetails is not found in the empty JSON string", JsonDecoderDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!JsonDecoderDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JsonDecoderDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("fieldToDecode") != null && !jsonObj.get("fieldToDecode").isJsonNull()) && !jsonObj.get("fieldToDecode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fieldToDecode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fieldToDecode").toString()));
      }
      if ((jsonObj.get("stepName") != null && !jsonObj.get("stepName").isJsonNull()) && !jsonObj.get("stepName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stepName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stepName").toString()));
      }
      if ((jsonObj.get("delimiter") != null && !jsonObj.get("delimiter").isJsonNull()) && !jsonObj.get("delimiter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delimiter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delimiter").toString()));
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            JsonDecoderField.validateJsonElement(jsonArrayfields.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JsonDecoderDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JsonDecoderDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JsonDecoderDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JsonDecoderDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<JsonDecoderDetails>() {
           @Override
           public void write(JsonWriter out, JsonDecoderDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JsonDecoderDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JsonDecoderDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JsonDecoderDetails
  * @throws IOException if the JSON string is invalid with respect to JsonDecoderDetails
  */
  public static JsonDecoderDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JsonDecoderDetails.class);
  }

 /**
  * Convert an instance of JsonDecoderDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

