context("UserSession tests")
library(lookr)

test_that("can initialize", {
  settings <- UserSession$new(configFile = "/home/runner/work/lookr/lookr/looker.ini")
  expect_is(settings, "UserSession")
})
