package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class Dialect   {
  
  private String name = null;
  private Long label = null;
  private Boolean supportsUploadTables = null;
  private String persistentTableIndexes = null;
  private String persistentTableSortkeys = null;
  private String persistentTableDistkey = null;
  private String supportsStreaming = null;
  private String automaticallyRunSqlRunnerSnippets = null;

  
  /**
   * The name of the dialect
   **/
  @ApiModelProperty(value = "The name of the dialect")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The human-readable label of the connection
   **/
  @ApiModelProperty(value = "The human-readable label of the connection")
  @JsonProperty("label")
  public Long getLabel() {
    return label;
  }
  public void setLabel(Long label) {
    this.label = label;
  }

  
  /**
   * Whether the dialect supports uploading tables
   **/
  @ApiModelProperty(value = "Whether the dialect supports uploading tables")
  @JsonProperty("supports_upload_tables")
  public Boolean getSupportsUploadTables() {
    return supportsUploadTables;
  }
  public void setSupportsUploadTables(Boolean supportsUploadTables) {
    this.supportsUploadTables = supportsUploadTables;
  }

  
  /**
   * PDT index columns
   **/
  @ApiModelProperty(value = "PDT index columns")
  @JsonProperty("persistent_table_indexes")
  public String getPersistentTableIndexes() {
    return persistentTableIndexes;
  }
  public void setPersistentTableIndexes(String persistentTableIndexes) {
    this.persistentTableIndexes = persistentTableIndexes;
  }

  
  /**
   * PDT sortkey columns
   **/
  @ApiModelProperty(value = "PDT sortkey columns")
  @JsonProperty("persistent_table_sortkeys")
  public String getPersistentTableSortkeys() {
    return persistentTableSortkeys;
  }
  public void setPersistentTableSortkeys(String persistentTableSortkeys) {
    this.persistentTableSortkeys = persistentTableSortkeys;
  }

  
  /**
   * PDT distkey column
   **/
  @ApiModelProperty(value = "PDT distkey column")
  @JsonProperty("persistent_table_distkey")
  public String getPersistentTableDistkey() {
    return persistentTableDistkey;
  }
  public void setPersistentTableDistkey(String persistentTableDistkey) {
    this.persistentTableDistkey = persistentTableDistkey;
  }

  
  /**
   * Suports streaming results
   **/
  @ApiModelProperty(value = "Suports streaming results")
  @JsonProperty("supports_streaming")
  public String getSupportsStreaming() {
    return supportsStreaming;
  }
  public void setSupportsStreaming(String supportsStreaming) {
    this.supportsStreaming = supportsStreaming;
  }

  
  /**
   * Should SQL Runner snippets automatically be run
   **/
  @ApiModelProperty(value = "Should SQL Runner snippets automatically be run")
  @JsonProperty("automatically_run_sql_runner_snippets")
  public String getAutomaticallyRunSqlRunnerSnippets() {
    return automaticallyRunSqlRunnerSnippets;
  }
  public void setAutomaticallyRunSqlRunnerSnippets(String automaticallyRunSqlRunnerSnippets) {
    this.automaticallyRunSqlRunnerSnippets = automaticallyRunSqlRunnerSnippets;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dialect {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    label: ").append(StringUtil.toIndentedString(label)).append("\n");
    sb.append("    supportsUploadTables: ").append(StringUtil.toIndentedString(supportsUploadTables)).append("\n");
    sb.append("    persistentTableIndexes: ").append(StringUtil.toIndentedString(persistentTableIndexes)).append("\n");
    sb.append("    persistentTableSortkeys: ").append(StringUtil.toIndentedString(persistentTableSortkeys)).append("\n");
    sb.append("    persistentTableDistkey: ").append(StringUtil.toIndentedString(persistentTableDistkey)).append("\n");
    sb.append("    supportsStreaming: ").append(StringUtil.toIndentedString(supportsStreaming)).append("\n");
    sb.append("    automaticallyRunSqlRunnerSnippets: ").append(StringUtil.toIndentedString(automaticallyRunSqlRunnerSnippets)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
