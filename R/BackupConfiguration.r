# Looker API 3.1 Reference
#
# ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### Try It Out!  This section describes the existing 'api-docs' page available on Looker instances. We recommend using the [API Explorer](https://looker.com/docs/r/api/explorer) instead.  The 'api-docs' page served by the Looker instance includes 'Try It Out!' buttons for each API method. After logging in with API3 credentials, you can use the \"Try It Out!\" buttons to call the API directly from the documentation page to interactively explore API features and responses.  **NOTE**! With great power comes great responsibility: The \"Try It Out!\" button makes API calls to your live Looker instance. Be especially careful with destructive API operations such as `delete_user` or similar. There is no \"undo\" for API operations. (API Explorer's \"Run It\" feature requires a check mark before running API operations that can change data.)   ### In This Release  The following are a few examples of noteworthy items that have changed between API 3.0 and API 3.1. For more comprehensive coverage of API changes, please see the release notes for your Looker release.  ### Examples of new things added in API 3.1 (compared to API 3.0):  * [Dashboard construction](#!/3.1/Dashboard/) APIs * [Themes](#!/3.1/Theme/) and [custom color collections](#!/3.1/ColorCollection) APIs * Create and run [SQL Runner](#!/3.1/Query/run_sql_query) queries * Create and run [merged results](#!/3.1/Query/create_merge_query) queries * Create and modify [dashboard filters](#!/3.1/Dashboard/create_dashboard_filter) * Create and modify [password requirements](#!/3.1/Auth/password_config)  ### Deprecated in API 3.0  The following functions and properties have been deprecated in API 3.0.  They continue to exist and work in API 3.0 for the next several Looker releases but they have not been carried forward to API 3.1:  * Dashboard Prefetch functions * User access_filter functions * User API 1.0 credentials functions * Space.is_root and Space.is_user_root properties. Use Space.is_shared_root and Space.is_users_root instead.  ### Semantic changes in API 3.1:  * [all_looks()](#!/3.1/Look/all_looks) no longer includes soft-deleted looks, matching [all_dashboards()](#!/3.1/Dashboard/all_dashboards) behavior. You can find soft-deleted looks using [search_looks()](#!/3.1/Look/search_looks) with the `deleted` param set to True. * [all_spaces()](#!/3.1/Space/all_spaces) no longer includes duplicate items * [search_users()](#!/3.1/User/search_users) no longer accepts Y,y,1,0,N,n for Boolean params, only \"true\" and \"false\". * For greater client and network compatibility, [render_task_results](#!/3.1/RenderTask/render_task_results) now returns HTTP status **202 Accepted** instead of HTTP status **102 Processing** * [all_running_queries()](#!/3.1/Query/all_running_queries) and [kill_query](#!/3.1/Query/kill_query) functions have moved into the [Query](#!/3.1/Query/) function group.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 3.1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' BackupConfiguration Class
#'
#' @field can 
#' @field type 
#' @field custom_s3_bucket 
#' @field custom_s3_bucket_region 
#' @field custom_s3_key 
#' @field custom_s3_secret 
#' @field url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BackupConfiguration <- R6::R6Class(
  'BackupConfiguration',
  public = list(
    `can` = NULL,
    `type` = NULL,
    `custom_s3_bucket` = NULL,
    `custom_s3_bucket_region` = NULL,
    `custom_s3_key` = NULL,
    `custom_s3_secret` = NULL,
    `url` = NULL,
    initialize = function(`can`, `type`, `custom_s3_bucket`, `custom_s3_bucket_region`, `custom_s3_key`, `custom_s3_secret`, `url`){
      if (!missing(`can`)) {
        self$`can` <- `can`
      }
      if (!missing(`type`)) {
        stopifnot(is.character(`type`), length(`type`) == 1)
        self$`type` <- `type`
      }
      if (!missing(`custom_s3_bucket`)) {
        stopifnot(is.character(`custom_s3_bucket`), length(`custom_s3_bucket`) == 1)
        self$`custom_s3_bucket` <- `custom_s3_bucket`
      }
      if (!missing(`custom_s3_bucket_region`)) {
        stopifnot(is.character(`custom_s3_bucket_region`), length(`custom_s3_bucket_region`) == 1)
        self$`custom_s3_bucket_region` <- `custom_s3_bucket_region`
      }
      if (!missing(`custom_s3_key`)) {
        stopifnot(is.character(`custom_s3_key`), length(`custom_s3_key`) == 1)
        self$`custom_s3_key` <- `custom_s3_key`
      }
      if (!missing(`custom_s3_secret`)) {
        stopifnot(is.character(`custom_s3_secret`), length(`custom_s3_secret`) == 1)
        self$`custom_s3_secret` <- `custom_s3_secret`
      }
      if (!missing(`url`)) {
        stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
    },
    toJSON = function() {
      BackupConfigurationObject <- list()
      if (!is.null(self$`can`)) {
        BackupConfigurationObject[['can']] <- self$`can`
      }
      if (!is.null(self$`type`)) {
        BackupConfigurationObject[['type']] <- self$`type`
      }
      if (!is.null(self$`custom_s3_bucket`)) {
        BackupConfigurationObject[['custom_s3_bucket']] <- self$`custom_s3_bucket`
      }
      if (!is.null(self$`custom_s3_bucket_region`)) {
        BackupConfigurationObject[['custom_s3_bucket_region']] <- self$`custom_s3_bucket_region`
      }
      if (!is.null(self$`custom_s3_key`)) {
        BackupConfigurationObject[['custom_s3_key']] <- self$`custom_s3_key`
      }
      if (!is.null(self$`custom_s3_secret`)) {
        BackupConfigurationObject[['custom_s3_secret']] <- self$`custom_s3_secret`
      }
      if (!is.null(self$`url`)) {
        BackupConfigurationObject[['url']] <- self$`url`
      }

      BackupConfigurationObject
    },
    fromJSON = function(BackupConfigurationJson) {
      BackupConfigurationObject <- jsonlite::fromJSON(BackupConfigurationJson)
      if (!is.null(BackupConfigurationObject$`can`)) {
        self$`can` <- BackupConfigurationObject$`can`
      }
      if (!is.null(BackupConfigurationObject$`type`)) {
        self$`type` <- BackupConfigurationObject$`type`
      }
      if (!is.null(BackupConfigurationObject$`custom_s3_bucket`)) {
        self$`custom_s3_bucket` <- BackupConfigurationObject$`custom_s3_bucket`
      }
      if (!is.null(BackupConfigurationObject$`custom_s3_bucket_region`)) {
        self$`custom_s3_bucket_region` <- BackupConfigurationObject$`custom_s3_bucket_region`
      }
      if (!is.null(BackupConfigurationObject$`custom_s3_key`)) {
        self$`custom_s3_key` <- BackupConfigurationObject$`custom_s3_key`
      }
      if (!is.null(BackupConfigurationObject$`custom_s3_secret`)) {
        self$`custom_s3_secret` <- BackupConfigurationObject$`custom_s3_secret`
      }
      if (!is.null(BackupConfigurationObject$`url`)) {
        self$`url` <- BackupConfigurationObject$`url`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "can": %s,
           "type": %s,
           "custom_s3_bucket": %s,
           "custom_s3_bucket_region": %s,
           "custom_s3_key": %s,
           "custom_s3_secret": %s,
           "url": %s
        }',
        self$`can`,
        self$`type`,
        self$`custom_s3_bucket`,
        self$`custom_s3_bucket_region`,
        self$`custom_s3_key`,
        self$`custom_s3_secret`,
        self$`url`
      )
    },
    fromJSONString = function(BackupConfigurationJson) {
      BackupConfigurationObject <- jsonlite::fromJSON(BackupConfigurationJson)
      self$`can` <- BackupConfigurationObject$`can`
      self$`type` <- BackupConfigurationObject$`type`
      self$`custom_s3_bucket` <- BackupConfigurationObject$`custom_s3_bucket`
      self$`custom_s3_bucket_region` <- BackupConfigurationObject$`custom_s3_bucket_region`
      self$`custom_s3_key` <- BackupConfigurationObject$`custom_s3_key`
      self$`custom_s3_secret` <- BackupConfigurationObject$`custom_s3_secret`
      self$`url` <- BackupConfigurationObject$`url`
    }
  )
)
