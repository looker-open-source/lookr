package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class CredentialsLDAP   {
  
  private String email = null;
  private String ldapId = null;
  private String ldapDn = null;
  private String createdAt = null;
  private String loggedInAt = null;
  private Boolean isDisabled = null;
  private String type = null;
  private String url = null;

  
  /**
   * EMail address
   **/
  @ApiModelProperty(value = "EMail address")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * LDAP Unique ID for this user
   **/
  @ApiModelProperty(value = "LDAP Unique ID for this user")
  @JsonProperty("ldap_id")
  public String getLdapId() {
    return ldapId;
  }
  public void setLdapId(String ldapId) {
    this.ldapId = ldapId;
  }

  
  /**
   * LDAP Distinguished name for this user (as-of the last login)
   **/
  @ApiModelProperty(value = "LDAP Distinguished name for this user (as-of the last login)")
  @JsonProperty("ldap_dn")
  public String getLdapDn() {
    return ldapDn;
  }
  public void setLdapDn(String ldapDn) {
    this.ldapDn = ldapDn;
  }

  
  /**
   * Timestamp for the creation of this credential
   **/
  @ApiModelProperty(value = "Timestamp for the creation of this credential")
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * Timestamp for most recent login using credential
   **/
  @ApiModelProperty(value = "Timestamp for most recent login using credential")
  @JsonProperty("logged_in_at")
  public String getLoggedInAt() {
    return loggedInAt;
  }
  public void setLoggedInAt(String loggedInAt) {
    this.loggedInAt = loggedInAt;
  }

  
  /**
   * Has this credential been disabled?
   **/
  @ApiModelProperty(value = "Has this credential been disabled?")
  @JsonProperty("is_disabled")
  public Boolean getIsDisabled() {
    return isDisabled;
  }
  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  
  /**
   * Short name for the type of this kind of credential
   **/
  @ApiModelProperty(value = "Short name for the type of this kind of credential")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Link to get this item
   **/
  @ApiModelProperty(value = "Link to get this item")
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
    sb.append("class CredentialsLDAP {\n");
    
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    ldapId: ").append(StringUtil.toIndentedString(ldapId)).append("\n");
    sb.append("    ldapDn: ").append(StringUtil.toIndentedString(ldapDn)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    loggedInAt: ").append(StringUtil.toIndentedString(loggedInAt)).append("\n");
    sb.append("    isDisabled: ").append(StringUtil.toIndentedString(isDisabled)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
