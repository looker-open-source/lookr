package io.swagger.client.model;

import io.swagger.client.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class BackupConfiguration   {
  
  private String type = null;
  private String customS3Bucket = null;
  private String customS3BucketRegion = null;
  private String customS3Key = null;
  private String customS3Secret = null;
  private String url = null;

  
  /**
   * Type of backup: looker-s3 or custom-s3
   **/
  @ApiModelProperty(value = "Type of backup: looker-s3 or custom-s3")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * Name of bucket for custom-s3 backups
   **/
  @ApiModelProperty(value = "Name of bucket for custom-s3 backups")
  @JsonProperty("custom_s3_bucket")
  public String getCustomS3Bucket() {
    return customS3Bucket;
  }
  public void setCustomS3Bucket(String customS3Bucket) {
    this.customS3Bucket = customS3Bucket;
  }

  
  /**
   * Name of region where the bucket is located
   **/
  @ApiModelProperty(value = "Name of region where the bucket is located")
  @JsonProperty("custom_s3_bucket_region")
  public String getCustomS3BucketRegion() {
    return customS3BucketRegion;
  }
  public void setCustomS3BucketRegion(String customS3BucketRegion) {
    this.customS3BucketRegion = customS3BucketRegion;
  }

  
  /**
   * AWS S3 key used for custom-s3 backups
   **/
  @ApiModelProperty(value = "AWS S3 key used for custom-s3 backups")
  @JsonProperty("custom_s3_key")
  public String getCustomS3Key() {
    return customS3Key;
  }
  public void setCustomS3Key(String customS3Key) {
    this.customS3Key = customS3Key;
  }

  
  /**
   * AWS S3 secret used for custom-s3 backups
   **/
  @ApiModelProperty(value = "AWS S3 secret used for custom-s3 backups")
  @JsonProperty("custom_s3_secret")
  public String getCustomS3Secret() {
    return customS3Secret;
  }
  public void setCustomS3Secret(String customS3Secret) {
    this.customS3Secret = customS3Secret;
  }

  
  /**
   * Link to get this item
   **/
  @ApiModelProperty(value = "Link to get this item")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupConfiguration {\n");
    
    sb.append("    type: ").append(StringUtil.toIndentedString(type)).append("\n");
    sb.append("    customS3Bucket: ").append(StringUtil.toIndentedString(customS3Bucket)).append("\n");
    sb.append("    customS3BucketRegion: ").append(StringUtil.toIndentedString(customS3BucketRegion)).append("\n");
    sb.append("    customS3Key: ").append(StringUtil.toIndentedString(customS3Key)).append("\n");
    sb.append("    customS3Secret: ").append(StringUtil.toIndentedString(customS3Secret)).append("\n");
    sb.append("    url: ").append(StringUtil.toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
