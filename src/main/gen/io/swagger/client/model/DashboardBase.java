package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.ScheduledTaskDashboard;
import io.swagger.client.model.SpaceBase;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class DashboardBase   {
  
  private String id = null;
  private Long userId = null;
  private String title = null;
  private String description = null;
  private Boolean readonly = null;
  private Boolean autoRun = null;
  private Boolean hidden = null;
  private String refreshInterval = null;
  private Long refreshIntervalToI = null;
  private SpaceBase space = null;
  private String model = null;
  private ScheduledTaskDashboard task = null;

  
  /**
   * Unique Id
   **/
  @ApiModelProperty(value = "Unique Id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
   * Look Title
   **/
  @ApiModelProperty(value = "Look Title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
   * Is Read-only
   **/
  @ApiModelProperty(value = "Is Read-only")
  @JsonProperty("readonly")
  public Boolean getReadonly() {
    return readonly;
  }
  public void setReadonly(Boolean readonly) {
    this.readonly = readonly;
  }

  
  /**
   * Is Auto-run
   **/
  @ApiModelProperty(value = "Is Auto-run")
  @JsonProperty("auto_run")
  public Boolean getAutoRun() {
    return autoRun;
  }
  public void setAutoRun(Boolean autoRun) {
    this.autoRun = autoRun;
  }

  
  /**
   * Is Hidden
   **/
  @ApiModelProperty(value = "Is Hidden")
  @JsonProperty("hidden")
  public Boolean getHidden() {
    return hidden;
  }
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  
  /**
   * Refresh Interval
   **/
  @ApiModelProperty(value = "Refresh Interval")
  @JsonProperty("refresh_interval")
  public String getRefreshInterval() {
    return refreshInterval;
  }
  public void setRefreshInterval(String refreshInterval) {
    this.refreshInterval = refreshInterval;
  }

  
  /**
   * Refresh Interval as Integer
   **/
  @ApiModelProperty(value = "Refresh Interval as Integer")
  @JsonProperty("refresh_interval_to_i")
  public Long getRefreshIntervalToI() {
    return refreshIntervalToI;
  }
  public void setRefreshIntervalToI(Long refreshIntervalToI) {
    this.refreshIntervalToI = refreshIntervalToI;
  }

  
  /**
   * Space
   **/
  @ApiModelProperty(value = "Space")
  @JsonProperty("space")
  public SpaceBase getSpace() {
    return space;
  }
  public void setSpace(SpaceBase space) {
    this.space = space;
  }

  
  /**
   * Model
   **/
  @ApiModelProperty(value = "Model")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   * ScheduledTask
   **/
  @ApiModelProperty(value = "ScheduledTask")
  @JsonProperty("task")
  public ScheduledTaskDashboard getTask() {
    return task;
  }
  public void setTask(ScheduledTaskDashboard task) {
    this.task = task;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardBase {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    readonly: ").append(StringUtil.toIndentedString(readonly)).append("\n");
    sb.append("    autoRun: ").append(StringUtil.toIndentedString(autoRun)).append("\n");
    sb.append("    hidden: ").append(StringUtil.toIndentedString(hidden)).append("\n");
    sb.append("    refreshInterval: ").append(StringUtil.toIndentedString(refreshInterval)).append("\n");
    sb.append("    refreshIntervalToI: ").append(StringUtil.toIndentedString(refreshIntervalToI)).append("\n");
    sb.append("    space: ").append(StringUtil.toIndentedString(space)).append("\n");
    sb.append("    model: ").append(StringUtil.toIndentedString(model)).append("\n");
    sb.append("    task: ").append(StringUtil.toIndentedString(task)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
