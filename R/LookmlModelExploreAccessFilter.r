# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' LookmlModelExploreAccessFilter Class
#'
#' @field field 
#' @field user_attribute 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
LookmlModelExploreAccessFilter <- R6::R6Class(
  'LookmlModelExploreAccessFilter',
  public = list(
    `field` = NULL,
    `user_attribute` = NULL,
    initialize = function(`field`, `user_attribute`){
      if (!missing(`field`)) {
        stopifnot(is.character(`field`), length(`field`) == 1)
        self$`field` <- `field`
      }
      if (!missing(`user_attribute`)) {
        stopifnot(is.character(`user_attribute`), length(`user_attribute`) == 1)
        self$`user_attribute` <- `user_attribute`
      }
    },
    toJSON = function() {
      LookmlModelExploreAccessFilterObject <- list()
      if (!is.null(self$`field`)) {
        LookmlModelExploreAccessFilterObject[['field']] <- self$`field`
      }
      if (!is.null(self$`user_attribute`)) {
        LookmlModelExploreAccessFilterObject[['user_attribute']] <- self$`user_attribute`
      }

      LookmlModelExploreAccessFilterObject
    },
    fromJSONObject = function(LookmlModelExploreAccessFilterJsonObject) {
      LookmlModelExploreAccessFilterObject <- LookmlModelExploreAccessFilterJsonObject #jsonlite::fromJSON(LookmlModelExploreAccessFilterJson, simplifyVector = FALSE)
      if (!is.null(LookmlModelExploreAccessFilterObject$`field`)) {
        self$`field` <- LookmlModelExploreAccessFilterObject$`field`
      }
      if (!is.null(LookmlModelExploreAccessFilterObject$`user_attribute`)) {
        self$`user_attribute` <- LookmlModelExploreAccessFilterObject$`user_attribute`
      }
    },
    fromJSON = function(LookmlModelExploreAccessFilterJson) {
      LookmlModelExploreAccessFilterObject <- jsonlite::fromJSON(LookmlModelExploreAccessFilterJson, simplifyVector = FALSE)
      self$fromJSONObject(LookmlModelExploreAccessFilterObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "field": %s,
           "user_attribute": %s
        }',
        self$`field`,
        self$`user_attribute`
      )
    },
    fromJSONString = function(LookmlModelExploreAccessFilterJson) {
      LookmlModelExploreAccessFilterObject <- jsonlite::fromJSON(LookmlModelExploreAccessFilterJson, simplifyVector = FALSE)
      self$`field` <- LookmlModelExploreAccessFilterObject$`field`
      self$`user_attribute` <- LookmlModelExploreAccessFilterObject$`user_attribute`
    }
  )
)
