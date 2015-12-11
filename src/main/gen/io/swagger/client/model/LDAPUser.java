package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class LDAPUser   {
  
  private String email = null;
  private String firstName = null;
  private String lastName = null;
  private String ldapId = null;
  private List<String> allEmails = new ArrayList<String>();
  private String ldapDn = null;
  private List<String> roles = new ArrayList<String>();
  private String url = null;

  
  /**
   * Primary email address
   **/
  @ApiModelProperty(value = "Primary email address")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * First name
   **/
  @ApiModelProperty(value = "First name")
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Last Name
   **/
  @ApiModelProperty(value = "Last Name")
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * LDAP's Unique ID for the user
   **/
  @ApiModelProperty(value = "LDAP's Unique ID for the user")
  @JsonProperty("ldap_id")
  public String getLdapId() {
    return ldapId;
  }
  public void setLdapId(String ldapId) {
    this.ldapId = ldapId;
  }

  
  /**
   * Array of user's email addresses and aliases for use in migration
   **/
  @ApiModelProperty(value = "Array of user's email addresses and aliases for use in migration")
  @JsonProperty("all_emails")
  public List<String> getAllEmails() {
    return allEmails;
  }
  public void setAllEmails(List<String> allEmails) {
    this.allEmails = allEmails;
  }

  
  /**
   * LDAP's distinguished name for the user record
   **/
  @ApiModelProperty(value = "LDAP's distinguished name for the user record")
  @JsonProperty("ldap_dn")
  public String getLdapDn() {
    return ldapDn;
  }
  public void setLdapDn(String ldapDn) {
    this.ldapDn = ldapDn;
  }

  
  /**
   * Array of user's roles (role names only)
   **/
  @ApiModelProperty(value = "Array of user's roles (role names only)")
  @JsonProperty("roles")
  public List<String> getRoles() {
    return roles;
  }
  public void setRoles(List<String> roles) {
    this.roles = roles;
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
    sb.append("class LDAPUser {\n");
    
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    ldapId: ").append(StringUtil.toIndentedString(ldapId)).append("\n");
    sb.append("    allEmails: ").append(StringUtil.toIndentedString(allEmails)).append("\n");
    sb.append("    ldapDn: ").append(StringUtil.toIndentedString(ldapDn)).append("\n");
    sb.append("    roles: ").append(StringUtil.toIndentedString(roles)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
