package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class ScheduledTaskLook   {
  
  private Long id = null;
  private String cronString = null;
  private String timezone = null;
  private String type = null;
  private String format = null;
  private Long lookId = null;
  private Boolean requireNoResults = null;
  private Boolean requireResults = null;
  private Boolean requireChange = null;
  private String actions = null;

  
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
   * Cron String
   **/
  @ApiModelProperty(value = "Cron String")
  @JsonProperty("cron_string")
  public String getCronString() {
    return cronString;
  }
  public void setCronString(String cronString) {
    this.cronString = cronString;
  }

  
  /**
   * Timezone
   **/
  @ApiModelProperty(value = "Timezone")
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  
  /**
   * Type
   **/
  @ApiModelProperty(value = "Type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Format
   **/
  @ApiModelProperty(value = "Format")
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  
  /**
   * Look Id
   **/
  @ApiModelProperty(value = "Look Id")
  @JsonProperty("look_id")
  public Long getLookId() {
    return lookId;
  }
  public void setLookId(Long lookId) {
    this.lookId = lookId;
  }

  
  /**
   * Require no results
   **/
  @ApiModelProperty(value = "Require no results")
  @JsonProperty("require_no_results")
  public Boolean getRequireNoResults() {
    return requireNoResults;
  }
  public void setRequireNoResults(Boolean requireNoResults) {
    this.requireNoResults = requireNoResults;
  }

  
  /**
   * Require results
   **/
  @ApiModelProperty(value = "Require results")
  @JsonProperty("require_results")
  public Boolean getRequireResults() {
    return requireResults;
  }
  public void setRequireResults(Boolean requireResults) {
    this.requireResults = requireResults;
  }

  
  /**
   * Require change
   **/
  @ApiModelProperty(value = "Require change")
  @JsonProperty("require_change")
  public Boolean getRequireChange() {
    return requireChange;
  }
  public void setRequireChange(Boolean requireChange) {
    this.requireChange = requireChange;
  }

  
  /**
   * Actions
   **/
  @ApiModelProperty(value = "Actions")
  @JsonProperty("actions")
  public String getActions() {
    return actions;
  }
  public void setActions(String actions) {
    this.actions = actions;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledTaskLook {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    cronString: ").append(StringUtil.toIndentedString(cronString)).append("\n");
    sb.append("    timezone: ").append(StringUtil.toIndentedString(timezone)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    format: ").append(StringUtil.toIndentedString(format)).append("\n");
    sb.append("    lookId: ").append(StringUtil.toIndentedString(lookId)).append("\n");
    sb.append("    requireNoResults: ").append(StringUtil.toIndentedString(requireNoResults)).append("\n");
    sb.append("    requireResults: ").append(StringUtil.toIndentedString(requireResults)).append("\n");
    sb.append("    requireChange: ").append(StringUtil.toIndentedString(requireChange)).append("\n");
    sb.append("    actions: ").append(StringUtil.toIndentedString(actions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
