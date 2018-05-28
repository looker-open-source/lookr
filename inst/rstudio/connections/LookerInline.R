library(lookr)
sdk <- lookr::LookerSDK$new(config = list(
	apiVersion = "${4:API Version=3.0}",
	basePath = "${0:Base Path}",
	clientId = "${1:Client ID}",
	clientSecret = "${2:Client Secret}",
	embedSecret = "${5:Embed Secret}",
	userId = "${6:User ID}",
	verifySSL = ${3:Verify SSL=TRUE}))
