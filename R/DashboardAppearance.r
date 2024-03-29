# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' DashboardAppearance Class
#'
#' @field page_side_margins 
#' @field page_background_color 
#' @field tile_title_alignment 
#' @field tile_space_between 
#' @field tile_background_color 
#' @field tile_shadow 
#' @field key_color 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
DashboardAppearance <- R6::R6Class(
  'DashboardAppearance',
  public = list(
    `page_side_margins` = NULL,
    `page_background_color` = NULL,
    `tile_title_alignment` = NULL,
    `tile_space_between` = NULL,
    `tile_background_color` = NULL,
    `tile_shadow` = NULL,
    `key_color` = NULL,
    initialize = function(`page_side_margins`, `page_background_color`, `tile_title_alignment`, `tile_space_between`, `tile_background_color`, `tile_shadow`, `key_color`){
      if (!missing(`page_side_margins`)) {
        stopifnot(is.numeric(`page_side_margins`), length(`page_side_margins`) == 1)
        self$`page_side_margins` <- `page_side_margins`
      }
      if (!missing(`page_background_color`)) {
        stopifnot(is.character(`page_background_color`), length(`page_background_color`) == 1)
        self$`page_background_color` <- `page_background_color`
      }
      if (!missing(`tile_title_alignment`)) {
        stopifnot(is.character(`tile_title_alignment`), length(`tile_title_alignment`) == 1)
        self$`tile_title_alignment` <- `tile_title_alignment`
      }
      if (!missing(`tile_space_between`)) {
        stopifnot(is.numeric(`tile_space_between`), length(`tile_space_between`) == 1)
        self$`tile_space_between` <- `tile_space_between`
      }
      if (!missing(`tile_background_color`)) {
        stopifnot(is.character(`tile_background_color`), length(`tile_background_color`) == 1)
        self$`tile_background_color` <- `tile_background_color`
      }
      if (!missing(`tile_shadow`)) {
        self$`tile_shadow` <- `tile_shadow`
      }
      if (!missing(`key_color`)) {
        stopifnot(is.character(`key_color`), length(`key_color`) == 1)
        self$`key_color` <- `key_color`
      }
    },
    toJSON = function() {
      DashboardAppearanceObject <- list()
      if (!is.null(self$`page_side_margins`)) {
        DashboardAppearanceObject[['page_side_margins']] <- self$`page_side_margins`
      }
      if (!is.null(self$`page_background_color`)) {
        DashboardAppearanceObject[['page_background_color']] <- self$`page_background_color`
      }
      if (!is.null(self$`tile_title_alignment`)) {
        DashboardAppearanceObject[['tile_title_alignment']] <- self$`tile_title_alignment`
      }
      if (!is.null(self$`tile_space_between`)) {
        DashboardAppearanceObject[['tile_space_between']] <- self$`tile_space_between`
      }
      if (!is.null(self$`tile_background_color`)) {
        DashboardAppearanceObject[['tile_background_color']] <- self$`tile_background_color`
      }
      if (!is.null(self$`tile_shadow`)) {
        DashboardAppearanceObject[['tile_shadow']] <- self$`tile_shadow`
      }
      if (!is.null(self$`key_color`)) {
        DashboardAppearanceObject[['key_color']] <- self$`key_color`
      }

      DashboardAppearanceObject
    },
    fromJSONObject = function(DashboardAppearanceJsonObject) {
      DashboardAppearanceObject <- DashboardAppearanceJsonObject #jsonlite::fromJSON(DashboardAppearanceJson, simplifyVector = FALSE)
      if (!is.null(DashboardAppearanceObject$`page_side_margins`)) {
        self$`page_side_margins` <- DashboardAppearanceObject$`page_side_margins`
      }
      if (!is.null(DashboardAppearanceObject$`page_background_color`)) {
        self$`page_background_color` <- DashboardAppearanceObject$`page_background_color`
      }
      if (!is.null(DashboardAppearanceObject$`tile_title_alignment`)) {
        self$`tile_title_alignment` <- DashboardAppearanceObject$`tile_title_alignment`
      }
      if (!is.null(DashboardAppearanceObject$`tile_space_between`)) {
        self$`tile_space_between` <- DashboardAppearanceObject$`tile_space_between`
      }
      if (!is.null(DashboardAppearanceObject$`tile_background_color`)) {
        self$`tile_background_color` <- DashboardAppearanceObject$`tile_background_color`
      }
      if (!is.null(DashboardAppearanceObject$`tile_shadow`)) {
        self$`tile_shadow` <- DashboardAppearanceObject$`tile_shadow`
      }
      if (!is.null(DashboardAppearanceObject$`key_color`)) {
        self$`key_color` <- DashboardAppearanceObject$`key_color`
      }
    },
    fromJSON = function(DashboardAppearanceJson) {
      DashboardAppearanceObject <- jsonlite::fromJSON(DashboardAppearanceJson, simplifyVector = FALSE)
      self$fromJSONObject(DashboardAppearanceObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "page_side_margins": %d,
           "page_background_color": %s,
           "tile_title_alignment": %s,
           "tile_space_between": %d,
           "tile_background_color": %s,
           "tile_shadow": %s,
           "key_color": %s
        }',
        self$`page_side_margins`,
        self$`page_background_color`,
        self$`tile_title_alignment`,
        self$`tile_space_between`,
        self$`tile_background_color`,
        self$`tile_shadow`,
        self$`key_color`
      )
    },
    fromJSONString = function(DashboardAppearanceJson) {
      DashboardAppearanceObject <- jsonlite::fromJSON(DashboardAppearanceJson, simplifyVector = FALSE)
      self$`page_side_margins` <- DashboardAppearanceObject$`page_side_margins`
      self$`page_background_color` <- DashboardAppearanceObject$`page_background_color`
      self$`tile_title_alignment` <- DashboardAppearanceObject$`tile_title_alignment`
      self$`tile_space_between` <- DashboardAppearanceObject$`tile_space_between`
      self$`tile_background_color` <- DashboardAppearanceObject$`tile_background_color`
      self$`tile_shadow` <- DashboardAppearanceObject$`tile_shadow`
      self$`key_color` <- DashboardAppearanceObject$`key_color`
    }
  )
)
