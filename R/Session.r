# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' Session Class
#'
#' @field can 
#' @field id 
#' @field ip_address 
#' @field browser 
#' @field operating_system 
#' @field city 
#' @field state 
#' @field country 
#' @field credentials_type 
#' @field extended_at 
#' @field extended_count 
#' @field sudo_user_id 
#' @field created_at 
#' @field expires_at 
#' @field url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
Session <- R6::R6Class(
  'Session',
  public = list(
    `can` = NULL,
    `id` = NULL,
    `ip_address` = NULL,
    `browser` = NULL,
    `operating_system` = NULL,
    `city` = NULL,
    `state` = NULL,
    `country` = NULL,
    `credentials_type` = NULL,
    `extended_at` = NULL,
    `extended_count` = NULL,
    `sudo_user_id` = NULL,
    `created_at` = NULL,
    `expires_at` = NULL,
    `url` = NULL,
    initialize = function(`can`, `id`, `ip_address`, `browser`, `operating_system`, `city`, `state`, `country`, `credentials_type`, `extended_at`, `extended_count`, `sudo_user_id`, `created_at`, `expires_at`, `url`){
      if (!missing(`can`)) {
        self$`can` <- `can`
      }
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`ip_address`)) {
        stopifnot(is.character(`ip_address`), length(`ip_address`) == 1)
        self$`ip_address` <- `ip_address`
      }
      if (!missing(`browser`)) {
        stopifnot(is.character(`browser`), length(`browser`) == 1)
        self$`browser` <- `browser`
      }
      if (!missing(`operating_system`)) {
        stopifnot(is.character(`operating_system`), length(`operating_system`) == 1)
        self$`operating_system` <- `operating_system`
      }
      if (!missing(`city`)) {
        stopifnot(is.character(`city`), length(`city`) == 1)
        self$`city` <- `city`
      }
      if (!missing(`state`)) {
        stopifnot(is.character(`state`), length(`state`) == 1)
        self$`state` <- `state`
      }
      if (!missing(`country`)) {
        stopifnot(is.character(`country`), length(`country`) == 1)
        self$`country` <- `country`
      }
      if (!missing(`credentials_type`)) {
        stopifnot(is.character(`credentials_type`), length(`credentials_type`) == 1)
        self$`credentials_type` <- `credentials_type`
      }
      if (!missing(`extended_at`)) {
        stopifnot(is.character(`extended_at`), length(`extended_at`) == 1)
        self$`extended_at` <- `extended_at`
      }
      if (!missing(`extended_count`)) {
        stopifnot(is.numeric(`extended_count`), length(`extended_count`) == 1)
        self$`extended_count` <- `extended_count`
      }
      if (!missing(`sudo_user_id`)) {
        stopifnot(is.numeric(`sudo_user_id`), length(`sudo_user_id`) == 1)
        self$`sudo_user_id` <- `sudo_user_id`
      }
      if (!missing(`created_at`)) {
        stopifnot(is.character(`created_at`), length(`created_at`) == 1)
        self$`created_at` <- `created_at`
      }
      if (!missing(`expires_at`)) {
        stopifnot(is.character(`expires_at`), length(`expires_at`) == 1)
        self$`expires_at` <- `expires_at`
      }
      if (!missing(`url`)) {
        stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
    },
    toJSON = function() {
      SessionObject <- list()
      if (!is.null(self$`can`)) {
        SessionObject[['can']] <- self$`can`
      }
      if (!is.null(self$`id`)) {
        SessionObject[['id']] <- self$`id`
      }
      if (!is.null(self$`ip_address`)) {
        SessionObject[['ip_address']] <- self$`ip_address`
      }
      if (!is.null(self$`browser`)) {
        SessionObject[['browser']] <- self$`browser`
      }
      if (!is.null(self$`operating_system`)) {
        SessionObject[['operating_system']] <- self$`operating_system`
      }
      if (!is.null(self$`city`)) {
        SessionObject[['city']] <- self$`city`
      }
      if (!is.null(self$`state`)) {
        SessionObject[['state']] <- self$`state`
      }
      if (!is.null(self$`country`)) {
        SessionObject[['country']] <- self$`country`
      }
      if (!is.null(self$`credentials_type`)) {
        SessionObject[['credentials_type']] <- self$`credentials_type`
      }
      if (!is.null(self$`extended_at`)) {
        SessionObject[['extended_at']] <- self$`extended_at`
      }
      if (!is.null(self$`extended_count`)) {
        SessionObject[['extended_count']] <- self$`extended_count`
      }
      if (!is.null(self$`sudo_user_id`)) {
        SessionObject[['sudo_user_id']] <- self$`sudo_user_id`
      }
      if (!is.null(self$`created_at`)) {
        SessionObject[['created_at']] <- self$`created_at`
      }
      if (!is.null(self$`expires_at`)) {
        SessionObject[['expires_at']] <- self$`expires_at`
      }
      if (!is.null(self$`url`)) {
        SessionObject[['url']] <- self$`url`
      }

      SessionObject
    },
    fromJSONObject = function(SessionJsonObject) {
      SessionObject <- SessionJsonObject #jsonlite::fromJSON(SessionJson, simplifyVector = FALSE)
      if (!is.null(SessionObject$`can`)) {
        self$`can` <- SessionObject$`can`
      }
      if (!is.null(SessionObject$`id`)) {
        self$`id` <- SessionObject$`id`
      }
      if (!is.null(SessionObject$`ip_address`)) {
        self$`ip_address` <- SessionObject$`ip_address`
      }
      if (!is.null(SessionObject$`browser`)) {
        self$`browser` <- SessionObject$`browser`
      }
      if (!is.null(SessionObject$`operating_system`)) {
        self$`operating_system` <- SessionObject$`operating_system`
      }
      if (!is.null(SessionObject$`city`)) {
        self$`city` <- SessionObject$`city`
      }
      if (!is.null(SessionObject$`state`)) {
        self$`state` <- SessionObject$`state`
      }
      if (!is.null(SessionObject$`country`)) {
        self$`country` <- SessionObject$`country`
      }
      if (!is.null(SessionObject$`credentials_type`)) {
        self$`credentials_type` <- SessionObject$`credentials_type`
      }
      if (!is.null(SessionObject$`extended_at`)) {
        self$`extended_at` <- SessionObject$`extended_at`
      }
      if (!is.null(SessionObject$`extended_count`)) {
        self$`extended_count` <- SessionObject$`extended_count`
      }
      if (!is.null(SessionObject$`sudo_user_id`)) {
        self$`sudo_user_id` <- SessionObject$`sudo_user_id`
      }
      if (!is.null(SessionObject$`created_at`)) {
        self$`created_at` <- SessionObject$`created_at`
      }
      if (!is.null(SessionObject$`expires_at`)) {
        self$`expires_at` <- SessionObject$`expires_at`
      }
      if (!is.null(SessionObject$`url`)) {
        self$`url` <- SessionObject$`url`
      }
    },
    fromJSON = function(SessionJson) {
      SessionObject <- jsonlite::fromJSON(SessionJson, simplifyVector = FALSE)
      self$fromJSONObject(SessionObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "can": %s,
           "id": %d,
           "ip_address": %s,
           "browser": %s,
           "operating_system": %s,
           "city": %s,
           "state": %s,
           "country": %s,
           "credentials_type": %s,
           "extended_at": %s,
           "extended_count": %d,
           "sudo_user_id": %d,
           "created_at": %s,
           "expires_at": %s,
           "url": %s
        }',
        self$`can`,
        self$`id`,
        self$`ip_address`,
        self$`browser`,
        self$`operating_system`,
        self$`city`,
        self$`state`,
        self$`country`,
        self$`credentials_type`,
        self$`extended_at`,
        self$`extended_count`,
        self$`sudo_user_id`,
        self$`created_at`,
        self$`expires_at`,
        self$`url`
      )
    },
    fromJSONString = function(SessionJson) {
      SessionObject <- jsonlite::fromJSON(SessionJson, simplifyVector = FALSE)
      self$`can` <- SessionObject$`can`
      self$`id` <- SessionObject$`id`
      self$`ip_address` <- SessionObject$`ip_address`
      self$`browser` <- SessionObject$`browser`
      self$`operating_system` <- SessionObject$`operating_system`
      self$`city` <- SessionObject$`city`
      self$`state` <- SessionObject$`state`
      self$`country` <- SessionObject$`country`
      self$`credentials_type` <- SessionObject$`credentials_type`
      self$`extended_at` <- SessionObject$`extended_at`
      self$`extended_count` <- SessionObject$`extended_count`
      self$`sudo_user_id` <- SessionObject$`sudo_user_id`
      self$`created_at` <- SessionObject$`created_at`
      self$`expires_at` <- SessionObject$`expires_at`
      self$`url` <- SessionObject$`url`
    }
  )
)
