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


package com.alterian.jo;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.TimeZone;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    private static final StdDateFormat sdf = new StdDateFormat()
        .withTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()))
        .withColonInTimeZone(true);
    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.AckMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.AliasDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ApiError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ApiJSONArrayResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ApiJSONResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheApiData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheApiDeleteResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheApiResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheCQL.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheChangesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheColumn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheColumnListing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheDeleteData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheDetailsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheExecuteData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheExecuteResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheTable.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheTableDefinition.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheTableDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CacheTableListing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.CaseTargetDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Client.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ClientData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ClientDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ClientResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ClusterPostRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ClusterPutRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.DataGridApiResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.DataGridApiResponseAllOfData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.DataGridDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.DataGridPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.DataGridRow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.DestinationTarget.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Icon.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.InputConnector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.JsonDecoderDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.JsonDecoderField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LastModified.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LicenseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LicenseList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsApiResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsDataAgent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsDataEcs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsDataEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsDataFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsDataHost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsDataInput.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsDataLog.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.LogsDataLogFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.MABStepDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.MABVariant.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Metadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ModelApiResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.NameDescriptionPair.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.OutputConnector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.OutputConnectorRealtimeOutputStepsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.OutputField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Parameter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ParameterApiResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ParameterCopyDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ParameterList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Permission.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.PermissionList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.PickListItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.PriorityWeighting.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.QuotaUsageHistory.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ROSCounts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RealtimeInputStepDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RealtimeInputStepHeader.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RefList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ResourceAndStatusResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Role.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RoleList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RuleAndStateResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RuleCallDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RuleData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RuleDesignerResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RuleList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RuleParameter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.RulegroupPostRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Site.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.SiteList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Statistics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Status.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.Success.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.SuccessCursor.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.SwitchCaseDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.TargetValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.TemplateData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.TemplateList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.TemplatePublishSettings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.TemplateUpgradeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.TestData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.TestDataItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.TestDataResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.User.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.UserList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.alterian.jo.model.ValidationMessage.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(sdf.parse(date).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, DateTimeFormatter will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toInstant().atOffset(ZoneOffset.UTC).format(dtf);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return sdf.parse(date);
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}