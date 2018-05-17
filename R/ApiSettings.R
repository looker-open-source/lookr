#' ApiSettings
#' 
#' Keeps track of the local settings for accessing the API (credentials, base path, etc).
#' This shouldn't generally be called directly.
#' A new \code{ApiSettings} will be generated when you created a new \code{LookerSDK}.
#' 
#' @name ApiSettings
NULL

#' @export
ApiSettings <- R6::R6Class(
  'ApiSettings',
  
  public = list(
    apiVersion = "3.0",
    verbose = FALSE,
    configFile = NULL,
    basePath = NULL,
    clientId = NULL,
    clientSecret = NULL,
    embedSecret = NULL,
    userId = NULL,
    url = NULL,
    verifySSL = TRUE,
    
    initialize = function(configFile = "looker.ini") {
      self$configFile <- configFile
      self$read(configFile)
    },
    
    read = function(configFile) {
      config <- configr::read.config(configFile)
      
      if(!is.null(config$Looker$api_version)) {
        self$apiVersion <- config$Looker$api_version
      } else {
        message(basename(configFile), " missing setting: api_version\n",
                "Using default value: ", self$apiVersion)
      }
      
      if(!is.null(config$Looker$base_url)) {
        self$basePath <- config$Looker$base_url
      } else {
        warning(basename(configFile),
                " missing required setting: base_url")
      }
      
      if(!is.null(config$Looker$client_id)) {
        self$clientId <- config$Looker$client_id
      } else {
        warning(basename(configFile),
                " missing required setting: client_id")
      }
      
      if(!is.null(config$Looker$client_secret)) {
        self$clientSecret <- config$Looker$client_secret
      } else {
        warning(basename(configFile),
                " missing required setting: client_secret")
      }
      
      if(!is.null(config$Looker$embed_secret)) {
        self$embedSecret <- config$Looker$embed_secret
      }
      
      if(!is.null(config$Looker$user_id)) {
        self$userId <- config$Looker$user_id
      }
      
      if(!is.null(config$Looker$url)) {
        self$url <- config$Looker$url
      }
      
      if(!is.null(config$Looker$verify_ssl)) {
        self$verifySSL <- config$Looker$verify_ssl
      } else {
        message(basename(configFile), " missing setting: verify_ssl\n",
                "Using default value: ", self$verifySSL)
      }
    }
  )
)