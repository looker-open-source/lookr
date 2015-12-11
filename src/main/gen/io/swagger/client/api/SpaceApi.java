package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.SpaceBase;
import io.swagger.client.model.Error;
import io.swagger.client.model.Space;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class SpaceApi {
  private ApiClient apiClient;

  public SpaceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SpaceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * get all spaces
   * ### Get information about all spaces.
   * @param fields Requested fields.
   * @return List<SpaceBase>
   */
  public List<SpaceBase> allSpaces (String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/spaces".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<SpaceBase>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * create space
   * ### Create a space with specified information.
   * @param body space
   * @return Space
   */
  public Space createSpace (Space body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/spaces".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Space>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get space
   * ### Get information about the space with a specific id.
   * @param spaceId Id of space
   * @param fields Requested fields.
   * @return Space
   */
  public Space space (String spaceId, String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'spaceId' is set
     if (spaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'spaceId' when calling space");
     }
     
    // create path and map variables
    String path = "/spaces/{space_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "space_id" + "\\}", apiClient.escapeString(spaceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Space>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * delete space
   * ### Delete the space with a specific id including any children spaces.\n**DANGER** this will delete all looks and dashboards in the space.
   * @param spaceId Id of space
   * @return String
   */
  public String deleteSpace (String spaceId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'spaceId' is set
     if (spaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'spaceId' when calling deleteSpace");
     }
     
    // create path and map variables
    String path = "/spaces/{space_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "space_id" + "\\}", apiClient.escapeString(spaceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * update space
   * ### Update the space with a specific id.
   * @param spaceId Id of space
   * @param body space
   * @return Space
   */
  public Space updateSpace (String spaceId, Space body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'spaceId' is set
     if (spaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'spaceId' when calling updateSpace");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateSpace");
     }
     
    // create path and map variables
    String path = "/spaces/{space_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "space_id" + "\\}", apiClient.escapeString(spaceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Space>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get ancestors of space
   * ### Get a space&#39;s ancestors
   * @param spaceId Id of space
   * @param fields Requested fields.
   * @return Space
   */
  public Space spaceAncestors (String spaceId, String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'spaceId' is set
     if (spaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'spaceId' when calling spaceAncestors");
     }
     
    // create path and map variables
    String path = "/spaces/{space_id}/ancestors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "space_id" + "\\}", apiClient.escapeString(spaceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Space>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get children of space
   * ### Get a space&#39;s children
   * @param spaceId Id of space
   * @param fields Requested fields.
   * @param page Requested page.
   * @param perPage Results per page.
   * @param sorts Fields to sort by.
   * @return Space
   */
  public Space spaceChildren (String spaceId, String fields, Long page, Long perPage, String sorts) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'spaceId' is set
     if (spaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'spaceId' when calling spaceChildren");
     }
     
    // create path and map variables
    String path = "/spaces/{space_id}/children".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "space_id" + "\\}", apiClient.escapeString(spaceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "per_page", perPage));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sorts", sorts));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Space>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * search children of space
   * ### Search a space&#39;s children
   * @param spaceId Id of space
   * @param fields Requested fields.
   * @param sorts Fields to sort by.
   * @param name Match Space name.
   * @return Space
   */
  public Space spaceChildrenSearch (String spaceId, String fields, String sorts, String name) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'spaceId' is set
     if (spaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'spaceId' when calling spaceChildrenSearch");
     }
     
    // create path and map variables
    String path = "/spaces/{space_id}/children/search".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "space_id" + "\\}", apiClient.escapeString(spaceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    
    queryParams.addAll(apiClient.parameterToPairs("", "sorts", sorts));
    
    queryParams.addAll(apiClient.parameterToPairs("", "name", name));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Space>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get parent of space
   * ### Get a space&#39;s parent
   * @param spaceId Id of space
   * @param fields Requested fields.
   * @return Space
   */
  public Space spaceParent (String spaceId, String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'spaceId' is set
     if (spaceId == null) {
        throw new ApiException(400, "Missing the required parameter 'spaceId' when calling spaceParent");
     }
     
    // create path and map variables
    String path = "/spaces/{space_id}/parent".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "space_id" + "\\}", apiClient.escapeString(spaceId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Space>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
