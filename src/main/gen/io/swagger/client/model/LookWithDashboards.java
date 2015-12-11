package io.swagger.client.model;

import io.swagger.client.StringUtil;
import io.swagger.client.model.UserPublic;
import io.swagger.client.model.DashboardBase;
import java.util.*;
import io.swagger.client.model.SpaceBase;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-20T15:30:04.098-08:00")
public class LookWithDashboards   {
  
  private Long id = null;
  private String title = null;
  private UserPublic user = null;
  private Long queryId = null;
  private String description = null;
  private Boolean scheduled = null;
  private String shortUrl = null;
  private SpaceBase space = null;
  private Boolean _public = null;
  private String publicSlug = null;
  private Long userId = null;
  private Long spaceId = null;
  private String model = null;
  private String publicUrl = null;
  private String embedUrl = null;
  private String googleSpreadsheetFormula = null;
  private String excelFileUrl = null;
  private List<DashboardBase> dashboards = new ArrayList<DashboardBase>();

  
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
   * Look Title
   **/
  @ApiModelProperty(value = "Look Title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * User
   **/
  @ApiModelProperty(value = "User")
  @JsonProperty("user")
  public UserPublic getUser() {
    return user;
  }
  public void setUser(UserPublic user) {
    this.user = user;
  }

  
  /**
   * Query Id
   **/
  @ApiModelProperty(value = "Query Id")
  @JsonProperty("query_id")
  public Long getQueryId() {
    return queryId;
  }
  public void setQueryId(Long queryId) {
    this.queryId = queryId;
  }

  
  /**
   * Description
   **/
  @ApiModelProperty(value = "Description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Is Scheduled
   **/
  @ApiModelProperty(value = "Is Scheduled")
  @JsonProperty("scheduled")
  public Boolean getScheduled() {
    return scheduled;
  }
  public void setScheduled(Boolean scheduled) {
    this.scheduled = scheduled;
  }

  
  /**
   * Short Url
   **/
  @ApiModelProperty(value = "Short Url")
  @JsonProperty("short_url")
  public String getShortUrl() {
    return shortUrl;
  }
  public void setShortUrl(String shortUrl) {
    this.shortUrl = shortUrl;
  }

  
  /**
   * Space of this Look
   **/
  @ApiModelProperty(value = "Space of this Look")
  @JsonProperty("space")
  public SpaceBase getSpace() {
    return space;
  }
  public void setSpace(SpaceBase space) {
    this.space = space;
  }

  
  /**
   * Is Public
   **/
  @ApiModelProperty(value = "Is Public")
  @JsonProperty("public")
  public Boolean getPublic() {
    return _public;
  }
  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  
  /**
   * Public Slug
   **/
  @ApiModelProperty(value = "Public Slug")
  @JsonProperty("public_slug")
  public String getPublicSlug() {
    return publicSlug;
  }
  public void setPublicSlug(String publicSlug) {
    this.publicSlug = publicSlug;
  }

  
  /**
   * (Write-only) User Id
   **/
  @ApiModelProperty(value = "(Write-only) User Id")
  @JsonProperty("user_id")
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  
  /**
   * (Write-only) Space Id
   **/
  @ApiModelProperty(value = "(Write-only) Space Id")
  @JsonProperty("space_id")
  public Long getSpaceId() {
    return spaceId;
  }
  public void setSpaceId(Long spaceId) {
    this.spaceId = spaceId;
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
   * Public Url
   **/
  @ApiModelProperty(value = "Public Url")
  @JsonProperty("public_url")
  public String getPublicUrl() {
    return publicUrl;
  }
  public void setPublicUrl(String publicUrl) {
    this.publicUrl = publicUrl;
  }

  
  /**
   * Embed Url
   **/
  @ApiModelProperty(value = "Embed Url")
  @JsonProperty("embed_url")
  public String getEmbedUrl() {
    return embedUrl;
  }
  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }

  
  /**
   * Google Spreadsheet Formula
   **/
  @ApiModelProperty(value = "Google Spreadsheet Formula")
  @JsonProperty("google_spreadsheet_formula")
  public String getGoogleSpreadsheetFormula() {
    return googleSpreadsheetFormula;
  }
  public void setGoogleSpreadsheetFormula(String googleSpreadsheetFormula) {
    this.googleSpreadsheetFormula = googleSpreadsheetFormula;
  }

  
  /**
   * Excel File Url
   **/
  @ApiModelProperty(value = "Excel File Url")
  @JsonProperty("excel_file_url")
  public String getExcelFileUrl() {
    return excelFileUrl;
  }
  public void setExcelFileUrl(String excelFileUrl) {
    this.excelFileUrl = excelFileUrl;
  }

  
  /**
   * Dashboards
   **/
  @ApiModelProperty(value = "Dashboards")
  @JsonProperty("dashboards")
  public List<DashboardBase> getDashboards() {
    return dashboards;
  }
  public void setDashboards(List<DashboardBase> dashboards) {
    this.dashboards = dashboards;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookWithDashboards {\n");
    
    sb.append("    id: ").append(StringUtil.toIndentedString(id)).append("\n");
    sb.append("    title: ").append(StringUtil.toIndentedString(title)).append("\n");
    sb.append("    user: ").append(StringUtil.toIndentedString(user)).append("\n");
    sb.append("    queryId: ").append(StringUtil.toIndentedString(queryId)).append("\n");
    sb.append("    description: ").append(StringUtil.toIndentedString(description)).append("\n");
    sb.append("    scheduled: ").append(StringUtil.toIndentedString(scheduled)).append("\n");
    sb.append("    shortUrl: ").append(StringUtil.toIndentedString(shortUrl)).append("\n");
    sb.append("    space: ").append(StringUtil.toIndentedString(space)).append("\n");
    sb.append("    _public: ").append(StringUtil.toIndentedString(_public)).append("\n");
    sb.append("    publicSlug: ").append(StringUtil.toIndentedString(publicSlug)).append("\n");
    sb.append("    userId: ").append(StringUtil.toIndentedString(userId)).append("\n");
    sb.append("    spaceId: ").append(StringUtil.toIndentedString(spaceId)).append("\n");
    sb.append("    model: ").append(StringUtil.toIndentedString(model)).append("\n");
    sb.append("    publicUrl: ").append(StringUtil.toIndentedString(publicUrl)).append("\n");
    sb.append("    embedUrl: ").append(StringUtil.toIndentedString(embedUrl)).append("\n");
    sb.append("    googleSpreadsheetFormula: ").append(StringUtil.toIndentedString(googleSpreadsheetFormula)).append("\n");
    sb.append("    excelFileUrl: ").append(StringUtil.toIndentedString(excelFileUrl)).append("\n");
    sb.append("    dashboards: ").append(StringUtil.toIndentedString(dashboards)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
