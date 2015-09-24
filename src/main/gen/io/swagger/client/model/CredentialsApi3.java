package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class CredentialsApi3   {
  
  private Long id = null;
  private String clientId = null;
  private String createdAt = null;
  private Boolean isDisabled = null;
  private String type = null;
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
   * API key client_id
   **/
  @ApiModelProperty(value = "API key client_id")
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
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
    sb.append("class CredentialsApi3 {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(StringUtil.toIndentedString(clientId)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    isDisabled: ").append(StringUtil.toIndentedString(isDisabled)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
