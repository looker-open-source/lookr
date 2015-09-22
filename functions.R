# preliminaries #
library("rJava")
library("rjson")
.jinit("/Users/scott/Documents/java_client/client/out/artifacts/swagger_java_client_jar/swagger-java-client.jar")

looker_setup <- function(id = NULL, secret = NULL, api_path = NULL){
	clientId <<- id
	clientSecret <<- secret
	basePath <<- api_path		# how is it that this is not used?
		
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

find_java_objects <- function(name = NULL){
	desired_class <- paste0("io/swagger/client/", name)
	java_objs <- names(which(sapply(mget(ls(envir = globalenv()), .GlobalEnv), class) == "jobjRef"))
	desired_objs <- sapply(sapply(java_objs, get0, USE.NAMES = FALSE), function(x){ x %instanceof% desired_class})
	obj_exists <- any(desired_objs)
	return(obj_exists)
}

# does our token exist, and is our session still authenticated
token_authenticated <- function(){
	out <<- tryCatch({
						(!is.null(token) && (!is.null(expires_at) || expires_at > Sys.time()))
			}, error = function(cond) {message("You have not authenticated your session. See the looker_setup function.")
			}, finally = {}
			
	)
}

# if we have are no longer authenticated, restart session; otherwise, do nothing
ensure_logged_in <- function(){
	if(!isTRUE(token_authenticated())){
		looker_setup(id = clientId, secret = clientSecret)
	}
}

run_look <- function(look_id = NULL, format = "json"){
	
	# ensure_logged_in
	ensure_logged_in()
	
	# test if authenticated ApiClient exists
	if(find_java_objects("api/ApiAuthApi") == FALSE){
		warning("You need to instantiate an authenticated API before calling looks.")
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
