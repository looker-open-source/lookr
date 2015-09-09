package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class UploadTable   {
  
  private Long id = null;
  private Long dbConnectionId = null;
  private String dbConnectionName = null;
  private String tableName = null;
  private String viewName = null;
  private String fileType = null;
  private String definition = null;
  private String createdAt = null;
  private String builtAt = null;
  private String createdAtRelative = null;
  private String builtAtRelative = null;
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
   * Id of the DB Connection
   **/
  @ApiModelProperty(value = "Id of the DB Connection")
  @JsonProperty("db_connection_id")
  public Long getDbConnectionId() {
    return dbConnectionId;
  }
  public void setDbConnectionId(Long dbConnectionId) {
    this.dbConnectionId = dbConnectionId;
  }

  
  /**
   * Name of the DB Connection
   **/
  @ApiModelProperty(value = "Name of the DB Connection")
  @JsonProperty("db_connection_name")
  public String getDbConnectionName() {
    return dbConnectionName;
  }
  public void setDbConnectionName(String dbConnectionName) {
    this.dbConnectionName = dbConnectionName;
  }

  
  /**
   * What the table will be named
   **/
  @ApiModelProperty(value = "What the table will be named")
  @JsonProperty("table_name")
  public String getTableName() {
    return tableName;
  }
  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  
  /**
   * What to name the new table
   **/
  @ApiModelProperty(value = "What to name the new table")
  @JsonProperty("view_name")
  public String getViewName() {
    return viewName;
  }
  public void setViewName(String viewName) {
    this.viewName = viewName;
  }

  
  /**
   * Type of the uploaded file
   **/
  @ApiModelProperty(value = "Type of the uploaded file")
  @JsonProperty("file_type")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  
  /**
   * Definition of the table and uploaded file
   **/
  @ApiModelProperty(value = "Definition of the table and uploaded file")
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }
  public void setDefinition(String definition) {
    this.definition = definition;
  }

  
  /**
   * Date/Time this record was created
   **/
  @ApiModelProperty(value = "Date/Time this record was created")
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * Relative time in English the table was built for this upload
   **/
  @ApiModelProperty(value = "Relative time in English the table was built for this upload")
  @JsonProperty("built_at")
  public String getBuiltAt() {
    return builtAt;
  }
  public void setBuiltAt(String builtAt) {
    this.builtAt = builtAt;
  }

  
  /**
   * Date/Time this record was created
   **/
  @ApiModelProperty(value = "Date/Time this record was created")
  @JsonProperty("created_at_relative")
  public String getCreatedAtRelative() {
    return createdAtRelative;
  }
  public void setCreatedAtRelative(String createdAtRelative) {
    this.createdAtRelative = createdAtRelative;
  }

  
  /**
   * Relative time in English the table was built for this upload
   **/
  @ApiModelProperty(value = "Relative time in English the table was built for this upload")
  @JsonProperty("built_at_relative")
  public String getBuiltAtRelative() {
    return builtAtRelative;
  }
  public void setBuiltAtRelative(String builtAtRelative) {
    this.builtAtRelative = builtAtRelative;
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
    sb.append("class UploadTable {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    dbConnectionId: ").append(StringUtil.toIndentedString(dbConnectionId)).append("\n");
    sb.append("    dbConnectionName: ").append(StringUtil.toIndentedString(dbConnectionName)).append("\n");
    sb.append("    tableName: ").append(StringUtil.toIndentedString(tableName)).append("\n");
    sb.append("    viewName: ").append(StringUtil.toIndentedString(viewName)).append("\n");
    sb.append("    fileType: ").append(StringUtil.toIndentedString(fileType)).append("\n");
    sb.append("    definition: ").append(StringUtil.toIndentedString(definition)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    builtAt: ").append(StringUtil.toIndentedString(builtAt)).append("\n");
    sb.append("    createdAtRelative: ").append(StringUtil.toIndentedString(createdAtRelative)).append("\n");
    sb.append("    builtAtRelative: ").append(StringUtil.toIndentedString(builtAtRelative)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
