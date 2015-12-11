package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.LookBasic;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class LookMovePlan   {
  
  private List<LookBasic> looksToMove = new ArrayList<LookBasic>();
  private List<LookBasic> looksToCopy = new ArrayList<LookBasic>();

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("looks_to_move")
  public List<LookBasic> getLooksToMove() {
    return looksToMove;
  }
  public void setLooksToMove(List<LookBasic> looksToMove) {
    this.looksToMove = looksToMove;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("looks_to_copy")
  public List<LookBasic> getLooksToCopy() {
    return looksToCopy;
  }
  public void setLooksToCopy(List<LookBasic> looksToCopy) {
    this.looksToCopy = looksToCopy;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookMovePlan {\n");
    
    sb.append("    looksToMove: ").append(StringUtil.toIndentedString(looksToMove)).append("\n");
    sb.append("    looksToCopy: ").append(StringUtil.toIndentedString(looksToCopy)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
