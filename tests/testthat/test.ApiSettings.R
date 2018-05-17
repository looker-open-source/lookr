context("ApiSettings tests")
library(lookr)

test_that("can initialize", {
  settings <- ApiSettings$new(configFile = "~/looker-sdk/looker.ini")
  expect_is(settings, "ApiSettings")
})