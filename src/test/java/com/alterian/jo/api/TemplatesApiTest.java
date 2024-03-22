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
import com.alterian.jo.model.Client;
import java.io.File;
import com.alterian.jo.model.ModelApiResponse;
import com.alterian.jo.model.ResourceAndStatusResponse;
import com.alterian.jo.model.TargetEnum;
import com.alterian.jo.model.TemplateList;
import com.alterian.jo.model.TemplatePublishSettings;
import com.alterian.jo.model.TemplateUpgradeResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TemplatesApi
 */
@Disabled
public class TemplatesApiTest {

    private final TemplatesApi api = new TemplatesApi();

    /**
     * Download the rule file for a specific version of a specific template for a specific client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadTemplateClientTemplatenameGetTest() throws ApiException {
        String client = null;
        String templatename = null;
        File response = api.downloadTemplateClientTemplatenameGet(client, templatename);
        // TODO: test validations
    }

    /**
     * Download the rule file for a specific version of a specific template for a specific client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void downloadTemplateClientTemplatenameVersionGetTest() throws ApiException {
        String client = null;
        String templatename = null;
        Integer version = null;
        File response = api.downloadTemplateClientTemplatenameVersionGet(client, templatename, version);
        // TODO: test validations
    }

    /**
     * Delete all templates uploaded by this client.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateClientDeleteTest() throws ApiException {
        String client = null;
        ModelApiResponse response = api.templateClientDelete(client);
        // TODO: test validations
    }

    /**
     * Get details about all templates uploaded by a specific client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateClientGetTest() throws ApiException {
        String client = null;
        Integer from = null;
        Integer to = null;
        Boolean allversions = null;
        Boolean getAllDetails = null;
        Boolean basicInfo = null;
        String targetClient = null;
        String searchText = null;
        Boolean includePublic = null;
        List<String> iClients = null;
        TemplateList response = api.templateClientGet(client, from, to, allversions, getAllDetails, basicInfo, targetClient, searchText, includePublic, iClients);
        // TODO: test validations
    }

    /**
     * Delete all versions of a specific template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateClientTemplatenameDeleteTest() throws ApiException {
        String client = null;
        String templatename = null;
        ModelApiResponse response = api.templateClientTemplatenameDelete(client, templatename);
        // TODO: test validations
    }

    /**
     * Get details about all versions of a specified template
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateClientTemplatenameGetTest() throws ApiException {
        String client = null;
        String templatename = null;
        Integer from = null;
        Integer to = null;
        Boolean allversions = null;
        Boolean getAllDetails = null;
        String targetClient = null;
        TemplateList response = api.templateClientTemplatenameGet(client, templatename, from, to, allversions, getAllDetails, targetClient);
        // TODO: test validations
    }

    /**
     * Upload a KTR file which defines the functionality of the template. This will generate and return a version   number.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateClientTemplatenamePostTest() throws ApiException {
        String client = null;
        String templatename = null;
        Boolean validate = null;
        File _file = null;
        String settings = null;
        ResourceAndStatusResponse response = api.templateClientTemplatenamePost(client, templatename, validate, _file, settings);
        // TODO: test validations
    }

    /**
     * Alter the settings of the most recent version of an existing template. This will generate and return a new   version number.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateClientTemplatenamePutTest() throws ApiException {
        String client = null;
        String templatename = null;
        Object body = null;
        ResourceAndStatusResponse response = api.templateClientTemplatenamePut(client, templatename, body);
        // TODO: test validations
    }

    /**
     * Delete a specific version of a specific template on the server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateClientTemplatenameVersionDeleteTest() throws ApiException {
        String client = null;
        String templatename = null;
        Integer version = null;
        ModelApiResponse response = api.templateClientTemplatenameVersionDelete(client, templatename, version);
        // TODO: test validations
    }

    /**
     * Get details about a specific version of a specific template for a specific client
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateClientTemplatenameVersionGetTest() throws ApiException {
        String client = null;
        String templatename = null;
        Integer version = null;
        Boolean getAllDetails = null;
        String targetClient = null;
        TemplateList response = api.templateClientTemplatenameVersionGet(client, templatename, version, getAllDetails, targetClient);
        // TODO: test validations
    }

    /**
     * Get an upgraded version of template
     *
     * Post a JSON representing a Rule Designer&#39;s tile to retrieve a JSON tile where the template version has   been upgraded
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateClientTemplatenameVersionPostTest() throws ApiException {
        String client = null;
        String templatename = null;
        Integer version = null;
        String targetClient = null;
        Object body = null;
        TemplateUpgradeResponse response = api.templateClientTemplatenameVersionPost(client, templatename, version, targetClient, body);
        // TODO: test validations
    }

    /**
     * Get details about all templates on the server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateGetTest() throws ApiException {
        Integer from = null;
        Integer to = null;
        Boolean allversions = null;
        Boolean getAllDetails = null;
        Boolean basicInfo = null;
        String targetClient = null;
        String searchText = null;
        Boolean includePublic = null;
        List<String> iClients = null;
        TemplateList response = api.templateGet(from, to, allversions, getAllDetails, basicInfo, targetClient, searchText, includePublic, iClients);
        // TODO: test validations
    }

    /**
     * Take a specific version of a template and publish it as a rule.
     *
     * If a rule is already published at this target then it will be &#39;hot-swapped&#39; with this new version with no   interruption to service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateTargetClientTemplatenameVersionPostTest() throws ApiException {
        TargetEnum target = null;
        String client = null;
        String templatename = null;
        Integer version = null;
        String paramSource = null;
        String targetClient = null;
        TemplatePublishSettings templatePublishSettings = null;
        ResourceAndStatusResponse response = api.templateTargetClientTemplatenameVersionPost(target, client, templatename, version, paramSource, targetClient, templatePublishSettings);
        // TODO: test validations
    }

    /**
     * Take a specific version of a template and publish it as a rule. and check if overwriting an existing rule   which has a different template
     *
     * If a rule is already published at this target then it will be &#39;hot-swapped&#39; with this new version with no   interruption to service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void templateTargetClientTemplatenameVersionPutTest() throws ApiException {
        TargetEnum target = null;
        String client = null;
        String templatename = null;
        Integer version = null;
        String targetClient = null;
        Client client2 = null;
        ModelApiResponse response = api.templateTargetClientTemplatenameVersionPut(target, client, templatename, version, targetClient, client2);
        // TODO: test validations
    }

}
