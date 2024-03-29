# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' WhitelabelConfiguration Class
#'
#' @field id 
#' @field logo_file 
#' @field logo_url 
#' @field favicon_file 
#' @field favicon_url 
#' @field default_title 
#' @field show_help_menu 
#' @field show_docs 
#' @field show_email_sub_options 
#' @field allow_looker_mentions 
#' @field allow_looker_links 
#' @field custom_welcome_email_advanced 
#' @field setup_mentions 
#' @field alerts_logo 
#' @field alerts_links 
#' @field folders_mentions 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
WhitelabelConfiguration <- R6::R6Class(
  'WhitelabelConfiguration',
  public = list(
    `id` = NULL,
    `logo_file` = NULL,
    `logo_url` = NULL,
    `favicon_file` = NULL,
    `favicon_url` = NULL,
    `default_title` = NULL,
    `show_help_menu` = NULL,
    `show_docs` = NULL,
    `show_email_sub_options` = NULL,
    `allow_looker_mentions` = NULL,
    `allow_looker_links` = NULL,
    `custom_welcome_email_advanced` = NULL,
    `setup_mentions` = NULL,
    `alerts_logo` = NULL,
    `alerts_links` = NULL,
    `folders_mentions` = NULL,
    initialize = function(`id`, `logo_file`, `logo_url`, `favicon_file`, `favicon_url`, `default_title`, `show_help_menu`, `show_docs`, `show_email_sub_options`, `allow_looker_mentions`, `allow_looker_links`, `custom_welcome_email_advanced`, `setup_mentions`, `alerts_logo`, `alerts_links`, `folders_mentions`){
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`logo_file`)) {
        stopifnot(is.character(`logo_file`), length(`logo_file`) == 1)
        self$`logo_file` <- `logo_file`
      }
      if (!missing(`logo_url`)) {
        stopifnot(is.character(`logo_url`), length(`logo_url`) == 1)
        self$`logo_url` <- `logo_url`
      }
      if (!missing(`favicon_file`)) {
        stopifnot(is.character(`favicon_file`), length(`favicon_file`) == 1)
        self$`favicon_file` <- `favicon_file`
      }
      if (!missing(`favicon_url`)) {
        stopifnot(is.character(`favicon_url`), length(`favicon_url`) == 1)
        self$`favicon_url` <- `favicon_url`
      }
      if (!missing(`default_title`)) {
        stopifnot(is.character(`default_title`), length(`default_title`) == 1)
        self$`default_title` <- `default_title`
      }
      if (!missing(`show_help_menu`)) {
        self$`show_help_menu` <- `show_help_menu`
      }
      if (!missing(`show_docs`)) {
        self$`show_docs` <- `show_docs`
      }
      if (!missing(`show_email_sub_options`)) {
        self$`show_email_sub_options` <- `show_email_sub_options`
      }
      if (!missing(`allow_looker_mentions`)) {
        self$`allow_looker_mentions` <- `allow_looker_mentions`
      }
      if (!missing(`allow_looker_links`)) {
        self$`allow_looker_links` <- `allow_looker_links`
      }
      if (!missing(`custom_welcome_email_advanced`)) {
        self$`custom_welcome_email_advanced` <- `custom_welcome_email_advanced`
      }
      if (!missing(`setup_mentions`)) {
        self$`setup_mentions` <- `setup_mentions`
      }
      if (!missing(`alerts_logo`)) {
        self$`alerts_logo` <- `alerts_logo`
      }
      if (!missing(`alerts_links`)) {
        self$`alerts_links` <- `alerts_links`
      }
      if (!missing(`folders_mentions`)) {
        self$`folders_mentions` <- `folders_mentions`
      }
    },
    toJSON = function() {
      WhitelabelConfigurationObject <- list()
      if (!is.null(self$`id`)) {
        WhitelabelConfigurationObject[['id']] <- self$`id`
      }
      if (!is.null(self$`logo_file`)) {
        WhitelabelConfigurationObject[['logo_file']] <- self$`logo_file`
      }
      if (!is.null(self$`logo_url`)) {
        WhitelabelConfigurationObject[['logo_url']] <- self$`logo_url`
      }
      if (!is.null(self$`favicon_file`)) {
        WhitelabelConfigurationObject[['favicon_file']] <- self$`favicon_file`
      }
      if (!is.null(self$`favicon_url`)) {
        WhitelabelConfigurationObject[['favicon_url']] <- self$`favicon_url`
      }
      if (!is.null(self$`default_title`)) {
        WhitelabelConfigurationObject[['default_title']] <- self$`default_title`
      }
      if (!is.null(self$`show_help_menu`)) {
        WhitelabelConfigurationObject[['show_help_menu']] <- self$`show_help_menu`
      }
      if (!is.null(self$`show_docs`)) {
        WhitelabelConfigurationObject[['show_docs']] <- self$`show_docs`
      }
      if (!is.null(self$`show_email_sub_options`)) {
        WhitelabelConfigurationObject[['show_email_sub_options']] <- self$`show_email_sub_options`
      }
      if (!is.null(self$`allow_looker_mentions`)) {
        WhitelabelConfigurationObject[['allow_looker_mentions']] <- self$`allow_looker_mentions`
      }
      if (!is.null(self$`allow_looker_links`)) {
        WhitelabelConfigurationObject[['allow_looker_links']] <- self$`allow_looker_links`
      }
      if (!is.null(self$`custom_welcome_email_advanced`)) {
        WhitelabelConfigurationObject[['custom_welcome_email_advanced']] <- self$`custom_welcome_email_advanced`
      }
      if (!is.null(self$`setup_mentions`)) {
        WhitelabelConfigurationObject[['setup_mentions']] <- self$`setup_mentions`
      }
      if (!is.null(self$`alerts_logo`)) {
        WhitelabelConfigurationObject[['alerts_logo']] <- self$`alerts_logo`
      }
      if (!is.null(self$`alerts_links`)) {
        WhitelabelConfigurationObject[['alerts_links']] <- self$`alerts_links`
      }
      if (!is.null(self$`folders_mentions`)) {
        WhitelabelConfigurationObject[['folders_mentions']] <- self$`folders_mentions`
      }

      WhitelabelConfigurationObject
    },
    fromJSONObject = function(WhitelabelConfigurationJsonObject) {
      WhitelabelConfigurationObject <- WhitelabelConfigurationJsonObject #jsonlite::fromJSON(WhitelabelConfigurationJson, simplifyVector = FALSE)
      if (!is.null(WhitelabelConfigurationObject$`id`)) {
        self$`id` <- WhitelabelConfigurationObject$`id`
      }
      if (!is.null(WhitelabelConfigurationObject$`logo_file`)) {
        self$`logo_file` <- WhitelabelConfigurationObject$`logo_file`
      }
      if (!is.null(WhitelabelConfigurationObject$`logo_url`)) {
        self$`logo_url` <- WhitelabelConfigurationObject$`logo_url`
      }
      if (!is.null(WhitelabelConfigurationObject$`favicon_file`)) {
        self$`favicon_file` <- WhitelabelConfigurationObject$`favicon_file`
      }
      if (!is.null(WhitelabelConfigurationObject$`favicon_url`)) {
        self$`favicon_url` <- WhitelabelConfigurationObject$`favicon_url`
      }
      if (!is.null(WhitelabelConfigurationObject$`default_title`)) {
        self$`default_title` <- WhitelabelConfigurationObject$`default_title`
      }
      if (!is.null(WhitelabelConfigurationObject$`show_help_menu`)) {
        self$`show_help_menu` <- WhitelabelConfigurationObject$`show_help_menu`
      }
      if (!is.null(WhitelabelConfigurationObject$`show_docs`)) {
        self$`show_docs` <- WhitelabelConfigurationObject$`show_docs`
      }
      if (!is.null(WhitelabelConfigurationObject$`show_email_sub_options`)) {
        self$`show_email_sub_options` <- WhitelabelConfigurationObject$`show_email_sub_options`
      }
      if (!is.null(WhitelabelConfigurationObject$`allow_looker_mentions`)) {
        self$`allow_looker_mentions` <- WhitelabelConfigurationObject$`allow_looker_mentions`
      }
      if (!is.null(WhitelabelConfigurationObject$`allow_looker_links`)) {
        self$`allow_looker_links` <- WhitelabelConfigurationObject$`allow_looker_links`
      }
      if (!is.null(WhitelabelConfigurationObject$`custom_welcome_email_advanced`)) {
        self$`custom_welcome_email_advanced` <- WhitelabelConfigurationObject$`custom_welcome_email_advanced`
      }
      if (!is.null(WhitelabelConfigurationObject$`setup_mentions`)) {
        self$`setup_mentions` <- WhitelabelConfigurationObject$`setup_mentions`
      }
      if (!is.null(WhitelabelConfigurationObject$`alerts_logo`)) {
        self$`alerts_logo` <- WhitelabelConfigurationObject$`alerts_logo`
      }
      if (!is.null(WhitelabelConfigurationObject$`alerts_links`)) {
        self$`alerts_links` <- WhitelabelConfigurationObject$`alerts_links`
      }
      if (!is.null(WhitelabelConfigurationObject$`folders_mentions`)) {
        self$`folders_mentions` <- WhitelabelConfigurationObject$`folders_mentions`
      }
    },
    fromJSON = function(WhitelabelConfigurationJson) {
      WhitelabelConfigurationObject <- jsonlite::fromJSON(WhitelabelConfigurationJson, simplifyVector = FALSE)
      self$fromJSONObject(WhitelabelConfigurationObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %d,
           "logo_file": %s,
           "logo_url": %s,
           "favicon_file": %s,
           "favicon_url": %s,
           "default_title": %s,
           "show_help_menu": %s,
           "show_docs": %s,
           "show_email_sub_options": %s,
           "allow_looker_mentions": %s,
           "allow_looker_links": %s,
           "custom_welcome_email_advanced": %s,
           "setup_mentions": %s,
           "alerts_logo": %s,
           "alerts_links": %s,
           "folders_mentions": %s
        }',
        self$`id`,
        self$`logo_file`,
        self$`logo_url`,
        self$`favicon_file`,
        self$`favicon_url`,
        self$`default_title`,
        self$`show_help_menu`,
        self$`show_docs`,
        self$`show_email_sub_options`,
        self$`allow_looker_mentions`,
        self$`allow_looker_links`,
        self$`custom_welcome_email_advanced`,
        self$`setup_mentions`,
        self$`alerts_logo`,
        self$`alerts_links`,
        self$`folders_mentions`
      )
    },
    fromJSONString = function(WhitelabelConfigurationJson) {
      WhitelabelConfigurationObject <- jsonlite::fromJSON(WhitelabelConfigurationJson, simplifyVector = FALSE)
      self$`id` <- WhitelabelConfigurationObject$`id`
      self$`logo_file` <- WhitelabelConfigurationObject$`logo_file`
      self$`logo_url` <- WhitelabelConfigurationObject$`logo_url`
      self$`favicon_file` <- WhitelabelConfigurationObject$`favicon_file`
      self$`favicon_url` <- WhitelabelConfigurationObject$`favicon_url`
      self$`default_title` <- WhitelabelConfigurationObject$`default_title`
      self$`show_help_menu` <- WhitelabelConfigurationObject$`show_help_menu`
      self$`show_docs` <- WhitelabelConfigurationObject$`show_docs`
      self$`show_email_sub_options` <- WhitelabelConfigurationObject$`show_email_sub_options`
      self$`allow_looker_mentions` <- WhitelabelConfigurationObject$`allow_looker_mentions`
      self$`allow_looker_links` <- WhitelabelConfigurationObject$`allow_looker_links`
      self$`custom_welcome_email_advanced` <- WhitelabelConfigurationObject$`custom_welcome_email_advanced`
      self$`setup_mentions` <- WhitelabelConfigurationObject$`setup_mentions`
      self$`alerts_logo` <- WhitelabelConfigurationObject$`alerts_logo`
      self$`alerts_links` <- WhitelabelConfigurationObject$`alerts_links`
      self$`folders_mentions` <- WhitelabelConfigurationObject$`folders_mentions`
    }
  )
)
