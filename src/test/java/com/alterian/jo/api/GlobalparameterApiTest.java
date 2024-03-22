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
import java.io.File;
import com.alterian.jo.model.ModelApiResponse;
import com.alterian.jo.model.Parameter;
import com.alterian.jo.model.ParameterApiResponse;
import com.alterian.jo.model.ParameterCopyDetails;
import com.alterian.jo.model.ParameterList;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GlobalparameterApi
 */
@Disabled
public class GlobalparameterApiTest {

    private final GlobalparameterApi api = new GlobalparameterApi();

    /**
     * Download global parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadGlobalparameterClientParamnameGetTest() throws ApiException {
        String client = null;
        String paramname = null;
        File response = api.downloadGlobalparameterClientParamnameGet(client, paramname);
        // TODO: test validations
    }

    /**
     * Get target parameter for for specific client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalparameterClientGetTest() throws ApiException {
        String client = null;
        Integer from = null;
        Integer to = null;
        String sortProperty = null;
        String sortDescending = null;
        String searchText = null;
        List<String> iClients = null;
        ParameterList response = api.globalparameterClientGet(client, from, to, sortProperty, sortDescending, searchText, iClients);
        // TODO: test validations
    }

    /**
     * Create a copy of a Global Parameter and, optionally, delete the original
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalparameterClientParamnameCopyPostTest() throws ApiException {
        String client = null;
        String paramname = null;
        ParameterCopyDetails parameterCopyDetails = null;
        ParameterApiResponse response = api.globalparameterClientParamnameCopyPost(client, paramname, parameterCopyDetails);
        // TODO: test validations
    }

    /**
     * Create a copy of a Global Parameter overwriting the target if it exists and, optionally, delete the original
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalparameterClientParamnameCopyPutTest() throws ApiException {
        String client = null;
        String paramname = null;
        ParameterCopyDetails parameterCopyDetails = null;
        ParameterApiResponse response = api.globalparameterClientParamnameCopyPut(client, paramname, parameterCopyDetails);
        // TODO: test validations
    }

    /**
     * Delete a global parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalparameterClientParamnameDeleteTest() throws ApiException {
        String client = null;
        String paramname = null;
        ModelApiResponse response = api.globalparameterClientParamnameDelete(client, paramname);
        // TODO: test validations
    }

    /**
     * Get individual Global Parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalparameterClientParamnameGetTest() throws ApiException {
        String client = null;
        String paramname = null;
        ParameterList response = api.globalparameterClientParamnameGet(client, paramname);
        // TODO: test validations
    }

    /**
     * Update Global Parameter
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalparameterClientParamnamePutTest() throws ApiException {
        String client = null;
        String paramname = null;
        Parameter parameter = null;
        ParameterApiResponse response = api.globalparameterClientParamnamePut(client, paramname, parameter);
        // TODO: test validations
    }

    /**
     * Get global parameters for all clients
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalparameterGetTest() throws ApiException {
        Integer from = null;
        Integer to = null;
        String sortProperty = null;
        String sortDescending = null;
        String searchText = null;
        List<String> iClients = null;
        ParameterList response = api.globalparameterGet(from, to, sortProperty, sortDescending, searchText, iClients);
        // TODO: test validations
    }

    /**
     * Create Global Parameter (will fail if already exists)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void globalparameterPostTest() throws ApiException {
        Parameter parameter = null;
        ParameterApiResponse response = api.globalparameterPost(parameter);
        // TODO: test validations
    }

}
