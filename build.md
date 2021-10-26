# Install R and some dependencies

Install R from instructions at https://cran.r-project.org/bin/linux/debian/#installation

Pandoc is used in generating documents.
```
sudo apt install pandoc
```
The RMarkdown package generates markdown files in R
```
R
install.packages("rmarkdown")
q()
```

# Get the most recent swagger.json file

The `jq` filter does a pretty-print of the json. It isn't really required but
nice.

```
curl https://demo.looker.com:19999/api/3.1/swagger.json | jq . > swagger.json
```

# Get swagger-codegen

Get swagger-codegen-cli-*VERSION*.jar. Use the latest 2.X.X version for now.

# Run swagger-codegen from the root of the repository

```
java -jar swagger-codegen-cli-2.4.23.jar generate \
  --config codegen-config.json \
  --lang r --input-spec swagger.json \
  --api-package looker --artifact-id looker \
  --template-dir templates
```

Base template files can be found under in the github repo https://github.com/swagger-api/swagger-codegen at `modules/swagger-codegen/src/main/resources/r/`

# Debugging Info
  
The most useful reason to generate this debug info is that all the parameters
that can be used in the templates will be displayed.

```
java -DdebugOperations -jar swagger-codegen-cli-2.4.23.jar generate \
  --config codegen-config.json \
  --lang r --input-spec swagger.json \
  --api-package looker --artifact-id looker \
  --template-dir templates > debugOperations-output.txt
```

# Generate the README.md
  
Generate the README.md from README.Rmd since swagger clobbers it.

```
R
rmarkdown::render("README.Rmd")
q()
```

Testing
```
R

devtools::install(".")

sdk <- lookr::LookerSDK$new(configFile = "looker.ini")

sdk$me()$content$display_name
[1] "Firstadmin Rekool"

data <- sdk$runLook(lookId = 5 )
fname = sapply(data, "[[", 1)
ocount = sapply(data, "[[", 2)
data.frame(fname, ocount)
     fname ocount
1    Homer      5
2     Bart      4
3   Robert      3
4  Bernard      2
5 Milhouse      1

data <- sdk$runInlineQuery(model = "system__activity", view = "history", fields
  = c("history.completed_date", "history.source", "user.count"))
str(data)

sdk$me()$content

sdk$me()$content$sessions[[1]]$ip_address
[1] "192.168.8.1"

looks <- sdk$allLooks()
looks[[1]]$title
[1] "Sales by State"

dashes <- sdk$allDashboards()
dashes[[1]]$title
[1] "Biz Pulse"

q()
```
