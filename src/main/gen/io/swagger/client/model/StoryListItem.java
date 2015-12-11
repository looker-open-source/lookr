package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.ProjectListItem;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class StoryListItem   {
  
  private String id = null;
  private String title = null;
  private String fileId = null;
  private ProjectListItem project = null;

  
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
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("project")
  public ProjectListItem getProject() {
    return project;
  }
  public void setProject(ProjectListItem project) {
    this.project = project;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryListItem {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    fileId: ").append(StringUtil.toIndentedString(fileId)).append("\n");
    sb.append("    project: ").append(StringUtil.toIndentedString(project)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
