package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.DashboardLayoutComponent;
import io.swagger.client.model.DashboardElement;
import io.swagger.client.model.DashboardFilter;
import java.util.*;
import io.swagger.client.model.ScheduledTaskDashboard;
import io.swagger.client.model.SpaceBase;
import io.swagger.client.model.DashboardLayout;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class Dashboard   {
  
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
  private Long spaceId = null;
  private List<DashboardElement> elements = new ArrayList<DashboardElement>();
  private List<DashboardLayout> layouts = new ArrayList<DashboardLayout>();
  private List<DashboardLayoutComponent> layoutComponents = new ArrayList<DashboardLayoutComponent>();
  private List<DashboardFilter> filters = new ArrayList<DashboardFilter>();

  
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

  
  /**
   * (Write-only) Id of Space
   **/
  @ApiModelProperty(value = "(Write-only) Id of Space")
  @JsonProperty("space_id")
  public Long getSpaceId() {
    return spaceId;
  }
  public void setSpaceId(Long spaceId) {
    this.spaceId = spaceId;
  }

  
  /**
   * Elements
   **/
  @ApiModelProperty(value = "Elements")
  @JsonProperty("elements")
  public List<DashboardElement> getElements() {
    return elements;
  }
  public void setElements(List<DashboardElement> elements) {
    this.elements = elements;
  }

  
  /**
   * Layouts
   **/
  @ApiModelProperty(value = "Layouts")
  @JsonProperty("layouts")
  public List<DashboardLayout> getLayouts() {
    return layouts;
  }
  public void setLayouts(List<DashboardLayout> layouts) {
    this.layouts = layouts;
  }

  
  /**
   * Layout Components
   **/
  @ApiModelProperty(value = "Layout Components")
  @JsonProperty("layout_components")
  public List<DashboardLayoutComponent> getLayoutComponents() {
    return layoutComponents;
  }
  public void setLayoutComponents(List<DashboardLayoutComponent> layoutComponents) {
    this.layoutComponents = layoutComponents;
  }

  
  /**
   * Filters
   **/
  @ApiModelProperty(value = "Filters")
  @JsonProperty("filters")
  public List<DashboardFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<DashboardFilter> filters) {
    this.filters = filters;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    
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
    sb.append("    spaceId: ").append(StringUtil.toIndentedString(spaceId)).append("\n");
    sb.append("    elements: ").append(StringUtil.toIndentedString(elements)).append("\n");
    sb.append("    layouts: ").append(StringUtil.toIndentedString(layouts)).append("\n");
    sb.append("    layoutComponents: ").append(StringUtil.toIndentedString(layoutComponents)).append("\n");
    sb.append("    filters: ").append(StringUtil.toIndentedString(filters)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
