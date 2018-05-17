context("UserSession tests")
library(lookr)

test_that("can initialize", {
  settings <- UserSession$new(configFile = "~/looker-sdk/looker.ini")
  expect_is(settings, "UserSession")
})