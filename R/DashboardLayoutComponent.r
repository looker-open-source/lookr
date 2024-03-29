# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' DashboardLayoutComponent Class
#'
#' @field can 
#' @field id 
#' @field dashboard_layout_id 
#' @field dashboard_element_id 
#' @field row 
#' @field column 
#' @field width 
#' @field height 
#' @field deleted 
#' @field element_title 
#' @field element_title_hidden 
#' @field vis_type 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
DashboardLayoutComponent <- R6::R6Class(
  'DashboardLayoutComponent',
  public = list(
    `can` = NULL,
    `id` = NULL,
    `dashboard_layout_id` = NULL,
    `dashboard_element_id` = NULL,
    `row` = NULL,
    `column` = NULL,
    `width` = NULL,
    `height` = NULL,
    `deleted` = NULL,
    `element_title` = NULL,
    `element_title_hidden` = NULL,
    `vis_type` = NULL,
    initialize = function(`can`, `id`, `dashboard_layout_id`, `dashboard_element_id`, `row`, `column`, `width`, `height`, `deleted`, `element_title`, `element_title_hidden`, `vis_type`){
      if (!missing(`can`)) {
        self$`can` <- `can`
      }
      if (!missing(`id`)) {
        stopifnot(is.character(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`dashboard_layout_id`)) {
        stopifnot(is.character(`dashboard_layout_id`), length(`dashboard_layout_id`) == 1)
        self$`dashboard_layout_id` <- `dashboard_layout_id`
      }
      if (!missing(`dashboard_element_id`)) {
        stopifnot(is.character(`dashboard_element_id`), length(`dashboard_element_id`) == 1)
        self$`dashboard_element_id` <- `dashboard_element_id`
      }
      if (!missing(`row`)) {
        stopifnot(is.numeric(`row`), length(`row`) == 1)
        self$`row` <- `row`
      }
      if (!missing(`column`)) {
        stopifnot(is.numeric(`column`), length(`column`) == 1)
        self$`column` <- `column`
      }
      if (!missing(`width`)) {
        stopifnot(is.numeric(`width`), length(`width`) == 1)
        self$`width` <- `width`
      }
      if (!missing(`height`)) {
        stopifnot(is.numeric(`height`), length(`height`) == 1)
        self$`height` <- `height`
      }
      if (!missing(`deleted`)) {
        self$`deleted` <- `deleted`
      }
      if (!missing(`element_title`)) {
        stopifnot(is.character(`element_title`), length(`element_title`) == 1)
        self$`element_title` <- `element_title`
      }
      if (!missing(`element_title_hidden`)) {
        self$`element_title_hidden` <- `element_title_hidden`
      }
      if (!missing(`vis_type`)) {
        stopifnot(is.character(`vis_type`), length(`vis_type`) == 1)
        self$`vis_type` <- `vis_type`
      }
    },
    toJSON = function() {
      DashboardLayoutComponentObject <- list()
      if (!is.null(self$`can`)) {
        DashboardLayoutComponentObject[['can']] <- self$`can`
      }
      if (!is.null(self$`id`)) {
        DashboardLayoutComponentObject[['id']] <- self$`id`
      }
      if (!is.null(self$`dashboard_layout_id`)) {
        DashboardLayoutComponentObject[['dashboard_layout_id']] <- self$`dashboard_layout_id`
      }
      if (!is.null(self$`dashboard_element_id`)) {
        DashboardLayoutComponentObject[['dashboard_element_id']] <- self$`dashboard_element_id`
      }
      if (!is.null(self$`row`)) {
        DashboardLayoutComponentObject[['row']] <- self$`row`
      }
      if (!is.null(self$`column`)) {
        DashboardLayoutComponentObject[['column']] <- self$`column`
      }
      if (!is.null(self$`width`)) {
        DashboardLayoutComponentObject[['width']] <- self$`width`
      }
      if (!is.null(self$`height`)) {
        DashboardLayoutComponentObject[['height']] <- self$`height`
      }
      if (!is.null(self$`deleted`)) {
        DashboardLayoutComponentObject[['deleted']] <- self$`deleted`
      }
      if (!is.null(self$`element_title`)) {
        DashboardLayoutComponentObject[['element_title']] <- self$`element_title`
      }
      if (!is.null(self$`element_title_hidden`)) {
        DashboardLayoutComponentObject[['element_title_hidden']] <- self$`element_title_hidden`
      }
      if (!is.null(self$`vis_type`)) {
        DashboardLayoutComponentObject[['vis_type']] <- self$`vis_type`
      }

      DashboardLayoutComponentObject
    },
    fromJSONObject = function(DashboardLayoutComponentJsonObject) {
      DashboardLayoutComponentObject <- DashboardLayoutComponentJsonObject #jsonlite::fromJSON(DashboardLayoutComponentJson, simplifyVector = FALSE)
      if (!is.null(DashboardLayoutComponentObject$`can`)) {
        self$`can` <- DashboardLayoutComponentObject$`can`
      }
      if (!is.null(DashboardLayoutComponentObject$`id`)) {
        self$`id` <- DashboardLayoutComponentObject$`id`
      }
      if (!is.null(DashboardLayoutComponentObject$`dashboard_layout_id`)) {
        self$`dashboard_layout_id` <- DashboardLayoutComponentObject$`dashboard_layout_id`
      }
      if (!is.null(DashboardLayoutComponentObject$`dashboard_element_id`)) {
        self$`dashboard_element_id` <- DashboardLayoutComponentObject$`dashboard_element_id`
      }
      if (!is.null(DashboardLayoutComponentObject$`row`)) {
        self$`row` <- DashboardLayoutComponentObject$`row`
      }
      if (!is.null(DashboardLayoutComponentObject$`column`)) {
        self$`column` <- DashboardLayoutComponentObject$`column`
      }
      if (!is.null(DashboardLayoutComponentObject$`width`)) {
        self$`width` <- DashboardLayoutComponentObject$`width`
      }
      if (!is.null(DashboardLayoutComponentObject$`height`)) {
        self$`height` <- DashboardLayoutComponentObject$`height`
      }
      if (!is.null(DashboardLayoutComponentObject$`deleted`)) {
        self$`deleted` <- DashboardLayoutComponentObject$`deleted`
      }
      if (!is.null(DashboardLayoutComponentObject$`element_title`)) {
        self$`element_title` <- DashboardLayoutComponentObject$`element_title`
      }
      if (!is.null(DashboardLayoutComponentObject$`element_title_hidden`)) {
        self$`element_title_hidden` <- DashboardLayoutComponentObject$`element_title_hidden`
      }
      if (!is.null(DashboardLayoutComponentObject$`vis_type`)) {
        self$`vis_type` <- DashboardLayoutComponentObject$`vis_type`
      }
    },
    fromJSON = function(DashboardLayoutComponentJson) {
      DashboardLayoutComponentObject <- jsonlite::fromJSON(DashboardLayoutComponentJson, simplifyVector = FALSE)
      self$fromJSONObject(DashboardLayoutComponentObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "can": %s,
           "id": %s,
           "dashboard_layout_id": %s,
           "dashboard_element_id": %s,
           "row": %d,
           "column": %d,
           "width": %d,
           "height": %d,
           "deleted": %s,
           "element_title": %s,
           "element_title_hidden": %s,
           "vis_type": %s
        }',
        self$`can`,
        self$`id`,
        self$`dashboard_layout_id`,
        self$`dashboard_element_id`,
        self$`row`,
        self$`column`,
        self$`width`,
        self$`height`,
        self$`deleted`,
        self$`element_title`,
        self$`element_title_hidden`,
        self$`vis_type`
      )
    },
    fromJSONString = function(DashboardLayoutComponentJson) {
      DashboardLayoutComponentObject <- jsonlite::fromJSON(DashboardLayoutComponentJson, simplifyVector = FALSE)
      self$`can` <- DashboardLayoutComponentObject$`can`
      self$`id` <- DashboardLayoutComponentObject$`id`
      self$`dashboard_layout_id` <- DashboardLayoutComponentObject$`dashboard_layout_id`
      self$`dashboard_element_id` <- DashboardLayoutComponentObject$`dashboard_element_id`
      self$`row` <- DashboardLayoutComponentObject$`row`
      self$`column` <- DashboardLayoutComponentObject$`column`
      self$`width` <- DashboardLayoutComponentObject$`width`
      self$`height` <- DashboardLayoutComponentObject$`height`
      self$`deleted` <- DashboardLayoutComponentObject$`deleted`
      self$`element_title` <- DashboardLayoutComponentObject$`element_title`
      self$`element_title_hidden` <- DashboardLayoutComponentObject$`element_title_hidden`
      self$`vis_type` <- DashboardLayoutComponentObject$`vis_type`
    }
  )
)
