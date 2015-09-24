package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class AsyncQuery   {
  
  private String slug = null;
  private Double runtime = null;

  
  /**
   * Unique Id
   **/
  @ApiModelProperty(value = "Unique Id")
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  
  /**
   * Estimated Runtime
   **/
  @ApiModelProperty(value = "Estimated Runtime")
  @JsonProperty("runtime")
  public Double getRuntime() {
    return runtime;
  }
  public void setRuntime(Double runtime) {
    this.runtime = runtime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncQuery {\n");
    
    sb.append("    slug: ").append(StringUtil.toIndentedString(slug)).append("\n");
    sb.append("    runtime: ").append(StringUtil.toIndentedString(runtime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
