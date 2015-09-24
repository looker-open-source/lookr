package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Query;
import io.swagger.client.model.Error;
import io.swagger.client.model.RunningQueries;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class QueryApi {
  private ApiClient apiClient;

  public QueryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QueryApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * create query
   * ### Create a query.\n\nThis allows you to create a new query that you can later run. Looker queries are immutable once created\nand are not deleted. If you create a query that is exactly like an existing query then the existing query\nwill be returned and no new query will be created. Whether a new query is created or not, you can use\nthe &#39;id&#39; in the returned query with the &#39;run&#39; method.\n\nThe query parameters are passed as json in the body of the request.
   * @param body query
   * @return Query
   */
  public Query createQuery (Query body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/queries".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<Query>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * run url encoded query
   * ### Run an URL encoded query.\n\nThis requires the caller to encode the specifiers for the query into the URL query part using\nLooker-specific syntax as explained below.\n\nGenerally, you would want to use one of the methods that takes the parameters as json in the POST body\nfor creating and/or running queries. This method exists for cases where one really needs to encode the\nparamaters into the URL of a single &#39;GET&#39; request. This matches the way that the Looker UI formats\n&#39;explore&#39; URLs etc.\n\nThe parameters here are very similar to the json body formatting except that the filter syntax is\ntricky. Unfortunately, this format makes this method not currently callible via the &#39;Try it out!&#39; button\nin this documentation page. But, this is callable  when creating URLs manually or when using the Looker SDK.\n\nHere is an example inline query URL:\n\n\&quot;https://looker.mycompany.com:19999/api/3.0/queries/models/thelook/views/inventory_items/run/json?fields=category.name,inventory_items.days_in_inventory_tier,products.count&amp;f[category.name]=socks&amp;sorts=products.count+desc+0&amp;limit=500&amp;query_timezone=America/Los_Angeles\&quot;\n\nWhen calling the Ruby SDK, one passes the query parameter parts as a hash. The hash to match the above would like like:\n\n```\n{\n  :fields =&gt; \&quot;category.name,inventory_items.days_in_inventory_tier,products.count\&quot;,\n  :\&quot;f[category.name]\&quot; =&gt; \&quot;socks\&quot;,\n  :sorts =&gt; \&quot;products.count desc 0\&quot;,\n  :limit =&gt; \&quot;500\&quot;,\n  :query_timezone =&gt; \&quot;America/Los_Angeles\&quot;\n}\n```\n\nAgain, it is generally easier to use the variant of this method that passes the full query in the POST body.\nThis method is available for cases where other alternatives won&#39;t fit the need.\n\nSuported formats:\n- json - plain json\n- csv - comma separated values with a header\n- txt - tab separated values with a header\n- html - simple html\n- md - simple markdown\n- sql - shows the generated SQL rather than running the query\n- unified - json that is annotated with additional metadata as used by the Looker web application
   * @param modelName Model name
   * @param viewName View name
   * @param format Format of result
   * @return String
   */
  public String runUrlEncodedQuery (String modelName, String viewName, String format) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'modelName' is set
     if (modelName == null) {
        throw new ApiException(400, "Missing the required parameter 'modelName' when calling runUrlEncodedQuery");
     }
     
     // verify the required parameter 'viewName' is set
     if (viewName == null) {
        throw new ApiException(400, "Missing the required parameter 'viewName' when calling runUrlEncodedQuery");
     }
     
     // verify the required parameter 'format' is set
     if (format == null) {
        throw new ApiException(400, "Missing the required parameter 'format' when calling runUrlEncodedQuery");
     }
     
    // create path and map variables
    String path = "/queries/models/{model_name}/views/{view_name}/run/{format}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "model_name" + "\\}", apiClient.escapeString(modelName.toString()))
      .replaceAll("\\{" + "view_name" + "\\}", apiClient.escapeString(viewName.toString()))
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
  
  /**
   * run inline query
   * ### Run the query that is specified inline in the posted body.\n\nThis allows running a query as defined in json in the posted body. This combines\nthe two actions of posting &amp; running a query into one step.\n\nHere is an example body in json:\n```\n{\n  \&quot;model\&quot;:\&quot;thelook\&quot;,\n  \&quot;view\&quot;:\&quot;inventory_items\&quot;,\n  \&quot;fields\&quot;:[\&quot;category.name\&quot;,\&quot;inventory_items.days_in_inventory_tier\&quot;,\&quot;products.count\&quot;],\n  \&quot;filters\&quot;:{\&quot;category.name\&quot;:\&quot;socks\&quot;},\n  \&quot;sorts\&quot;:[\&quot;products.count desc 0\&quot;],\n  \&quot;limit\&quot;:\&quot;500\&quot;,\n  \&quot;query_timezone\&quot;:\&quot;America/Los_Angeles\&quot;\n}\n```\n\nWhen using the Ruby SDK this would be passed as a Ruby hash like:\n```\n{\n :model=&gt;\&quot;thelook\&quot;,\n :view=&gt;\&quot;inventory_items\&quot;,\n :fields=&gt;\n  [\&quot;category.name\&quot;,\n   \&quot;inventory_items.days_in_inventory_tier\&quot;,\n   \&quot;products.count\&quot;],\n :filters=&gt;{:\&quot;category.name\&quot;=&gt;\&quot;socks\&quot;},\n :sorts=&gt;[\&quot;products.count desc 0\&quot;],\n :limit=&gt;\&quot;500\&quot;,\n :query_timezone=&gt;\&quot;America/Los_Angeles\&quot;,\n}\n```\n\nThis will return the result of running the query in the format specified by the &#39;format&#39; paramater.\n\nSuported formats:\n- json - plain json\n- csv - comma separated values with a header\n- txt - tab separated values with a header\n- html - simple html\n- md - simple markdown\n- sql - shows the generated SQL rather than running the query\n- unified - json that is annotated with additional metadata as used by the Looker web application
   * @param format Format of result
   * @param body inline query
   * @return String
   */
  public String runInlineQuery (String format, Query body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'format' is set
     if (format == null) {
        throw new ApiException(400, "Missing the required parameter 'format' when calling runInlineQuery");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling runInlineQuery");
     }
     
    // create path and map variables
    String path = "/queries/run/{format}".replaceAll("\\{format\\}","json")
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
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Create a Query and run it asynchronously.
   * Given a set of properties for a Query, fetches or creates the Query and starts running it asynchronously.\nThe Query Task results endpoint can be used to fetch the query.
   * @param body Query data
   * @param format Format of the response. Default is json.
   * @return RunningQueries
   */
  public RunningQueries createQueryAndRunAsync (Query body, String format) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling createQueryAndRunAsync");
     }
     
    // create path and map variables
    String path = "/queries/run_async".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "format", format));
    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<RunningQueries>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get query for slug
   * ### Get the query for a given query slug.\n\nThis returns the query for the &#39;slug&#39; in a query share URL.\n\nThe &#39;slug&#39; is a randomly chosen short string that is used as an alternative to the query&#39;s id value\nfor use in URLs etc. This method exists as a convenience to help you use the API to &#39;find&#39; queries that\nhave been created using the Looker UI.\n\nYou can use the Looker explore page to build a query and then choose the &#39;Share&#39; option to\nshow the share url for the query. Share urls generally look something like &#39;https://looker.yourcompany/x/vwGSbfc&#39;.\nThe trailing &#39;vwGSbfc&#39; is the share slug. You can pass that string to this api method to get details about the query.\nThose details include the &#39;id&#39; that you can use to run the query. Or, you can copy the query body\n(perhaps with your own modification) and use that as the basis to make/run new queries.
   * @param slug Slug of query
   * @param fields Requested fields.
   * @return Query
   */
  public Query queryForSlug (String slug, String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'slug' is set
     if (slug == null) {
        throw new ApiException(400, "Missing the required parameter 'slug' when calling queryForSlug");
     }
     
    // create path and map variables
    String path = "/queries/slug/{slug}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "slug" + "\\}", apiClient.escapeString(slug.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<Query>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get query
   * ### Get a previously created query by id.\n\nA Looker query object includes the various parameters that define a database query that has been run or\ncould be run in the future. These parameters include: model, view, fields, filters, pivots, etc.\nQuery *results* are not part of the query object.\n\nQuery objects are unique and immutable. Query objects are created automatically in Looker as users explore data.\nLooker does not delete them; they become part of the query history. When asked to create a query for\nany given set of parameters, Looker will first try to find an existing query object with matching\nparameters and will only create a new object when an appropriate object can not be found.\n\nThis &#39;get&#39; method is used to get the details about a query for a given id. See the other methods here\nto &#39;create&#39; and &#39;run&#39; queries.\n\nNote that some fields like &#39;filter_config&#39; and &#39;vis_config&#39; etc are specific to how the Looker UI\nbuilds queries and visualizations and are not generally useful for API use. They are not required when\ncreating new queries and can usually just be ignored.
   * @param queryId Id of query
   * @param fields Requested fields.
   * @return Query
   */
  public Query query (Long queryId, String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'queryId' is set
     if (queryId == null) {
        throw new ApiException(400, "Missing the required parameter 'queryId' when calling query");
     }
     
    // create path and map variables
    String path = "/queries/{query_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "query_id" + "\\}", apiClient.escapeString(queryId.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<Query>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * run query
   * ### Run a saved query.\n\nThis runs a previously saved query. You can use this on a query that was generated in the Looker UI\nor one that you have explicitly created using the API. You can also use a query &#39;id&#39; from a saved &#39;Look&#39;.\n\nThis will return the result of running the query in the format specified by the &#39;format&#39; paramater.\n\nSuported formats:\n- json - plain json\n- csv - comma separated values with a header\n- txt - tab separated values with a header\n- html - simple html\n- md - simple markdown\n- sql - shows the generated SQL rather than running the query\n- unified - json that is annotated with additional metadata as used by the Looker web application
   * @param queryId Id of query
   * @param format Format of result
   * @return String
   */
  public String runQuery (Long queryId, String format) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'queryId' is set
     if (queryId == null) {
        throw new ApiException(400, "Missing the required parameter 'queryId' when calling runQuery");
     }
     
     // verify the required parameter 'format' is set
     if (format == null) {
        throw new ApiException(400, "Missing the required parameter 'format' when calling runQuery");
     }
     
    // create path and map variables
    String path = "/queries/{query_id}/run/{format}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "query_id" + "\\}", apiClient.escapeString(queryId.toString()))
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
  
  /**
   * Run a Query asynchronously.
   * ### Run a saved query asynchronously.\n\nRuns a previously created query asynchronously. Returns a Query Task ID\nwhich can be used to fetch the results from the Query Tasks results endpoint.
   * @param queryId ID of query
   * @param body async query run
   * @return RunningQueries
   */
  public RunningQueries runAsync (Long queryId, RunningQueries body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'queryId' is set
     if (queryId == null) {
        throw new ApiException(400, "Missing the required parameter 'queryId' when calling runAsync");
     }
     
    // create path and map variables
    String path = "/queries/{query_id}/run_async".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "query_id" + "\\}", apiClient.escapeString(queryId.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<RunningQueries>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get a Query Task
   * Fetch a Query Task.\n\nQuery Tasks are generated by running queries asynchronously. They are represented by a GUID returned\nfrom one of the async query endpoints.
   * @param queryTaskId ID of the Query Task
   * @param fields Requested fields.
   * @return RunningQueries
   */
  public RunningQueries queryTask (String queryTaskId, String fields) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'queryTaskId' is set
     if (queryTaskId == null) {
        throw new ApiException(400, "Missing the required parameter 'queryTaskId' when calling queryTask");
     }
     
    // create path and map variables
    String path = "/query_tasks/{query_task_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "query_task_id" + "\\}", apiClient.escapeString(queryTaskId.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<RunningQueries>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get a Query Task&#39;s results
   * Fetch a Query Task&#39;s results.
   * @param queryTaskId ID of the Query Task
   * @return String
   */
  public String queryTaskResults (String queryTaskId) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'queryTaskId' is set
     if (queryTaskId == null) {
        throw new ApiException(400, "Missing the required parameter 'queryTaskId' when calling queryTaskResults");
     }
     
    // create path and map variables
    String path = "/query_tasks/{query_task_id}/results".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "query_task_id" + "\\}", apiClient.escapeString(queryTaskId.toString()));

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
