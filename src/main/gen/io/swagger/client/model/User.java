package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.AccessFilter;
import io.swagger.client.model.CredentialsTotp;
import io.swagger.client.model.CredentialsApi3;
import io.swagger.client.model.CredentialsLDAP;
import io.swagger.client.model.Session;
import io.swagger.client.model.CredentialsLookerOpenid;
import io.swagger.client.model.CredentialsSaml;
import io.swagger.client.model.CredentialsEmail;
import io.swagger.client.model.CredentialsApi;
import io.swagger.client.model.CredentialsGoogle;
import java.util.*;
import io.swagger.client.model.CredentialsEmbed;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class User   {
  
  private Long id = null;
  private String firstName = null;
  private String lastName = null;
  private String displayName = null;
  private String email = null;
  private Boolean isDisabled = null;
  private String avatarUrl = null;
  private String homeSpaceId = null;
  private List<AccessFilter> accessFilters = new ArrayList<AccessFilter>();
  private CredentialsEmail credentialsEmail = null;
  private CredentialsTotp credentialsTotp = null;
  private CredentialsLDAP credentialsLdap = null;
  private CredentialsGoogle credentialsGoogle = null;
  private CredentialsSaml credentialsSaml = null;
  private CredentialsApi credentialsApi = null;
  private List<CredentialsApi3> credentialsApi3 = new ArrayList<CredentialsApi3>();
  private List<CredentialsEmbed> credentialsEmbed = new ArrayList<CredentialsEmbed>();
  private CredentialsLookerOpenid credentialsLookerOpenid = null;
  private List<Session> sessions = new ArrayList<Session>();
  private List<Long> roleIds = new ArrayList<Long>();
  private Boolean presumedLookerEmployee = null;
  private Boolean verifiedLookerEmployee = null;
  private String url = null;

  
  /**
   * Unique Id
   **/
  @ApiModelProperty(value = "Unique Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
   * Last name
   **/
  @ApiModelProperty(value = "Last name")
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Full name for display (available only if both first_name and last_name are set)
   **/
  @ApiModelProperty(value = "Full name for display (available only if both first_name and last_name are set)")
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
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
   * Account has been disabled
   **/
  @ApiModelProperty(value = "Account has been disabled")
  @JsonProperty("is_disabled")
  public Boolean getIsDisabled() {
    return isDisabled;
  }
  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  
  /**
   * URL for the avatar image (may be generic)
   **/
  @ApiModelProperty(value = "URL for the avatar image (may be generic)")
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  
  /**
   * ID string for user's home space
   **/
  @ApiModelProperty(value = "ID string for user's home space")
  @JsonProperty("home_space_id")
  public String getHomeSpaceId() {
    return homeSpaceId;
  }
  public void setHomeSpaceId(String homeSpaceId) {
    this.homeSpaceId = homeSpaceId;
  }

  
  /**
   * Model access filters.
   **/
  @ApiModelProperty(value = "Model access filters.")
  @JsonProperty("access_filters")
  public List<AccessFilter> getAccessFilters() {
    return accessFilters;
  }
  public void setAccessFilters(List<AccessFilter> accessFilters) {
    this.accessFilters = accessFilters;
  }

  
  /**
   * Email/Password login credentials
   **/
  @ApiModelProperty(value = "Email/Password login credentials")
  @JsonProperty("credentials_email")
  public CredentialsEmail getCredentialsEmail() {
    return credentialsEmail;
  }
  public void setCredentialsEmail(CredentialsEmail credentialsEmail) {
    this.credentialsEmail = credentialsEmail;
  }

  
  /**
   * Two-factor credentials
   **/
  @ApiModelProperty(value = "Two-factor credentials")
  @JsonProperty("credentials_totp")
  public CredentialsTotp getCredentialsTotp() {
    return credentialsTotp;
  }
  public void setCredentialsTotp(CredentialsTotp credentialsTotp) {
    this.credentialsTotp = credentialsTotp;
  }

  
  /**
   * LDAP credentials
   **/
  @ApiModelProperty(value = "LDAP credentials")
  @JsonProperty("credentials_ldap")
  public CredentialsLDAP getCredentialsLdap() {
    return credentialsLdap;
  }
  public void setCredentialsLdap(CredentialsLDAP credentialsLdap) {
    this.credentialsLdap = credentialsLdap;
  }

  
  /**
   * Google auth credentials
   **/
  @ApiModelProperty(value = "Google auth credentials")
  @JsonProperty("credentials_google")
  public CredentialsGoogle getCredentialsGoogle() {
    return credentialsGoogle;
  }
  public void setCredentialsGoogle(CredentialsGoogle credentialsGoogle) {
    this.credentialsGoogle = credentialsGoogle;
  }

  
  /**
   * Saml auth credentials
   **/
  @ApiModelProperty(value = "Saml auth credentials")
  @JsonProperty("credentials_saml")
  public CredentialsSaml getCredentialsSaml() {
    return credentialsSaml;
  }
  public void setCredentialsSaml(CredentialsSaml credentialsSaml) {
    this.credentialsSaml = credentialsSaml;
  }

  
  /**
   * API user credentials
   **/
  @ApiModelProperty(value = "API user credentials")
  @JsonProperty("credentials_api")
  public CredentialsApi getCredentialsApi() {
    return credentialsApi;
  }
  public void setCredentialsApi(CredentialsApi credentialsApi) {
    this.credentialsApi = credentialsApi;
  }

  
  /**
   * API 3 credentials
   **/
  @ApiModelProperty(value = "API 3 credentials")
  @JsonProperty("credentials_api3")
  public List<CredentialsApi3> getCredentialsApi3() {
    return credentialsApi3;
  }
  public void setCredentialsApi3(List<CredentialsApi3> credentialsApi3) {
    this.credentialsApi3 = credentialsApi3;
  }

  
  /**
   * Embed credentials
   **/
  @ApiModelProperty(value = "Embed credentials")
  @JsonProperty("credentials_embed")
  public List<CredentialsEmbed> getCredentialsEmbed() {
    return credentialsEmbed;
  }
  public void setCredentialsEmbed(List<CredentialsEmbed> credentialsEmbed) {
    this.credentialsEmbed = credentialsEmbed;
  }

  
  /**
   * LookerOpenID credentials. Used for login by Looker Analysts
   **/
  @ApiModelProperty(value = "LookerOpenID credentials. Used for login by Looker Analysts")
  @JsonProperty("credentials_looker_openid")
  public CredentialsLookerOpenid getCredentialsLookerOpenid() {
    return credentialsLookerOpenid;
  }
  public void setCredentialsLookerOpenid(CredentialsLookerOpenid credentialsLookerOpenid) {
    this.credentialsLookerOpenid = credentialsLookerOpenid;
  }

  
  /**
   * Active sessions
   **/
  @ApiModelProperty(value = "Active sessions")
  @JsonProperty("sessions")
  public List<Session> getSessions() {
    return sessions;
  }
  public void setSessions(List<Session> sessions) {
    this.sessions = sessions;
  }

  
  /**
   * Array of ids of the roles for this user
   **/
  @ApiModelProperty(value = "Array of ids of the roles for this user")
  @JsonProperty("role_ids")
  public List<Long> getRoleIds() {
    return roleIds;
  }
  public void setRoleIds(List<Long> roleIds) {
    this.roleIds = roleIds;
  }

  
  /**
   * User is identified as an employee of Looker
   **/
  @ApiModelProperty(value = "User is identified as an employee of Looker")
  @JsonProperty("presumed_looker_employee")
  public Boolean getPresumedLookerEmployee() {
    return presumedLookerEmployee;
  }
  public void setPresumedLookerEmployee(Boolean presumedLookerEmployee) {
    this.presumedLookerEmployee = presumedLookerEmployee;
  }

  
  /**
   * User is identified as an employee of Looker who has been verified via Looker corporate authentication
   **/
  @ApiModelProperty(value = "User is identified as an employee of Looker who has been verified via Looker corporate authentication")
  @JsonProperty("verified_looker_employee")
  public Boolean getVerifiedLookerEmployee() {
    return verifiedLookerEmployee;
  }
  public void setVerifiedLookerEmployee(Boolean verifiedLookerEmployee) {
    this.verifiedLookerEmployee = verifiedLookerEmployee;
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
    sb.append("class User {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(StringUtil.toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(StringUtil.toIndentedString(lastName)).append("\n");
    sb.append("    displayName: ").append(StringUtil.toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(StringUtil.toIndentedString(email)).append("\n");
    sb.append("    isDisabled: ").append(StringUtil.toIndentedString(isDisabled)).append("\n");
    sb.append("    avatarUrl: ").append(StringUtil.toIndentedString(avatarUrl)).append("\n");
    sb.append("    homeSpaceId: ").append(StringUtil.toIndentedString(homeSpaceId)).append("\n");
    sb.append("    accessFilters: ").append(StringUtil.toIndentedString(accessFilters)).append("\n");
    sb.append("    credentialsEmail: ").append(StringUtil.toIndentedString(credentialsEmail)).append("\n");
    sb.append("    credentialsTotp: ").append(StringUtil.toIndentedString(credentialsTotp)).append("\n");
    sb.append("    credentialsLdap: ").append(StringUtil.toIndentedString(credentialsLdap)).append("\n");
    sb.append("    credentialsGoogle: ").append(StringUtil.toIndentedString(credentialsGoogle)).append("\n");
    sb.append("    credentialsSaml: ").append(StringUtil.toIndentedString(credentialsSaml)).append("\n");
    sb.append("    credentialsApi: ").append(StringUtil.toIndentedString(credentialsApi)).append("\n");
    sb.append("    credentialsApi3: ").append(StringUtil.toIndentedString(credentialsApi3)).append("\n");
    sb.append("    credentialsEmbed: ").append(StringUtil.toIndentedString(credentialsEmbed)).append("\n");
    sb.append("    credentialsLookerOpenid: ").append(StringUtil.toIndentedString(credentialsLookerOpenid)).append("\n");
    sb.append("    sessions: ").append(StringUtil.toIndentedString(sessions)).append("\n");
    sb.append("    roleIds: ").append(StringUtil.toIndentedString(roleIds)).append("\n");
    sb.append("    presumedLookerEmployee: ").append(StringUtil.toIndentedString(presumedLookerEmployee)).append("\n");
    sb.append("    verifiedLookerEmployee: ").append(StringUtil.toIndentedString(verifiedLookerEmployee)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
