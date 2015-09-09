package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Error;
import io.swagger.client.model.SamlMetadataParseResult;
import io.swagger.client.model.LDAPConfig;
import io.swagger.client.model.LDAPConfigTestResult;
import io.swagger.client.model.SamlConfig;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class AuthApi {
  private ApiClient apiClient;

  public AuthApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * fetch and parse saml idp metadata xml
   * ### Fetch the given url and parse it as a Saml IdP metadata document and return the result.\nNote that this requires that the url be public or at least at a location where the Looker instance\ncan fetch it without requiring any special authentication.
   * @param body SAML IdP metadata public url
   * @return SamlMetadataParseResult
   */
  public SamlMetadataParseResult fetchAndParseSamlIdpMetadata (String body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling fetchAndParseSamlIdpMetadata");
     }
     
    // create path and map variables
    String path = "/fetch_and_parse_saml_idp_metadata".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "text/plain"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<SamlMetadataParseResult>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get ldap configuration
   * ### Get the LDAP configuration.\n\nLooker can be optionally configured to authenticate users against an Active Directory or other LDAP directory server.\nLDAP setup requires coordination with an administrator of that directory server.\n\nOnly Looker administrators can read and update the LDAP configuration.\n\nConfiguring LDAP impacts authentication for all users. This configuration should be done carefully.\n\nLooker maintains a single LDAP configuation. It can be read and updated.       Updates only succeed if the new state will be valid (in the sense that all required fields are populated);       it is up to you to ensure that the configuration is appropriate and correct).\n\nLDAP is enabled or disabled for Looker using the **enabled** field.\n\nLooker will never return an **auth_password** field. That value can be set, but never retreived.\n\nSee the [Looker LDAP docs]( http://www.looker.com/docs/admin/security/ldap-setup) for additional information.
   * @return LDAPConfig
   */
  public LDAPConfig ldapConfig () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/ldap_config".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<LDAPConfig>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * update ldap configuration
   * ### Update the LDAP configuration.\n\nConfiguring LDAP impacts authentication for all users. This configuration should be done carefully.\n\nOnly Looker administrators can read and update the LDAP configuration.\n\nLDAP is enabled or disabled for Looker using the **enabled** field.\n\nIt is **highly** recommended that any LDAP setting changes be tested using the APIs below before being set globally.\n\nSee the [Looker LDAP docs]( http://www.looker.com/docs/admin/security/ldap-setup) for additional information.
   * @param body LDAP Config
   * @return LDAPConfig
   */
  public LDAPConfig updateLdapConfig (LDAPConfig body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateLdapConfig");
     }
     
    // create path and map variables
    String path = "/ldap_config".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<LDAPConfig>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * test ldap auth config
   * ### Test the connection authentication settings for an LDAP configuration.\n\nThis tests that the connection is possible and that a &#39;server&#39; account to be used by Looker can       authenticate to the LDAP server given connection and authentication information.\n\n**connection_host**, **connection_port**, and **auth_username**, are required.       **connection_tls** and **auth_password** are optional.\n\nExample:\n```json\n{\n  \&quot;connection_host\&quot;: \&quot;ldap.example.com\&quot;,\n  \&quot;connection_port\&quot;: \&quot;636\&quot;,\n  \&quot;connection_tls\&quot;: true,\n  \&quot;auth_username\&quot;: \&quot;cn=looker,dc=example,dc=com\&quot;,\n  \&quot;auth_password\&quot;: \&quot;secret\&quot;\n}\n```\n\nLooker will never return an **auth_password**. If this request omits the **auth_password** field, then       the **auth_password** value from the active config (if present) will be used for the test.\n\nThe active LDAP settings are not modified.
   * @param body LDAP Config
   * @return LDAPConfigTestResult
   */
  public LDAPConfigTestResult testLdapConfigAuth (LDAPConfig body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling testLdapConfigAuth");
     }
     
    // create path and map variables
    String path = "/ldap_config/test_auth".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<LDAPConfigTestResult>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * test ldap connection config
   * ### Test the connection settings for an LDAP configuration.\n\nThis tests that the connection is possible given a connection_host and connection_port.\n\n**connection_host** and **connection_port** are required. **connection_tls** is optional.\n\nExample:\n```json\n{\n  \&quot;connection_host\&quot;: \&quot;ldap.example.com\&quot;,\n  \&quot;connection_port\&quot;: \&quot;636\&quot;,\n  \&quot;connection_tls\&quot;: true\n}\n```\n\nNo authentication to the LDAP server is attempted.\n\nThe active LDAP settings are not modified.
   * @param body LDAP Config
   * @return LDAPConfigTestResult
   */
  public LDAPConfigTestResult testLdapConfigConnection (LDAPConfig body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling testLdapConfigConnection");
     }
     
    // create path and map variables
    String path = "/ldap_config/test_connection".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<LDAPConfigTestResult>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * test ldap user auth config
   * ### Test the user authentication settings for an LDAP configuration.\n\nThis test accepts a full LDAP configuration along with a username/password pair and attempts to       authenticate the user with the LDAP server. The configuration is validated before attempting the       authentication.\n\nLooker will never return an **auth_password**. If this request omits the **auth_password** field, then       the **auth_password** value from the active config (if present) will be used for the test.\n\n**test_ldap_user** and **test_ldap_password** are required.\n\nThe active LDAP settings are not modified.
   * @param body LDAP Config
   * @return LDAPConfigTestResult
   */
  public LDAPConfigTestResult testLdapConfigUserAuth (LDAPConfig body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling testLdapConfigUserAuth");
     }
     
    // create path and map variables
    String path = "/ldap_config/test_user_auth".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<LDAPConfigTestResult>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * test ldap user info config
   * ### Test the user authentication settings for an LDAP configuration without authenticating the user.\n\nThis test will let you easily test the mapping for user properties and roles for any user without      needing to authenticate as that user.\n\nThis test accepts a full LDAP configuration along with a username and attempts to find the full info      for the user from the LDAP server without actually authenticating the user. So, user password is not      required.The configuration is validated before attempting to contact the server.\n\n**test_ldap_user** is required.\n\nThe active LDAP settings are not modified.
   * @param body LDAP Config
   * @return LDAPConfigTestResult
   */
  public LDAPConfigTestResult testLdapConfigUserInfo (LDAPConfig body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling testLdapConfigUserInfo");
     }
     
    // create path and map variables
    String path = "/ldap_config/test_user_info".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<LDAPConfigTestResult>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * parse saml idp metadata xml
   * ### Parse the given xml as a Saml IdP metadata document and return the result.
   * @param body SAML IdP metadata xml
   * @return SamlMetadataParseResult
   */
  public SamlMetadataParseResult parseSamlIdpMetadata (String body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling parseSamlIdpMetadata");
     }
     
    // create path and map variables
    String path = "/parse_saml_idp_metadata".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "text/plain"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<SamlMetadataParseResult>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get saml configuration
   * ### Get the SAML configuration.\n\nLooker can be optionally configured to authenticate users against a SAML authentication server.\nSAML setup requires coordination with an administrator of that server.\n\nOnly Looker administrators can read and update the SAML configuration.\n\nConfiguring SAML impacts authentication for all users. This configuration should be done carefully.\n\nLooker maintains a single SAML configuation. It can be read and updated.       Updates only succeed if the new state will be valid (in the sense that all required fields are populated);       it is up to you to ensure that the configuration is appropriate and correct).\n\nSAML is enabled or disabled for Looker using the **enabled** field.
   * @return SamlConfig
   */
  public SamlConfig samlConfig () throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/saml_config".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<SamlConfig>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * update saml configuration
   * ### Update the SAML configuration.\n\nConfiguring SAML impacts authentication for all users. This configuration should be done carefully.\n\nOnly Looker administrators can read and update the SAML configuration.\n\nSAML is enabled or disabled for Looker using the **enabled** field.\n\nIt is **highly** recommended that any SAML setting changes be tested using the APIs below before being set globally.
   * @param body SAML Config
   * @return SamlConfig
   */
  public SamlConfig updateSamlConfig (SamlConfig body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling updateSamlConfig");
     }
     
    // create path and map variables
    String path = "/saml_config".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<SamlConfig>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * create saml test configuration
   * ### Create a SAML test configuration.
   * @param body SAML test config
   * @return SamlConfig
   */
  public SamlConfig createSamlTestConfig (SamlConfig body) throws ApiException {
    Object postBody = body;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling createSamlTestConfig");
     }
     
    // create path and map variables
    String path = "/saml_test_configs".replaceAll("\\{format\\}","json");

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

    

    
    
    TypeRef returnType = new TypeRef<SamlConfig>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * get saml test configuration
   * ### Get a SAML test configuration by test_slug.
   * @param testSlug Slug of test config
   * @return SamlConfig
   */
  public SamlConfig samlTestConfig (String testSlug) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'testSlug' is set
     if (testSlug == null) {
        throw new ApiException(400, "Missing the required parameter 'testSlug' when calling samlTestConfig");
     }
     
    // create path and map variables
    String path = "/saml_test_configs/{test_slug}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "test_slug" + "\\}", apiClient.escapeString(testSlug.toString()));

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

    

    
    
    TypeRef returnType = new TypeRef<SamlConfig>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * delete saml test configuration
   * ### Delete a SAML test configuration.
   * @param testSlug Slug of test config
   * @return String
   */
  public String deleteSamlTestConfig (String testSlug) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'testSlug' is set
     if (testSlug == null) {
        throw new ApiException(400, "Missing the required parameter 'testSlug' when calling deleteSamlTestConfig");
     }
     
    // create path and map variables
    String path = "/saml_test_configs/{test_slug}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "test_slug" + "\\}", apiClient.escapeString(testSlug.toString()));

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
  
}
