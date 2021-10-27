# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' CredentialsEmailSearch Class
#'
#' @field can 
#' @field created_at 
#' @field email 
#' @field forced_password_reset_at_next_login 
#' @field is_disabled 
#' @field logged_in_at 
#' @field password_reset_url 
#' @field type 
#' @field url 
#' @field user_url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
CredentialsEmailSearch <- R6::R6Class(
  'CredentialsEmailSearch',
  public = list(
    `can` = NULL,
    `created_at` = NULL,
    `email` = NULL,
    `forced_password_reset_at_next_login` = NULL,
    `is_disabled` = NULL,
    `logged_in_at` = NULL,
    `password_reset_url` = NULL,
    `type` = NULL,
    `url` = NULL,
    `user_url` = NULL,
    initialize = function(`can`, `created_at`, `email`, `forced_password_reset_at_next_login`, `is_disabled`, `logged_in_at`, `password_reset_url`, `type`, `url`, `user_url`){
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
      if (!missing(`forced_password_reset_at_next_login`)) {
        self$`forced_password_reset_at_next_login` <- `forced_password_reset_at_next_login`
      }
      if (!missing(`is_disabled`)) {
        self$`is_disabled` <- `is_disabled`
      }
      if (!missing(`logged_in_at`)) {
        stopifnot(is.character(`logged_in_at`), length(`logged_in_at`) == 1)
        self$`logged_in_at` <- `logged_in_at`
      }
      if (!missing(`password_reset_url`)) {
        stopifnot(is.character(`password_reset_url`), length(`password_reset_url`) == 1)
        self$`password_reset_url` <- `password_reset_url`
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
      CredentialsEmailSearchObject <- list()
      if (!is.null(self$`can`)) {
        CredentialsEmailSearchObject[['can']] <- self$`can`
      }
      if (!is.null(self$`created_at`)) {
        CredentialsEmailSearchObject[['created_at']] <- self$`created_at`
      }
      if (!is.null(self$`email`)) {
        CredentialsEmailSearchObject[['email']] <- self$`email`
      }
      if (!is.null(self$`forced_password_reset_at_next_login`)) {
        CredentialsEmailSearchObject[['forced_password_reset_at_next_login']] <- self$`forced_password_reset_at_next_login`
      }
      if (!is.null(self$`is_disabled`)) {
        CredentialsEmailSearchObject[['is_disabled']] <- self$`is_disabled`
      }
      if (!is.null(self$`logged_in_at`)) {
        CredentialsEmailSearchObject[['logged_in_at']] <- self$`logged_in_at`
      }
      if (!is.null(self$`password_reset_url`)) {
        CredentialsEmailSearchObject[['password_reset_url']] <- self$`password_reset_url`
      }
      if (!is.null(self$`type`)) {
        CredentialsEmailSearchObject[['type']] <- self$`type`
      }
      if (!is.null(self$`url`)) {
        CredentialsEmailSearchObject[['url']] <- self$`url`
      }
      if (!is.null(self$`user_url`)) {
        CredentialsEmailSearchObject[['user_url']] <- self$`user_url`
      }

      CredentialsEmailSearchObject
    },
    fromJSONObject = function(CredentialsEmailSearchJsonObject) {
      CredentialsEmailSearchObject <- CredentialsEmailSearchJsonObject #jsonlite::fromJSON(CredentialsEmailSearchJson, simplifyVector = FALSE)
      if (!is.null(CredentialsEmailSearchObject$`can`)) {
        self$`can` <- CredentialsEmailSearchObject$`can`
      }
      if (!is.null(CredentialsEmailSearchObject$`created_at`)) {
        self$`created_at` <- CredentialsEmailSearchObject$`created_at`
      }
      if (!is.null(CredentialsEmailSearchObject$`email`)) {
        self$`email` <- CredentialsEmailSearchObject$`email`
      }
      if (!is.null(CredentialsEmailSearchObject$`forced_password_reset_at_next_login`)) {
        self$`forced_password_reset_at_next_login` <- CredentialsEmailSearchObject$`forced_password_reset_at_next_login`
      }
      if (!is.null(CredentialsEmailSearchObject$`is_disabled`)) {
        self$`is_disabled` <- CredentialsEmailSearchObject$`is_disabled`
      }
      if (!is.null(CredentialsEmailSearchObject$`logged_in_at`)) {
        self$`logged_in_at` <- CredentialsEmailSearchObject$`logged_in_at`
      }
      if (!is.null(CredentialsEmailSearchObject$`password_reset_url`)) {
        self$`password_reset_url` <- CredentialsEmailSearchObject$`password_reset_url`
      }
      if (!is.null(CredentialsEmailSearchObject$`type`)) {
        self$`type` <- CredentialsEmailSearchObject$`type`
      }
      if (!is.null(CredentialsEmailSearchObject$`url`)) {
        self$`url` <- CredentialsEmailSearchObject$`url`
      }
      if (!is.null(CredentialsEmailSearchObject$`user_url`)) {
        self$`user_url` <- CredentialsEmailSearchObject$`user_url`
      }
    },
    fromJSON = function(CredentialsEmailSearchJson) {
      CredentialsEmailSearchObject <- jsonlite::fromJSON(CredentialsEmailSearchJson, simplifyVector = FALSE)
      self$fromJSONObject(CredentialsEmailSearchObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "can": %s,
           "created_at": %s,
           "email": %s,
           "forced_password_reset_at_next_login": %s,
           "is_disabled": %s,
           "logged_in_at": %s,
           "password_reset_url": %s,
           "type": %s,
           "url": %s,
           "user_url": %s
        }',
        self$`can`,
        self$`created_at`,
        self$`email`,
        self$`forced_password_reset_at_next_login`,
        self$`is_disabled`,
        self$`logged_in_at`,
        self$`password_reset_url`,
        self$`type`,
        self$`url`,
        self$`user_url`
      )
    },
    fromJSONString = function(CredentialsEmailSearchJson) {
      CredentialsEmailSearchObject <- jsonlite::fromJSON(CredentialsEmailSearchJson, simplifyVector = FALSE)
      self$`can` <- CredentialsEmailSearchObject$`can`
      self$`created_at` <- CredentialsEmailSearchObject$`created_at`
      self$`email` <- CredentialsEmailSearchObject$`email`
      self$`forced_password_reset_at_next_login` <- CredentialsEmailSearchObject$`forced_password_reset_at_next_login`
      self$`is_disabled` <- CredentialsEmailSearchObject$`is_disabled`
      self$`logged_in_at` <- CredentialsEmailSearchObject$`logged_in_at`
      self$`password_reset_url` <- CredentialsEmailSearchObject$`password_reset_url`
      self$`type` <- CredentialsEmailSearchObject$`type`
      self$`url` <- CredentialsEmailSearchObject$`url`
      self$`user_url` <- CredentialsEmailSearchObject$`user_url`
    }
  )
)