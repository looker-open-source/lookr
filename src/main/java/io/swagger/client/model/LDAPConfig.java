package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.LDAPGroup;
import io.swagger.client.model.Role;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class LDAPConfig   {
  
  private Boolean enabled = null;
  private String connectionHost = null;
  private String connectionPort = null;
  private Boolean connectionTls = null;
  private String authUsername = null;
  private String authPassword = null;
  private Boolean hasAuthPassword = null;
  private String userBindBaseDn = null;
  private String userIdAttributeNames = null;
  private String userObjectclass = null;
  private String userAttributeMapEmail = null;
  private String userAttributeMapFirstName = null;
  private String userAttributeMapLastName = null;
  private String userAttributeMapLdapId = null;
  private Boolean mergeNewUsersByEmail = null;
  private Boolean alternateEmailLoginAllowed = null;
  private String modifiedAt = null;
  private String modifiedBy = null;
  private Role defaultNewUserRoles = null;
  private List<Long> defaultNewUserRoleIds = new ArrayList<Long>();
  private Boolean setRolesFromGroups = null;
  private LDAPGroup groups = null;
  private LDAPGroup groupsWithRoleIds = null;
  private Boolean authRequiresRole = null;
  private String groupsFinderType = null;
  private String groupsBaseDn = null;
  private String groupsMemberAttribute = null;
  private String groupsObjectclasses = null;
  private String url = null;

  
  /**
   * Enable/Disable LDAP authentication for the server
   **/
  @ApiModelProperty(value = "Enable/Disable LDAP authentication for the server")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * LDAP server hostname
   **/
  @ApiModelProperty(value = "LDAP server hostname")
  @JsonProperty("connection_host")
  public String getConnectionHost() {
    return connectionHost;
  }
  public void setConnectionHost(String connectionHost) {
    this.connectionHost = connectionHost;
  }

  
  /**
   * LDAP host port
   **/
  @ApiModelProperty(value = "LDAP host port")
  @JsonProperty("connection_port")
  public String getConnectionPort() {
    return connectionPort;
  }
  public void setConnectionPort(String connectionPort) {
    this.connectionPort = connectionPort;
  }

  
  /**
   * Use Transport Layer Security
   **/
  @ApiModelProperty(value = "Use Transport Layer Security")
  @JsonProperty("connection_tls")
  public Boolean getConnectionTls() {
    return connectionTls;
  }
  public void setConnectionTls(Boolean connectionTls) {
    this.connectionTls = connectionTls;
  }

  
  /**
   * Distinguished name of LDAP account used to access the LDAP server
   **/
  @ApiModelProperty(value = "Distinguished name of LDAP account used to access the LDAP server")
  @JsonProperty("auth_username")
  public String getAuthUsername() {
    return authUsername;
  }
  public void setAuthUsername(String authUsername) {
    this.authUsername = authUsername;
  }

  
  /**
   * (Write-only) Password for the LDAP account used to access the LDAP server
   **/
  @ApiModelProperty(value = "(Write-only) Password for the LDAP account used to access the LDAP server")
  @JsonProperty("auth_password")
  public String getAuthPassword() {
    return authPassword;
  }
  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }

  
  /**
   * (Read-only) Has the password been set for the LDAP account used to access the LDAP server
   **/
  @ApiModelProperty(value = "(Read-only) Has the password been set for the LDAP account used to access the LDAP server")
  @JsonProperty("has_auth_password")
  public Boolean getHasAuthPassword() {
    return hasAuthPassword;
  }
  public void setHasAuthPassword(Boolean hasAuthPassword) {
    this.hasAuthPassword = hasAuthPassword;
  }

  
  /**
   * Distinguished name of LDAP node used as the base for user searches
   **/
  @ApiModelProperty(value = "Distinguished name of LDAP node used as the base for user searches")
  @JsonProperty("user_bind_base_dn")
  public String getUserBindBaseDn() {
    return userBindBaseDn;
  }
  public void setUserBindBaseDn(String userBindBaseDn) {
    this.userBindBaseDn = userBindBaseDn;
  }

  
  /**
   * Name(s) of user record attributes used for matching user login id (comma separated list)
   **/
  @ApiModelProperty(value = "Name(s) of user record attributes used for matching user login id (comma separated list)")
  @JsonProperty("user_id_attribute_names")
  public String getUserIdAttributeNames() {
    return userIdAttributeNames;
  }
  public void setUserIdAttributeNames(String userIdAttributeNames) {
    this.userIdAttributeNames = userIdAttributeNames;
  }

  
  /**
   * (Optional) Name of user record objectclass used for finding user during login id
   **/
  @ApiModelProperty(value = "(Optional) Name of user record objectclass used for finding user during login id")
  @JsonProperty("user_objectclass")
  public String getUserObjectclass() {
    return userObjectclass;
  }
  public void setUserObjectclass(String userObjectclass) {
    this.userObjectclass = userObjectclass;
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
   * Name of user record attributes used to indicate unique record id
   **/
  @ApiModelProperty(value = "Name of user record attributes used to indicate unique record id")
  @JsonProperty("user_attribute_map_ldap_id")
  public String getUserAttributeMapLdapId() {
    return userAttributeMapLdapId;
  }
  public void setUserAttributeMapLdapId(String userAttributeMapLdapId) {
    this.userAttributeMapLdapId = userAttributeMapLdapId;
  }

  
  /**
   * Merge first-time ldap login to existing user account by email addresses. When a user logs in for the first time via ldap this option will connect this user into their existing account by finding the account with a matching email address. Otherwise a new user account will be created for the user.
   **/
  @ApiModelProperty(value = "Merge first-time ldap login to existing user account by email addresses. When a user logs in for the first time via ldap this option will connect this user into their existing account by finding the account with a matching email address. Otherwise a new user account will be created for the user.")
  @JsonProperty("merge_new_users_by_email")
  public Boolean getMergeNewUsersByEmail() {
    return mergeNewUsersByEmail;
  }
  public void setMergeNewUsersByEmail(Boolean mergeNewUsersByEmail) {
    this.mergeNewUsersByEmail = mergeNewUsersByEmail;
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
   * (Read-only) Roles that will be applied to new users the first time they login via LDAP
   **/
  @ApiModelProperty(value = "(Read-only) Roles that will be applied to new users the first time they login via LDAP")
  @JsonProperty("default_new_user_roles")
  public Role getDefaultNewUserRoles() {
    return defaultNewUserRoles;
  }
  public void setDefaultNewUserRoles(Role defaultNewUserRoles) {
    this.defaultNewUserRoles = defaultNewUserRoles;
  }

  
  /**
   * (Write-only) Array of ids of roles that will be applied to new users the first time they login via LDAP
   **/
  @ApiModelProperty(value = "(Write-only) Array of ids of roles that will be applied to new users the first time they login via LDAP")
  @JsonProperty("default_new_user_role_ids")
  public List<Long> getDefaultNewUserRoleIds() {
    return defaultNewUserRoleIds;
  }
  public void setDefaultNewUserRoleIds(List<Long> defaultNewUserRoleIds) {
    this.defaultNewUserRoleIds = defaultNewUserRoleIds;
  }

  
  /**
   * Set user roles in Looker based on groups from LDAP
   **/
  @ApiModelProperty(value = "Set user roles in Looker based on groups from LDAP")
  @JsonProperty("set_roles_from_groups")
  public Boolean getSetRolesFromGroups() {
    return setRolesFromGroups;
  }
  public void setSetRolesFromGroups(Boolean setRolesFromGroups) {
    this.setRolesFromGroups = setRolesFromGroups;
  }

  
  /**
   * (Read-only) Array of mappings between LDAP Groups and Looker Roles
   **/
  @ApiModelProperty(value = "(Read-only) Array of mappings between LDAP Groups and Looker Roles")
  @JsonProperty("groups")
  public LDAPGroup getGroups() {
    return groups;
  }
  public void setGroups(LDAPGroup groups) {
    this.groups = groups;
  }

  
  /**
   * (Write-only) Array of mappings between LDAP Groups and arrays of Looker Role ids
   **/
  @ApiModelProperty(value = "(Write-only) Array of mappings between LDAP Groups and arrays of Looker Role ids")
  @JsonProperty("groups_with_role_ids")
  public LDAPGroup getGroupsWithRoleIds() {
    return groupsWithRoleIds;
  }
  public void setGroupsWithRoleIds(LDAPGroup groupsWithRoleIds) {
    this.groupsWithRoleIds = groupsWithRoleIds;
  }

  
  /**
   * Users will not be allowed to login at all unless a role for them is found in LDAP if set to true
   **/
  @ApiModelProperty(value = "Users will not be allowed to login at all unless a role for them is found in LDAP if set to true")
  @JsonProperty("auth_requires_role")
  public Boolean getAuthRequiresRole() {
    return authRequiresRole;
  }
  public void setAuthRequiresRole(Boolean authRequiresRole) {
    this.authRequiresRole = authRequiresRole;
  }

  
  /**
   * Identifier for a strategy for how Looker will search for groups in the LDAP server
   **/
  @ApiModelProperty(value = "Identifier for a strategy for how Looker will search for groups in the LDAP server")
  @JsonProperty("groups_finder_type")
  public String getGroupsFinderType() {
    return groupsFinderType;
  }
  public void setGroupsFinderType(String groupsFinderType) {
    this.groupsFinderType = groupsFinderType;
  }

  
  /**
   * Base dn for finding groups in LDAP searches
   **/
  @ApiModelProperty(value = "Base dn for finding groups in LDAP searches")
  @JsonProperty("groups_base_dn")
  public String getGroupsBaseDn() {
    return groupsBaseDn;
  }
  public void setGroupsBaseDn(String groupsBaseDn) {
    this.groupsBaseDn = groupsBaseDn;
  }

  
  /**
   * LDAP Group attribute that signifies the members of the groups. Most commonly 'member'
   **/
  @ApiModelProperty(value = "LDAP Group attribute that signifies the members of the groups. Most commonly 'member'")
  @JsonProperty("groups_member_attribute")
  public String getGroupsMemberAttribute() {
    return groupsMemberAttribute;
  }
  public void setGroupsMemberAttribute(String groupsMemberAttribute) {
    this.groupsMemberAttribute = groupsMemberAttribute;
  }

  
  /**
   * Optional comma-separated list of supported LDAP objectclass for groups when doing groups searches
   **/
  @ApiModelProperty(value = "Optional comma-separated list of supported LDAP objectclass for groups when doing groups searches")
  @JsonProperty("groups_objectclasses")
  public String getGroupsObjectclasses() {
    return groupsObjectclasses;
  }
  public void setGroupsObjectclasses(String groupsObjectclasses) {
    this.groupsObjectclasses = groupsObjectclasses;
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
    sb.append("class LDAPConfig {\n");
    
    sb.append("    enabled: ").append(StringUtil.toIndentedString(enabled)).append("\n");
    sb.append("    connectionHost: ").append(StringUtil.toIndentedString(connectionHost)).append("\n");
    sb.append("    connectionPort: ").append(StringUtil.toIndentedString(connectionPort)).append("\n");
    sb.append("    connectionTls: ").append(StringUtil.toIndentedString(connectionTls)).append("\n");
    sb.append("    authUsername: ").append(StringUtil.toIndentedString(authUsername)).append("\n");
    sb.append("    authPassword: ").append(StringUtil.toIndentedString(authPassword)).append("\n");
    sb.append("    hasAuthPassword: ").append(StringUtil.toIndentedString(hasAuthPassword)).append("\n");
    sb.append("    userBindBaseDn: ").append(StringUtil.toIndentedString(userBindBaseDn)).append("\n");
    sb.append("    userIdAttributeNames: ").append(StringUtil.toIndentedString(userIdAttributeNames)).append("\n");
    sb.append("    userObjectclass: ").append(StringUtil.toIndentedString(userObjectclass)).append("\n");
    sb.append("    userAttributeMapEmail: ").append(StringUtil.toIndentedString(userAttributeMapEmail)).append("\n");
    sb.append("    userAttributeMapFirstName: ").append(StringUtil.toIndentedString(userAttributeMapFirstName)).append("\n");
    sb.append("    userAttributeMapLastName: ").append(StringUtil.toIndentedString(userAttributeMapLastName)).append("\n");
    sb.append("    userAttributeMapLdapId: ").append(StringUtil.toIndentedString(userAttributeMapLdapId)).append("\n");
    sb.append("    mergeNewUsersByEmail: ").append(StringUtil.toIndentedString(mergeNewUsersByEmail)).append("\n");
    sb.append("    alternateEmailLoginAllowed: ").append(StringUtil.toIndentedString(alternateEmailLoginAllowed)).append("\n");
    sb.append("    modifiedAt: ").append(StringUtil.toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedBy: ").append(StringUtil.toIndentedString(modifiedBy)).append("\n");
    sb.append("    defaultNewUserRoles: ").append(StringUtil.toIndentedString(defaultNewUserRoles)).append("\n");
    sb.append("    defaultNewUserRoleIds: ").append(StringUtil.toIndentedString(defaultNewUserRoleIds)).append("\n");
    sb.append("    setRolesFromGroups: ").append(StringUtil.toIndentedString(setRolesFromGroups)).append("\n");
    sb.append("    groups: ").append(StringUtil.toIndentedString(groups)).append("\n");
    sb.append("    groupsWithRoleIds: ").append(StringUtil.toIndentedString(groupsWithRoleIds)).append("\n");
    sb.append("    authRequiresRole: ").append(StringUtil.toIndentedString(authRequiresRole)).append("\n");
    sb.append("    groupsFinderType: ").append(StringUtil.toIndentedString(groupsFinderType)).append("\n");
    sb.append("    groupsBaseDn: ").append(StringUtil.toIndentedString(groupsBaseDn)).append("\n");
    sb.append("    groupsMemberAttribute: ").append(StringUtil.toIndentedString(groupsMemberAttribute)).append("\n");
    sb.append("    groupsObjectclasses: ").append(StringUtil.toIndentedString(groupsObjectclasses)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
