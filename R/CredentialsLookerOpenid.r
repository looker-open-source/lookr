# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' CredentialsLookerOpenid Class
#'
#' @field can 
#' @field created_at 
#' @field email 
#' @field is_disabled 
#' @field logged_in_at 
#' @field logged_in_ip 
#' @field type 
#' @field url 
#' @field user_url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
CredentialsLookerOpenid <- R6::R6Class(
  'CredentialsLookerOpenid',
  public = list(
    `can` = NULL,
    `created_at` = NULL,
    `email` = NULL,
    `is_disabled` = NULL,
    `logged_in_at` = NULL,
    `logged_in_ip` = NULL,
    `type` = NULL,
    `url` = NULL,
    `user_url` = NULL,
    initialize = function(`can`, `created_at`, `email`, `is_disabled`, `logged_in_at`, `logged_in_ip`, `type`, `url`, `user_url`){
      if (!missing(`can`)) {
        self$`can` <- `can`
      }
      if (!missing(`created_at`)) {
        stopifnot(is.character(`created_at`), length(`created_at`) == 1)
        self$`created_at` <- `created_at`
      }
      if (!missing(`email`)) {
        stopifnot(is.character(`email`), length(`email`) == 1)
        self$`email` <- `email`
      }
      if (!missing(`is_disabled`)) {
        self$`is_disabled` <- `is_disabled`
      }
      if (!missing(`logged_in_at`)) {
        stopifnot(is.character(`logged_in_at`), length(`logged_in_at`) == 1)
        self$`logged_in_at` <- `logged_in_at`
      }
      if (!missing(`logged_in_ip`)) {
        stopifnot(is.character(`logged_in_ip`), length(`logged_in_ip`) == 1)
        self$`logged_in_ip` <- `logged_in_ip`
      }
      if (!missing(`type`)) {
        stopifnot(is.character(`type`), length(`type`) == 1)
        self$`type` <- `type`
      }
      if (!missing(`url`)) {
        stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
      if (!missing(`user_url`)) {
        stopifnot(is.character(`user_url`), length(`user_url`) == 1)
        self$`user_url` <- `user_url`
      }
    },
    toJSON = function() {
      CredentialsLookerOpenidObject <- list()
      if (!is.null(self$`can`)) {
        CredentialsLookerOpenidObject[['can']] <- self$`can`
      }
      if (!is.null(self$`created_at`)) {
        CredentialsLookerOpenidObject[['created_at']] <- self$`created_at`
      }
      if (!is.null(self$`email`)) {
        CredentialsLookerOpenidObject[['email']] <- self$`email`
      }
      if (!is.null(self$`is_disabled`)) {
        CredentialsLookerOpenidObject[['is_disabled']] <- self$`is_disabled`
      }
      if (!is.null(self$`logged_in_at`)) {
        CredentialsLookerOpenidObject[['logged_in_at']] <- self$`logged_in_at`
      }
      if (!is.null(self$`logged_in_ip`)) {
        CredentialsLookerOpenidObject[['logged_in_ip']] <- self$`logged_in_ip`
      }
      if (!is.null(self$`type`)) {
        CredentialsLookerOpenidObject[['type']] <- self$`type`
      }
      if (!is.null(self$`url`)) {
        CredentialsLookerOpenidObject[['url']] <- self$`url`
      }
      if (!is.null(self$`user_url`)) {
        CredentialsLookerOpenidObject[['user_url']] <- self$`user_url`
      }

      CredentialsLookerOpenidObject
    },
    fromJSONObject = function(CredentialsLookerOpenidJsonObject) {
      CredentialsLookerOpenidObject <- CredentialsLookerOpenidJsonObject #jsonlite::fromJSON(CredentialsLookerOpenidJson, simplifyVector = FALSE)
      if (!is.null(CredentialsLookerOpenidObject$`can`)) {
        self$`can` <- CredentialsLookerOpenidObject$`can`
      }
      if (!is.null(CredentialsLookerOpenidObject$`created_at`)) {
        self$`created_at` <- CredentialsLookerOpenidObject$`created_at`
      }
      if (!is.null(CredentialsLookerOpenidObject$`email`)) {
        self$`email` <- CredentialsLookerOpenidObject$`email`
      }
      if (!is.null(CredentialsLookerOpenidObject$`is_disabled`)) {
        self$`is_disabled` <- CredentialsLookerOpenidObject$`is_disabled`
      }
      if (!is.null(CredentialsLookerOpenidObject$`logged_in_at`)) {
        self$`logged_in_at` <- CredentialsLookerOpenidObject$`logged_in_at`
      }
      if (!is.null(CredentialsLookerOpenidObject$`logged_in_ip`)) {
        self$`logged_in_ip` <- CredentialsLookerOpenidObject$`logged_in_ip`
      }
      if (!is.null(CredentialsLookerOpenidObject$`type`)) {
        self$`type` <- CredentialsLookerOpenidObject$`type`
      }
      if (!is.null(CredentialsLookerOpenidObject$`url`)) {
        self$`url` <- CredentialsLookerOpenidObject$`url`
      }
      if (!is.null(CredentialsLookerOpenidObject$`user_url`)) {
        self$`user_url` <- CredentialsLookerOpenidObject$`user_url`
      }
    },
    fromJSON = function(CredentialsLookerOpenidJson) {
      CredentialsLookerOpenidObject <- jsonlite::fromJSON(CredentialsLookerOpenidJson, simplifyVector = FALSE)
      self$fromJSONObject(CredentialsLookerOpenidObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "can": %s,
           "created_at": %s,
           "email": %s,
           "is_disabled": %s,
           "logged_in_at": %s,
           "logged_in_ip": %s,
           "type": %s,
           "url": %s,
           "user_url": %s
        }',
        self$`can`,
        self$`created_at`,
        self$`email`,
        self$`is_disabled`,
        self$`logged_in_at`,
        self$`logged_in_ip`,
        self$`type`,
        self$`url`,
        self$`user_url`
      )
    },
    fromJSONString = function(CredentialsLookerOpenidJson) {
      CredentialsLookerOpenidObject <- jsonlite::fromJSON(CredentialsLookerOpenidJson, simplifyVector = FALSE)
      self$`can` <- CredentialsLookerOpenidObject$`can`
      self$`created_at` <- CredentialsLookerOpenidObject$`created_at`
      self$`email` <- CredentialsLookerOpenidObject$`email`
      self$`is_disabled` <- CredentialsLookerOpenidObject$`is_disabled`
      self$`logged_in_at` <- CredentialsLookerOpenidObject$`logged_in_at`
      self$`logged_in_ip` <- CredentialsLookerOpenidObject$`logged_in_ip`
      self$`type` <- CredentialsLookerOpenidObject$`type`
      self$`url` <- CredentialsLookerOpenidObject$`url`
      self$`user_url` <- CredentialsLookerOpenidObject$`user_url`
    }
  )
)
