# preliminaries #
library("rJava")
.jinit("/Users/scott/Documents/java_client/client/out/artifacts/swagger_java_client_jar/swagger-java-client.jar")
.jclassPath()

# credentials #
clientSecret = "RgRXKd8QrzYvm8H7ckh8ZfvG"
clientId = "YQrRfCHQwQfz9fcChS28"
basePath = "https://meta.looker.com:19999/api/3.0"

# instantiate classes #
client <- .jnew("io/swagger/client/ApiClient")
# config <- .jnew("io/swagger/client/Configuration")
auth <- .jnew("io/swagger/client/api/ApiAuthApi", client)

# login method #
login <- J(auth, "login", clientId = clientId, clientSecret = clientSecret)

# store access token #
token <- .jcall(login, "S", "getAccessToken")

# spin up session #
#conf <- J(config, "setDefaultApiClient", client)
#J(conf, "getDefaultApiClient")
#J(conf, "addDefaultHeader", "Authorization", paste("token ", token))


J(client, "addDefaultHeader", "Authorization", paste("token ", token))

# authenticate #
#J(config, "addDefaultHeader", "Authorization", paste("token ", "MJNYm8CBVTczR73Rjr6vXpnDMTBPh4VxpcGc3cjK"))

# look <- .jnew("io/swagger/client/api/LookApi")
look <- .jnew("io/swagger/client/api/LookApi", client)

J(look, "runLook", as.integer(1298), "json")
J(look, "runLook", .jnew("java/lang/Long", .jlong(1298)), "json")
