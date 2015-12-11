package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.Dialect;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class DBConnection   {
  
  private String name = null;
  private Dialect dialect = null;

  
  /**
   * The name of the connection
   **/
  @ApiModelProperty(value = "The name of the connection")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * SQL Dialect
   **/
  @ApiModelProperty(value = "SQL Dialect")
  @JsonProperty("dialect")
  public Dialect getDialect() {
    return dialect;
  }
  public void setDialect(Dialect dialect) {
    this.dialect = dialect;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBConnection {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    dialect: ").append(StringUtil.toIndentedString(dialect)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
