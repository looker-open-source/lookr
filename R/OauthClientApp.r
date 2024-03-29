# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' OauthClientApp Class
#'
#' @field can 
#' @field client_guid 
#' @field redirect_uri 
#' @field display_name 
#' @field description 
#' @field enabled 
#' @field group_id 
#' @field tokens_invalid_before 
#' @field activated_users 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
OauthClientApp <- R6::R6Class(
  'OauthClientApp',
  public = list(
    `can` = NULL,
    `client_guid` = NULL,
    `redirect_uri` = NULL,
    `display_name` = NULL,
    `description` = NULL,
    `enabled` = NULL,
    `group_id` = NULL,
    `tokens_invalid_before` = NULL,
    `activated_users` = NULL,
    initialize = function(`can`, `client_guid`, `redirect_uri`, `display_name`, `description`, `enabled`, `group_id`, `tokens_invalid_before`, `activated_users`){
      if (!missing(`can`)) {
        self$`can` <- `can`
      }
      if (!missing(`client_guid`)) {
        stopifnot(is.character(`client_guid`), length(`client_guid`) == 1)
        self$`client_guid` <- `client_guid`
      }
      if (!missing(`redirect_uri`)) {
        stopifnot(is.character(`redirect_uri`), length(`redirect_uri`) == 1)
        self$`redirect_uri` <- `redirect_uri`
      }
      if (!missing(`display_name`)) {
        stopifnot(is.character(`display_name`), length(`display_name`) == 1)
        self$`display_name` <- `display_name`
      }
      if (!missing(`description`)) {
        stopifnot(is.character(`description`), length(`description`) == 1)
        self$`description` <- `description`
      }
      if (!missing(`enabled`)) {
        self$`enabled` <- `enabled`
      }
      if (!missing(`group_id`)) {
        stopifnot(is.numeric(`group_id`), length(`group_id`) == 1)
        self$`group_id` <- `group_id`
      }
      if (!missing(`tokens_invalid_before`)) {
        stopifnot(is.character(`tokens_invalid_before`), length(`tokens_invalid_before`) == 1)
        self$`tokens_invalid_before` <- `tokens_invalid_before`
      }
      if (!missing(`activated_users`)) {
        stopifnot(is.list(`activated_users`), length(`activated_users`) != 0)
        lapply(`activated_users`, function(x) stopifnot(R6::is.R6(x)))
        self$`activated_users` <- `activated_users`
      }
    },
    toJSON = function() {
      OauthClientAppObject <- list()
      if (!is.null(self$`can`)) {
        OauthClientAppObject[['can']] <- self$`can`
      }
      if (!is.null(self$`client_guid`)) {
        OauthClientAppObject[['client_guid']] <- self$`client_guid`
      }
      if (!is.null(self$`redirect_uri`)) {
        OauthClientAppObject[['redirect_uri']] <- self$`redirect_uri`
      }
      if (!is.null(self$`display_name`)) {
        OauthClientAppObject[['display_name']] <- self$`display_name`
      }
      if (!is.null(self$`description`)) {
        OauthClientAppObject[['description']] <- self$`description`
      }
      if (!is.null(self$`enabled`)) {
        OauthClientAppObject[['enabled']] <- self$`enabled`
      }
      if (!is.null(self$`group_id`)) {
        OauthClientAppObject[['group_id']] <- self$`group_id`
      }
      if (!is.null(self$`tokens_invalid_before`)) {
        OauthClientAppObject[['tokens_invalid_before']] <- self$`tokens_invalid_before`
      }
      if (!is.null(self$`activated_users`)) {
        OauthClientAppObject[['activated_users']] <- lapply(self$`activated_users`, function(x) x$toJSON())
      }

      OauthClientAppObject
    },
    fromJSONObject = function(OauthClientAppJsonObject) {
      OauthClientAppObject <- OauthClientAppJsonObject #jsonlite::fromJSON(OauthClientAppJson, simplifyVector = FALSE)
      if (!is.null(OauthClientAppObject$`can`)) {
        self$`can` <- OauthClientAppObject$`can`
      }
      if (!is.null(OauthClientAppObject$`client_guid`)) {
        self$`client_guid` <- OauthClientAppObject$`client_guid`
      }
      if (!is.null(OauthClientAppObject$`redirect_uri`)) {
        self$`redirect_uri` <- OauthClientAppObject$`redirect_uri`
      }
      if (!is.null(OauthClientAppObject$`display_name`)) {
        self$`display_name` <- OauthClientAppObject$`display_name`
      }
      if (!is.null(OauthClientAppObject$`description`)) {
        self$`description` <- OauthClientAppObject$`description`
      }
      if (!is.null(OauthClientAppObject$`enabled`)) {
        self$`enabled` <- OauthClientAppObject$`enabled`
      }
      if (!is.null(OauthClientAppObject$`group_id`)) {
        self$`group_id` <- OauthClientAppObject$`group_id`
      }
      if (!is.null(OauthClientAppObject$`tokens_invalid_before`)) {
        self$`tokens_invalid_before` <- OauthClientAppObject$`tokens_invalid_before`
      }
      if (!is.null(OauthClientAppObject$`activated_users`)) {
        self$`activated_users` <- lapply(OauthClientAppObject$`activated_users`, function(x) {
          activated_usersObject <- UserPublic$new()
          activated_usersObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          activated_usersObject
        })
      }
    },
    fromJSON = function(OauthClientAppJson) {
      OauthClientAppObject <- jsonlite::fromJSON(OauthClientAppJson, simplifyVector = FALSE)
      self$fromJSONObject(OauthClientAppObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "can": %s,
           "client_guid": %s,
           "redirect_uri": %s,
           "display_name": %s,
           "description": %s,
           "enabled": %s,
           "group_id": %d,
           "tokens_invalid_before": %s,
           "activated_users": [%s]
        }',
        self$`can`,
        self$`client_guid`,
        self$`redirect_uri`,
        self$`display_name`,
        self$`description`,
        self$`enabled`,
        self$`group_id`,
        self$`tokens_invalid_before`,
        lapply(self$`activated_users`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(OauthClientAppJson) {
      OauthClientAppObject <- jsonlite::fromJSON(OauthClientAppJson, simplifyVector = FALSE)
      self$`can` <- OauthClientAppObject$`can`
      self$`client_guid` <- OauthClientAppObject$`client_guid`
      self$`redirect_uri` <- OauthClientAppObject$`redirect_uri`
      self$`display_name` <- OauthClientAppObject$`display_name`
      self$`description` <- OauthClientAppObject$`description`
      self$`enabled` <- OauthClientAppObject$`enabled`
      self$`group_id` <- OauthClientAppObject$`group_id`
      self$`tokens_invalid_before` <- OauthClientAppObject$`tokens_invalid_before`
      self$`activated_users` <- lapply(OauthClientAppObject$`activated_users`, function(x) UserPublic$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
