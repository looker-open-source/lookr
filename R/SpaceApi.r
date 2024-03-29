# Looker API 3.1 Reference
#
# ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### Try It Out!  This section describes the existing 'api-docs' page available on Looker instances. We recommend using the [API Explorer](https://looker.com/docs/r/api/explorer) instead.  The 'api-docs' page served by the Looker instance includes 'Try It Out!' buttons for each API method. After logging in with API3 credentials, you can use the \"Try It Out!\" buttons to call the API directly from the documentation page to interactively explore API features and responses.  **NOTE**! With great power comes great responsibility: The \"Try It Out!\" button makes API calls to your live Looker instance. Be especially careful with destructive API operations such as `delete_user` or similar. There is no \"undo\" for API operations. (API Explorer's \"Run It\" feature requires a check mark before running API operations that can change data.)   ### In This Release  The following are a few examples of noteworthy items that have changed between API 3.0 and API 3.1. For more comprehensive coverage of API changes, please see the release notes for your Looker release.  ### Examples of new things added in API 3.1 (compared to API 3.0):  * [Dashboard construction](#!/3.1/Dashboard/) APIs * [Themes](#!/3.1/Theme/) and [custom color collections](#!/3.1/ColorCollection) APIs * Create and run [SQL Runner](#!/3.1/Query/run_sql_query) queries * Create and run [merged results](#!/3.1/Query/create_merge_query) queries * Create and modify [dashboard filters](#!/3.1/Dashboard/create_dashboard_filter) * Create and modify [password requirements](#!/3.1/Auth/password_config)  ### Deprecated in API 3.0  The following functions and properties have been deprecated in API 3.0.  They continue to exist and work in API 3.0 for the next several Looker releases but they have not been carried forward to API 3.1:  * Dashboard Prefetch functions * User access_filter functions * User API 1.0 credentials functions * Space.is_root and Space.is_user_root properties. Use Space.is_shared_root and Space.is_users_root instead.  ### Semantic changes in API 3.1:  * [all_looks()](#!/3.1/Look/all_looks) no longer includes soft-deleted looks, matching [all_dashboards()](#!/3.1/Dashboard/all_dashboards) behavior. You can find soft-deleted looks using [search_looks()](#!/3.1/Look/search_looks) with the `deleted` param set to True. * [all_spaces()](#!/3.1/Space/all_spaces) no longer includes duplicate items * [search_users()](#!/3.1/User/search_users) no longer accepts Y,y,1,0,N,n for Boolean params, only \"true\" and \"false\". * For greater client and network compatibility, [render_task_results](#!/3.1/RenderTask/render_task_results) now returns HTTP status **202 Accepted** instead of HTTP status **102 Processing** * [all_running_queries()](#!/3.1/Query/all_running_queries) and [kill_query](#!/3.1/Query/kill_query) functions have moved into the [Query](#!/3.1/Query/) function group.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 3.1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' @title Space operations
#' @description looker.Space
#'
#' @field path Stores url path of the request.
#' @field apiClient Handles the client-server communication.
#' @field userAgent Set the user agent of the request.
#'
#' @importFrom R6 R6Class
#'
#' @section Methods:
#' \describe{
#'
#' all_spaces Get All Spaces
#'
#'
#' create_space Create Space
#'
#'
#' delete_space Delete Space
#'
#'
#' search_spaces Search Spaces
#'
#'
#' space Get Space
#'
#'
#' space_ancestors Get Space Ancestors
#'
#'
#' space_children Get Space Children
#'
#'
#' space_children_search Search Space Children
#'
#'
#' space_dashboards Get Space Dashboards
#'
#'
#' space_looks Get Space Looks
#'
#'
#' space_parent Get Space Parent
#'
#'
#' update_space Update Space
#'
#' }
#'
#' @export
SpaceApi <- R6::R6Class(
  'SpaceApi',
  public = list(
    userAgent = "R-SDK",
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    all_spaces = function(fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/spaces"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- SpaceBase$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- SpaceBase$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    create_space = function(body, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`body`)) {
        body <- `body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/spaces"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "POST",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Space$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Space$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    delete_space = function(space_id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/spaces/{space_id}"
      if (!missing(`space_id`)) {
        urlPath <- gsub(paste0("\\{", "space_id", "\\}"), `space_id`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "DELETE",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Character$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Character$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    search_spaces = function(fields, page, per_page, limit, offset, sorts, name, id, parent_id, creator_id, filter_or, is_shared_root, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`page`)) {
        queryParams['page'] <- page
      }

      if (!missing(`per_page`)) {
        queryParams['per_page'] <- per_page
      }

      if (!missing(`limit`)) {
        queryParams['limit'] <- limit
      }

      if (!missing(`offset`)) {
        queryParams['offset'] <- offset
      }

      if (!missing(`sorts`)) {
        queryParams['sorts'] <- sorts
      }

      if (!missing(`name`)) {
        queryParams['name'] <- name
      }

      if (!missing(`id`)) {
        queryParams['id'] <- id
      }

      if (!missing(`parent_id`)) {
        queryParams['parent_id'] <- parent_id
      }

      if (!missing(`creator_id`)) {
        queryParams['creator_id'] <- creator_id
      }

      if (!missing(`filter_or`)) {
        queryParams['filter_or'] <- filter_or
      }

      if (!missing(`is_shared_root`)) {
        queryParams['is_shared_root'] <- is_shared_root
      }

      urlPath <- "/spaces/search"
      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Space$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Space$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    space = function(space_id, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/spaces/{space_id}"
      if (!missing(`space_id`)) {
        urlPath <- gsub(paste0("\\{", "space_id", "\\}"), `space_id`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Space$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Space$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    space_ancestors = function(space_id, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/spaces/{space_id}/ancestors"
      if (!missing(`space_id`)) {
        urlPath <- gsub(paste0("\\{", "space_id", "\\}"), `space_id`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Space$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Space$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    space_children = function(space_id, fields, page, per_page, sorts, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`page`)) {
        queryParams['page'] <- page
      }

      if (!missing(`per_page`)) {
        queryParams['per_page'] <- per_page
      }

      if (!missing(`sorts`)) {
        queryParams['sorts'] <- sorts
      }

      urlPath <- "/spaces/{space_id}/children"
      if (!missing(`space_id`)) {
        urlPath <- gsub(paste0("\\{", "space_id", "\\}"), `space_id`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Space$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Space$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    space_children_search = function(space_id, fields, sorts, name, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`sorts`)) {
        queryParams['sorts'] <- sorts
      }

      if (!missing(`name`)) {
        queryParams['name'] <- name
      }

      urlPath <- "/spaces/{space_id}/children/search"
      if (!missing(`space_id`)) {
        urlPath <- gsub(paste0("\\{", "space_id", "\\}"), `space_id`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Space$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Space$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    space_dashboards = function(space_id, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/spaces/{space_id}/dashboards"
      if (!missing(`space_id`)) {
        urlPath <- gsub(paste0("\\{", "space_id", "\\}"), `space_id`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Dashboard$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Dashboard$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    space_looks = function(space_id, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/spaces/{space_id}/looks"
      if (!missing(`space_id`)) {
        urlPath <- gsub(paste0("\\{", "space_id", "\\}"), `space_id`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- LookWithQuery$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- LookWithQuery$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    space_parent = function(space_id, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/spaces/{space_id}/parent"
      if (!missing(`space_id`)) {
        urlPath <- gsub(paste0("\\{", "space_id", "\\}"), `space_id`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Space$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Space$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    },
    update_space = function(space_id, body, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`body`)) {
        body <- `body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/spaces/{space_id}"
      if (!missing(`space_id`)) {
        urlPath <- gsub(paste0("\\{", "space_id", "\\}"), `space_id`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "PATCH",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
	data <- jsonlite::fromJSON(httr::content(resp, "text", encoding = "UTF-8"),simplifyVector = FALSE)
	if (is.null(names(data))) {
	  returnObjects <- lapply(data, function(x) {
	    returnObject <- Space$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Space$new()
	  #result <- returnObject$fromJSON(httr::content(resp, "text", encoding = "UTF-8"))
	  result <- returnObject$fromJSONObject(data)
	  Response$new(returnObject, resp)
	}
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
  )
)
