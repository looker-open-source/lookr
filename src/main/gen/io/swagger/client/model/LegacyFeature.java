package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class LegacyFeature   {
  
  private Long id = null;
  private String name = null;
  private String description = null;
  private Boolean enabledLocally = null;
  private Boolean enabled = null;
  private String disallowedAsOfVersion = null;
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
   * Name
   **/
  @ApiModelProperty(value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Description
   **/
  @ApiModelProperty(value = "Description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Whether this feature has been enabled by a user
   **/
  @ApiModelProperty(value = "Whether this feature has been enabled by a user")
  @JsonProperty("enabled_locally")
  public Boolean getEnabledLocally() {
    return enabledLocally;
  }
  public void setEnabledLocally(Boolean enabledLocally) {
    this.enabledLocally = enabledLocally;
  }

  
  /**
   * Whether this feature is currently enabled
   **/
  @ApiModelProperty(value = "Whether this feature is currently enabled")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   * Looker version where this feature became a legacy feature
   **/
  @ApiModelProperty(value = "Looker version where this feature became a legacy feature")
  @JsonProperty("disallowed_as_of_version")
  public String getDisallowedAsOfVersion() {
    return disallowedAsOfVersion;
  }
  public void setDisallowedAsOfVersion(String disallowedAsOfVersion) {
    this.disallowedAsOfVersion = disallowedAsOfVersion;
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
    sb.append("class LegacyFeature {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    enabledLocally: ").append(StringUtil.toIndentedString(enabledLocally)).append("\n");
    sb.append("    enabled: ").append(StringUtil.toIndentedString(enabled)).append("\n");
    sb.append("    disallowedAsOfVersion: ").append(StringUtil.toIndentedString(disallowedAsOfVersion)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
