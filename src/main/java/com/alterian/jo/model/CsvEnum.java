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
 * Gets or Sets csvEnum
 */
@JsonAdapter(CsvEnum.Adapter.class)
public enum CsvEnum {
  
  CSV("csv"),
  
  UNKNOWN_DEFAULT_OPEN_API("unknown_default_open_api");

  private String value;

  CsvEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CsvEnum fromValue(String value) {
    for (CsvEnum b : CsvEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN_DEFAULT_OPEN_API;
  }

  public static class Adapter extends TypeAdapter<CsvEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final CsvEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CsvEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CsvEnum.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CsvEnum.fromValue(value);
  }
}

