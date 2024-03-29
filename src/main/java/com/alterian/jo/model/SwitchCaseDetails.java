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
import com.alterian.jo.model.CaseTargetDetails;
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
 * SwitchCaseDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SwitchCaseDetails {
  public static final String SERIALIZED_NAME_CASE_TARGETS = "caseTargets";
  @SerializedName(SERIALIZED_NAME_CASE_TARGETS)
  private List<CaseTargetDetails> caseTargets;

  public static final String SERIALIZED_NAME_STEP_NAME = "stepName";
  @SerializedName(SERIALIZED_NAME_STEP_NAME)
  private String stepName;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_DEFAULT_CASE_TARGET = "defaultCaseTarget";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CASE_TARGET)
  private CaseTargetDetails defaultCaseTarget;

  public static final String SERIALIZED_NAME_IS_CONTAINS = "isContains";
  @SerializedName(SERIALIZED_NAME_IS_CONTAINS)
  private Boolean isContains;

  public SwitchCaseDetails() {
  }

  public SwitchCaseDetails caseTargets(List<CaseTargetDetails> caseTargets) {
    this.caseTargets = caseTargets;
    return this;
  }

  public SwitchCaseDetails addCaseTargetsItem(CaseTargetDetails caseTargetsItem) {
    if (this.caseTargets == null) {
      this.caseTargets = new ArrayList<>();
    }
    this.caseTargets.add(caseTargetsItem);
    return this;
  }

   /**
   * Get caseTargets
   * @return caseTargets
  **/
  @javax.annotation.Nullable
  public List<CaseTargetDetails> getCaseTargets() {
    return caseTargets;
  }

  public void setCaseTargets(List<CaseTargetDetails> caseTargets) {
    this.caseTargets = caseTargets;
  }


  public SwitchCaseDetails stepName(String stepName) {
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


  public SwitchCaseDetails active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  public SwitchCaseDetails defaultCaseTarget(CaseTargetDetails defaultCaseTarget) {
    this.defaultCaseTarget = defaultCaseTarget;
    return this;
  }

   /**
   * Get defaultCaseTarget
   * @return defaultCaseTarget
  **/
  @javax.annotation.Nullable
  public CaseTargetDetails getDefaultCaseTarget() {
    return defaultCaseTarget;
  }

  public void setDefaultCaseTarget(CaseTargetDetails defaultCaseTarget) {
    this.defaultCaseTarget = defaultCaseTarget;
  }


  public SwitchCaseDetails isContains(Boolean isContains) {
    this.isContains = isContains;
    return this;
  }

   /**
   * Get isContains
   * @return isContains
  **/
  @javax.annotation.Nullable
  public Boolean getIsContains() {
    return isContains;
  }

  public void setIsContains(Boolean isContains) {
    this.isContains = isContains;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchCaseDetails switchCaseDetails = (SwitchCaseDetails) o;
    return Objects.equals(this.caseTargets, switchCaseDetails.caseTargets) &&
        Objects.equals(this.stepName, switchCaseDetails.stepName) &&
        Objects.equals(this.active, switchCaseDetails.active) &&
        Objects.equals(this.defaultCaseTarget, switchCaseDetails.defaultCaseTarget) &&
        Objects.equals(this.isContains, switchCaseDetails.isContains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseTargets, stepName, active, defaultCaseTarget, isContains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchCaseDetails {\n");
    sb.append("    caseTargets: ").append(toIndentedString(caseTargets)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    defaultCaseTarget: ").append(toIndentedString(defaultCaseTarget)).append("\n");
    sb.append("    isContains: ").append(toIndentedString(isContains)).append("\n");
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
    openapiFields.add("caseTargets");
    openapiFields.add("stepName");
    openapiFields.add("active");
    openapiFields.add("defaultCaseTarget");
    openapiFields.add("isContains");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SwitchCaseDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SwitchCaseDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SwitchCaseDetails is not found in the empty JSON string", SwitchCaseDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SwitchCaseDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SwitchCaseDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("caseTargets") != null && !jsonObj.get("caseTargets").isJsonNull()) {
        JsonArray jsonArraycaseTargets = jsonObj.getAsJsonArray("caseTargets");
        if (jsonArraycaseTargets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("caseTargets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `caseTargets` to be an array in the JSON string but got `%s`", jsonObj.get("caseTargets").toString()));
          }

          // validate the optional field `caseTargets` (array)
          for (int i = 0; i < jsonArraycaseTargets.size(); i++) {
            CaseTargetDetails.validateJsonElement(jsonArraycaseTargets.get(i));
          };
        }
      }
      if ((jsonObj.get("stepName") != null && !jsonObj.get("stepName").isJsonNull()) && !jsonObj.get("stepName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stepName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stepName").toString()));
      }
      // validate the optional field `defaultCaseTarget`
      if (jsonObj.get("defaultCaseTarget") != null && !jsonObj.get("defaultCaseTarget").isJsonNull()) {
        CaseTargetDetails.validateJsonElement(jsonObj.get("defaultCaseTarget"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SwitchCaseDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SwitchCaseDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SwitchCaseDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SwitchCaseDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<SwitchCaseDetails>() {
           @Override
           public void write(JsonWriter out, SwitchCaseDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SwitchCaseDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SwitchCaseDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SwitchCaseDetails
  * @throws IOException if the JSON string is invalid with respect to SwitchCaseDetails
  */
  public static SwitchCaseDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SwitchCaseDetails.class);
  }

 /**
  * Convert an instance of SwitchCaseDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

