context("LookerSDK tests")

test_that("LookerSDK$new works", {
  skip_on_cran()
  sdk <- LookerSDK$new(configFile = "~/looker-sdk/looker.ini")
  expect_is(sdk, "LookerSDK")
  expect_is(sdk$userSession, "UserSession")
})

test_that("LookerSDK$activeToken detects tokens", {
  skip_on_cran()
  sdk <- LookerSDK$new(configFile = "~/looker-sdk/looker.ini")
  expect_is(sdk$activeToken(), "list")
  sdk$logout()
  expect_null(sdk$activeToken())
})

test_that("LookerSDK$login gets a valid token", {
  skip_on_cran()
  sdk <- LookerSDK$new(configFile = "~/looker-sdk/looker.ini")
  
  token <- sdk$activeToken()
  expect_length(token, 3)
  expect_named(token, c("access_token", "token_type", "expires_in"), ignore.order = TRUE)
  
  expect_is(token$access_token, "character")
  expect_match(token$access_token, "[A-Za-z0-9]{40,40}")
  
  expect_is(token$token_type, "character")
  expect_match(token$token_type, "Bearer")
  
  expect_is(token$expires_in, "integer")
  expect_gte(token$expires_in, 3599)
  expect_lte(token$expires_in, 3600)
})

test_that("Test connection panel population code", {
  skip_on_cran()
  sdk <- LookerSDK$new(configFile = "~/looker-sdk/looker.ini")
  
  relationships <- sdk$describeRelationships()
  
  expect_is(relationships, "list")
  expect_match(unique(unlist(relationships)), "data")
  
  objects <- sdk$describeObject()
  expect_is(objects, "data.frame")
  expect_named(objects, c("name", "type"))
})