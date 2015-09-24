package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class StoryAssets   {
  
  private String js = null;
  private String css = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("js")
  public String getJs() {
    return js;
  }
  public void setJs(String js) {
    this.js = js;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("css")
  public String getCss() {
    return css;
  }
  public void setCss(String css) {
    this.css = css;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryAssets {\n");
    
    sb.append("    js: ").append(StringUtil.toIndentedString(js)).append("\n");
    sb.append("    css: ").append(StringUtil.toIndentedString(css)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
