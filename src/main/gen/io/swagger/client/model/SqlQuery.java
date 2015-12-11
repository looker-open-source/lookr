package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.UserPublic;
import io.swagger.client.model.DBConnection;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class SqlQuery   {
  
  private String slug = null;
  private Float lastRuntime = null;
  private Long runCount = null;
  private Long browserLimit = null;
  private String sql = null;
  private String lastRunAt = null;
  private DBConnection connection = null;
  private UserPublic creator = null;
  private String derivedTableLookml = null;
  private String exploreUrl = null;

  
  /**
   * The identifier of the SQL query
   **/
  @ApiModelProperty(value = "The identifier of the SQL query")
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  
  /**
   * Number of seconds this query took to run the most recent time it was run
   **/
  @ApiModelProperty(value = "Number of seconds this query took to run the most recent time it was run")
  @JsonProperty("last_runtime")
  public Float getLastRuntime() {
    return lastRuntime;
  }
  public void setLastRuntime(Float lastRuntime) {
    this.lastRuntime = lastRuntime;
  }

  
  /**
   * Number of times this query has been run
   **/
  @ApiModelProperty(value = "Number of times this query has been run")
  @JsonProperty("run_count")
  public Long getRunCount() {
    return runCount;
  }
  public void setRunCount(Long runCount) {
    this.runCount = runCount;
  }

  
  /**
   * Maximum number of rows this query will display on the SQL Runner page
   **/
  @ApiModelProperty(value = "Maximum number of rows this query will display on the SQL Runner page")
  @JsonProperty("browser_limit")
  public Long getBrowserLimit() {
    return browserLimit;
  }
  public void setBrowserLimit(Long browserLimit) {
    this.browserLimit = browserLimit;
  }

  
  /**
   * SQL query text
   **/
  @ApiModelProperty(value = "SQL query text")
  @JsonProperty("sql")
  public String getSql() {
    return sql;
  }
  public void setSql(String sql) {
    this.sql = sql;
  }

  
  /**
   * The most recent time this query was run
   **/
  @ApiModelProperty(value = "The most recent time this query was run")
  @JsonProperty("last_run_at")
  public String getLastRunAt() {
    return lastRunAt;
  }
  public void setLastRunAt(String lastRunAt) {
    this.lastRunAt = lastRunAt;
  }

  
  /**
   * Connection this query uses
   **/
  @ApiModelProperty(value = "Connection this query uses")
  @JsonProperty("connection")
  public DBConnection getConnection() {
    return connection;
  }
  public void setConnection(DBConnection connection) {
    this.connection = connection;
  }

  
  /**
   * User who created this SQL query
   **/
  @ApiModelProperty(value = "User who created this SQL query")
  @JsonProperty("creator")
  public UserPublic getCreator() {
    return creator;
  }
  public void setCreator(UserPublic creator) {
    this.creator = creator;
  }

  
  /**
   * Source code for LookML derived table based on this query
   **/
  @ApiModelProperty(value = "Source code for LookML derived table based on this query")
  @JsonProperty("derived_table_lookml")
  public String getDerivedTableLookml() {
    return derivedTableLookml;
  }
  public void setDerivedTableLookml(String derivedTableLookml) {
    this.derivedTableLookml = derivedTableLookml;
  }

  
  /**
   * Explore page URL for this SQL query
   **/
  @ApiModelProperty(value = "Explore page URL for this SQL query")
  @JsonProperty("explore_url")
  public String getExploreUrl() {
    return exploreUrl;
  }
  public void setExploreUrl(String exploreUrl) {
    this.exploreUrl = exploreUrl;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlQuery {\n");
    
    sb.append("    slug: ").append(StringUtil.toIndentedString(slug)).append("\n");
    sb.append("    lastRuntime: ").append(StringUtil.toIndentedString(lastRuntime)).append("\n");
    sb.append("    runCount: ").append(StringUtil.toIndentedString(runCount)).append("\n");
    sb.append("    browserLimit: ").append(StringUtil.toIndentedString(browserLimit)).append("\n");
    sb.append("    sql: ").append(StringUtil.toIndentedString(sql)).append("\n");
    sb.append("    lastRunAt: ").append(StringUtil.toIndentedString(lastRunAt)).append("\n");
    sb.append("    connection: ").append(StringUtil.toIndentedString(connection)).append("\n");
    sb.append("    creator: ").append(StringUtil.toIndentedString(creator)).append("\n");
    sb.append("    derivedTableLookml: ").append(StringUtil.toIndentedString(derivedTableLookml)).append("\n");
    sb.append("    exploreUrl: ").append(StringUtil.toIndentedString(exploreUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
