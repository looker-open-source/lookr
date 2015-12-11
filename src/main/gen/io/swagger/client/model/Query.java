package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.util.Map;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class Query   {
  
  private Long id = null;
  private String model = null;
  private String view = null;
  private List<String> fields = new ArrayList<String>();
  private List<String> pivots = new ArrayList<String>();
  private Map<String, String> filters = new HashMap<String, String>();
  private List<String> sorts = new ArrayList<String>();
  private String limit = null;
  private String columnLimit = null;
  private Boolean total = null;
  private String rowTotal = null;
  private Double runtime = null;
  private Map<String, String> visConfig = new HashMap<String, String>();
  private Map<String, String> filterConfig = new HashMap<String, String>();
  private String visibleUiSections = null;
  private String slug = null;
  private List<String> dynamicFields = new ArrayList<String>();
  private String clientId = null;
  private String shareUrl = null;
  private String expandedShareUrl = null;
  private String queryTimezone = null;

  
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
   * View
   **/
  @ApiModelProperty(value = "View")
  @JsonProperty("view")
  public String getView() {
    return view;
  }
  public void setView(String view) {
    this.view = view;
  }

  
  /**
   * Fields
   **/
  @ApiModelProperty(value = "Fields")
  @JsonProperty("fields")
  public List<String> getFields() {
    return fields;
  }
  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  
  /**
   * Pivots
   **/
  @ApiModelProperty(value = "Pivots")
  @JsonProperty("pivots")
  public List<String> getPivots() {
    return pivots;
  }
  public void setPivots(List<String> pivots) {
    this.pivots = pivots;
  }

  
  /**
   * Filters
   **/
  @ApiModelProperty(value = "Filters")
  @JsonProperty("filters")
  public Map<String, String> getFilters() {
    return filters;
  }
  public void setFilters(Map<String, String> filters) {
    this.filters = filters;
  }

  
  /**
   * Sorts
   **/
  @ApiModelProperty(value = "Sorts")
  @JsonProperty("sorts")
  public List<String> getSorts() {
    return sorts;
  }
  public void setSorts(List<String> sorts) {
    this.sorts = sorts;
  }

  
  /**
   * Limit
   **/
  @ApiModelProperty(value = "Limit")
  @JsonProperty("limit")
  public String getLimit() {
    return limit;
  }
  public void setLimit(String limit) {
    this.limit = limit;
  }

  
  /**
   * Column Limit
   **/
  @ApiModelProperty(value = "Column Limit")
  @JsonProperty("column_limit")
  public String getColumnLimit() {
    return columnLimit;
  }
  public void setColumnLimit(String columnLimit) {
    this.columnLimit = columnLimit;
  }

  
  /**
   * Total
   **/
  @ApiModelProperty(value = "Total")
  @JsonProperty("total")
  public Boolean getTotal() {
    return total;
  }
  public void setTotal(Boolean total) {
    this.total = total;
  }

  
  /**
   * Raw Total
   **/
  @ApiModelProperty(value = "Raw Total")
  @JsonProperty("row_total")
  public String getRowTotal() {
    return rowTotal;
  }
  public void setRowTotal(String rowTotal) {
    this.rowTotal = rowTotal;
  }

  
  /**
   * Runtime
   **/
  @ApiModelProperty(value = "Runtime")
  @JsonProperty("runtime")
  public Double getRuntime() {
    return runtime;
  }
  public void setRuntime(Double runtime) {
    this.runtime = runtime;
  }

  
  /**
   * Visualization Config
   **/
  @ApiModelProperty(value = "Visualization Config")
  @JsonProperty("vis_config")
  public Map<String, String> getVisConfig() {
    return visConfig;
  }
  public void setVisConfig(Map<String, String> visConfig) {
    this.visConfig = visConfig;
  }

  
  /**
   * Filter Config
   **/
  @ApiModelProperty(value = "Filter Config")
  @JsonProperty("filter_config")
  public Map<String, String> getFilterConfig() {
    return filterConfig;
  }
  public void setFilterConfig(Map<String, String> filterConfig) {
    this.filterConfig = filterConfig;
  }

  
  /**
   * Visible UI Sections
   **/
  @ApiModelProperty(value = "Visible UI Sections")
  @JsonProperty("visible_ui_sections")
  public String getVisibleUiSections() {
    return visibleUiSections;
  }
  public void setVisibleUiSections(String visibleUiSections) {
    this.visibleUiSections = visibleUiSections;
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
   * Dynamic Fields
   **/
  @ApiModelProperty(value = "Dynamic Fields")
  @JsonProperty("dynamic_fields")
  public List<String> getDynamicFields() {
    return dynamicFields;
  }
  public void setDynamicFields(List<String> dynamicFields) {
    this.dynamicFields = dynamicFields;
  }

  
  /**
   * Client Id
   **/
  @ApiModelProperty(value = "Client Id")
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   * Share Url
   **/
  @ApiModelProperty(value = "Share Url")
  @JsonProperty("share_url")
  public String getShareUrl() {
    return shareUrl;
  }
  public void setShareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
  }

  
  /**
   * Expanded Share Url
   **/
  @ApiModelProperty(value = "Expanded Share Url")
  @JsonProperty("expanded_share_url")
  public String getExpandedShareUrl() {
    return expandedShareUrl;
  }
  public void setExpandedShareUrl(String expandedShareUrl) {
    this.expandedShareUrl = expandedShareUrl;
  }

  
  /**
   * Query Timezone
   **/
  @ApiModelProperty(value = "Query Timezone")
  @JsonProperty("query_timezone")
  public String getQueryTimezone() {
    return queryTimezone;
  }
  public void setQueryTimezone(String queryTimezone) {
    this.queryTimezone = queryTimezone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    model: ").append(StringUtil.toIndentedString(model)).append("\n");
    sb.append("    view: ").append(StringUtil.toIndentedString(view)).append("\n");
    sb.append("    fields: ").append(StringUtil.toIndentedString(fields)).append("\n");
    sb.append("    pivots: ").append(StringUtil.toIndentedString(pivots)).append("\n");
    sb.append("    filters: ").append(StringUtil.toIndentedString(filters)).append("\n");
    sb.append("    sorts: ").append(StringUtil.toIndentedString(sorts)).append("\n");
    sb.append("    limit: ").append(StringUtil.toIndentedString(limit)).append("\n");
    sb.append("    columnLimit: ").append(StringUtil.toIndentedString(columnLimit)).append("\n");
    sb.append("    total: ").append(StringUtil.toIndentedString(total)).append("\n");
    sb.append("    rowTotal: ").append(StringUtil.toIndentedString(rowTotal)).append("\n");
    sb.append("    runtime: ").append(StringUtil.toIndentedString(runtime)).append("\n");
    sb.append("    visConfig: ").append(StringUtil.toIndentedString(visConfig)).append("\n");
    sb.append("    filterConfig: ").append(StringUtil.toIndentedString(filterConfig)).append("\n");
    sb.append("    visibleUiSections: ").append(StringUtil.toIndentedString(visibleUiSections)).append("\n");
    sb.append("    slug: ").append(StringUtil.toIndentedString(slug)).append("\n");
    sb.append("    dynamicFields: ").append(StringUtil.toIndentedString(dynamicFields)).append("\n");
    sb.append("    clientId: ").append(StringUtil.toIndentedString(clientId)).append("\n");
    sb.append("    shareUrl: ").append(StringUtil.toIndentedString(shareUrl)).append("\n");
    sb.append("    expandedShareUrl: ").append(StringUtil.toIndentedString(expandedShareUrl)).append("\n");
    sb.append("    queryTimezone: ").append(StringUtil.toIndentedString(queryTimezone)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
