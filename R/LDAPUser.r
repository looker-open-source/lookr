# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' LDAPUser Class
#'
#' @field all_emails 
#' @field attributes 
#' @field email 
#' @field first_name 
#' @field groups 
#' @field last_name 
#' @field ldap_dn 
#' @field ldap_id 
#' @field roles 
#' @field url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
LDAPUser <- R6::R6Class(
  'LDAPUser',
  public = list(
    `all_emails` = NULL,
    `attributes` = NULL,
    `email` = NULL,
    `first_name` = NULL,
    `groups` = NULL,
    `last_name` = NULL,
    `ldap_dn` = NULL,
    `ldap_id` = NULL,
    `roles` = NULL,
    `url` = NULL,
    initialize = function(`all_emails`, `attributes`, `email`, `first_name`, `groups`, `last_name`, `ldap_dn`, `ldap_id`, `roles`, `url`){
      if (!missing(`all_emails`)) {
        stopifnot(is.list(`all_emails`), length(`all_emails`) != 0)
        lapply(`all_emails`, function(x) stopifnot(is.character(x)))
        self$`all_emails` <- `all_emails`
      }
      if (!missing(`attributes`)) {
        self$`attributes` <- `attributes`
      }
      if (!missing(`email`)) {
        stopifnot(is.character(`email`), length(`email`) == 1)
        self$`email` <- `email`
      }
      if (!missing(`first_name`)) {
        stopifnot(is.character(`first_name`), length(`first_name`) == 1)
        self$`first_name` <- `first_name`
      }
      if (!missing(`groups`)) {
        stopifnot(is.list(`groups`), length(`groups`) != 0)
        lapply(`groups`, function(x) stopifnot(is.character(x)))
        self$`groups` <- `groups`
      }
      if (!missing(`last_name`)) {
        stopifnot(is.character(`last_name`), length(`last_name`) == 1)
        self$`last_name` <- `last_name`
      }
      if (!missing(`ldap_dn`)) {
        stopifnot(is.character(`ldap_dn`), length(`ldap_dn`) == 1)
        self$`ldap_dn` <- `ldap_dn`
      }
      if (!missing(`ldap_id`)) {
        stopifnot(is.character(`ldap_id`), length(`ldap_id`) == 1)
        self$`ldap_id` <- `ldap_id`
      }
      if (!missing(`roles`)) {
        stopifnot(is.list(`roles`), length(`roles`) != 0)
        lapply(`roles`, function(x) stopifnot(is.character(x)))
        self$`roles` <- `roles`
      }
      if (!missing(`url`)) {
        stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
    },
    toJSON = function() {
      LDAPUserObject <- list()
      if (!is.null(self$`all_emails`)) {
        LDAPUserObject[['all_emails']] <- self$`all_emails`
      }
      if (!is.null(self$`attributes`)) {
        LDAPUserObject[['attributes']] <- self$`attributes`
      }
      if (!is.null(self$`email`)) {
        LDAPUserObject[['email']] <- self$`email`
      }
      if (!is.null(self$`first_name`)) {
        LDAPUserObject[['first_name']] <- self$`first_name`
      }
      if (!is.null(self$`groups`)) {
        LDAPUserObject[['groups']] <- self$`groups`
      }
      if (!is.null(self$`last_name`)) {
        LDAPUserObject[['last_name']] <- self$`last_name`
      }
      if (!is.null(self$`ldap_dn`)) {
        LDAPUserObject[['ldap_dn']] <- self$`ldap_dn`
      }
      if (!is.null(self$`ldap_id`)) {
        LDAPUserObject[['ldap_id']] <- self$`ldap_id`
      }
      if (!is.null(self$`roles`)) {
        LDAPUserObject[['roles']] <- self$`roles`
      }
      if (!is.null(self$`url`)) {
        LDAPUserObject[['url']] <- self$`url`
      }

      LDAPUserObject
    },
    fromJSONObject = function(LDAPUserJsonObject) {
      LDAPUserObject <- LDAPUserJsonObject #jsonlite::fromJSON(LDAPUserJson, simplifyVector = FALSE)
      if (!is.null(LDAPUserObject$`all_emails`)) {
        self$`all_emails` <- LDAPUserObject$`all_emails`
      }
      if (!is.null(LDAPUserObject$`attributes`)) {
        self$`attributes` <- LDAPUserObject$`attributes`
      }
      if (!is.null(LDAPUserObject$`email`)) {
        self$`email` <- LDAPUserObject$`email`
      }
      if (!is.null(LDAPUserObject$`first_name`)) {
        self$`first_name` <- LDAPUserObject$`first_name`
      }
      if (!is.null(LDAPUserObject$`groups`)) {
        self$`groups` <- LDAPUserObject$`groups`
      }
      if (!is.null(LDAPUserObject$`last_name`)) {
        self$`last_name` <- LDAPUserObject$`last_name`
      }
      if (!is.null(LDAPUserObject$`ldap_dn`)) {
        self$`ldap_dn` <- LDAPUserObject$`ldap_dn`
      }
      if (!is.null(LDAPUserObject$`ldap_id`)) {
        self$`ldap_id` <- LDAPUserObject$`ldap_id`
      }
      if (!is.null(LDAPUserObject$`roles`)) {
        self$`roles` <- LDAPUserObject$`roles`
      }
      if (!is.null(LDAPUserObject$`url`)) {
        self$`url` <- LDAPUserObject$`url`
      }
    },
    fromJSON = function(LDAPUserJson) {
      LDAPUserObject <- jsonlite::fromJSON(LDAPUserJson, simplifyVector = FALSE)
      self$fromJSONObject(LDAPUserObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "all_emails": [%s],
           "attributes": %s,
           "email": %s,
           "first_name": %s,
           "groups": [%s],
           "last_name": %s,
           "ldap_dn": %s,
           "ldap_id": %s,
           "roles": [%s],
           "url": %s
        }',
        lapply(self$`all_emails`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`attributes`,
        self$`email`,
        self$`first_name`,
        lapply(self$`groups`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`last_name`,
        self$`ldap_dn`,
        self$`ldap_id`,
        lapply(self$`roles`, function(x) paste(paste0('"', x, '"'), sep=",")),
        self$`url`
      )
    },
    fromJSONString = function(LDAPUserJson) {
      LDAPUserObject <- jsonlite::fromJSON(LDAPUserJson, simplifyVector = FALSE)
      self$`all_emails` <- LDAPUserObject$`all_emails`
      self$`attributes` <- LDAPUserObject$`attributes`
      self$`email` <- LDAPUserObject$`email`
      self$`first_name` <- LDAPUserObject$`first_name`
      self$`groups` <- LDAPUserObject$`groups`
      self$`last_name` <- LDAPUserObject$`last_name`
      self$`ldap_dn` <- LDAPUserObject$`ldap_dn`
      self$`ldap_id` <- LDAPUserObject$`ldap_id`
      self$`roles` <- LDAPUserObject$`roles`
      self$`url` <- LDAPUserObject$`url`
    }
  )
)
