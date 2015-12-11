package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.UserPublic;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class RunningQueries   {
  
  private Long id = null;
  private UserPublic user = null;
  private String createdAt = null;
  private String completedAt = null;
  private String queryId = null;
  private String source = null;
  private String nodeId = null;
  private String slug = null;
  private String queryTaskId = null;
  private String cacheKey = null;
  private String connectionName = null;
  private String dialect = null;
  private String connectionId = null;
  private String message = null;
  private String status = null;

  
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
   * User who initiated the query
   **/
  @ApiModelProperty(value = "User who initiated the query")
  @JsonProperty("user")
  public UserPublic getUser() {
    return user;
  }
  public void setUser(UserPublic user) {
    this.user = user;
  }

  
  /**
   * Date/Time Query was initiated
   **/
  @ApiModelProperty(value = "Date/Time Query was initiated")
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   * Date/Time Query was completed
   **/
  @ApiModelProperty(value = "Date/Time Query was completed")
  @JsonProperty("completed_at")
  public String getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  
  /**
   * Query Id
   **/
  @ApiModelProperty(value = "Query Id")
  @JsonProperty("query_id")
  public String getQueryId() {
    return queryId;
  }
  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  
  /**
   * Source (look, dashboard, queryrunner, explore, etc.)
   **/
  @ApiModelProperty(value = "Source (look, dashboard, queryrunner, explore, etc.)")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Node Id
   **/
  @ApiModelProperty(value = "Node Id")
  @JsonProperty("node_id")
  public String getNodeId() {
    return nodeId;
  }
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  
  /**
   * Slug
   **/
  @ApiModelProperty(value = "Slug")
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  
  /**
   * ID of a Query Task
   **/
  @ApiModelProperty(value = "ID of a Query Task")
  @JsonProperty("query_task_id")
  public String getQueryTaskId() {
    return queryTaskId;
  }
  public void setQueryTaskId(String queryTaskId) {
    this.queryTaskId = queryTaskId;
  }

  
  /**
   * Cache Key
   **/
  @ApiModelProperty(value = "Cache Key")
  @JsonProperty("cache_key")
  public String getCacheKey() {
    return cacheKey;
  }
  public void setCacheKey(String cacheKey) {
    this.cacheKey = cacheKey;
  }

  
  /**
   * Connection
   **/
  @ApiModelProperty(value = "Connection")
  @JsonProperty("connection_name")
  public String getConnectionName() {
    return connectionName;
  }
  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }

  
  /**
   * Dialect
   **/
  @ApiModelProperty(value = "Dialect")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
  }

  
  /**
   * Connection ID
   **/
  @ApiModelProperty(value = "Connection ID")
  @JsonProperty("connection_id")
  public String getConnectionId() {
    return connectionId;
  }
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  
  /**
   * Additional Information(Error message or verbose status)
   **/
  @ApiModelProperty(value = "Additional Information(Error message or verbose status)")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Status description
   **/
  @ApiModelProperty(value = "Status description")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunningQueries {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    user: ").append(StringUtil.toIndentedString(user)).append("\n");
    sb.append("    createdAt: ").append(StringUtil.toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(StringUtil.toIndentedString(completedAt)).append("\n");
    sb.append("    queryId: ").append(StringUtil.toIndentedString(queryId)).append("\n");
    sb.append("    source: ").append(StringUtil.toIndentedString(source)).append("\n");
    sb.append("    nodeId: ").append(StringUtil.toIndentedString(nodeId)).append("\n");
    sb.append("    slug: ").append(StringUtil.toIndentedString(slug)).append("\n");
    sb.append("    queryTaskId: ").append(StringUtil.toIndentedString(queryTaskId)).append("\n");
    sb.append("    cacheKey: ").append(StringUtil.toIndentedString(cacheKey)).append("\n");
    sb.append("    connectionName: ").append(StringUtil.toIndentedString(connectionName)).append("\n");
    sb.append("    dialect: ").append(StringUtil.toIndentedString(dialect)).append("\n");
    sb.append("    connectionId: ").append(StringUtil.toIndentedString(connectionId)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
