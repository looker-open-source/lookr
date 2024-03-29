# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' ProjectValidation Class
#'
#' @field errors 
#' @field project_digest 
#' @field models_not_validated 
#' @field computation_time 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite parse_json toJSON
#' @export
ProjectValidation <- R6::R6Class(
  'ProjectValidation',
  public = list(
    `errors` = NULL,
    `project_digest` = NULL,
    `models_not_validated` = NULL,
    `computation_time` = NULL,
    initialize = function(`errors`, `project_digest`, `models_not_validated`, `computation_time`){
      if (!missing(`errors`)) {
        stopifnot(is.list(`errors`), length(`errors`) != 0)
        lapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!missing(`project_digest`)) {
        stopifnot(is.character(`project_digest`), length(`project_digest`) == 1)
        self$`project_digest` <- `project_digest`
      }
      if (!missing(`models_not_validated`)) {
        stopifnot(is.list(`models_not_validated`), length(`models_not_validated`) != 0)
        lapply(`models_not_validated`, function(x) stopifnot(R6::is.R6(x)))
        self$`models_not_validated` <- `models_not_validated`
      }
      if (!missing(`computation_time`)) {
        stopifnot(is.numeric(`computation_time`), length(`computation_time`) == 1)
        self$`computation_time` <- `computation_time`
      }
    },
    toJSON = function() {
      ProjectValidationObject <- list()
      if (!is.null(self$`errors`)) {
        ProjectValidationObject[['errors']] <- lapply(self$`errors`, function(x) x$toJSON())
      }
      if (!is.null(self$`project_digest`)) {
        ProjectValidationObject[['project_digest']] <- self$`project_digest`
      }
      if (!is.null(self$`models_not_validated`)) {
        ProjectValidationObject[['models_not_validated']] <- lapply(self$`models_not_validated`, function(x) x$toJSON())
      }
      if (!is.null(self$`computation_time`)) {
        ProjectValidationObject[['computation_time']] <- self$`computation_time`
      }

      ProjectValidationObject
    },
    fromJSONObject = function(ProjectValidationJsonObject) {
      ProjectValidationObject <- ProjectValidationJsonObject #jsonlite::fromJSON(ProjectValidationJson, simplifyVector = FALSE)
      if (!is.null(ProjectValidationObject$`errors`)) {
        self$`errors` <- lapply(ProjectValidationObject$`errors`, function(x) {
          errorsObject <- ProjectError$new()
          errorsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          errorsObject
        })
      }
      if (!is.null(ProjectValidationObject$`project_digest`)) {
        self$`project_digest` <- ProjectValidationObject$`project_digest`
      }
      if (!is.null(ProjectValidationObject$`models_not_validated`)) {
        self$`models_not_validated` <- lapply(ProjectValidationObject$`models_not_validated`, function(x) {
          models_not_validatedObject <- ModelsNotValidated$new()
          models_not_validatedObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          models_not_validatedObject
        })
      }
      if (!is.null(ProjectValidationObject$`computation_time`)) {
        self$`computation_time` <- ProjectValidationObject$`computation_time`
      }
    },
    fromJSON = function(ProjectValidationJson) {
      ProjectValidationObject <- jsonlite::fromJSON(ProjectValidationJson, simplifyVector = FALSE)
      self$fromJSONObject(ProjectValidationObject)
    },
    toJSONString = function() {
       sprintf(
        '{
           "errors": [%s],
           "project_digest": %s,
           "models_not_validated": [%s],
           "computation_time": %d
        }',
        lapply(self$`errors`, function(x) paste(x$toJSON(), sep=",")),
        self$`project_digest`,
        lapply(self$`models_not_validated`, function(x) paste(x$toJSON(), sep=",")),
        self$`computation_time`
      )
    },
    fromJSONString = function(ProjectValidationJson) {
      ProjectValidationObject <- jsonlite::fromJSON(ProjectValidationJson, simplifyVector = FALSE)
      self$`errors` <- lapply(ProjectValidationObject$`errors`, function(x) ProjectError$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`project_digest` <- ProjectValidationObject$`project_digest`
      self$`models_not_validated` <- lapply(ProjectValidationObject$`models_not_validated`, function(x) ModelsNotValidated$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`computation_time` <- ProjectValidationObject$`computation_time`
    }
  )
)
