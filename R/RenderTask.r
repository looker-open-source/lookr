# Looker API 3.1 Reference
#
# ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### Try It Out!  This section describes the existing 'api-docs' page available on Looker instances. We recommend using the [API Explorer](https://looker.com/docs/r/api/explorer) instead.  The 'api-docs' page served by the Looker instance includes 'Try It Out!' buttons for each API method. After logging in with API3 credentials, you can use the \"Try It Out!\" buttons to call the API directly from the documentation page to interactively explore API features and responses.  **NOTE**! With great power comes great responsibility: The \"Try It Out!\" button makes API calls to your live Looker instance. Be especially careful with destructive API operations such as `delete_user` or similar. There is no \"undo\" for API operations. (API Explorer's \"Run It\" feature requires a check mark before running API operations that can change data.)   ### In This Release  The following are a few examples of noteworthy items that have changed between API 3.0 and API 3.1. For more comprehensive coverage of API changes, please see the release notes for your Looker release.  ### Examples of new things added in API 3.1 (compared to API 3.0):  * [Dashboard construction](#!/3.1/Dashboard/) APIs * [Themes](#!/3.1/Theme/) and [custom color collections](#!/3.1/ColorCollection) APIs * Create and run [SQL Runner](#!/3.1/Query/run_sql_query) queries * Create and run [merged results](#!/3.1/Query/create_merge_query) queries * Create and modify [dashboard filters](#!/3.1/Dashboard/create_dashboard_filter) * Create and modify [password requirements](#!/3.1/Auth/password_config)  ### Deprecated in API 3.0  The following functions and properties have been deprecated in API 3.0.  They continue to exist and work in API 3.0 for the next several Looker releases but they have not been carried forward to API 3.1:  * Dashboard Prefetch functions * User access_filter functions * User API 1.0 credentials functions * Space.is_root and Space.is_user_root properties. Use Space.is_shared_root and Space.is_users_root instead.  ### Semantic changes in API 3.1:  * [all_looks()](#!/3.1/Look/all_looks) no longer includes soft-deleted looks, matching [all_dashboards()](#!/3.1/Dashboard/all_dashboards) behavior. You can find soft-deleted looks using [search_looks()](#!/3.1/Look/search_looks) with the `deleted` param set to True. * [all_spaces()](#!/3.1/Space/all_spaces) no longer includes duplicate items * [search_users()](#!/3.1/User/search_users) no longer accepts Y,y,1,0,N,n for Boolean params, only \"true\" and \"false\". * For greater client and network compatibility, [render_task_results](#!/3.1/RenderTask/render_task_results) now returns HTTP status **202 Accepted** instead of HTTP status **102 Processing** * [all_running_queries()](#!/3.1/Query/all_running_queries) and [kill_query](#!/3.1/Query/kill_query) functions have moved into the [Query](#!/3.1/Query/) function group.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 3.1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' RenderTask Class
#'
#' @field can 
#' @field created_at 
#' @field dashboard_filters 
#' @field dashboard_id 
#' @field dashboard_style 
#' @field finalized_at 
#' @field height 
#' @field id 
#' @field look_id 
#' @field lookml_dashboard_id 
#' @field query_id 
#' @field dashboard_element_id 
#' @field query_runtime 
#' @field render_runtime 
#' @field result_format 
#' @field runtime 
#' @field status 
#' @field status_detail 
#' @field user_id 
#' @field width 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RenderTask <- R6::R6Class(
  'RenderTask',
  public = list(
    `can` = NULL,
    `created_at` = NULL,
    `dashboard_filters` = NULL,
    `dashboard_id` = NULL,
    `dashboard_style` = NULL,
    `finalized_at` = NULL,
    `height` = NULL,
    `id` = NULL,
    `look_id` = NULL,
    `lookml_dashboard_id` = NULL,
    `query_id` = NULL,
    `dashboard_element_id` = NULL,
    `query_runtime` = NULL,
    `render_runtime` = NULL,
    `result_format` = NULL,
    `runtime` = NULL,
    `status` = NULL,
    `status_detail` = NULL,
    `user_id` = NULL,
    `width` = NULL,
    initialize = function(`can`, `created_at`, `dashboard_filters`, `dashboard_id`, `dashboard_style`, `finalized_at`, `height`, `id`, `look_id`, `lookml_dashboard_id`, `query_id`, `dashboard_element_id`, `query_runtime`, `render_runtime`, `result_format`, `runtime`, `status`, `status_detail`, `user_id`, `width`){
      if (!missing(`can`)) {
        self$`can` <- `can`
      }
      if (!missing(`created_at`)) {
        stopifnot(is.character(`created_at`), length(`created_at`) == 1)
        self$`created_at` <- `created_at`
      }
      if (!missing(`dashboard_filters`)) {
        stopifnot(is.character(`dashboard_filters`), length(`dashboard_filters`) == 1)
        self$`dashboard_filters` <- `dashboard_filters`
      }
      if (!missing(`dashboard_id`)) {
        stopifnot(is.numeric(`dashboard_id`), length(`dashboard_id`) == 1)
        self$`dashboard_id` <- `dashboard_id`
      }
      if (!missing(`dashboard_style`)) {
        stopifnot(is.character(`dashboard_style`), length(`dashboard_style`) == 1)
        self$`dashboard_style` <- `dashboard_style`
      }
      if (!missing(`finalized_at`)) {
        stopifnot(is.character(`finalized_at`), length(`finalized_at`) == 1)
        self$`finalized_at` <- `finalized_at`
      }
      if (!missing(`height`)) {
        stopifnot(is.numeric(`height`), length(`height`) == 1)
        self$`height` <- `height`
      }
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`look_id`)) {
        stopifnot(is.numeric(`look_id`), length(`look_id`) == 1)
        self$`look_id` <- `look_id`
      }
      if (!missing(`lookml_dashboard_id`)) {
        stopifnot(is.character(`lookml_dashboard_id`), length(`lookml_dashboard_id`) == 1)
        self$`lookml_dashboard_id` <- `lookml_dashboard_id`
      }
      if (!missing(`query_id`)) {
        stopifnot(is.numeric(`query_id`), length(`query_id`) == 1)
        self$`query_id` <- `query_id`
      }
      if (!missing(`dashboard_element_id`)) {
        stopifnot(is.character(`dashboard_element_id`), length(`dashboard_element_id`) == 1)
        self$`dashboard_element_id` <- `dashboard_element_id`
      }
      if (!missing(`query_runtime`)) {
        stopifnot(is.numeric(`query_runtime`), length(`query_runtime`) == 1)
        self$`query_runtime` <- `query_runtime`
      }
      if (!missing(`render_runtime`)) {
        stopifnot(is.numeric(`render_runtime`), length(`render_runtime`) == 1)
        self$`render_runtime` <- `render_runtime`
      }
      if (!missing(`result_format`)) {
        stopifnot(is.character(`result_format`), length(`result_format`) == 1)
        self$`result_format` <- `result_format`
      }
      if (!missing(`runtime`)) {
        stopifnot(is.numeric(`runtime`), length(`runtime`) == 1)
        self$`runtime` <- `runtime`
      }
      if (!missing(`status`)) {
        stopifnot(is.character(`status`), length(`status`) == 1)
        self$`status` <- `status`
      }
      if (!missing(`status_detail`)) {
        stopifnot(is.character(`status_detail`), length(`status_detail`) == 1)
        self$`status_detail` <- `status_detail`
      }
      if (!missing(`user_id`)) {
        stopifnot(is.numeric(`user_id`), length(`user_id`) == 1)
        self$`user_id` <- `user_id`
      }
      if (!missing(`width`)) {
        stopifnot(is.numeric(`width`), length(`width`) == 1)
        self$`width` <- `width`
      }
    },
    toJSON = function() {
      RenderTaskObject <- list()
      if (!is.null(self$`can`)) {
        RenderTaskObject[['can']] <- self$`can`
      }
      if (!is.null(self$`created_at`)) {
        RenderTaskObject[['created_at']] <- self$`created_at`
      }
      if (!is.null(self$`dashboard_filters`)) {
        RenderTaskObject[['dashboard_filters']] <- self$`dashboard_filters`
      }
      if (!is.null(self$`dashboard_id`)) {
        RenderTaskObject[['dashboard_id']] <- self$`dashboard_id`
      }
      if (!is.null(self$`dashboard_style`)) {
        RenderTaskObject[['dashboard_style']] <- self$`dashboard_style`
      }
      if (!is.null(self$`finalized_at`)) {
        RenderTaskObject[['finalized_at']] <- self$`finalized_at`
      }
      if (!is.null(self$`height`)) {
        RenderTaskObject[['height']] <- self$`height`
      }
      if (!is.null(self$`id`)) {
        RenderTaskObject[['id']] <- self$`id`
      }
      if (!is.null(self$`look_id`)) {
        RenderTaskObject[['look_id']] <- self$`look_id`
      }
      if (!is.null(self$`lookml_dashboard_id`)) {
        RenderTaskObject[['lookml_dashboard_id']] <- self$`lookml_dashboard_id`
      }
      if (!is.null(self$`query_id`)) {
        RenderTaskObject[['query_id']] <- self$`query_id`
      }
      if (!is.null(self$`dashboard_element_id`)) {
        RenderTaskObject[['dashboard_element_id']] <- self$`dashboard_element_id`
      }
      if (!is.null(self$`query_runtime`)) {
        RenderTaskObject[['query_runtime']] <- self$`query_runtime`
      }
      if (!is.null(self$`render_runtime`)) {
        RenderTaskObject[['render_runtime']] <- self$`render_runtime`
      }
      if (!is.null(self$`result_format`)) {
        RenderTaskObject[['result_format']] <- self$`result_format`
      }
      if (!is.null(self$`runtime`)) {
        RenderTaskObject[['runtime']] <- self$`runtime`
      }
      if (!is.null(self$`status`)) {
        RenderTaskObject[['status']] <- self$`status`
      }
      if (!is.null(self$`status_detail`)) {
        RenderTaskObject[['status_detail']] <- self$`status_detail`
      }
      if (!is.null(self$`user_id`)) {
        RenderTaskObject[['user_id']] <- self$`user_id`
      }
      if (!is.null(self$`width`)) {
        RenderTaskObject[['width']] <- self$`width`
      }

      RenderTaskObject
    },
    fromJSON = function(RenderTaskJson) {
      RenderTaskObject <- jsonlite::fromJSON(RenderTaskJson)
      if (!is.null(RenderTaskObject$`can`)) {
        self$`can` <- RenderTaskObject$`can`
      }
      if (!is.null(RenderTaskObject$`created_at`)) {
        self$`created_at` <- RenderTaskObject$`created_at`
      }
      if (!is.null(RenderTaskObject$`dashboard_filters`)) {
        self$`dashboard_filters` <- RenderTaskObject$`dashboard_filters`
      }
      if (!is.null(RenderTaskObject$`dashboard_id`)) {
        self$`dashboard_id` <- RenderTaskObject$`dashboard_id`
      }
      if (!is.null(RenderTaskObject$`dashboard_style`)) {
        self$`dashboard_style` <- RenderTaskObject$`dashboard_style`
      }
      if (!is.null(RenderTaskObject$`finalized_at`)) {
        self$`finalized_at` <- RenderTaskObject$`finalized_at`
      }
      if (!is.null(RenderTaskObject$`height`)) {
        self$`height` <- RenderTaskObject$`height`
      }
      if (!is.null(RenderTaskObject$`id`)) {
        self$`id` <- RenderTaskObject$`id`
      }
      if (!is.null(RenderTaskObject$`look_id`)) {
        self$`look_id` <- RenderTaskObject$`look_id`
      }
      if (!is.null(RenderTaskObject$`lookml_dashboard_id`)) {
        self$`lookml_dashboard_id` <- RenderTaskObject$`lookml_dashboard_id`
      }
      if (!is.null(RenderTaskObject$`query_id`)) {
        self$`query_id` <- RenderTaskObject$`query_id`
      }
      if (!is.null(RenderTaskObject$`dashboard_element_id`)) {
        self$`dashboard_element_id` <- RenderTaskObject$`dashboard_element_id`
      }
      if (!is.null(RenderTaskObject$`query_runtime`)) {
        self$`query_runtime` <- RenderTaskObject$`query_runtime`
      }
      if (!is.null(RenderTaskObject$`render_runtime`)) {
        self$`render_runtime` <- RenderTaskObject$`render_runtime`
      }
      if (!is.null(RenderTaskObject$`result_format`)) {
        self$`result_format` <- RenderTaskObject$`result_format`
      }
      if (!is.null(RenderTaskObject$`runtime`)) {
        self$`runtime` <- RenderTaskObject$`runtime`
      }
      if (!is.null(RenderTaskObject$`status`)) {
        self$`status` <- RenderTaskObject$`status`
      }
      if (!is.null(RenderTaskObject$`status_detail`)) {
        self$`status_detail` <- RenderTaskObject$`status_detail`
      }
      if (!is.null(RenderTaskObject$`user_id`)) {
        self$`user_id` <- RenderTaskObject$`user_id`
      }
      if (!is.null(RenderTaskObject$`width`)) {
        self$`width` <- RenderTaskObject$`width`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "can": %s,
           "created_at": %s,
           "dashboard_filters": %s,
           "dashboard_id": %d,
           "dashboard_style": %s,
           "finalized_at": %s,
           "height": %d,
           "id": %s,
           "look_id": %d,
           "lookml_dashboard_id": %s,
           "query_id": %d,
           "dashboard_element_id": %s,
           "query_runtime": %d,
           "render_runtime": %d,
           "result_format": %s,
           "runtime": %d,
           "status": %s,
           "status_detail": %s,
           "user_id": %d,
           "width": %d
        }',
        self$`can`,
        self$`created_at`,
        self$`dashboard_filters`,
        self$`dashboard_id`,
        self$`dashboard_style`,
        self$`finalized_at`,
        self$`height`,
        self$`id`,
        self$`look_id`,
        self$`lookml_dashboard_id`,
        self$`query_id`,
        self$`dashboard_element_id`,
        self$`query_runtime`,
        self$`render_runtime`,
        self$`result_format`,
        self$`runtime`,
        self$`status`,
        self$`status_detail`,
        self$`user_id`,
        self$`width`
      )
    },
    fromJSONString = function(RenderTaskJson) {
      RenderTaskObject <- jsonlite::fromJSON(RenderTaskJson)
      self$`can` <- RenderTaskObject$`can`
      self$`created_at` <- RenderTaskObject$`created_at`
      self$`dashboard_filters` <- RenderTaskObject$`dashboard_filters`
      self$`dashboard_id` <- RenderTaskObject$`dashboard_id`
      self$`dashboard_style` <- RenderTaskObject$`dashboard_style`
      self$`finalized_at` <- RenderTaskObject$`finalized_at`
      self$`height` <- RenderTaskObject$`height`
      self$`id` <- RenderTaskObject$`id`
      self$`look_id` <- RenderTaskObject$`look_id`
      self$`lookml_dashboard_id` <- RenderTaskObject$`lookml_dashboard_id`
      self$`query_id` <- RenderTaskObject$`query_id`
      self$`dashboard_element_id` <- RenderTaskObject$`dashboard_element_id`
      self$`query_runtime` <- RenderTaskObject$`query_runtime`
      self$`render_runtime` <- RenderTaskObject$`render_runtime`
      self$`result_format` <- RenderTaskObject$`result_format`
      self$`runtime` <- RenderTaskObject$`runtime`
      self$`status` <- RenderTaskObject$`status`
      self$`status_detail` <- RenderTaskObject$`status_detail`
      self$`user_id` <- RenderTaskObject$`user_id`
      self$`width` <- RenderTaskObject$`width`
    }
  )
)
