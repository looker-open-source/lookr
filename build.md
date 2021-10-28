# Install R and some dependencies

Install R from instructions at https://cran.r-project.org/bin/linux/debian/#installation

Pandoc is used in generating documents. The package libssl-dev is used for ssl connections.
The package libcurl4-openssl-dev is a basic http library.
```
sudo apt install pandoc libssl-dev libcurl4-openssl-dev libxml2-dev \
    texlive texlive-fonts-extra
```
The RMarkdown package generates markdown files in R. Devtools is a package that
helps build and install packages. The others are supporting packages for those.
```
R
install.packages(c('usethis', 'httr', 'rcmdcheck', 'roxygen2', 'rversions'))
install.packages(c('openssl', 'curl', 'xml2', 'httpuv'))
install.packages(c('rmarkdown', 'devtools'))
q()
```

# Get the most recent swagger.json file

The `jq` filter does a pretty-print of the json. It isn't really required but
nice. It can be installed with `sudo apt install jq`

```
curl https://demo.looker.com:19999/api/4.0/swagger.json | jq . > swagger.json
```
Swagger requires java. It can be installed with `sudo apt install openjdk-11-jre`
if you don't have java already installed.

# Get swagger-codegen

Get swagger-codegen-cli-*VERSION*.jar. Use the latest 2.X.X version for now.

The easiest way to get this is from the maven central repository. Go to
https://search.maven.org/artifact/io.swagger/swagger-codegen-cli/2.4.23/jar
and use the Downloads button in the top right. Or
```
wget https://search.maven.org/remotecontent?filepath=io/swagger/swagger-codegen-cli/2.4.23/swagger-codegen-cli-2.4.23.jar -O swagger-codegen-cli-2.4.23.jar
```

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
  
Generate the README.md from README.Rmd since swagger
sometimes clobbers it.

```
R
rmarkdown::render("README.Rmd")
q()
```

# Generate the pdf version of the docs
```
cd lookr
R CMD Rd2pdf .
```

# Testing
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

sapply(sdk$allModels(), "[[", 'name')
[1] "cucu_mysql_ee15852b"   "cucu_thelook_ee15852b" "system__activity"

sapply(sdk$getLookmlModel('cucu_mysql_ee15852b')$explores, "[[", "name")
[1] "customer_order_facts_ndt" "customer_order_facts_sql"
[3] "customer"                 "customer_for_validator"
[5] "order"                    "order_item"
[7] "product"                  "supplier"

sdk$getLookmlModelExplore('cucu_mysql_ee15852b', 'customer')$title
[1] "Customer"

q()
```

# Automatic testing
```
cd lookr
R CMD check .
```
