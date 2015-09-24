package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class SamlMetadataParseResult   {
  
  private String status = null;
  private String message = null;
  private String idpIssuer = null;
  private String idpUrl = null;
  private String idpCert = null;

  
  /**
   * Status: 'success' or 'failure'
   **/
  @ApiModelProperty(value = "Status: 'success' or 'failure'")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Error Message
   **/
  @ApiModelProperty(value = "Error Message")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Identify Provider Issuer
   **/
  @ApiModelProperty(value = "Identify Provider Issuer")
  @JsonProperty("idp_issuer")
  public String getIdpIssuer() {
    return idpIssuer;
  }
  public void setIdpIssuer(String idpIssuer) {
    this.idpIssuer = idpIssuer;
  }

  
  /**
   * Identify Provider Url
   **/
  @ApiModelProperty(value = "Identify Provider Url")
  @JsonProperty("idp_url")
  public String getIdpUrl() {
    return idpUrl;
  }
  public void setIdpUrl(String idpUrl) {
    this.idpUrl = idpUrl;
  }

  
  /**
   * Identify Provider Certificate
   **/
  @ApiModelProperty(value = "Identify Provider Certificate")
  @JsonProperty("idp_cert")
  public String getIdpCert() {
    return idpCert;
  }
  public void setIdpCert(String idpCert) {
    this.idpCert = idpCert;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SamlMetadataParseResult {\n");
    
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    idpIssuer: ").append(StringUtil.toIndentedString(idpIssuer)).append("\n");
    sb.append("    idpUrl: ").append(StringUtil.toIndentedString(idpUrl)).append("\n");
    sb.append("    idpCert: ").append(StringUtil.toIndentedString(idpCert)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
