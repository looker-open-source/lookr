# Looker API 4.0 (Beta) Reference
#
#  Welcome to the future! API 4.0 co-exists with APIs 3.1 and 3.0. (3.0 should no longer be used.) The \"beta\" tag means updates for API 4.0 may include breaking changes, but as always we will work to minimize them.  ### Authorization  The classic method of API authorization uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page.  API 4.0 adds additional ways to authenticate API requests, including OAuth and CORS requests.  For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization).   ### API Explorer  The API Explorer is a Looker-provided utility with many new and unique features for learning and using the Looker API and SDKs. It is a replacement for the 'api-docs' page currently provided on Looker instances.  For details, see the [API Explorer documentation](https://looker.com/docs/r/api/explorer).   ### Looker Language SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. SDKs for a variety of programming languages are also provided to streamline using the API. Looker has an OpenSource [sdk-codegen project](https://github.com/looker-open-source/sdk-codegen) that provides several language SDKs. Language SDKs generated by `sdk-codegen` have an Authentication manager that can automatically authenticate API requests when needed.  For details on available Looker SDKs, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks).   ### API Versioning  Future releases of Looker expand the latest API version release-by-release to securely expose more and more of the core power of the Looker platform to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning (but we will try to avoid doing that). Stable (non-beta) API endpoints should not receive breaking changes in future releases.  For details, see [Looker API Versioning](https://looker.com/docs/r/api/versioning).   ### In This Release  API 4.0 version was introduced so we can make adjustments to API functions, parameters, and response types to fix bugs and inconsistencies. These changes fall outside the bounds of non-breaking additive changes we can make to our stable API 3.1.  One benefit of these type adjustments in API 4.0 is dramatically better support for strongly typed languages like TypeScript, Kotlin, Swift, Go, C#, and more.  While API 3.1 is still the de-facto Looker API (\"current\", \"stable\", \"default\", etc), the bulk of our development activity has shifted to API 4.0, where all new features are added.  The API Explorer can be used to [interactively compare](https://looker.com/docs/r/api/explorer#comparing_api_versions) the differences between API 3.1 and 4.0.   ### API and SDK Support Policies  Looker API versions and language SDKs have varying support levels. Please read the API and SDK [support policies](https://looker.com/docs/r/api/support-policy) for more information.   
#
# OpenAPI spec version: 4.0.21.18
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' @title Board operations
#' @description looker.Board
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
#' all_board_items Get All Board Items
#'
#'
#' all_board_sections Get All Board sections
#'
#'
#' all_boards Get All Boards
#'
#'
#' board Get Board
#'
#'
#' board_item Get Board Item
#'
#'
#' board_section Get Board section
#'
#'
#' create_board Create Board
#'
#'
#' create_board_item Create Board Item
#'
#'
#' create_board_section Create Board section
#'
#'
#' delete_board Delete Board
#'
#'
#' delete_board_item Delete Board Item
#'
#'
#' delete_board_section Delete Board section
#'
#'
#' search_boards Search Boards
#'
#'
#' update_board Update Board
#'
#'
#' update_board_item Update Board Item
#'
#'
#' update_board_section Update Board section
#'
#' }
#'
#' @export
BoardApi <- R6::R6Class(
  'BoardApi',
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
    all_board_items = function(fields, sorts, board_section_id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`sorts`)) {
        queryParams['sorts'] <- sorts
      }

      if (!missing(`board_section_id`)) {
        queryParams['board_section_id'] <- board_section_id
      }

      urlPath <- "/board_items"
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
	    returnObject <- BoardItem$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- BoardItem$new()
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
    all_board_sections = function(fields, sorts, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`sorts`)) {
        queryParams['sorts'] <- sorts
      }

      urlPath <- "/board_sections"
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
	    returnObject <- BoardSection$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- BoardSection$new()
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
    all_boards = function(fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/boards"
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
	    returnObject <- Board$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Board$new()
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
    board = function(board_id, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/boards/{board_id}"
      if (!missing(`board_id`)) {
        urlPath <- gsub(paste0("\\{", "board_id", "\\}"), `board_id`, urlPath)
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
	    returnObject <- Board$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Board$new()
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
    board_item = function(board_item_id, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/board_items/{board_item_id}"
      if (!missing(`board_item_id`)) {
        urlPath <- gsub(paste0("\\{", "board_item_id", "\\}"), `board_item_id`, urlPath)
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
	    returnObject <- BoardItem$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- BoardItem$new()
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
    board_section = function(board_section_id, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      urlPath <- "/board_sections/{board_section_id}"
      if (!missing(`board_section_id`)) {
        urlPath <- gsub(paste0("\\{", "board_section_id", "\\}"), `board_section_id`, urlPath)
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
	    returnObject <- BoardSection$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- BoardSection$new()
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
    create_board = function(body, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`body`)) {
        body <- `body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/boards"
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
	    returnObject <- Board$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Board$new()
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
    create_board_item = function(body, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`body`)) {
        body <- `body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/board_items"
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
	    returnObject <- BoardItem$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- BoardItem$new()
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
    create_board_section = function(body, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`body`)) {
        body <- `body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/board_sections"
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
	    returnObject <- BoardSection$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- BoardSection$new()
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
    delete_board = function(board_id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/boards/{board_id}"
      if (!missing(`board_id`)) {
        urlPath <- gsub(paste0("\\{", "board_id", "\\}"), `board_id`, urlPath)
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
    delete_board_item = function(board_item_id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/board_items/{board_item_id}"
      if (!missing(`board_item_id`)) {
        urlPath <- gsub(paste0("\\{", "board_item_id", "\\}"), `board_item_id`, urlPath)
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
    delete_board_section = function(board_section_id, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/board_sections/{board_section_id}"
      if (!missing(`board_section_id`)) {
        urlPath <- gsub(paste0("\\{", "board_section_id", "\\}"), `board_section_id`, urlPath)
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
    search_boards = function(title, created_at, first_name, last_name, fields, favorited, creator_id, sorts, page, per_page, offset, limit, filter_or, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`title`)) {
        queryParams['title'] <- title
      }

      if (!missing(`created_at`)) {
        queryParams['created_at'] <- created_at
      }

      if (!missing(`first_name`)) {
        queryParams['first_name'] <- first_name
      }

      if (!missing(`last_name`)) {
        queryParams['last_name'] <- last_name
      }

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`favorited`)) {
        queryParams['favorited'] <- favorited
      }

      if (!missing(`creator_id`)) {
        queryParams['creator_id'] <- creator_id
      }

      if (!missing(`sorts`)) {
        queryParams['sorts'] <- sorts
      }

      if (!missing(`page`)) {
        queryParams['page'] <- page
      }

      if (!missing(`per_page`)) {
        queryParams['per_page'] <- per_page
      }

      if (!missing(`offset`)) {
        queryParams['offset'] <- offset
      }

      if (!missing(`limit`)) {
        queryParams['limit'] <- limit
      }

      if (!missing(`filter_or`)) {
        queryParams['filter_or'] <- filter_or
      }

      urlPath <- "/boards/search"
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
	    returnObject <- Board$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Board$new()
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
    update_board = function(board_id, body, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`body`)) {
        body <- `body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/boards/{board_id}"
      if (!missing(`board_id`)) {
        urlPath <- gsub(paste0("\\{", "board_id", "\\}"), `board_id`, urlPath)
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
	    returnObject <- Board$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- Board$new()
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
    update_board_item = function(board_item_id, body, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`body`)) {
        body <- `body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/board_items/{board_item_id}"
      if (!missing(`board_item_id`)) {
        urlPath <- gsub(paste0("\\{", "board_item_id", "\\}"), `board_item_id`, urlPath)
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
	    returnObject <- BoardItem$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- BoardItem$new()
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
    update_board_section = function(board_section_id, body, fields, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`fields`)) {
        queryParams['fields'] <- fields
      }

      if (!missing(`body`)) {
        body <- `body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/board_sections/{board_section_id}"
      if (!missing(`board_section_id`)) {
        urlPath <- gsub(paste0("\\{", "board_section_id", "\\}"), `board_section_id`, urlPath)
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
	    returnObject <- BoardSection$new()
	    #returnObject$fromJSON(jsonlite::toJSON(x, auto_unbox = FALSE))
	    returnObject$fromJSONObject(x)
	    returnObject
	  })
	  Response$new(returnObjects, resp)
	} else {
	  returnObject <- BoardSection$new()
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
