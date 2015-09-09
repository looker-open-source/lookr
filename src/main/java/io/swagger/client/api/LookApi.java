package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Look;
import io.swagger.client.model.Error;
import io.swagger.client.model.LookWithQuery;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class LookApi {
  private ApiClient apiClient;

  public LookApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LookApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * get all looks
   * ### Get all the looks.
   * @param fields Requested fields.
   * @return List<Look>
   */
  public List<Look> allLooks (String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/looks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<Look>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get look
   * ### Get a Look.\n\nReturn detailed information about the Look and its associated Query.
   * @param lookId Id of look
   * @param fields Requested fields.
   * @return LookWithQuery
   */
  public LookWithQuery look (Long lookId, String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'lookId' is set
     if (lookId == null) {
        throw new ApiException(400, "Missing the required parameter 'lookId' when calling look");
     }
     
    // create path and map variables
    String path = "/looks/{look_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "look_id" + "\\}", apiClient.escapeString(lookId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<LookWithQuery>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * run look
   * ### Run a Look.\n\nGiven a look id and a format, this will run the look&#39;s query and return the results.\n\nSuported formats:\n- json - plain json\n- csv - comma separated values with a header\n- txt - tab separated values with a header\n- html - simple html\n- md - simple markdown\n- sql - shows the generated SQL rather than running the query\n- unified - json that is annotated with additional metadata as used by the Looker web application
   * @param lookId Id of look
   * @param format Format of result
   * @return String
   */
  public String runLook (Long lookId, String format) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'lookId' is set
     if (lookId == null) {
        throw new ApiException(400, "Missing the required parameter 'lookId' when calling runLook");
     }
     
     // verify the required parameter 'format' is set
     if (format == null) {
        throw new ApiException(400, "Missing the required parameter 'format' when calling runLook");
     }
     
    // create path and map variables
    String path = "/looks/{look_id}/run/{format}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "look_id" + "\\}", apiClient.escapeString(lookId.toString()))
      .replaceAll("\\{" + "format" + "\\}", apiClient.escapeString(format.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "text", "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
