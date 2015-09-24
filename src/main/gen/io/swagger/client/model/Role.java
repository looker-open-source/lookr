package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.PermissionSet;
import io.swagger.client.model.ModelSet;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class Role   {
  
  private Long id = null;
  private String name = null;
  private PermissionSet permissionSet = null;
  private ModelSet modelSet = null;
  private String url = null;
  private String usersUrl = null;

  
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
   * Name of Role
   **/
  @ApiModelProperty(value = "Name of Role")
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
  @JsonProperty("permission_set")
  public PermissionSet getPermissionSet() {
    return permissionSet;
  }
  public void setPermissionSet(PermissionSet permissionSet) {
    this.permissionSet = permissionSet;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("model_set")
  public ModelSet getModelSet() {
    return modelSet;
  }
  public void setModelSet(ModelSet modelSet) {
    this.modelSet = modelSet;
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

  
  /**
   * Link to get list of users with this role
   **/
  @ApiModelProperty(value = "Link to get list of users with this role")
  @JsonProperty("users_url")
  public String getUsersUrl() {
    return usersUrl;
  }
  public void setUsersUrl(String usersUrl) {
    this.usersUrl = usersUrl;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    permissionSet: ").append(StringUtil.toIndentedString(permissionSet)).append("\n");
    sb.append("    modelSet: ").append(StringUtil.toIndentedString(modelSet)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("    usersUrl: ").append(StringUtil.toIndentedString(usersUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
