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
    apiVersion = "4.0",
    verbose = FALSE,
    configFile = NULL,
    basePath = NULL,
    clientId = NULL,
    clientSecret = NULL,
    embedSecret = NULL,
    userId = NULL,
    verifySSL = TRUE,
    
    initialize = function(configFile = "looker.ini", config) {
      if(!missing(config)) {
        self$apiVersion <- config[["apiVersion"]]
        self$basePath <- config[["basePath"]]
        self$clientId <- config[["clientId"]]
        self$clientSecret <- config[["clientSecret"]]
        self$embedSecret <- config[["embedSecret"]]
        self$userId <- config[["userId"]]
        self$verifySSL <- config[["verifySSL"]]
      } else {
        self$configFile <- configFile
        self$read(configFile)
      }
    },
    
    read = function(configFile) {

      config <- tryCatch( { configr::read.config(configFile) },
                          warning = function(cond) {
                            message(paste0("read of ", configFile, " caused a warning"))
                            message(cond)
                            return(NULL)
                          },
                          error = function(cond) {
                            message(paste0("read of ", configFile, " caused an error"))
                            message(cond)
                            return(NA)
                          }
                        )

      if(!is.list(config)) {
        message(basename(configFile), " not found\n",
                "Trying to use environment variables instead")

        envVariables <- c('LOOKERSDK_API_VERSION',
                          'LOOKERSDK_BASE_URL',
                          'LOOKERSDK_CLIENT_ID',
                          'LOOKERSDK_CLIENT_SECRET',
                          'LOOKERSDK_EMBED_SECRET',
                          'LOOKERSDK_USER_ID',
                          'LOOKERSDK_VERIFY_SSL')
        env <- Sys.getenv(envVariables,unset = NA)

        config <- list(Looker = list(
                                     api_version = NULL,
                                     base_url = NULL,
                                     client_id = NULL,
                                     client_secret = NULL,
                                     embed_secret = NULL,
                                     user_id = NULL,
                                     verify_ssl = NULL
                                    ))

        if(!is.na(env[['LOOKERSDK_API_VERSION']])) {
          config$Looker$api_version <- env[['LOOKERSDK_API_VERSION']]
        }
        if(!is.na(env[['LOOKERSDK_BASE_URL']])) {
          config$Looker$base_url <- env[['LOOKERSDK_BASE_URL']]
        }
        if(!is.na(env[['LOOKERSDK_CLIENT_ID']])) {
          config$Looker$client_id <- env[['LOOKERSDK_CLIENT_ID']]
        }
        if(!is.na(env[['LOOKERSDK_CLIENT_SECRET']])) {
          config$Looker$client_secret <- env[['LOOKERSDK_CLIENT_SECRET']]
        }
        if(!is.na(env[['LOOKERSDK_EMBED_SECRET']])) {
          config$Looker$embed_secret <- env[['LOOKERSDK_EMBED_SECRET']]
        }
        if(!is.na(env[['LOOKERSDK_USER_ID']])) {
          config$Looker$user_id <- env[['LOOKERSDK_USER_ID']]
        }
        if(!is.na(env[['LOOKERSDK_VERIFY_SSL']])) {
          config$Looker$verify_ssl <- env[['LOOKERSDK_VERIFY_SSL']]
        }

      }
      
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
      
      if(!is.null(config$Looker$verify_ssl)) {
        self$verifySSL <- config$Looker$verify_ssl
      } else {
        message(basename(configFile), " missing setting: verify_ssl\n",
                "Using default value: ", self$verifySSL)
      }
    }
  )
)
