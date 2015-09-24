package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.DashboardLayoutComponent;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class DashboardLayout   {
  
  private Long id = null;
  private String dashboardId = null;
  private String type = null;
  private Boolean active = null;
  private Long columnWidth = null;
  private Long width = null;
  private List<DashboardLayoutComponent> components = new ArrayList<DashboardLayoutComponent>();

  
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
   * Id of Dashboard
   **/
  @ApiModelProperty(value = "Id of Dashboard")
  @JsonProperty("dashboard_id")
  public String getDashboardId() {
    return dashboardId;
  }
  public void setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
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
   * Is Active
   **/
  @ApiModelProperty(value = "Is Active")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * Column Width
   **/
  @ApiModelProperty(value = "Column Width")
  @JsonProperty("column_width")
  public Long getColumnWidth() {
    return columnWidth;
  }
  public void setColumnWidth(Long columnWidth) {
    this.columnWidth = columnWidth;
  }

  
  /**
   * Width
   **/
  @ApiModelProperty(value = "Width")
  @JsonProperty("width")
  public Long getWidth() {
    return width;
  }
  public void setWidth(Long width) {
    this.width = width;
  }

  
  /**
   * Components
   **/
  @ApiModelProperty(value = "Components")
  @JsonProperty("components")
  public List<DashboardLayoutComponent> getComponents() {
    return components;
  }
  public void setComponents(List<DashboardLayoutComponent> components) {
    this.components = components;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardLayout {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    dashboardId: ").append(StringUtil.toIndentedString(dashboardId)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    active: ").append(StringUtil.toIndentedString(active)).append("\n");
    sb.append("    columnWidth: ").append(StringUtil.toIndentedString(columnWidth)).append("\n");
    sb.append("    width: ").append(StringUtil.toIndentedString(width)).append("\n");
    sb.append("    components: ").append(StringUtil.toIndentedString(components)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
