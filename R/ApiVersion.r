# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ApiVersion Class
#'
#' @field looker_release_version 
#' @field current_version 
#' @field supported_versions 
#' @field api_server_url 
#' @field web_server_url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
ApiVersion <- R6::R6Class(
  'ApiVersion',
  public = list(
    `looker_release_version` = NULL,
    `current_version` = NULL,
    `supported_versions` = NULL,
    `api_server_url` = NULL,
    `web_server_url` = NULL,
    initialize = function(`looker_release_version`, `current_version`, `supported_versions`, `api_server_url`, `web_server_url`){
      if (!missing(`looker_release_version`)) {
        stopifnot(is.character(`looker_release_version`), length(`looker_release_version`) == 1)
        self$`looker_release_version` <- `looker_release_version`
      }
      if (!missing(`current_version`)) {
        stopifnot(R6::is.R6(`current_version`))
        self$`current_version` <- `current_version`
      }
      if (!missing(`supported_versions`)) {
        stopifnot(is.list(`supported_versions`), length(`supported_versions`) != 0)
        lapply(`supported_versions`, function(x) stopifnot(R6::is.R6(x)))
        self$`supported_versions` <- `supported_versions`
      }
      if (!missing(`api_server_url`)) {
        stopifnot(is.character(`api_server_url`), length(`api_server_url`) == 1)
        self$`api_server_url` <- `api_server_url`
      }
      if (!missing(`web_server_url`)) {
        stopifnot(is.character(`web_server_url`), length(`web_server_url`) == 1)
        self$`web_server_url` <- `web_server_url`
      }
    },
    toJSON = function() {
      ApiVersionObject <- list()
      if (!is.null(self$`looker_release_version`)) {
        ApiVersionObject[['looker_release_version']] <- self$`looker_release_version`
      }
      if (!is.null(self$`current_version`)) {
        ApiVersionObject[['current_version']] <- self$`current_version`$toJSON()
      }
      if (!is.null(self$`supported_versions`)) {
        ApiVersionObject[['supported_versions']] <- lapply(self$`supported_versions`, function(x) x$toJSON())
      }
      if (!is.null(self$`api_server_url`)) {
        ApiVersionObject[['api_server_url']] <- self$`api_server_url`
      }
      if (!is.null(self$`web_server_url`)) {
        ApiVersionObject[['web_server_url']] <- self$`web_server_url`
      }

      ApiVersionObject
    },
    fromJSONObject = function(ApiVersionJsonObject) {
      ApiVersionObject <- ApiVersionJsonObject #jsonlite::fromJSON(ApiVersionJson, simplifyVector = FALSE)
      if (!is.null(ApiVersionObject$`looker_release_version`)) {
        self$`looker_release_version` <- ApiVersionObject$`looker_release_version`
      }
      if (!is.null(ApiVersionObject$`current_version`)) {
        current_versionObject <- ApiVersionElement$new()
        current_versionObject$fromJSON(jsonlite::toJSON(ApiVersionObject$current_version, auto_unbox = TRUE))
        self$`current_version` <- current_versionObject
      }
      if (!is.null(ApiVersionObject$`supported_versions`)) {
        self$`supported_versions` <- lapply(ApiVersionObject$`supported_versions`, function(x) {
          supported_versionsObject <- ApiVersionElement$new()
          supported_versionsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          supported_versionsObject
        })
      }
      if (!is.null(ApiVersionObject$`api_server_url`)) {
        self$`api_server_url` <- ApiVersionObject$`api_server_url`
      }
      if (!is.null(ApiVersionObject$`web_server_url`)) {
        self$`web_server_url` <- ApiVersionObject$`web_server_url`
      }
    },
    fromJSON = function(ApiVersionJson) {
      ApiVersionObject <- jsonlite::fromJSON(ApiVersionJson, simplifyVector = FALSE)
      self$fromJSONObject(ApiVersionObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "looker_release_version": %s,
           "current_version": %s,
           "supported_versions": [%s],
           "api_server_url": %s,
           "web_server_url": %s
        }',
        self$`looker_release_version`,
        self$`current_version`$toJSON(),
        lapply(self$`supported_versions`, function(x) paste(x$toJSON(), sep=",")),
        self$`api_server_url`,
        self$`web_server_url`
      )
    },
    fromJSONString = function(ApiVersionJson) {
      ApiVersionObject <- jsonlite::fromJSON(ApiVersionJson, simplifyVector = FALSE)
      self$`looker_release_version` <- ApiVersionObject$`looker_release_version`
      ApiVersionElementObject <- ApiVersionElement$new()
      self$`current_version` <- ApiVersionElementObject$fromJSON(jsonlite::toJSON(ApiVersionObject$current_version, auto_unbox = TRUE))
      self$`supported_versions` <- lapply(ApiVersionObject$`supported_versions`, function(x) ApiVersionElement$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`api_server_url` <- ApiVersionObject$`api_server_url`
      self$`web_server_url` <- ApiVersionObject$`web_server_url`
    }
  )
)
