# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' LookmlTestResult Class
#'
#' @field can 
#' @field model_name 
#' @field test_name 
#' @field assertions_count 
#' @field assertions_failed 
#' @field errors 
#' @field warnings 
#' @field success 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
LookmlTestResult <- R6::R6Class(
  'LookmlTestResult',
  public = list(
    `can` = NULL,
    `model_name` = NULL,
    `test_name` = NULL,
    `assertions_count` = NULL,
    `assertions_failed` = NULL,
    `errors` = NULL,
    `warnings` = NULL,
    `success` = NULL,
    initialize = function(`can`, `model_name`, `test_name`, `assertions_count`, `assertions_failed`, `errors`, `warnings`, `success`){
      if (!missing(`can`)) {
        self$`can` <- `can`
      }
      if (!missing(`model_name`)) {
        stopifnot(is.character(`model_name`), length(`model_name`) == 1)
        self$`model_name` <- `model_name`
      }
      if (!missing(`test_name`)) {
        stopifnot(is.character(`test_name`), length(`test_name`) == 1)
        self$`test_name` <- `test_name`
      }
      if (!missing(`assertions_count`)) {
        stopifnot(is.numeric(`assertions_count`), length(`assertions_count`) == 1)
        self$`assertions_count` <- `assertions_count`
      }
      if (!missing(`assertions_failed`)) {
        stopifnot(is.numeric(`assertions_failed`), length(`assertions_failed`) == 1)
        self$`assertions_failed` <- `assertions_failed`
      }
      if (!missing(`errors`)) {
        stopifnot(is.list(`errors`), length(`errors`) != 0)
        lapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!missing(`warnings`)) {
        stopifnot(is.list(`warnings`), length(`warnings`) != 0)
        lapply(`warnings`, function(x) stopifnot(R6::is.R6(x)))
        self$`warnings` <- `warnings`
      }
      if (!missing(`success`)) {
        self$`success` <- `success`
      }
    },
    toJSON = function() {
      LookmlTestResultObject <- list()
      if (!is.null(self$`can`)) {
        LookmlTestResultObject[['can']] <- self$`can`
      }
      if (!is.null(self$`model_name`)) {
        LookmlTestResultObject[['model_name']] <- self$`model_name`
      }
      if (!is.null(self$`test_name`)) {
        LookmlTestResultObject[['test_name']] <- self$`test_name`
      }
      if (!is.null(self$`assertions_count`)) {
        LookmlTestResultObject[['assertions_count']] <- self$`assertions_count`
      }
      if (!is.null(self$`assertions_failed`)) {
        LookmlTestResultObject[['assertions_failed']] <- self$`assertions_failed`
      }
      if (!is.null(self$`errors`)) {
        LookmlTestResultObject[['errors']] <- lapply(self$`errors`, function(x) x$toJSON())
      }
      if (!is.null(self$`warnings`)) {
        LookmlTestResultObject[['warnings']] <- lapply(self$`warnings`, function(x) x$toJSON())
      }
      if (!is.null(self$`success`)) {
        LookmlTestResultObject[['success']] <- self$`success`
      }

      LookmlTestResultObject
    },
    fromJSONObject = function(LookmlTestResultJsonObject) {
      LookmlTestResultObject <- LookmlTestResultJsonObject #jsonlite::fromJSON(LookmlTestResultJson, simplifyVector = FALSE)
      if (!is.null(LookmlTestResultObject$`can`)) {
        self$`can` <- LookmlTestResultObject$`can`
      }
      if (!is.null(LookmlTestResultObject$`model_name`)) {
        self$`model_name` <- LookmlTestResultObject$`model_name`
      }
      if (!is.null(LookmlTestResultObject$`test_name`)) {
        self$`test_name` <- LookmlTestResultObject$`test_name`
      }
      if (!is.null(LookmlTestResultObject$`assertions_count`)) {
        self$`assertions_count` <- LookmlTestResultObject$`assertions_count`
      }
      if (!is.null(LookmlTestResultObject$`assertions_failed`)) {
        self$`assertions_failed` <- LookmlTestResultObject$`assertions_failed`
      }
      if (!is.null(LookmlTestResultObject$`errors`)) {
        self$`errors` <- lapply(LookmlTestResultObject$`errors`, function(x) {
          errorsObject <- ProjectError$new()
          errorsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          errorsObject
        })
      }
      if (!is.null(LookmlTestResultObject$`warnings`)) {
        self$`warnings` <- lapply(LookmlTestResultObject$`warnings`, function(x) {
          warningsObject <- ProjectError$new()
          warningsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          warningsObject
        })
      }
      if (!is.null(LookmlTestResultObject$`success`)) {
        self$`success` <- LookmlTestResultObject$`success`
      }
    },
    fromJSON = function(LookmlTestResultJson) {
      LookmlTestResultObject <- jsonlite::fromJSON(LookmlTestResultJson, simplifyVector = FALSE)
      self$fromJSONObject(LookmlTestResultObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "can": %s,
           "model_name": %s,
           "test_name": %s,
           "assertions_count": %d,
           "assertions_failed": %d,
           "errors": [%s],
           "warnings": [%s],
           "success": %s
        }',
        self$`can`,
        self$`model_name`,
        self$`test_name`,
        self$`assertions_count`,
        self$`assertions_failed`,
        lapply(self$`errors`, function(x) paste(x$toJSON(), sep=",")),
        lapply(self$`warnings`, function(x) paste(x$toJSON(), sep=",")),
        self$`success`
      )
    },
    fromJSONString = function(LookmlTestResultJson) {
      LookmlTestResultObject <- jsonlite::fromJSON(LookmlTestResultJson, simplifyVector = FALSE)
      self$`can` <- LookmlTestResultObject$`can`
      self$`model_name` <- LookmlTestResultObject$`model_name`
      self$`test_name` <- LookmlTestResultObject$`test_name`
      self$`assertions_count` <- LookmlTestResultObject$`assertions_count`
      self$`assertions_failed` <- LookmlTestResultObject$`assertions_failed`
      self$`errors` <- lapply(LookmlTestResultObject$`errors`, function(x) ProjectError$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`warnings` <- lapply(LookmlTestResultObject$`warnings`, function(x) ProjectError$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`success` <- LookmlTestResultObject$`success`
    }
  )
)
