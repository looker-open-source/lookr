# preliminaries #
require("rJava")
require("rjson")

# instantiate the client and authenticate
looker_setup <- function(id = NULL, secret = NULL, api_path = NULL){
	clientId <<- id
	clientSecret <<- secret
	basePath <<- api_path
		
	if((is.null(clientId) || is.null(clientSecret))){
		warning("A client id and secret are required for login.")
	}
	
	client <<- .jnew("io/swagger/client/ApiClient")
	J(client, "setBasePath", basePath)
	auth <<- .jnew("io/swagger/client/api/ApiAuthApi", client)
	login <- J(auth, "login", clientId = id, clientSecret = secret)
	token <<- .jcall(login, "S", "getAccessToken")
	session <<- J(client, "addDefaultHeader", "Authorization", paste("token ", token))
	expires_in <- J(login, "getExpiresIn")
	expires_at <<- Sys.time() + expires_in
}

# search global environment for existing java objects
find_java_objects <- function(name = NULL){
	desired_class <- paste0("io/swagger/client/", name)
	java_objs <- names(which(sapply(mget(ls(envir = globalenv()), .GlobalEnv), class) == "jobjRef"))
	desired_objs <- sapply(sapply(java_objs, get0, USE.NAMES = FALSE), function(x){ x %instanceof% desired_class})
	obj_exists <- any(desired_objs)
	return(obj_exists)
}

# does our token exist, and is our session still authenticated?
token_authenticated <- function(){
	out <<- tryCatch({
						result <- (exists("token") && exists("expires_at")) && expires_at > Sys.time()
			}, error = function(cond) {message("You have not authenticated your session. See the looker_setup function.")
			}, finally = {}
			
	)
	return(result)
}

# if we have are no longer authenticated, restart session; otherwise, do nothing
ensure_logged_in <- function(){
	if(!isTRUE(token_authenticated())){
		message("Re-authenticating your Looker API session. \n", appendLF = FALSE)
		flush.console()
		looker_setup(id = clientId, secret = clientSecret, api_path = basePath)
	}
}

# run look by its look id 
run_look <- function(look_id = NULL, format = "json"){
	
	# ensure_logged_in
	ensure_logged_in()
	
	# test if authenticated ApiClient exists
	if(find_java_objects("api/ApiAuthApi") == FALSE){
		warning("You need to use the looker_setup(...) function before calling looks.")
	} else {

	# create a global instance of LookApi
	lookApi <<- .jnew("io/swagger/client/api/LookApi", client)
	
	# run look
	response <- J(lookApi, "runLook", .jnew("java/lang/Long", .jlong(look_id)), format)

	
	# extract and prepare query results
	json_response <- fromJSON(response)
	return(data.frame(do.call("rbind", lapply(json_response, unlist))))
	}
	
}


# run inline query by building up query components
run_inline_query <- function(model, explore, fields, filters = NULL, pivots = NULL, sorts = NULL, limit = NULL){
	
	# warn if any required parameters are missing
	if(missing(model) || missing(explore) || missing(fields)) {
		stop("One or more required parameters are missing.")
	}
	
	# ensure_logged_in
	ensure_logged_in()
	
	# test if authenticated ApiClient exists
	if(find_java_objects("api/ApiAuthApi") == FALSE){
		warning("You need to use the looker_setup(...) function before building queries.")
	} else {

	# create a global instance of QueryApi
	queryApi <<- .jnew("io/swagger/client/api/QueryApi", client)
	
	# build up the query
	query <- .jnew("io/swagger/client/model/Query")
	.jcall(query, "V", "setModel", model)
	.jcall(query, "V", "setView", base_view)
	fields_array_list <- J("java/util/Arrays", method = "asList", .jcastToArray(fields))
	J(query, "setFields", fields_array_list)
	
	# handle filters
	filter_hash <- .jnew("java/util/HashMap")	
	lapply(filters, function(x){J(filter_hash, method = "put", x[1], x[2])})
	J(query, "setFilters", filter_hash)
	
	# run query	
	response <- J(queryApi, "runInlineQuery", "json", query)

	# extract and prepare query results
	json_response <- fromJSON(response)
	return(data.frame(do.call("rbind", lapply(json_response, unlist))))
	}
}