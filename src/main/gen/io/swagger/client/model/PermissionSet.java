package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class PermissionSet   {
  
  private Long id = null;
  private String name = null;
  private List<String> permissions = new ArrayList<String>();
  private Boolean builtIn = null;
  private Boolean allAccess = null;
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
   * Name of PermissionSet
   **/
  @ApiModelProperty(value = "Name of PermissionSet")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("built_in")
  public Boolean getBuiltIn() {
    return builtIn;
  }
  public void setBuiltIn(Boolean builtIn) {
    this.builtIn = builtIn;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("all_access")
  public Boolean getAllAccess() {
    return allAccess;
  }
  public void setAllAccess(Boolean allAccess) {
    this.allAccess = allAccess;
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
    sb.append("class PermissionSet {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(StringUtil.toIndentedString(permissions)).append("\n");
    sb.append("    builtIn: ").append(StringUtil.toIndentedString(builtIn)).append("\n");
    sb.append("    allAccess: ").append(StringUtil.toIndentedString(allAccess)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
