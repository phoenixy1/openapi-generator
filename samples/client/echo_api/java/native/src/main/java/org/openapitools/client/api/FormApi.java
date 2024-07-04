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

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Pair;

import org.openapitools.client.model.TestFormObjectMultipartRequestMarker;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0-SNAPSHOT")
public class FormApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public FormApi() {
    this(new ApiClient());
  }

  public FormApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Test form parameter(s)
   * Test form parameter(s)
   * @param integerForm  (optional)
   * @param booleanForm  (optional)
   * @param stringForm  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testFormIntegerBooleanString(Integer integerForm, Boolean booleanForm, String stringForm) throws ApiException {
    ApiResponse<String> localVarResponse = testFormIntegerBooleanStringWithHttpInfo(integerForm, booleanForm, stringForm);
    return localVarResponse.getData();
  }

  /**
   * Test form parameter(s)
   * Test form parameter(s)
   * @param integerForm  (optional)
   * @param booleanForm  (optional)
   * @param stringForm  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testFormIntegerBooleanStringWithHttpInfo(Integer integerForm, Boolean booleanForm, String stringForm) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testFormIntegerBooleanStringRequestBuilder(integerForm, booleanForm, stringForm);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testFormIntegerBooleanString", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testFormIntegerBooleanStringRequestBuilder(Integer integerForm, Boolean booleanForm, String stringForm) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/form/integer/boolean/string";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain");

    List<NameValuePair> formValues = new ArrayList<>();
    if (integerForm != null) {
        formValues.add(new BasicNameValuePair("integer_form", integerForm.toString()));
    }
    if (booleanForm != null) {
        formValues.add(new BasicNameValuePair("boolean_form", booleanForm.toString()));
    }
    if (stringForm != null) {
        formValues.add(new BasicNameValuePair("string_form", stringForm.toString()));
    }
    HttpEntity entity = new UrlEncodedFormEntity(formValues, java.nio.charset.StandardCharsets.UTF_8);
    ByteArrayOutputStream formOutputStream = new ByteArrayOutputStream();
    try {
        entity.writeTo(formOutputStream);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    localVarRequestBuilder
        .header("Content-Type", entity.getContentType().getValue())
        .method("POST", HttpRequest.BodyPublishers
            .ofInputStream(() -> new ByteArrayInputStream(formOutputStream.toByteArray())));
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test form parameter(s) for multipart schema
   * Test form parameter(s) for multipart schema
   * @param marker  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testFormObjectMultipart(TestFormObjectMultipartRequestMarker marker) throws ApiException {
    ApiResponse<String> localVarResponse = testFormObjectMultipartWithHttpInfo(marker);
    return localVarResponse.getData();
  }

  /**
   * Test form parameter(s) for multipart schema
   * Test form parameter(s) for multipart schema
   * @param marker  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testFormObjectMultipartWithHttpInfo(TestFormObjectMultipartRequestMarker marker) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testFormObjectMultipartRequestBuilder(marker);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testFormObjectMultipart", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testFormObjectMultipartRequestBuilder(TestFormObjectMultipartRequestMarker marker) throws ApiException {
    // verify the required parameter 'marker' is set
    if (marker == null) {
      throw new ApiException(400, "Missing the required parameter 'marker' when calling testFormObjectMultipart");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/form/object/multipart";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain");

    MultipartEntityBuilder multiPartBuilder = MultipartEntityBuilder.create();
    boolean hasFiles = false;
    multiPartBuilder.addTextBody("marker", marker.toString());
    HttpEntity entity = multiPartBuilder.build();
    HttpRequest.BodyPublisher formDataPublisher;
    if (hasFiles) {
        Pipe pipe;
        try {
            pipe = Pipe.open();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new Thread(() -> {
            try (OutputStream outputStream = Channels.newOutputStream(pipe.sink())) {
                entity.writeTo(outputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        formDataPublisher = HttpRequest.BodyPublishers.ofInputStream(() -> Channels.newInputStream(pipe.source()));
    } else {
        ByteArrayOutputStream formOutputStream = new ByteArrayOutputStream();
        try {
            entity.writeTo(formOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        formDataPublisher = HttpRequest.BodyPublishers
            .ofInputStream(() -> new ByteArrayInputStream(formOutputStream.toByteArray()));
    }
    localVarRequestBuilder
        .header("Content-Type", entity.getContentType().getValue())
        .method("POST", formDataPublisher);
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test form parameter(s) for oneOf schema
   * Test form parameter(s) for oneOf schema
   * @param form1  (optional)
   * @param form2  (optional)
   * @param form3  (optional)
   * @param form4  (optional)
   * @param id  (optional)
   * @param name  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testFormOneof(String form1, Integer form2, String form3, Boolean form4, Long id, String name) throws ApiException {
    ApiResponse<String> localVarResponse = testFormOneofWithHttpInfo(form1, form2, form3, form4, id, name);
    return localVarResponse.getData();
  }

  /**
   * Test form parameter(s) for oneOf schema
   * Test form parameter(s) for oneOf schema
   * @param form1  (optional)
   * @param form2  (optional)
   * @param form3  (optional)
   * @param form4  (optional)
   * @param id  (optional)
   * @param name  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testFormOneofWithHttpInfo(String form1, Integer form2, String form3, Boolean form4, Long id, String name) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testFormOneofRequestBuilder(form1, form2, form3, form4, id, name);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testFormOneof", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testFormOneofRequestBuilder(String form1, Integer form2, String form3, Boolean form4, Long id, String name) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/form/oneof";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain");

    List<NameValuePair> formValues = new ArrayList<>();
    if (form1 != null) {
        formValues.add(new BasicNameValuePair("form1", form1.toString()));
    }
    if (form2 != null) {
        formValues.add(new BasicNameValuePair("form2", form2.toString()));
    }
    if (form3 != null) {
        formValues.add(new BasicNameValuePair("form3", form3.toString()));
    }
    if (form4 != null) {
        formValues.add(new BasicNameValuePair("form4", form4.toString()));
    }
    if (id != null) {
        formValues.add(new BasicNameValuePair("id", id.toString()));
    }
    if (name != null) {
        formValues.add(new BasicNameValuePair("name", name.toString()));
    }
    HttpEntity entity = new UrlEncodedFormEntity(formValues, java.nio.charset.StandardCharsets.UTF_8);
    ByteArrayOutputStream formOutputStream = new ByteArrayOutputStream();
    try {
        entity.writeTo(formOutputStream);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    localVarRequestBuilder
        .header("Content-Type", entity.getContentType().getValue())
        .method("POST", HttpRequest.BodyPublishers
            .ofInputStream(() -> new ByteArrayInputStream(formOutputStream.toByteArray())));
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
