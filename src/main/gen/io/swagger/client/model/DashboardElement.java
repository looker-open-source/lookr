package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class DashboardElement   {
  
  private Long id = null;
  private String dashboardId = null;
  private Long lookId = null;
  private String type = null;
  private String listen = null;
  private String refreshInterval = null;
  private Long refreshIntervalToI = null;
  private String noteText = null;
  private String noteTextAsHtml = null;
  private String noteDisplay = null;
  private String noteState = null;

  
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
   * Id Of Look
   **/
  @ApiModelProperty(value = "Id Of Look")
  @JsonProperty("look_id")
  public Long getLookId() {
    return lookId;
  }
  public void setLookId(Long lookId) {
    this.lookId = lookId;
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
   * Listen
   **/
  @ApiModelProperty(value = "Listen")
  @JsonProperty("listen")
  public String getListen() {
    return listen;
  }
  public void setListen(String listen) {
    this.listen = listen;
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
   * Refresh Interval as integer
   **/
  @ApiModelProperty(value = "Refresh Interval as integer")
  @JsonProperty("refresh_interval_to_i")
  public Long getRefreshIntervalToI() {
    return refreshIntervalToI;
  }
  public void setRefreshIntervalToI(Long refreshIntervalToI) {
    this.refreshIntervalToI = refreshIntervalToI;
  }

  
  /**
   * Note Text
   **/
  @ApiModelProperty(value = "Note Text")
  @JsonProperty("note_text")
  public String getNoteText() {
    return noteText;
  }
  public void setNoteText(String noteText) {
    this.noteText = noteText;
  }

  
  /**
   * Note Text as Html
   **/
  @ApiModelProperty(value = "Note Text as Html")
  @JsonProperty("note_text_as_html")
  public String getNoteTextAsHtml() {
    return noteTextAsHtml;
  }
  public void setNoteTextAsHtml(String noteTextAsHtml) {
    this.noteTextAsHtml = noteTextAsHtml;
  }

  
  /**
   * Note Display
   **/
  @ApiModelProperty(value = "Note Display")
  @JsonProperty("note_display")
  public String getNoteDisplay() {
    return noteDisplay;
  }
  public void setNoteDisplay(String noteDisplay) {
    this.noteDisplay = noteDisplay;
  }

  
  /**
   * Note State
   **/
  @ApiModelProperty(value = "Note State")
  @JsonProperty("note_state")
  public String getNoteState() {
    return noteState;
  }
  public void setNoteState(String noteState) {
    this.noteState = noteState;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardElement {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    dashboardId: ").append(StringUtil.toIndentedString(dashboardId)).append("\n");
    sb.append("    lookId: ").append(StringUtil.toIndentedString(lookId)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    listen: ").append(StringUtil.toIndentedString(listen)).append("\n");
    sb.append("    refreshInterval: ").append(StringUtil.toIndentedString(refreshInterval)).append("\n");
    sb.append("    refreshIntervalToI: ").append(StringUtil.toIndentedString(refreshIntervalToI)).append("\n");
    sb.append("    noteText: ").append(StringUtil.toIndentedString(noteText)).append("\n");
    sb.append("    noteTextAsHtml: ").append(StringUtil.toIndentedString(noteTextAsHtml)).append("\n");
    sb.append("    noteDisplay: ").append(StringUtil.toIndentedString(noteDisplay)).append("\n");
    sb.append("    noteState: ").append(StringUtil.toIndentedString(noteState)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
