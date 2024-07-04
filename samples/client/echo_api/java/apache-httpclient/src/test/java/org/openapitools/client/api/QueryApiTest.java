/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for QueryApi
 */
@Disabled
public class QueryApiTest {

    private final QueryApi api = new QueryApi();

    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryIntegerBooleanStringTest() throws ApiException {
        Integer integerQuery = null;
        Boolean booleanQuery = null;
        String stringQuery = null;
        String response = api.testQueryIntegerBooleanString(integerQuery, booleanQuery, stringQuery);

        // TODO: test validations
    }
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryStyleFormExplodeTrueArrayStringTest() throws ApiException {
        TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter queryObject = null;
        String response = api.testQueryStyleFormExplodeTrueArrayString(queryObject);

        // TODO: test validations
    }
    /**
     * Test query parameter(s)
     *
     * Test query parameter(s)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testQueryStyleFormExplodeTrueObjectTest() throws ApiException {
        Pet queryObject = null;
        String response = api.testQueryStyleFormExplodeTrueObject(queryObject);

        // TODO: test validations
    }
}
