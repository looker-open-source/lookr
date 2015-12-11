package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class SamlGroupWrite   {
  
  private String name = null;
  private List<Long> roleIds = new ArrayList<Long>();
  private String url = null;

  
  /**
   * Name of group in Saml
   **/
  @ApiModelProperty(value = "Name of group in Saml")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Looker Role Ids
   **/
  @ApiModelProperty(value = "Looker Role Ids")
  @JsonProperty("role_ids")
  public List<Long> getRoleIds() {
    return roleIds;
  }
  public void setRoleIds(List<Long> roleIds) {
    this.roleIds = roleIds;
  }

  
  /**
   * Link to saml config
   **/
  @ApiModelProperty(value = "Link to saml config")
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
    sb.append("class SamlGroupWrite {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    roleIds: ").append(StringUtil.toIndentedString(roleIds)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
