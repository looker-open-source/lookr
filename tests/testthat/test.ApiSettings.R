context("ApiSettings tests")
library(lookr)

test_that("can initialize", {
  settings <- ApiSettings$new(configFile = "/home/runner/work/lookr/lookr/looker.ini")
  expect_is(settings, "ApiSettings")
})
