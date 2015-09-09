package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-09-08T14:44:15.944-07:00")
public class ValidationError   {
  
  private String message = null;
  private String errors = null;
  private String documentationUrl = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("errors")
  public String getErrors() {
    return errors;
  }
  public void setErrors(String errors) {
    this.errors = errors;
  }

  
  /**
   * Documentation link
   **/
  @ApiModelProperty(required = true, value = "Documentation link")
  @JsonProperty("documentation_url")
  public String getDocumentationUrl() {
    return documentationUrl;
  }
  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(StringUtil.toIndentedString(errors)).append("\n");
    sb.append("    documentationUrl: ").append(StringUtil.toIndentedString(documentationUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
