package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class Session   {
  
  private Long id = null;
  private String ipAddress = null;
  private String browser = null;
  private String operatingSystem = null;
  private String city = null;
  private String state = null;
  private String country = null;
  private String credentialsType = null;
  private String extendedAt = null;
  private Long extendedCount = null;
  private Long sudoUserId = null;
  private String createdAt = null;
  private String expiresAt = null;
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
   * IP address of user when this session was initiated
   **/
  @ApiModelProperty(value = "IP address of user when this session was initiated")
  @JsonProperty("ip_address")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  
  /**
   * User's browser type
   **/
  @ApiModelProperty(value = "User's browser type")
  @JsonProperty("browser")
  public String getBrowser() {
    return browser;
  }
  public void setBrowser(String browser) {
    this.browser = browser;
  }

  
  /**
   * User's Operating System
   **/
  @ApiModelProperty(value = "User's Operating System")
  @JsonProperty("operating_system")
  public String getOperatingSystem() {
    return operatingSystem;
  }
  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  
  /**
   * City component of user location (derived from IP address)
   **/
  @ApiModelProperty(value = "City component of user location (derived from IP address)")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * State component of user location (derived from IP address)
   **/
  @ApiModelProperty(value = "State component of user location (derived from IP address)")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * Country component of user location (derived from IP address)
   **/
  @ApiModelProperty(value = "Country component of user location (derived from IP address)")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * Type of credentials used for logging in this session
   **/
  @ApiModelProperty(value = "Type of credentials used for logging in this session")
  @JsonProperty("credentials_type")
  public String getCredentialsType() {
    return credentialsType;
  }
  public void setCredentialsType(String credentialsType) {
    this.credentialsType = credentialsType;
  }

  
  /**
   * Time when this session was last extended by the user
   **/
  @ApiModelProperty(value = "Time when this session was last extended by the user")
  @JsonProperty("extended_at")
  public String getExtendedAt() {
    return extendedAt;
  }
  public void setExtendedAt(String extendedAt) {
    this.extendedAt = extendedAt;
  }

  
  /**
   * Number of times this session was extended
   **/
  @ApiModelProperty(value = "Number of times this session was extended")
  @JsonProperty("extended_count")
  public Long getExtendedCount() {
    return extendedCount;
  }
  public void setExtendedCount(Long extendedCount) {
    this.extendedCount = extendedCount;
  }

  
  /**
   * Actual user in the case when this session represents one user sudo'ing as another
   **/
  @ApiModelProperty(value = "Actual user in the case when this session represents one user sudo'ing as another")
  @JsonProperty("sudo_user_id")
  public Long getSudoUserId() {
    return sudoUserId;
  }
  public void setSudoUserId(Long sudoUserId) {
    this.sudoUserId = sudoUserId;
  }

  
  /**
   * Time when this session was initiated
   **/
  @ApiModelProperty(value = "Time when this session was initiated")
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * Time when this session will expire
   **/
  @ApiModelProperty(value = "Time when this session will expire")
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
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
    sb.append("class Session {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(StringUtil.toIndentedString(ipAddress)).append("\n");
    sb.append("    browser: ").append(StringUtil.toIndentedString(browser)).append("\n");
    sb.append("    operatingSystem: ").append(StringUtil.toIndentedString(operatingSystem)).append("\n");
    sb.append("    city: ").append(StringUtil.toIndentedString(city)).append("\n");
    sb.append("    state: ").append(StringUtil.toIndentedString(state)).append("\n");
    sb.append("    country: ").append(StringUtil.toIndentedString(country)).append("\n");
    sb.append("    credentialsType: ").append(StringUtil.toIndentedString(credentialsType)).append("\n");
    sb.append("    extendedAt: ").append(StringUtil.toIndentedString(extendedAt)).append("\n");
    sb.append("    extendedCount: ").append(StringUtil.toIndentedString(extendedCount)).append("\n");
    sb.append("    sudoUserId: ").append(StringUtil.toIndentedString(sudoUserId)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    expiresAt: ").append(StringUtil.toIndentedString(expiresAt)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
