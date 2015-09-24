package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class DashboardLayoutComponent   {
  
  private Long id = null;
  private Long dashboardLayoutId = null;
  private Long dashboardElementId = null;
  private Long row = null;
  private Long column = null;
  private Long width = null;
  private Long height = null;

  
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
   * Id of Dashboard Layout
   **/
  @ApiModelProperty(value = "Id of Dashboard Layout")
  @JsonProperty("dashboard_layout_id")
  public Long getDashboardLayoutId() {
    return dashboardLayoutId;
  }
  public void setDashboardLayoutId(Long dashboardLayoutId) {
    this.dashboardLayoutId = dashboardLayoutId;
  }

  
  /**
   * Id Of Dashboard Element
   **/
  @ApiModelProperty(value = "Id Of Dashboard Element")
  @JsonProperty("dashboard_element_id")
  public Long getDashboardElementId() {
    return dashboardElementId;
  }
  public void setDashboardElementId(Long dashboardElementId) {
    this.dashboardElementId = dashboardElementId;
  }

  
  /**
   * Row
   **/
  @ApiModelProperty(value = "Row")
  @JsonProperty("row")
  public Long getRow() {
    return row;
  }
  public void setRow(Long row) {
    this.row = row;
  }

  
  /**
   * Column
   **/
  @ApiModelProperty(value = "Column")
  @JsonProperty("column")
  public Long getColumn() {
    return column;
  }
  public void setColumn(Long column) {
    this.column = column;
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
   * Height
   **/
  @ApiModelProperty(value = "Height")
  @JsonProperty("height")
  public Long getHeight() {
    return height;
  }
  public void setHeight(Long height) {
    this.height = height;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardLayoutComponent {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    dashboardLayoutId: ").append(StringUtil.toIndentedString(dashboardLayoutId)).append("\n");
    sb.append("    dashboardElementId: ").append(StringUtil.toIndentedString(dashboardElementId)).append("\n");
    sb.append("    row: ").append(StringUtil.toIndentedString(row)).append("\n");
    sb.append("    column: ").append(StringUtil.toIndentedString(column)).append("\n");
    sb.append("    width: ").append(StringUtil.toIndentedString(width)).append("\n");
    sb.append("    height: ").append(StringUtil.toIndentedString(height)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
