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
import com.alterian.jo.model.DataGridDetails;
import com.alterian.jo.model.Icon;
import com.alterian.jo.model.InputConnector;
import com.alterian.jo.model.JsonDecoderDetails;
import com.alterian.jo.model.MABStepDetails;
import com.alterian.jo.model.OutputConnector;
import com.alterian.jo.model.RealtimeInputStepDetails;
import com.alterian.jo.model.RuleCallDetails;
import com.alterian.jo.model.RuleParameter;
import com.alterian.jo.model.SwitchCaseDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * TemplateData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class TemplateData {
  public static final String SERIALIZED_NAME_INPUTCONNECTORS = "inputconnectors";
  @SerializedName(SERIALIZED_NAME_INPUTCONNECTORS)
  private List<InputConnector> inputconnectors;

  public static final String SERIALIZED_NAME_DATAGRIDS = "datagrids";
  @SerializedName(SERIALIZED_NAME_DATAGRIDS)
  private List<String> datagrids;

  public static final String SERIALIZED_NAME_DATAGRIDSDETAILS = "datagridsdetails";
  @SerializedName(SERIALIZED_NAME_DATAGRIDSDETAILS)
  private List<DataGridDetails> datagridsdetails;

  public static final String SERIALIZED_NAME_CXIDPROVIDER = "cxidprovider";
  @SerializedName(SERIALIZED_NAME_CXIDPROVIDER)
  private Boolean cxidprovider;

  public static final String SERIALIZED_NAME_TEMPLATELASTMODIFIEDDATE = "templatelastmodifieddate";
  @SerializedName(SERIALIZED_NAME_TEMPLATELASTMODIFIEDDATE)
  private String templatelastmodifieddate;

  public static final String SERIALIZED_NAME_SERVICE_COST = "serviceCost";
  @SerializedName(SERIALIZED_NAME_SERVICE_COST)
  private BigDecimal serviceCost;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private Icon icon;

  public static final String SERIALIZED_NAME_OUTPUTCONNECTORS = "outputconnectors";
  @SerializedName(SERIALIZED_NAME_OUTPUTCONNECTORS)
  private List<OutputConnector> outputconnectors;

  public static final String SERIALIZED_NAME_ISSTARTTILE = "isstarttile";
  @SerializedName(SERIALIZED_NAME_ISSTARTTILE)
  private Boolean isstarttile;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_TEMPLATELASTMODIFIEDUSER = "templatelastmodifieduser";
  @SerializedName(SERIALIZED_NAME_TEMPLATELASTMODIFIEDUSER)
  private String templatelastmodifieduser;

  public static final String SERIALIZED_NAME_KTRNAME = "ktrname";
  @SerializedName(SERIALIZED_NAME_KTRNAME)
  private String ktrname;

  public static final String SERIALIZED_NAME_REALTIME_RULE_STEPS = "realtimeRuleSteps";
  @SerializedName(SERIALIZED_NAME_REALTIME_RULE_STEPS)
  private List<RuleCallDetails> realtimeRuleSteps;

  public static final String SERIALIZED_NAME_HELP_LINK = "helpLink";
  @SerializedName(SERIALIZED_NAME_HELP_LINK)
  private String helpLink;

  public static final String SERIALIZED_NAME_REALTIME_INPUT_STEPS = "realtimeInputSteps";
  @SerializedName(SERIALIZED_NAME_REALTIME_INPUT_STEPS)
  private List<RealtimeInputStepDetails> realtimeInputSteps;

  public static final String SERIALIZED_NAME_SWITCHCASES = "switchcases";
  @SerializedName(SERIALIZED_NAME_SWITCHCASES)
  private List<SwitchCaseDetails> switchcases;

  public static final String SERIALIZED_NAME_CONTROL_ENABLED = "controlEnabled";
  @SerializedName(SERIALIZED_NAME_CONTROL_ENABLED)
  private Boolean controlEnabled;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private String client;

  public static final String SERIALIZED_NAME_TEMPLATENAME = "templatename";
  @SerializedName(SERIALIZED_NAME_TEMPLATENAME)
  private String templatename;

  public static final String SERIALIZED_NAME_MABSTEPS = "mabsteps";
  @SerializedName(SERIALIZED_NAME_MABSTEPS)
  private List<MABStepDetails> mabsteps;

  public static final String SERIALIZED_NAME_JSON_DECODERS = "jsonDecoders";
  @SerializedName(SERIALIZED_NAME_JSON_DECODERS)
  private List<JsonDecoderDetails> jsonDecoders;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<RuleParameter> parameters;

  public static final String SERIALIZED_NAME_TEMPLATEDESCRIPTION = "templatedescription";
  @SerializedName(SERIALIZED_NAME_TEMPLATEDESCRIPTION)
  private String templatedescription;

  public TemplateData() {
  }

  public TemplateData inputconnectors(List<InputConnector> inputconnectors) {
    this.inputconnectors = inputconnectors;
    return this;
  }

  public TemplateData addInputconnectorsItem(InputConnector inputconnectorsItem) {
    if (this.inputconnectors == null) {
      this.inputconnectors = new ArrayList<>();
    }
    this.inputconnectors.add(inputconnectorsItem);
    return this;
  }

   /**
   * Get inputconnectors
   * @return inputconnectors
  **/
  @javax.annotation.Nullable
  public List<InputConnector> getInputconnectors() {
    return inputconnectors;
  }

  public void setInputconnectors(List<InputConnector> inputconnectors) {
    this.inputconnectors = inputconnectors;
  }


  public TemplateData datagrids(List<String> datagrids) {
    this.datagrids = datagrids;
    return this;
  }

  public TemplateData addDatagridsItem(String datagridsItem) {
    if (this.datagrids == null) {
      this.datagrids = new ArrayList<>();
    }
    this.datagrids.add(datagridsItem);
    return this;
  }

   /**
   * Get datagrids
   * @return datagrids
  **/
  @javax.annotation.Nullable
  public List<String> getDatagrids() {
    return datagrids;
  }

  public void setDatagrids(List<String> datagrids) {
    this.datagrids = datagrids;
  }


  public TemplateData datagridsdetails(List<DataGridDetails> datagridsdetails) {
    this.datagridsdetails = datagridsdetails;
    return this;
  }

  public TemplateData addDatagridsdetailsItem(DataGridDetails datagridsdetailsItem) {
    if (this.datagridsdetails == null) {
      this.datagridsdetails = new ArrayList<>();
    }
    this.datagridsdetails.add(datagridsdetailsItem);
    return this;
  }

   /**
   * Get datagridsdetails
   * @return datagridsdetails
  **/
  @javax.annotation.Nullable
  public List<DataGridDetails> getDatagridsdetails() {
    return datagridsdetails;
  }

  public void setDatagridsdetails(List<DataGridDetails> datagridsdetails) {
    this.datagridsdetails = datagridsdetails;
  }


  public TemplateData cxidprovider(Boolean cxidprovider) {
    this.cxidprovider = cxidprovider;
    return this;
  }

   /**
   * Get cxidprovider
   * @return cxidprovider
  **/
  @javax.annotation.Nullable
  public Boolean getCxidprovider() {
    return cxidprovider;
  }

  public void setCxidprovider(Boolean cxidprovider) {
    this.cxidprovider = cxidprovider;
  }


  public TemplateData templatelastmodifieddate(String templatelastmodifieddate) {
    this.templatelastmodifieddate = templatelastmodifieddate;
    return this;
  }

   /**
   * Get templatelastmodifieddate
   * @return templatelastmodifieddate
  **/
  @javax.annotation.Nullable
  public String getTemplatelastmodifieddate() {
    return templatelastmodifieddate;
  }

  public void setTemplatelastmodifieddate(String templatelastmodifieddate) {
    this.templatelastmodifieddate = templatelastmodifieddate;
  }


  public TemplateData serviceCost(BigDecimal serviceCost) {
    this.serviceCost = serviceCost;
    return this;
  }

   /**
   * Get serviceCost
   * @return serviceCost
  **/
  @javax.annotation.Nullable
  public BigDecimal getServiceCost() {
    return serviceCost;
  }

  public void setServiceCost(BigDecimal serviceCost) {
    this.serviceCost = serviceCost;
  }


  public TemplateData icon(Icon icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nullable
  public Icon getIcon() {
    return icon;
  }

  public void setIcon(Icon icon) {
    this.icon = icon;
  }


  public TemplateData outputconnectors(List<OutputConnector> outputconnectors) {
    this.outputconnectors = outputconnectors;
    return this;
  }

  public TemplateData addOutputconnectorsItem(OutputConnector outputconnectorsItem) {
    if (this.outputconnectors == null) {
      this.outputconnectors = new ArrayList<>();
    }
    this.outputconnectors.add(outputconnectorsItem);
    return this;
  }

   /**
   * Get outputconnectors
   * @return outputconnectors
  **/
  @javax.annotation.Nullable
  public List<OutputConnector> getOutputconnectors() {
    return outputconnectors;
  }

  public void setOutputconnectors(List<OutputConnector> outputconnectors) {
    this.outputconnectors = outputconnectors;
  }


  public TemplateData isstarttile(Boolean isstarttile) {
    this.isstarttile = isstarttile;
    return this;
  }

   /**
   * Get isstarttile
   * @return isstarttile
  **/
  @javax.annotation.Nullable
  public Boolean getIsstarttile() {
    return isstarttile;
  }

  public void setIsstarttile(Boolean isstarttile) {
    this.isstarttile = isstarttile;
  }


  public TemplateData version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public TemplateData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public TemplateData templatelastmodifieduser(String templatelastmodifieduser) {
    this.templatelastmodifieduser = templatelastmodifieduser;
    return this;
  }

   /**
   * Get templatelastmodifieduser
   * @return templatelastmodifieduser
  **/
  @javax.annotation.Nullable
  public String getTemplatelastmodifieduser() {
    return templatelastmodifieduser;
  }

  public void setTemplatelastmodifieduser(String templatelastmodifieduser) {
    this.templatelastmodifieduser = templatelastmodifieduser;
  }


  public TemplateData ktrname(String ktrname) {
    this.ktrname = ktrname;
    return this;
  }

   /**
   * Get ktrname
   * @return ktrname
  **/
  @javax.annotation.Nullable
  public String getKtrname() {
    return ktrname;
  }

  public void setKtrname(String ktrname) {
    this.ktrname = ktrname;
  }


  public TemplateData realtimeRuleSteps(List<RuleCallDetails> realtimeRuleSteps) {
    this.realtimeRuleSteps = realtimeRuleSteps;
    return this;
  }

  public TemplateData addRealtimeRuleStepsItem(RuleCallDetails realtimeRuleStepsItem) {
    if (this.realtimeRuleSteps == null) {
      this.realtimeRuleSteps = new ArrayList<>();
    }
    this.realtimeRuleSteps.add(realtimeRuleStepsItem);
    return this;
  }

   /**
   * Get realtimeRuleSteps
   * @return realtimeRuleSteps
  **/
  @javax.annotation.Nullable
  public List<RuleCallDetails> getRealtimeRuleSteps() {
    return realtimeRuleSteps;
  }

  public void setRealtimeRuleSteps(List<RuleCallDetails> realtimeRuleSteps) {
    this.realtimeRuleSteps = realtimeRuleSteps;
  }


  public TemplateData helpLink(String helpLink) {
    this.helpLink = helpLink;
    return this;
  }

   /**
   * Get helpLink
   * @return helpLink
  **/
  @javax.annotation.Nullable
  public String getHelpLink() {
    return helpLink;
  }

  public void setHelpLink(String helpLink) {
    this.helpLink = helpLink;
  }


  public TemplateData realtimeInputSteps(List<RealtimeInputStepDetails> realtimeInputSteps) {
    this.realtimeInputSteps = realtimeInputSteps;
    return this;
  }

  public TemplateData addRealtimeInputStepsItem(RealtimeInputStepDetails realtimeInputStepsItem) {
    if (this.realtimeInputSteps == null) {
      this.realtimeInputSteps = new ArrayList<>();
    }
    this.realtimeInputSteps.add(realtimeInputStepsItem);
    return this;
  }

   /**
   * Get realtimeInputSteps
   * @return realtimeInputSteps
  **/
  @javax.annotation.Nullable
  public List<RealtimeInputStepDetails> getRealtimeInputSteps() {
    return realtimeInputSteps;
  }

  public void setRealtimeInputSteps(List<RealtimeInputStepDetails> realtimeInputSteps) {
    this.realtimeInputSteps = realtimeInputSteps;
  }


  public TemplateData switchcases(List<SwitchCaseDetails> switchcases) {
    this.switchcases = switchcases;
    return this;
  }

  public TemplateData addSwitchcasesItem(SwitchCaseDetails switchcasesItem) {
    if (this.switchcases == null) {
      this.switchcases = new ArrayList<>();
    }
    this.switchcases.add(switchcasesItem);
    return this;
  }

   /**
   * Get switchcases
   * @return switchcases
  **/
  @javax.annotation.Nullable
  public List<SwitchCaseDetails> getSwitchcases() {
    return switchcases;
  }

  public void setSwitchcases(List<SwitchCaseDetails> switchcases) {
    this.switchcases = switchcases;
  }


  public TemplateData controlEnabled(Boolean controlEnabled) {
    this.controlEnabled = controlEnabled;
    return this;
  }

   /**
   * Get controlEnabled
   * @return controlEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getControlEnabled() {
    return controlEnabled;
  }

  public void setControlEnabled(Boolean controlEnabled) {
    this.controlEnabled = controlEnabled;
  }


  public TemplateData client(String client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }


  public TemplateData templatename(String templatename) {
    this.templatename = templatename;
    return this;
  }

   /**
   * Get templatename
   * @return templatename
  **/
  @javax.annotation.Nullable
  public String getTemplatename() {
    return templatename;
  }

  public void setTemplatename(String templatename) {
    this.templatename = templatename;
  }


  public TemplateData mabsteps(List<MABStepDetails> mabsteps) {
    this.mabsteps = mabsteps;
    return this;
  }

  public TemplateData addMabstepsItem(MABStepDetails mabstepsItem) {
    if (this.mabsteps == null) {
      this.mabsteps = new ArrayList<>();
    }
    this.mabsteps.add(mabstepsItem);
    return this;
  }

   /**
   * Get mabsteps
   * @return mabsteps
  **/
  @javax.annotation.Nullable
  public List<MABStepDetails> getMabsteps() {
    return mabsteps;
  }

  public void setMabsteps(List<MABStepDetails> mabsteps) {
    this.mabsteps = mabsteps;
  }


  public TemplateData jsonDecoders(List<JsonDecoderDetails> jsonDecoders) {
    this.jsonDecoders = jsonDecoders;
    return this;
  }

  public TemplateData addJsonDecodersItem(JsonDecoderDetails jsonDecodersItem) {
    if (this.jsonDecoders == null) {
      this.jsonDecoders = new ArrayList<>();
    }
    this.jsonDecoders.add(jsonDecodersItem);
    return this;
  }

   /**
   * Get jsonDecoders
   * @return jsonDecoders
  **/
  @javax.annotation.Nullable
  public List<JsonDecoderDetails> getJsonDecoders() {
    return jsonDecoders;
  }

  public void setJsonDecoders(List<JsonDecoderDetails> jsonDecoders) {
    this.jsonDecoders = jsonDecoders;
  }


  public TemplateData parameters(List<RuleParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  public TemplateData addParametersItem(RuleParameter parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  public List<RuleParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<RuleParameter> parameters) {
    this.parameters = parameters;
  }


  public TemplateData templatedescription(String templatedescription) {
    this.templatedescription = templatedescription;
    return this;
  }

   /**
   * Get templatedescription
   * @return templatedescription
  **/
  @javax.annotation.Nullable
  public String getTemplatedescription() {
    return templatedescription;
  }

  public void setTemplatedescription(String templatedescription) {
    this.templatedescription = templatedescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateData templateData = (TemplateData) o;
    return Objects.equals(this.inputconnectors, templateData.inputconnectors) &&
        Objects.equals(this.datagrids, templateData.datagrids) &&
        Objects.equals(this.datagridsdetails, templateData.datagridsdetails) &&
        Objects.equals(this.cxidprovider, templateData.cxidprovider) &&
        Objects.equals(this.templatelastmodifieddate, templateData.templatelastmodifieddate) &&
        Objects.equals(this.serviceCost, templateData.serviceCost) &&
        Objects.equals(this.icon, templateData.icon) &&
        Objects.equals(this.outputconnectors, templateData.outputconnectors) &&
        Objects.equals(this.isstarttile, templateData.isstarttile) &&
        Objects.equals(this.version, templateData.version) &&
        Objects.equals(this.url, templateData.url) &&
        Objects.equals(this.templatelastmodifieduser, templateData.templatelastmodifieduser) &&
        Objects.equals(this.ktrname, templateData.ktrname) &&
        Objects.equals(this.realtimeRuleSteps, templateData.realtimeRuleSteps) &&
        Objects.equals(this.helpLink, templateData.helpLink) &&
        Objects.equals(this.realtimeInputSteps, templateData.realtimeInputSteps) &&
        Objects.equals(this.switchcases, templateData.switchcases) &&
        Objects.equals(this.controlEnabled, templateData.controlEnabled) &&
        Objects.equals(this.client, templateData.client) &&
        Objects.equals(this.templatename, templateData.templatename) &&
        Objects.equals(this.mabsteps, templateData.mabsteps) &&
        Objects.equals(this.jsonDecoders, templateData.jsonDecoders) &&
        Objects.equals(this.parameters, templateData.parameters) &&
        Objects.equals(this.templatedescription, templateData.templatedescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputconnectors, datagrids, datagridsdetails, cxidprovider, templatelastmodifieddate, serviceCost, icon, outputconnectors, isstarttile, version, url, templatelastmodifieduser, ktrname, realtimeRuleSteps, helpLink, realtimeInputSteps, switchcases, controlEnabled, client, templatename, mabsteps, jsonDecoders, parameters, templatedescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateData {\n");
    sb.append("    inputconnectors: ").append(toIndentedString(inputconnectors)).append("\n");
    sb.append("    datagrids: ").append(toIndentedString(datagrids)).append("\n");
    sb.append("    datagridsdetails: ").append(toIndentedString(datagridsdetails)).append("\n");
    sb.append("    cxidprovider: ").append(toIndentedString(cxidprovider)).append("\n");
    sb.append("    templatelastmodifieddate: ").append(toIndentedString(templatelastmodifieddate)).append("\n");
    sb.append("    serviceCost: ").append(toIndentedString(serviceCost)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    outputconnectors: ").append(toIndentedString(outputconnectors)).append("\n");
    sb.append("    isstarttile: ").append(toIndentedString(isstarttile)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    templatelastmodifieduser: ").append(toIndentedString(templatelastmodifieduser)).append("\n");
    sb.append("    ktrname: ").append(toIndentedString(ktrname)).append("\n");
    sb.append("    realtimeRuleSteps: ").append(toIndentedString(realtimeRuleSteps)).append("\n");
    sb.append("    helpLink: ").append(toIndentedString(helpLink)).append("\n");
    sb.append("    realtimeInputSteps: ").append(toIndentedString(realtimeInputSteps)).append("\n");
    sb.append("    switchcases: ").append(toIndentedString(switchcases)).append("\n");
    sb.append("    controlEnabled: ").append(toIndentedString(controlEnabled)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    templatename: ").append(toIndentedString(templatename)).append("\n");
    sb.append("    mabsteps: ").append(toIndentedString(mabsteps)).append("\n");
    sb.append("    jsonDecoders: ").append(toIndentedString(jsonDecoders)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    templatedescription: ").append(toIndentedString(templatedescription)).append("\n");
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
    openapiFields.add("inputconnectors");
    openapiFields.add("datagrids");
    openapiFields.add("datagridsdetails");
    openapiFields.add("cxidprovider");
    openapiFields.add("templatelastmodifieddate");
    openapiFields.add("serviceCost");
    openapiFields.add("icon");
    openapiFields.add("outputconnectors");
    openapiFields.add("isstarttile");
    openapiFields.add("version");
    openapiFields.add("url");
    openapiFields.add("templatelastmodifieduser");
    openapiFields.add("ktrname");
    openapiFields.add("realtimeRuleSteps");
    openapiFields.add("helpLink");
    openapiFields.add("realtimeInputSteps");
    openapiFields.add("switchcases");
    openapiFields.add("controlEnabled");
    openapiFields.add("client");
    openapiFields.add("templatename");
    openapiFields.add("mabsteps");
    openapiFields.add("jsonDecoders");
    openapiFields.add("parameters");
    openapiFields.add("templatedescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TemplateData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateData is not found in the empty JSON string", TemplateData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TemplateData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("inputconnectors") != null && !jsonObj.get("inputconnectors").isJsonNull()) {
        JsonArray jsonArrayinputconnectors = jsonObj.getAsJsonArray("inputconnectors");
        if (jsonArrayinputconnectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("inputconnectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `inputconnectors` to be an array in the JSON string but got `%s`", jsonObj.get("inputconnectors").toString()));
          }

          // validate the optional field `inputconnectors` (array)
          for (int i = 0; i < jsonArrayinputconnectors.size(); i++) {
            InputConnector.validateJsonElement(jsonArrayinputconnectors.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("datagrids") != null && !jsonObj.get("datagrids").isJsonNull() && !jsonObj.get("datagrids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `datagrids` to be an array in the JSON string but got `%s`", jsonObj.get("datagrids").toString()));
      }
      if (jsonObj.get("datagridsdetails") != null && !jsonObj.get("datagridsdetails").isJsonNull()) {
        JsonArray jsonArraydatagridsdetails = jsonObj.getAsJsonArray("datagridsdetails");
        if (jsonArraydatagridsdetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("datagridsdetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `datagridsdetails` to be an array in the JSON string but got `%s`", jsonObj.get("datagridsdetails").toString()));
          }

          // validate the optional field `datagridsdetails` (array)
          for (int i = 0; i < jsonArraydatagridsdetails.size(); i++) {
            DataGridDetails.validateJsonElement(jsonArraydatagridsdetails.get(i));
          };
        }
      }
      if ((jsonObj.get("templatelastmodifieddate") != null && !jsonObj.get("templatelastmodifieddate").isJsonNull()) && !jsonObj.get("templatelastmodifieddate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templatelastmodifieddate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templatelastmodifieddate").toString()));
      }
      // validate the optional field `icon`
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) {
        Icon.validateJsonElement(jsonObj.get("icon"));
      }
      if (jsonObj.get("outputconnectors") != null && !jsonObj.get("outputconnectors").isJsonNull()) {
        JsonArray jsonArrayoutputconnectors = jsonObj.getAsJsonArray("outputconnectors");
        if (jsonArrayoutputconnectors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("outputconnectors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `outputconnectors` to be an array in the JSON string but got `%s`", jsonObj.get("outputconnectors").toString()));
          }

          // validate the optional field `outputconnectors` (array)
          for (int i = 0; i < jsonArrayoutputconnectors.size(); i++) {
            OutputConnector.validateJsonElement(jsonArrayoutputconnectors.get(i));
          };
        }
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("templatelastmodifieduser") != null && !jsonObj.get("templatelastmodifieduser").isJsonNull()) && !jsonObj.get("templatelastmodifieduser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templatelastmodifieduser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templatelastmodifieduser").toString()));
      }
      if ((jsonObj.get("ktrname") != null && !jsonObj.get("ktrname").isJsonNull()) && !jsonObj.get("ktrname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ktrname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ktrname").toString()));
      }
      if (jsonObj.get("realtimeRuleSteps") != null && !jsonObj.get("realtimeRuleSteps").isJsonNull()) {
        JsonArray jsonArrayrealtimeRuleSteps = jsonObj.getAsJsonArray("realtimeRuleSteps");
        if (jsonArrayrealtimeRuleSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("realtimeRuleSteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `realtimeRuleSteps` to be an array in the JSON string but got `%s`", jsonObj.get("realtimeRuleSteps").toString()));
          }

          // validate the optional field `realtimeRuleSteps` (array)
          for (int i = 0; i < jsonArrayrealtimeRuleSteps.size(); i++) {
            RuleCallDetails.validateJsonElement(jsonArrayrealtimeRuleSteps.get(i));
          };
        }
      }
      if ((jsonObj.get("helpLink") != null && !jsonObj.get("helpLink").isJsonNull()) && !jsonObj.get("helpLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `helpLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("helpLink").toString()));
      }
      if (jsonObj.get("realtimeInputSteps") != null && !jsonObj.get("realtimeInputSteps").isJsonNull()) {
        JsonArray jsonArrayrealtimeInputSteps = jsonObj.getAsJsonArray("realtimeInputSteps");
        if (jsonArrayrealtimeInputSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("realtimeInputSteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `realtimeInputSteps` to be an array in the JSON string but got `%s`", jsonObj.get("realtimeInputSteps").toString()));
          }

          // validate the optional field `realtimeInputSteps` (array)
          for (int i = 0; i < jsonArrayrealtimeInputSteps.size(); i++) {
            RealtimeInputStepDetails.validateJsonElement(jsonArrayrealtimeInputSteps.get(i));
          };
        }
      }
      if (jsonObj.get("switchcases") != null && !jsonObj.get("switchcases").isJsonNull()) {
        JsonArray jsonArrayswitchcases = jsonObj.getAsJsonArray("switchcases");
        if (jsonArrayswitchcases != null) {
          // ensure the json data is an array
          if (!jsonObj.get("switchcases").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `switchcases` to be an array in the JSON string but got `%s`", jsonObj.get("switchcases").toString()));
          }

          // validate the optional field `switchcases` (array)
          for (int i = 0; i < jsonArrayswitchcases.size(); i++) {
            SwitchCaseDetails.validateJsonElement(jsonArrayswitchcases.get(i));
          };
        }
      }
      if ((jsonObj.get("client") != null && !jsonObj.get("client").isJsonNull()) && !jsonObj.get("client").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client").toString()));
      }
      if ((jsonObj.get("templatename") != null && !jsonObj.get("templatename").isJsonNull()) && !jsonObj.get("templatename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templatename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templatename").toString()));
      }
      if (jsonObj.get("mabsteps") != null && !jsonObj.get("mabsteps").isJsonNull()) {
        JsonArray jsonArraymabsteps = jsonObj.getAsJsonArray("mabsteps");
        if (jsonArraymabsteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mabsteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mabsteps` to be an array in the JSON string but got `%s`", jsonObj.get("mabsteps").toString()));
          }

          // validate the optional field `mabsteps` (array)
          for (int i = 0; i < jsonArraymabsteps.size(); i++) {
            MABStepDetails.validateJsonElement(jsonArraymabsteps.get(i));
          };
        }
      }
      if (jsonObj.get("jsonDecoders") != null && !jsonObj.get("jsonDecoders").isJsonNull()) {
        JsonArray jsonArrayjsonDecoders = jsonObj.getAsJsonArray("jsonDecoders");
        if (jsonArrayjsonDecoders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("jsonDecoders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `jsonDecoders` to be an array in the JSON string but got `%s`", jsonObj.get("jsonDecoders").toString()));
          }

          // validate the optional field `jsonDecoders` (array)
          for (int i = 0; i < jsonArrayjsonDecoders.size(); i++) {
            JsonDecoderDetails.validateJsonElement(jsonArrayjsonDecoders.get(i));
          };
        }
      }
      if (jsonObj.get("parameters") != null && !jsonObj.get("parameters").isJsonNull()) {
        JsonArray jsonArrayparameters = jsonObj.getAsJsonArray("parameters");
        if (jsonArrayparameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("parameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `parameters` to be an array in the JSON string but got `%s`", jsonObj.get("parameters").toString()));
          }

          // validate the optional field `parameters` (array)
          for (int i = 0; i < jsonArrayparameters.size(); i++) {
            RuleParameter.validateJsonElement(jsonArrayparameters.get(i));
          };
        }
      }
      if ((jsonObj.get("templatedescription") != null && !jsonObj.get("templatedescription").isJsonNull()) && !jsonObj.get("templatedescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templatedescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templatedescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateData.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateData>() {
           @Override
           public void write(JsonWriter out, TemplateData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateData
  * @throws IOException if the JSON string is invalid with respect to TemplateData
  */
  public static TemplateData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateData.class);
  }

 /**
  * Convert an instance of TemplateData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

