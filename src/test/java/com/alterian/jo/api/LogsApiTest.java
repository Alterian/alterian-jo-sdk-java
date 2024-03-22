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


package com.alterian.jo.api;

import com.alterian.jo.ApiException;
import com.alterian.jo.model.LogSource;
import com.alterian.jo.model.LogType;
import com.alterian.jo.model.LogTypeOrTimeseries;
import com.alterian.jo.model.LogsApiResponse;
import java.time.OffsetDateTime;
import com.alterian.jo.model.TargetEnum;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogsApi
 */
@Disabled
public class LogsApiTest {

    private final LogsApi api = new LogsApi();

    /**
     * Search across logs for this client and target
     *
     * Provide a search string to search for
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logsTypeTargetClientGetTest() throws ApiException {
        LogType type = null;
        TargetEnum target = null;
        String client = null;
        String searchPhrase = null;
        String sequenceNumber = null;
        String templateUrl = null;
        Integer limit = null;
        LogSource source = null;
        Boolean csv = null;
        OffsetDateTime startdate = null;
        OffsetDateTime enddate = null;
        LogsApiResponse response = api.logsTypeTargetClientGet(type, target, client, searchPhrase, sequenceNumber, templateUrl, limit, source, csv, startdate, enddate);
        // TODO: test validations
    }

    /**
     * Get logs that have been recorded for this rule
     *
     * If you haven&#39;t invoked the rule since you started logging then the writetolog list will always be empty.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logsTypeTargetClientRulenameGetTest() throws ApiException {
        LogTypeOrTimeseries type = null;
        TargetEnum target = null;
        String client = null;
        String rulename = null;
        String searchPhrase = null;
        String searchQuery = null;
        String sequenceNumber = null;
        String tileName = null;
        String tileId = null;
        String templateUrl = null;
        Integer limit = null;
        LogSource source = null;
        Boolean csv = null;
        OffsetDateTime startdate = null;
        OffsetDateTime enddate = null;
        LogsApiResponse response = api.logsTypeTargetClientRulenameGet(type, target, client, rulename, searchPhrase, searchQuery, sequenceNumber, tileName, tileId, templateUrl, limit, source, csv, startdate, enddate);
        // TODO: test validations
    }

}
