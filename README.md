# This repository is archived and READ ONLY
------

<!-- README.md is generated from README.Rmd. Please edit that file -->
<!-- badges: start -->

[![R-CMD-check](https://github.com/looker-open-source/lookr/workflows/R-CMD-check/badge.svg)](https://github.com/looker-open-source/lookr/actions)
<!-- badges: end -->

LookR
=====

This is an SDK for using the Looker API with the R programming language.
Our priority is to add support for the endpoints that are most useful to
data scientists and analysts working in R (the ones that get data from
Looker) but eventually the goal is to add support for every endpoint in
the Looker API.

For more information about the Looker API’s capabilities and for details
about what each endpoint does, see the [Looker API reference
documentation](https://docs.looker.com/reference/api-and-integration/api-reference).


### Support
This SDK is NOT officially supported by Looker/Google. It is community
supported. Issues can be logged here in the GitHub Issues page. Details
of Looker API and SDK support can be found at 
[https://cloud.google.com/looker/docs/api-sdk-support-policy](https://cloud.google.com/looker/docs/api-sdk-support-policy).


Important!
----------

*LookR used to be based on
[`rJava`](https://cran.r-project.org/package=rJava), but this caused
problems with reliability and many users struggled to get it to work. To
fix this, we’ve rewritten a new SDK in native R. The versions have been
reset as well.*

All of the old code is available on the old-lookr branch, so if you want
to continue using it, you an install from that branch by setting\* `ref`
*to* `old-lookr`\*:

``` r
devtools::install_github("looker/lookr", ref = "old-lookr")
```

*The code recently changed to support API 4.0 instead of 3.0. There
still is not a robust testing mechanism in place. If you need to use the
older version install it from the `api-3.0` branch.*

``` r
devtools::install_github("looker/lookr", ref = "api-3.0")
# or
devtools::install_github("looker/lookr", ref = "api-3.1")
```

Install
-------

Use `devtools` to install from this repository:

``` r
devtools::install_github("looker/lookr", ref = "api-4.0")
library(lookr)
```

Configure
---------

First, make sure that you have your API credentials and the URL to your
Looker host in a file called `looker.ini`. LookR uses the information in
this file to authenticate. See below for a sample of what `looker.ini`
should look like:

`looker-sample.ini`

``` r
[Looker]
# API version is required
api_version=4.0
# Base URL for API. Do not include /api/* in the url
base_url=https://<your-looker-endpoint>:19999
# API 3 client id
client_id=your_API3_client_id
# API 3 client secret
client_secret=your_API3_client_secret
# Optional embed secret for SSO embedding
embed_secret=your_embed_SSO_secret
# Optional user_id to impersonate
user_id=
# Set to false if testing locally against self-signed certs. Otherwise leave True
verify_ssl=True
```

*Make sure that this file is not checked into version control.*

Connect
-------

All of the endpoints are accessed from methods contained in an instance
of the `LookerSDK` class, which is implemented in
[`R6`](https://cran.r-project.org/web/packages/R6/index.html). To start
using LookR, create an instance of that class:

``` r
sdk <- LookerSDK$new(configFile = "looker.ini")
```

If you’re using a version of RStudio that includes the [Connections
Pane](https://support.rstudio.com/hc/en-us/articles/115010915687-Using-RStudio-Connections),
you can also use that to create a new connection to Looker.

Whether you use the Connection Pane to create the connection or not, you
will be able to browse your projects, models, and explores in the
Connections Pane as long as your API user has access to them.

Query
-----

You can use LookR to fetch the results of a saved Look by calling
`runLook`:

``` r
data <- sdk$runLook(lookId = 1337)
```

You can also use a new query by calling `runInlineQuery`. `model`,
`view`, and `fields` are mandatory arguments:

``` r
data <- sdk$runInlineQuery(model = "model_name",
                           view = "my_awesome_explore",
                           fields = c("id", "count"))
```

and you can optionally supply `filters`, `sorts`, `limit`, and
`queryTimezone`:

``` r
data <- sdk$runInlineQuery(model = "model_name",
                           view = "my_awesome_explore",
                           fields = c("id", "count"),
                           filters = list(field.name = jsonutil::unbox("filter_expression"),
                                       another.field = jsonutil::unbox("filter_expression")),
                           limit = 500,
                           queryTimezone = "America/Los_Angeles")
```

The SDK returns data as a list of lists. The inner list has named
elements for one row of data. The outer list is the collection of rows.
R most naturally wants to work with columns of data. The following
process will reformat the data in a useful way…

``` r
sdk <- lookr::LookerSDK$new(configFile = "looker.ini")

# run a look or inline query
data <- sdk$runLook(lookId = 5 )

# Verify that at least one row was returned
length(data)
[1] 5

# get the column names from the first row
names(data[[1]])
[1] "customer.first_name" "order.count"

# create a new list that represents each column
fname = sapply(data, "[[", 1)
ocount = sapply(data, "[[", 2)

# create a data.frame object with the columns
# the list names will become the default column names
df <- data.frame(fname, ocount)
print(df)
     fname ocount
1    Homer      5
2     Bart      4
3   Robert      3
4  Bernard      2
5 Milhouse      1

# If a column can have a NULL value, use I(...) to wrap the column list
ocount = list(5,4,NULL,2,1)
df <- data.frame(fname, I(ocount))
print(df)
     fname ocount
1    Homer      5
2     Bart      4
3   Robert
4  Bernard      2
5 Milhouse      1
```

Other Operations
----------------

The SDK exposes a number of the most frequently used and useful
operations But the whole API is available through underlying methods.
For example:

``` r
sdk$refresh()
data <- sdk$userSession$lookApi$look(6, config = sdk$oauthHeader)$content
print(data)
<LookWithQuery>
  Public:
    ...
    folder_id: 5
    fromJSON: function (LookWithQueryJson)
    fromJSONObject: function (LookWithQueryJsonObject)
    fromJSONString: function (LookWithQueryJson)
    ...
    id: 6
    ...
    model: LookModel, R6
    public: NULL
    public_slug: 2ytjPWrQrbxSHHZxGSYXXhgsF7Pjj6Wy
    ...
    query: Query, R6
    query_id: 124
    short_url: /looks/6
    space: SpaceBase, R6
    space_id: 5
    title: Simple Look
    ...
    user_id: 1
    view_count: 1
```

The `sdk$refresh()` call checks if the session is still authenticated
and logs in again if needed.

The `sdk` object has a `userSession` attribute. The `userSession` has
references to subsections of the API. For example, the `lookApi` has the
operations that deal with Looks. The `look` operation gets a Look by id.

`config = sdk$oauthHeader` has to be the **last** parameter sent to any
of these calls. That contains the token that needs to be sent to
validate your authorization.

These calls return a `responseObject` with two attributes.
`responseObject$response` is the http response codes. Check the value of
`httr::status_code(responseObject$response)` for `200` to verify
success. The `responseObject$content` is the data that is actually
returned, assuming everything worked properly, or an error message.

Currently the `UserSession` supports several but not all the API
objects.

R has tab completion to help explore these:

``` r
sdk$userSession$<TAB>
sdk$userSession$.__enclos_env__    sdk$userSession$lookmlModelApi     sdk$userSession$clientConfig       sdk$userSession$activeToken
sdk$userSession$oauthHeader        sdk$userSession$userApi            sdk$userSession$settings           sdk$userSession$me
sdk$userSession$userToken          sdk$userSession$dashboardApi       sdk$userSession$clone              sdk$userSession$isAuthenticated
sdk$userSession$token              sdk$userSession$queryApi           sdk$userSession$logout             sdk$userSession$loginUser
sdk$userSession$tokenExpiresAt     sdk$userSession$lookApi            sdk$userSession$impersonating      sdk$userSession$login
sdk$userSession$userId             sdk$userSession$authClient         sdk$userSession$setAuthExpiration  sdk$userSession$reset
sdk$userSession$projectApi         sdk$userSession$apiClient          sdk$userSession$assignApiClient    sdk$userSession$initialize
```

We can see that `UserSession` has references to the `projectApi`,
`userApi`, `queryApi`, `dashboardApi`, and `lookApi`.

If we want to access an Api that isn’t readily available, we can do it
like this:

``` r
workspaceApi <- lookr::WorkspaceApi$new(sdk$userSession$apiClient)
workspaceApi$ <TAB>
workspaceApi$.__enclos_env__  workspaceApi$userAgent        workspaceApi$workspace        workspaceApi$initialize
workspaceApi$apiClient        workspaceApi$clone            workspaceApi$all_workspaces
data = workspaceApi$all_workspaces(config = sdk$oauthHeader)$content
print(data)
[[1]]
<Workspace>
  Public:
    can: list
    clone: function (deep = FALSE)
    fromJSON: function (WorkspaceJson)
    fromJSONObject: function (WorkspaceJsonObject)
    fromJSONString: function (WorkspaceJson)
    id: production
    initialize: function (can, id, projects)
    projects: list
    toJSON: function ()
    toJSONString: function ()

[[2]]
<Workspace>
  Public:
    can: list
    clone: function (deep = FALSE)
    fromJSON: function (WorkspaceJson)
    fromJSONObject: function (WorkspaceJsonObject)
    fromJSONString: function (WorkspaceJson)
    id: dev
    initialize: function (can, id, projects)
    projects: list
    toJSON: function ()
    toJSONString: function ()
```
