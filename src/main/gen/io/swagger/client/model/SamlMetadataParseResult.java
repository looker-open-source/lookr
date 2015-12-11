package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class SamlMetadataParseResult   {
  
  private String idpIssuer = null;
  private String idpUrl = null;
  private String idpCert = null;

  
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
    
    sb.append("    idpIssuer: ").append(StringUtil.toIndentedString(idpIssuer)).append("\n");
    sb.append("    idpUrl: ").append(StringUtil.toIndentedString(idpUrl)).append("\n");
    sb.append("    idpCert: ").append(StringUtil.toIndentedString(idpCert)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
