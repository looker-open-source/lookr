package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class ScheduledTaskDashboard   {
  
  private Long id = null;
  private String cronString = null;
  private String timezone = null;
  private String type = null;
  private Long userId = null;
  private String format = null;
  private String dashboardPath = null;
  private Long dashboardId = null;
  private Double lastRunAt = null;
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
   * Id of User
   **/
  @ApiModelProperty(value = "Id of User")
  @JsonProperty("user_id")
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
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
   * Dashboard Path
   **/
  @ApiModelProperty(value = "Dashboard Path")
  @JsonProperty("dashboard_path")
  public String getDashboardPath() {
    return dashboardPath;
  }
  public void setDashboardPath(String dashboardPath) {
    this.dashboardPath = dashboardPath;
  }

  
  /**
   * Id of Dashboard
   **/
  @ApiModelProperty(value = "Id of Dashboard")
  @JsonProperty("dashboard_id")
  public Long getDashboardId() {
    return dashboardId;
  }
  public void setDashboardId(Long dashboardId) {
    this.dashboardId = dashboardId;
  }

  
  /**
   * Last time the schedule ran
   **/
  @ApiModelProperty(value = "Last time the schedule ran")
  @JsonProperty("last_run_at")
  public Double getLastRunAt() {
    return lastRunAt;
  }
  public void setLastRunAt(Double lastRunAt) {
    this.lastRunAt = lastRunAt;
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
    sb.append("class ScheduledTaskDashboard {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    cronString: ").append(StringUtil.toIndentedString(cronString)).append("\n");
    sb.append("    timezone: ").append(StringUtil.toIndentedString(timezone)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    format: ").append(StringUtil.toIndentedString(format)).append("\n");
    sb.append("    dashboardPath: ").append(StringUtil.toIndentedString(dashboardPath)).append("\n");
    sb.append("    dashboardId: ").append(StringUtil.toIndentedString(dashboardId)).append("\n");
    sb.append("    lastRunAt: ").append(StringUtil.toIndentedString(lastRunAt)).append("\n");
    sb.append("    actions: ").append(StringUtil.toIndentedString(actions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
