package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.LDAPUser;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class LDAPConfigTestResult   {
  
  private String status = null;
  private String message = null;
  private String details = null;
  private LDAPUser user = null;
  private String trace = null;
  private String url = null;

  
  /**
   * Test status code: always 'success' or 'error'
   **/
  @ApiModelProperty(value = "Test status code: always 'success' or 'error'")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Short human readable test about the result
   **/
  @ApiModelProperty(value = "Short human readable test about the result")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Additional details for error cases
   **/
  @ApiModelProperty(value = "Additional details for error cases")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }
  public void setDetails(String details) {
    this.details = details;
  }

  
  /**
   * User details from LDAP server for auth tests
   **/
  @ApiModelProperty(value = "User details from LDAP server for auth tests")
  @JsonProperty("user")
  public LDAPUser getUser() {
    return user;
  }
  public void setUser(LDAPUser user) {
    this.user = user;
  }

  
  /**
   * A more detailed trace incremental results during auth tests
   **/
  @ApiModelProperty(value = "A more detailed trace incremental results during auth tests")
  @JsonProperty("trace")
  public String getTrace() {
    return trace;
  }
  public void setTrace(String trace) {
    this.trace = trace;
  }

  
  /**
   * Link to ldap config
   **/
  @ApiModelProperty(value = "Link to ldap config")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LDAPConfigTestResult {\n");
    
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    details: ").append(StringUtil.toIndentedString(details)).append("\n");
    sb.append("    user: ").append(StringUtil.toIndentedString(user)).append("\n");
    sb.append("    trace: ").append(StringUtil.toIndentedString(trace)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
