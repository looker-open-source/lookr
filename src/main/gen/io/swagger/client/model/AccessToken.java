package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class AccessToken   {
  
  private String accessToken = null;
  private String tokenType = null;
  private Long expiresIn = null;

  
  /**
   * Access Token used for API calls
   **/
  @ApiModelProperty(value = "Access Token used for API calls")
  @JsonProperty("access_token")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  
  /**
   * Type of Token
   **/
  @ApiModelProperty(value = "Type of Token")
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  
  /**
   * Number of seconds before the token expires
   **/
  @ApiModelProperty(value = "Number of seconds before the token expires")
  @JsonProperty("expires_in")
  public Long getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    
    sb.append("    accessToken: ").append(StringUtil.toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(StringUtil.toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(StringUtil.toIndentedString(expiresIn)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
