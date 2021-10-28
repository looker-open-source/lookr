context("ApiSettings tests")
library(lookr)

test_that("can initialize", {
  settings <- ApiSettings$new(configFile = "looker.ini")
  expect_is(settings, "ApiSettings")
})
