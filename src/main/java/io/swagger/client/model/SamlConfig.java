package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.SamlGroup;
import io.swagger.client.model.Role;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class SamlConfig   {
  
  private Boolean enabled = null;
  private String idpCert = null;
  private String idpUrl = null;
  private String idpIssuer = null;
  private String idpAudience = null;
  private String userAttributeMapEmail = null;
  private String userAttributeMapFirstName = null;
  private String userAttributeMapLastName = null;
  private String newUserMigrationTypes = null;
  private Boolean alternateEmailLoginAllowed = null;
  private String testSlug = null;
  private String modifiedAt = null;
  private String modifiedBy = null;
  private Role defaultNewUserRoles = null;
  private List<Long> defaultNewUserRoleIds = new ArrayList<Long>();
  private Boolean setRolesFromGroups = null;
  private String groupsAttribute = null;
  private SamlGroup groups = null;
  private SamlGroup groupsWithRoleIds = null;
  private Boolean authRequiresRole = null;
  private String url = null;

  
  /**
   * Enable/Disable Saml authentication for the server
   **/
  @ApiModelProperty(value = "Enable/Disable Saml authentication for the server")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Identify Provider Certificate (provided by IdP)
   **/
  @ApiModelProperty(value = "Identify Provider Certificate (provided by IdP)")
  @JsonProperty("idp_cert")
  public String getIdpCert() {
    return idpCert;
  }
  public void setIdpCert(String idpCert) {
    this.idpCert = idpCert;
  }

  
  /**
   * Identify Provider Url (provided by IdP)
   **/
  @ApiModelProperty(value = "Identify Provider Url (provided by IdP)")
  @JsonProperty("idp_url")
  public String getIdpUrl() {
    return idpUrl;
  }
  public void setIdpUrl(String idpUrl) {
    this.idpUrl = idpUrl;
  }

  
  /**
   * Identify Provider Issuer (provided by IdP)
   **/
  @ApiModelProperty(value = "Identify Provider Issuer (provided by IdP)")
  @JsonProperty("idp_issuer")
  public String getIdpIssuer() {
    return idpIssuer;
  }
  public void setIdpIssuer(String idpIssuer) {
    this.idpIssuer = idpIssuer;
  }

  
  /**
   * Identify Provider Audience (set in IdP config). Optional in Looker. Set this only if you want Looker to validate the audience value returned by the IdP.
   **/
  @ApiModelProperty(value = "Identify Provider Audience (set in IdP config). Optional in Looker. Set this only if you want Looker to validate the audience value returned by the IdP.")
  @JsonProperty("idp_audience")
  public String getIdpAudience() {
    return idpAudience;
  }
  public void setIdpAudience(String idpAudience) {
    this.idpAudience = idpAudience;
  }

  
  /**
   * Name of user record attributes used to indicate email address field
   **/
  @ApiModelProperty(value = "Name of user record attributes used to indicate email address field")
  @JsonProperty("user_attribute_map_email")
  public String getUserAttributeMapEmail() {
    return userAttributeMapEmail;
  }
  public void setUserAttributeMapEmail(String userAttributeMapEmail) {
    this.userAttributeMapEmail = userAttributeMapEmail;
  }

  
  /**
   * Name of user record attributes used to indicate first name
   **/
  @ApiModelProperty(value = "Name of user record attributes used to indicate first name")
  @JsonProperty("user_attribute_map_first_name")
  public String getUserAttributeMapFirstName() {
    return userAttributeMapFirstName;
  }
  public void setUserAttributeMapFirstName(String userAttributeMapFirstName) {
    this.userAttributeMapFirstName = userAttributeMapFirstName;
  }

  
  /**
   * Name of user record attributes used to indicate last name
   **/
  @ApiModelProperty(value = "Name of user record attributes used to indicate last name")
  @JsonProperty("user_attribute_map_last_name")
  public String getUserAttributeMapLastName() {
    return userAttributeMapLastName;
  }
  public void setUserAttributeMapLastName(String userAttributeMapLastName) {
    this.userAttributeMapLastName = userAttributeMapLastName;
  }

  
  /**
   * Merge first-time saml login to existing user account by email addresses. When a user logs in for the first time via saml this option will connect this user into their existing account by finding the account with a matching email address by testing the given types of credentials for existing users. Otherwise a new user account will be created for the user. This list (if provided) must be a comma separated list of string like 'email,ldap,google'
   **/
  @ApiModelProperty(value = "Merge first-time saml login to existing user account by email addresses. When a user logs in for the first time via saml this option will connect this user into their existing account by finding the account with a matching email address by testing the given types of credentials for existing users. Otherwise a new user account will be created for the user. This list (if provided) must be a comma separated list of string like 'email,ldap,google'")
  @JsonProperty("new_user_migration_types")
  public String getNewUserMigrationTypes() {
    return newUserMigrationTypes;
  }
  public void setNewUserMigrationTypes(String newUserMigrationTypes) {
    this.newUserMigrationTypes = newUserMigrationTypes;
  }

  
  /**
   * Allow alternate email-based login via '/login/email' for admins and for specified users with the 'login_special_email' permission. This option is useful as a fallback during ldap setup, if ldap config problems occur later, or if you need to support some users who are not in your ldap directory. Looker email/password logins are always disabled for regular users when ldap is enabled.
   **/
  @ApiModelProperty(value = "Allow alternate email-based login via '/login/email' for admins and for specified users with the 'login_special_email' permission. This option is useful as a fallback during ldap setup, if ldap config problems occur later, or if you need to support some users who are not in your ldap directory. Looker email/password logins are always disabled for regular users when ldap is enabled.")
  @JsonProperty("alternate_email_login_allowed")
  public Boolean getAlternateEmailLoginAllowed() {
    return alternateEmailLoginAllowed;
  }
  public void setAlternateEmailLoginAllowed(Boolean alternateEmailLoginAllowed) {
    this.alternateEmailLoginAllowed = alternateEmailLoginAllowed;
  }

  
  /**
   * Slug to identify configurations that are created in order to run a Saml config test
   **/
  @ApiModelProperty(value = "Slug to identify configurations that are created in order to run a Saml config test")
  @JsonProperty("test_slug")
  public String getTestSlug() {
    return testSlug;
  }
  public void setTestSlug(String testSlug) {
    this.testSlug = testSlug;
  }

  
  /**
   * When this config was last modified
   **/
  @ApiModelProperty(value = "When this config was last modified")
  @JsonProperty("modified_at")
  public String getModifiedAt() {
    return modifiedAt;
  }
  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  
  /**
   * User id of user who last modified this config
   **/
  @ApiModelProperty(value = "User id of user who last modified this config")
  @JsonProperty("modified_by")
  public String getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   * (Read-only) Roles that will be applied to new users the first time they login via Saml
   **/
  @ApiModelProperty(value = "(Read-only) Roles that will be applied to new users the first time they login via Saml")
  @JsonProperty("default_new_user_roles")
  public Role getDefaultNewUserRoles() {
    return defaultNewUserRoles;
  }
  public void setDefaultNewUserRoles(Role defaultNewUserRoles) {
    this.defaultNewUserRoles = defaultNewUserRoles;
  }

  
  /**
   * (Write-only) Array of ids of roles that will be applied to new users the first time they login via Saml
   **/
  @ApiModelProperty(value = "(Write-only) Array of ids of roles that will be applied to new users the first time they login via Saml")
  @JsonProperty("default_new_user_role_ids")
  public List<Long> getDefaultNewUserRoleIds() {
    return defaultNewUserRoleIds;
  }
  public void setDefaultNewUserRoleIds(List<Long> defaultNewUserRoleIds) {
    this.defaultNewUserRoleIds = defaultNewUserRoleIds;
  }

  
  /**
   * Set user roles in Looker based on groups from Saml
   **/
  @ApiModelProperty(value = "Set user roles in Looker based on groups from Saml")
  @JsonProperty("set_roles_from_groups")
  public Boolean getSetRolesFromGroups() {
    return setRolesFromGroups;
  }
  public void setSetRolesFromGroups(Boolean setRolesFromGroups) {
    this.setRolesFromGroups = setRolesFromGroups;
  }

  
  /**
   * Name of user record attributes used to indicate groups
   **/
  @ApiModelProperty(value = "Name of user record attributes used to indicate groups")
  @JsonProperty("groups_attribute")
  public String getGroupsAttribute() {
    return groupsAttribute;
  }
  public void setGroupsAttribute(String groupsAttribute) {
    this.groupsAttribute = groupsAttribute;
  }

  
  /**
   * (Read-only) Array of mappings between Saml Groups and Looker Roles
   **/
  @ApiModelProperty(value = "(Read-only) Array of mappings between Saml Groups and Looker Roles")
  @JsonProperty("groups")
  public SamlGroup getGroups() {
    return groups;
  }
  public void setGroups(SamlGroup groups) {
    this.groups = groups;
  }

  
  /**
   * (Write-only) Array of mappings between Saml Groups and arrays of Looker Role ids
   **/
  @ApiModelProperty(value = "(Write-only) Array of mappings between Saml Groups and arrays of Looker Role ids")
  @JsonProperty("groups_with_role_ids")
  public SamlGroup getGroupsWithRoleIds() {
    return groupsWithRoleIds;
  }
  public void setGroupsWithRoleIds(SamlGroup groupsWithRoleIds) {
    this.groupsWithRoleIds = groupsWithRoleIds;
  }

  
  /**
   * Users will not be allowed to login at all unless a role for them is found in Saml if set to true
   **/
  @ApiModelProperty(value = "Users will not be allowed to login at all unless a role for them is found in Saml if set to true")
  @JsonProperty("auth_requires_role")
  public Boolean getAuthRequiresRole() {
    return authRequiresRole;
  }
  public void setAuthRequiresRole(Boolean authRequiresRole) {
    this.authRequiresRole = authRequiresRole;
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
    sb.append("class SamlConfig {\n");
    
    sb.append("    enabled: ").append(StringUtil.toIndentedString(enabled)).append("\n");
    sb.append("    idpCert: ").append(StringUtil.toIndentedString(idpCert)).append("\n");
    sb.append("    idpUrl: ").append(StringUtil.toIndentedString(idpUrl)).append("\n");
    sb.append("    idpIssuer: ").append(StringUtil.toIndentedString(idpIssuer)).append("\n");
    sb.append("    idpAudience: ").append(StringUtil.toIndentedString(idpAudience)).append("\n");
    sb.append("    userAttributeMapEmail: ").append(StringUtil.toIndentedString(userAttributeMapEmail)).append("\n");
    sb.append("    userAttributeMapFirstName: ").append(StringUtil.toIndentedString(userAttributeMapFirstName)).append("\n");
    sb.append("    userAttributeMapLastName: ").append(StringUtil.toIndentedString(userAttributeMapLastName)).append("\n");
    sb.append("    newUserMigrationTypes: ").append(StringUtil.toIndentedString(newUserMigrationTypes)).append("\n");
    sb.append("    alternateEmailLoginAllowed: ").append(StringUtil.toIndentedString(alternateEmailLoginAllowed)).append("\n");
    sb.append("    testSlug: ").append(StringUtil.toIndentedString(testSlug)).append("\n");
    sb.append("    modifiedAt: ").append(StringUtil.toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(StringUtil.toIndentedString(modifiedBy)).append("\n");
    sb.append("    defaultNewUserRoles: ").append(StringUtil.toIndentedString(defaultNewUserRoles)).append("\n");
    sb.append("    defaultNewUserRoleIds: ").append(StringUtil.toIndentedString(defaultNewUserRoleIds)).append("\n");
    sb.append("    setRolesFromGroups: ").append(StringUtil.toIndentedString(setRolesFromGroups)).append("\n");
    sb.append("    groupsAttribute: ").append(StringUtil.toIndentedString(groupsAttribute)).append("\n");
    sb.append("    groups: ").append(StringUtil.toIndentedString(groups)).append("\n");
    sb.append("    groupsWithRoleIds: ").append(StringUtil.toIndentedString(groupsWithRoleIds)).append("\n");
    sb.append("    authRequiresRole: ").append(StringUtil.toIndentedString(authRequiresRole)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
