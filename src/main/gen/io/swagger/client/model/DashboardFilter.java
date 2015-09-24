package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class DashboardFilter   {
  
  private Long id = null;
  private String name = null;
  private String title = null;
  private String type = null;
  private String defaultValue = null;
  private String model = null;
  private String explore = null;
  private String dimension = null;
  private String field = null;

  
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
   * Name of filter
   **/
  @ApiModelProperty(value = "Name of filter")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Name of title
   **/
  @ApiModelProperty(value = "Name of title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Type of filter: one of date, number, string, or field
   **/
  @ApiModelProperty(value = "Type of filter: one of date, number, string, or field")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Default value of filter
   **/
  @ApiModelProperty(value = "Default value of filter")
  @JsonProperty("default_value")
  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  
  /**
   * Model of filter (required if type = field)
   **/
  @ApiModelProperty(value = "Model of filter (required if type = field)")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   * Explore of filter (required if type = field)
   **/
  @ApiModelProperty(value = "Explore of filter (required if type = field)")
  @JsonProperty("explore")
  public String getExplore() {
    return explore;
  }
  public void setExplore(String explore) {
    this.explore = explore;
  }

  
  /**
   * Dimension of filter (required if type = field)
   **/
  @ApiModelProperty(value = "Dimension of filter (required if type = field)")
  @JsonProperty("dimension")
  public String getDimension() {
    return dimension;
  }
  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  
  /**
   * Field information
   **/
  @ApiModelProperty(value = "Field information")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardFilter {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    defaultValue: ").append(StringUtil.toIndentedString(defaultValue)).append("\n");
    sb.append("    model: ").append(StringUtil.toIndentedString(model)).append("\n");
    sb.append("    explore: ").append(StringUtil.toIndentedString(explore)).append("\n");
    sb.append("    dimension: ").append(StringUtil.toIndentedString(dimension)).append("\n");
    sb.append("    field: ").append(StringUtil.toIndentedString(field)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
