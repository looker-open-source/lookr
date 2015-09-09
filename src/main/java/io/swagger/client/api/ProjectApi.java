package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Error;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class ProjectApi {
  private ApiClient apiClient;

  public ProjectApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProjectApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Reset a project to the version that is in production.
   * ### Reset a project with a specified ID to the version of the project that is in production.\n\n**DANGER** this will delete any changes that have not been pushed to a remote repository.
   * @param projectId Id of project
   * @return Boolean
   */
  public Boolean resetProjectToProduction (String projectId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'projectId' is set
     if (projectId == null) {
        throw new ApiException(400, "Missing the required parameter 'projectId' when calling resetProjectToProduction");
     }
     
    // create path and map variables
    String path = "/projects/{project_id}/reset_to_production".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<Boolean>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
