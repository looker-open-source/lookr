# Looker API 3.1 Reference
#
# ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### Try It Out!  This section describes the existing 'api-docs' page available on Looker instances. We recommend using the [API Explorer](https://looker.com/docs/r/api/explorer) instead.  The 'api-docs' page served by the Looker instance includes 'Try It Out!' buttons for each API method. After logging in with API3 credentials, you can use the \"Try It Out!\" buttons to call the API directly from the documentation page to interactively explore API features and responses.  **NOTE**! With great power comes great responsibility: The \"Try It Out!\" button makes API calls to your live Looker instance. Be especially careful with destructive API operations such as `delete_user` or similar. There is no \"undo\" for API operations. (API Explorer's \"Run It\" feature requires a check mark before running API operations that can change data.)   ### In This Release  The following are a few examples of noteworthy items that have changed between API 3.0 and API 3.1. For more comprehensive coverage of API changes, please see the release notes for your Looker release.  ### Examples of new things added in API 3.1 (compared to API 3.0):  * [Dashboard construction](#!/3.1/Dashboard/) APIs * [Themes](#!/3.1/Theme/) and [custom color collections](#!/3.1/ColorCollection) APIs * Create and run [SQL Runner](#!/3.1/Query/run_sql_query) queries * Create and run [merged results](#!/3.1/Query/create_merge_query) queries * Create and modify [dashboard filters](#!/3.1/Dashboard/create_dashboard_filter) * Create and modify [password requirements](#!/3.1/Auth/password_config)  ### Deprecated in API 3.0  The following functions and properties have been deprecated in API 3.0.  They continue to exist and work in API 3.0 for the next several Looker releases but they have not been carried forward to API 3.1:  * Dashboard Prefetch functions * User access_filter functions * User API 1.0 credentials functions * Space.is_root and Space.is_user_root properties. Use Space.is_shared_root and Space.is_users_root instead.  ### Semantic changes in API 3.1:  * [all_looks()](#!/3.1/Look/all_looks) no longer includes soft-deleted looks, matching [all_dashboards()](#!/3.1/Dashboard/all_dashboards) behavior. You can find soft-deleted looks using [search_looks()](#!/3.1/Look/search_looks) with the `deleted` param set to True. * [all_spaces()](#!/3.1/Space/all_spaces) no longer includes duplicate items * [search_users()](#!/3.1/User/search_users) no longer accepts Y,y,1,0,N,n for Boolean params, only \"true\" and \"false\". * For greater client and network compatibility, [render_task_results](#!/3.1/RenderTask/render_task_results) now returns HTTP status **202 Accepted** instead of HTTP status **102 Processing** * [all_running_queries()](#!/3.1/Query/all_running_queries) and [kill_query](#!/3.1/Query/kill_query) functions have moved into the [Query](#!/3.1/Query/) function group.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 3.1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' GitBranch Class
#'
#' @field can 
#' @field name 
#' @field remote 
#' @field remote_name 
#' @field error 
#' @field message 
#' @field owner_name 
#' @field readonly 
#' @field personal 
#' @field is_local 
#' @field is_remote 
#' @field is_production 
#' @field ahead_count 
#' @field behind_count 
#' @field commit_at 
#' @field ref 
#' @field remote_ref 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GitBranch <- R6::R6Class(
  'GitBranch',
  public = list(
    `can` = NULL,
    `name` = NULL,
    `remote` = NULL,
    `remote_name` = NULL,
    `error` = NULL,
    `message` = NULL,
    `owner_name` = NULL,
    `readonly` = NULL,
    `personal` = NULL,
    `is_local` = NULL,
    `is_remote` = NULL,
    `is_production` = NULL,
    `ahead_count` = NULL,
    `behind_count` = NULL,
    `commit_at` = NULL,
    `ref` = NULL,
    `remote_ref` = NULL,
    initialize = function(`can`, `name`, `remote`, `remote_name`, `error`, `message`, `owner_name`, `readonly`, `personal`, `is_local`, `is_remote`, `is_production`, `ahead_count`, `behind_count`, `commit_at`, `ref`, `remote_ref`){
      if (!missing(`can`)) {
        self$`can` <- `can`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`remote`)) {
        stopifnot(is.character(`remote`), length(`remote`) == 1)
        self$`remote` <- `remote`
      }
      if (!missing(`remote_name`)) {
        stopifnot(is.character(`remote_name`), length(`remote_name`) == 1)
        self$`remote_name` <- `remote_name`
      }
      if (!missing(`error`)) {
        stopifnot(is.character(`error`), length(`error`) == 1)
        self$`error` <- `error`
      }
      if (!missing(`message`)) {
        stopifnot(is.character(`message`), length(`message`) == 1)
        self$`message` <- `message`
      }
      if (!missing(`owner_name`)) {
        stopifnot(is.character(`owner_name`), length(`owner_name`) == 1)
        self$`owner_name` <- `owner_name`
      }
      if (!missing(`readonly`)) {
        self$`readonly` <- `readonly`
      }
      if (!missing(`personal`)) {
        self$`personal` <- `personal`
      }
      if (!missing(`is_local`)) {
        self$`is_local` <- `is_local`
      }
      if (!missing(`is_remote`)) {
        self$`is_remote` <- `is_remote`
      }
      if (!missing(`is_production`)) {
        self$`is_production` <- `is_production`
      }
      if (!missing(`ahead_count`)) {
        stopifnot(is.numeric(`ahead_count`), length(`ahead_count`) == 1)
        self$`ahead_count` <- `ahead_count`
      }
      if (!missing(`behind_count`)) {
        stopifnot(is.numeric(`behind_count`), length(`behind_count`) == 1)
        self$`behind_count` <- `behind_count`
      }
      if (!missing(`commit_at`)) {
        stopifnot(is.numeric(`commit_at`), length(`commit_at`) == 1)
        self$`commit_at` <- `commit_at`
      }
      if (!missing(`ref`)) {
        stopifnot(is.character(`ref`), length(`ref`) == 1)
        self$`ref` <- `ref`
      }
      if (!missing(`remote_ref`)) {
        stopifnot(is.character(`remote_ref`), length(`remote_ref`) == 1)
        self$`remote_ref` <- `remote_ref`
      }
    },
    toJSON = function() {
      GitBranchObject <- list()
      if (!is.null(self$`can`)) {
        GitBranchObject[['can']] <- self$`can`
      }
      if (!is.null(self$`name`)) {
        GitBranchObject[['name']] <- self$`name`
      }
      if (!is.null(self$`remote`)) {
        GitBranchObject[['remote']] <- self$`remote`
      }
      if (!is.null(self$`remote_name`)) {
        GitBranchObject[['remote_name']] <- self$`remote_name`
      }
      if (!is.null(self$`error`)) {
        GitBranchObject[['error']] <- self$`error`
      }
      if (!is.null(self$`message`)) {
        GitBranchObject[['message']] <- self$`message`
      }
      if (!is.null(self$`owner_name`)) {
        GitBranchObject[['owner_name']] <- self$`owner_name`
      }
      if (!is.null(self$`readonly`)) {
        GitBranchObject[['readonly']] <- self$`readonly`
      }
      if (!is.null(self$`personal`)) {
        GitBranchObject[['personal']] <- self$`personal`
      }
      if (!is.null(self$`is_local`)) {
        GitBranchObject[['is_local']] <- self$`is_local`
      }
      if (!is.null(self$`is_remote`)) {
        GitBranchObject[['is_remote']] <- self$`is_remote`
      }
      if (!is.null(self$`is_production`)) {
        GitBranchObject[['is_production']] <- self$`is_production`
      }
      if (!is.null(self$`ahead_count`)) {
        GitBranchObject[['ahead_count']] <- self$`ahead_count`
      }
      if (!is.null(self$`behind_count`)) {
        GitBranchObject[['behind_count']] <- self$`behind_count`
      }
      if (!is.null(self$`commit_at`)) {
        GitBranchObject[['commit_at']] <- self$`commit_at`
      }
      if (!is.null(self$`ref`)) {
        GitBranchObject[['ref']] <- self$`ref`
      }
      if (!is.null(self$`remote_ref`)) {
        GitBranchObject[['remote_ref']] <- self$`remote_ref`
      }

      GitBranchObject
    },
    fromJSON = function(GitBranchJson) {
      GitBranchObject <- jsonlite::fromJSON(GitBranchJson)
      if (!is.null(GitBranchObject$`can`)) {
        self$`can` <- GitBranchObject$`can`
      }
      if (!is.null(GitBranchObject$`name`)) {
        self$`name` <- GitBranchObject$`name`
      }
      if (!is.null(GitBranchObject$`remote`)) {
        self$`remote` <- GitBranchObject$`remote`
      }
      if (!is.null(GitBranchObject$`remote_name`)) {
        self$`remote_name` <- GitBranchObject$`remote_name`
      }
      if (!is.null(GitBranchObject$`error`)) {
        self$`error` <- GitBranchObject$`error`
      }
      if (!is.null(GitBranchObject$`message`)) {
        self$`message` <- GitBranchObject$`message`
      }
      if (!is.null(GitBranchObject$`owner_name`)) {
        self$`owner_name` <- GitBranchObject$`owner_name`
      }
      if (!is.null(GitBranchObject$`readonly`)) {
        self$`readonly` <- GitBranchObject$`readonly`
      }
      if (!is.null(GitBranchObject$`personal`)) {
        self$`personal` <- GitBranchObject$`personal`
      }
      if (!is.null(GitBranchObject$`is_local`)) {
        self$`is_local` <- GitBranchObject$`is_local`
      }
      if (!is.null(GitBranchObject$`is_remote`)) {
        self$`is_remote` <- GitBranchObject$`is_remote`
      }
      if (!is.null(GitBranchObject$`is_production`)) {
        self$`is_production` <- GitBranchObject$`is_production`
      }
      if (!is.null(GitBranchObject$`ahead_count`)) {
        self$`ahead_count` <- GitBranchObject$`ahead_count`
      }
      if (!is.null(GitBranchObject$`behind_count`)) {
        self$`behind_count` <- GitBranchObject$`behind_count`
      }
      if (!is.null(GitBranchObject$`commit_at`)) {
        self$`commit_at` <- GitBranchObject$`commit_at`
      }
      if (!is.null(GitBranchObject$`ref`)) {
        self$`ref` <- GitBranchObject$`ref`
      }
      if (!is.null(GitBranchObject$`remote_ref`)) {
        self$`remote_ref` <- GitBranchObject$`remote_ref`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "can": %s,
           "name": %s,
           "remote": %s,
           "remote_name": %s,
           "error": %s,
           "message": %s,
           "owner_name": %s,
           "readonly": %s,
           "personal": %s,
           "is_local": %s,
           "is_remote": %s,
           "is_production": %s,
           "ahead_count": %d,
           "behind_count": %d,
           "commit_at": %d,
           "ref": %s,
           "remote_ref": %s
        }',
        self$`can`,
        self$`name`,
        self$`remote`,
        self$`remote_name`,
        self$`error`,
        self$`message`,
        self$`owner_name`,
        self$`readonly`,
        self$`personal`,
        self$`is_local`,
        self$`is_remote`,
        self$`is_production`,
        self$`ahead_count`,
        self$`behind_count`,
        self$`commit_at`,
        self$`ref`,
        self$`remote_ref`
      )
    },
    fromJSONString = function(GitBranchJson) {
      GitBranchObject <- jsonlite::fromJSON(GitBranchJson)
      self$`can` <- GitBranchObject$`can`
      self$`name` <- GitBranchObject$`name`
      self$`remote` <- GitBranchObject$`remote`
      self$`remote_name` <- GitBranchObject$`remote_name`
      self$`error` <- GitBranchObject$`error`
      self$`message` <- GitBranchObject$`message`
      self$`owner_name` <- GitBranchObject$`owner_name`
      self$`readonly` <- GitBranchObject$`readonly`
      self$`personal` <- GitBranchObject$`personal`
      self$`is_local` <- GitBranchObject$`is_local`
      self$`is_remote` <- GitBranchObject$`is_remote`
      self$`is_production` <- GitBranchObject$`is_production`
      self$`ahead_count` <- GitBranchObject$`ahead_count`
      self$`behind_count` <- GitBranchObject$`behind_count`
      self$`commit_at` <- GitBranchObject$`commit_at`
      self$`ref` <- GitBranchObject$`ref`
      self$`remote_ref` <- GitBranchObject$`remote_ref`
    }
  )
)
