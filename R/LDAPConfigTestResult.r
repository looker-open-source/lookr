# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' LDAPConfigTestResult Class
#'
#' @field details 
#' @field issues 
#' @field message 
#' @field status 
#' @field trace 
#' @field user 
#' @field url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
LDAPConfigTestResult <- R6::R6Class(
  'LDAPConfigTestResult',
  public = list(
    `details` = NULL,
    `issues` = NULL,
    `message` = NULL,
    `status` = NULL,
    `trace` = NULL,
    `user` = NULL,
    `url` = NULL,
    initialize = function(`details`, `issues`, `message`, `status`, `trace`, `user`, `url`){
      if (!missing(`details`)) {
        stopifnot(is.character(`details`), length(`details`) == 1)
        self$`details` <- `details`
      }
      if (!missing(`issues`)) {
        stopifnot(is.list(`issues`), length(`issues`) != 0)
        lapply(`issues`, function(x) stopifnot(R6::is.R6(x)))
        self$`issues` <- `issues`
      }
      if (!missing(`message`)) {
        stopifnot(is.character(`message`), length(`message`) == 1)
        self$`message` <- `message`
      }
      if (!missing(`status`)) {
        stopifnot(is.character(`status`), length(`status`) == 1)
        self$`status` <- `status`
      }
      if (!missing(`trace`)) {
        stopifnot(is.character(`trace`), length(`trace`) == 1)
        self$`trace` <- `trace`
      }
      if (!missing(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
      if (!missing(`url`)) {
        stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
    },
    toJSON = function() {
      LDAPConfigTestResultObject <- list()
      if (!is.null(self$`details`)) {
        LDAPConfigTestResultObject[['details']] <- self$`details`
      }
      if (!is.null(self$`issues`)) {
        LDAPConfigTestResultObject[['issues']] <- lapply(self$`issues`, function(x) x$toJSON())
      }
      if (!is.null(self$`message`)) {
        LDAPConfigTestResultObject[['message']] <- self$`message`
      }
      if (!is.null(self$`status`)) {
        LDAPConfigTestResultObject[['status']] <- self$`status`
      }
      if (!is.null(self$`trace`)) {
        LDAPConfigTestResultObject[['trace']] <- self$`trace`
      }
      if (!is.null(self$`user`)) {
        LDAPConfigTestResultObject[['user']] <- self$`user`$toJSON()
      }
      if (!is.null(self$`url`)) {
        LDAPConfigTestResultObject[['url']] <- self$`url`
      }

      LDAPConfigTestResultObject
    },
    fromJSONObject = function(LDAPConfigTestResultJsonObject) {
      LDAPConfigTestResultObject <- LDAPConfigTestResultJsonObject #jsonlite::fromJSON(LDAPConfigTestResultJson, simplifyVector = FALSE)
      if (!is.null(LDAPConfigTestResultObject$`details`)) {
        self$`details` <- LDAPConfigTestResultObject$`details`
      }
      if (!is.null(LDAPConfigTestResultObject$`issues`)) {
        self$`issues` <- lapply(LDAPConfigTestResultObject$`issues`, function(x) {
          issuesObject <- LDAPConfigTestIssue$new()
          issuesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          issuesObject
        })
      }
      if (!is.null(LDAPConfigTestResultObject$`message`)) {
        self$`message` <- LDAPConfigTestResultObject$`message`
      }
      if (!is.null(LDAPConfigTestResultObject$`status`)) {
        self$`status` <- LDAPConfigTestResultObject$`status`
      }
      if (!is.null(LDAPConfigTestResultObject$`trace`)) {
        self$`trace` <- LDAPConfigTestResultObject$`trace`
      }
      if (!is.null(LDAPConfigTestResultObject$`user`)) {
        userObject <- LDAPUser$new()
        userObject$fromJSON(jsonlite::toJSON(LDAPConfigTestResultObject$user, auto_unbox = TRUE))
        self$`user` <- userObject
      }
      if (!is.null(LDAPConfigTestResultObject$`url`)) {
        self$`url` <- LDAPConfigTestResultObject$`url`
      }
    },
    fromJSON = function(LDAPConfigTestResultJson) {
      LDAPConfigTestResultObject <- jsonlite::fromJSON(LDAPConfigTestResultJson, simplifyVector = FALSE)
      self$fromJSONObject(LDAPConfigTestResultObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "details": %s,
           "issues": [%s],
           "message": %s,
           "status": %s,
           "trace": %s,
           "user": %s,
           "url": %s
        }',
        self$`details`,
        lapply(self$`issues`, function(x) paste(x$toJSON(), sep=",")),
        self$`message`,
        self$`status`,
        self$`trace`,
        self$`user`$toJSON(),
        self$`url`
      )
    },
    fromJSONString = function(LDAPConfigTestResultJson) {
      LDAPConfigTestResultObject <- jsonlite::fromJSON(LDAPConfigTestResultJson, simplifyVector = FALSE)
      self$`details` <- LDAPConfigTestResultObject$`details`
      self$`issues` <- lapply(LDAPConfigTestResultObject$`issues`, function(x) LDAPConfigTestIssue$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`message` <- LDAPConfigTestResultObject$`message`
      self$`status` <- LDAPConfigTestResultObject$`status`
      self$`trace` <- LDAPConfigTestResultObject$`trace`
      LDAPUserObject <- LDAPUser$new()
      self$`user` <- LDAPUserObject$fromJSON(jsonlite::toJSON(LDAPConfigTestResultObject$user, auto_unbox = TRUE))
      self$`url` <- LDAPConfigTestResultObject$`url`
    }
  )
)
