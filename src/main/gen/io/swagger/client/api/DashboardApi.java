package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.DashboardBase;
import io.swagger.client.model.Error;
import io.swagger.client.model.Dashboard;
import io.swagger.client.model.LookMovePlan;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class DashboardApi {
  private ApiClient apiClient;

  public DashboardApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DashboardApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * get all dashboards
   * Get information about all dashboards.
   * @param fields Requested fieds.
   * @return DashboardBase
   */
  public DashboardBase allDashboards (String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/dashboards".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<DashboardBase>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * create dashboard
   * ### Create a dashboard with specified information.
   * @param body dashboard
   * @return Dashboard
   */
  public Dashboard createDashboard (Dashboard body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/dashboards".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<Dashboard>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * copy dashboards to space
   * ### Copy dashboards with specified ids to space
   * @param body dashboard
   * @param spaceId Destination space id.
   * @param dashboardIds Dashboard ids to copy.
   * @return String
   */
  public String copyDashboards (Dashboard body, String spaceId, List<String> dashboardIds) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/dashboards/copy".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "space_id", spaceId));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "dashboard_ids", dashboardIds));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * move dashboards to space
   * ### Move dashboards with specified ids to space
   * @param body dashboard
   * @param spaceId Destination space id.
   * @param dashboardIds Dashboard ids to move.
   * @return String
   */
  public String moveDashboards (Dashboard body, String spaceId, List<String> dashboardIds) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling moveDashboards");
     }
     
    // create path and map variables
    String path = "/dashboards/move".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "space_id", spaceId));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "dashboard_ids", dashboardIds));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * plan for moving dashboards to space
   * ### Plan for moving dashboards with specified ids.
   * @param spaceId Destination space id.
   * @param dashboardIds Dashboard ids to move.
   * @return LookMovePlan
   */
  public LookMovePlan dashboardsMovePlan (String spaceId, List<String> dashboardIds) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/dashboards/move_plan".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "space_id", spaceId));
    
    queryParams.addAll(apiClient.parameterToPairs("multi", "dashboard_ids", dashboardIds));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<LookMovePlan>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get dashboard
   * ### Get information about the dashboard with a specific id.
   * @param dashboardId Id of dashboard
   * @param fields Requested fields.
   * @return Dashboard
   */
  public Dashboard dashboard (String dashboardId, String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'dashboardId' is set
     if (dashboardId == null) {
        throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling dashboard");
     }
     
    // create path and map variables
    String path = "/dashboards/{dashboard_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<Dashboard>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * delete dashboard
   * ### Delete the dashboard with a specific id.
   * @param dashboardId Id of dashboard
   * @return String
   */
  public String deleteDashboard (String dashboardId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'dashboardId' is set
     if (dashboardId == null) {
        throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling deleteDashboard");
     }
     
    // create path and map variables
    String path = "/dashboards/{dashboard_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<String>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * update dashboard
   * ### Update the dashboard with a specific id.
   * @param dashboardId Id of dashboard
   * @param body dashboard
   * @return Dashboard
   */
  public Dashboard updateDashboard (String dashboardId, Dashboard body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'dashboardId' is set
     if (dashboardId == null) {
        throw new ApiException(400, "Missing the required parameter 'dashboardId' when calling updateDashboard");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateDashboard");
     }
     
    // create path and map variables
    String path = "/dashboards/{dashboard_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dashboard_id" + "\\}", apiClient.escapeString(dashboardId.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<Dashboard>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
