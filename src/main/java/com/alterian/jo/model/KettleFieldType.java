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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Kettle Data Types
 */
@JsonAdapter(KettleFieldType.Adapter.class)
public enum KettleFieldType {
  
  BIGNUMBER("BigNumber"),
  
  BINARY("Binary"),
  
  BLOB("blob"),
  
  BOOLEAN("Boolean"),
  
  COUNTER("counter"),
  
  DATE("Date"),
  
  INTEGER("Integer"),
  
  INTERNET_ADDRESS("Internet Address"),
  
  NUMBER("Number"),
  
  STRING("String"),
  
  TIMESTAMP("Timestamp"),
  
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private String value;

  KettleFieldType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KettleFieldType fromValue(String value) {
    for (KettleFieldType b : KettleFieldType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }

  public static class Adapter extends TypeAdapter<KettleFieldType> {
    @Override
    public void write(final JsonWriter jsonWriter, final KettleFieldType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KettleFieldType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KettleFieldType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    KettleFieldType.fromValue(value);
  }
}

