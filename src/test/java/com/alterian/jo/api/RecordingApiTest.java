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
import com.alterian.jo.model.ModelApiResponse;
import com.alterian.jo.model.TargetEnum;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecordingApi
 */
@Disabled
public class RecordingApiTest {

    private final RecordingApi api = new RecordingApi();

    /**
     * Delete all recordings created by this client.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingClientDeleteTest() throws ApiException {
        String client = null;
        api.recordingClientDelete(client);
        // TODO: test validations
    }

    /**
     * Get details about all recordings created by a specific client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingClientGetTest() throws ApiException {
        String client = null;
        Integer from = null;
        Integer to = null;
        api.recordingClientGet(client, from, to);
        // TODO: test validations
    }

    /**
     * Delete all recordings created by this client in this target.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingClientTargetDeleteTest() throws ApiException {
        String client = null;
        TargetEnum target = null;
        api.recordingClientTargetDelete(client, target);
        // TODO: test validations
    }

    /**
     * Get details about all recordings created by a specific client in a specific target
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingClientTargetGetTest() throws ApiException {
        String client = null;
        TargetEnum target = null;
        Integer from = null;
        Integer to = null;
        api.recordingClientTargetGet(client, target, from, to);
        // TODO: test validations
    }

    /**
     * Delete a specific recording.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingClientTargetNameDeleteTest() throws ApiException {
        String client = null;
        TargetEnum target = null;
        String name = null;
        api.recordingClientTargetNameDelete(client, target, name);
        // TODO: test validations
    }

    /**
     * Get raw event traffic associated with this specific recording
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingClientTargetNameEventsGetTest() throws ApiException {
        String client = null;
        TargetEnum target = null;
        String name = null;
        String since = null;
        Integer from = null;
        Integer to = null;
        api.recordingClientTargetNameEventsGet(client, target, name, since, from, to);
        // TODO: test validations
    }

    /**
     * Get details about a specific recording
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingClientTargetNameGetTest() throws ApiException {
        String client = null;
        TargetEnum target = null;
        String name = null;
        Boolean analysis = null;
        Boolean force = null;
        api.recordingClientTargetNameGet(client, target, name, analysis, force);
        // TODO: test validations
    }

    /**
     * Edit the details of a specific recording.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingClientTargetNamePutTest() throws ApiException {
        String client = null;
        TargetEnum target = null;
        String name = null;
        String body = null;
        ModelApiResponse response = api.recordingClientTargetNamePut(client, target, name, body);
        // TODO: test validations
    }

    /**
     * Start or stop recording traffic for this client and target
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingClientTargetPostTest() throws ApiException {
        String client = null;
        TargetEnum target = null;
        String action = null;
        String body = null;
        api.recordingClientTargetPost(client, target, action, body);
        // TODO: test validations
    }

    /**
     * Get details about all recordings in the cluster
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recordingGetTest() throws ApiException {
        Integer from = null;
        Integer to = null;
        api.recordingGet(from, to);
        // TODO: test validations
    }

}
