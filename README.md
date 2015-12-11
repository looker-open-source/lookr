# LookR
### Overview
LookR is an open-source R library that provides the user an interface from the R Console or command line to the Looker API (3.0). The API methods are determined dynamically by a Swagger JSON file available on a given Looker instance. All client methods are written in Java and called from R using the rJava library.


### Installation
The LookR library is not distributed on CRAN; instead, one must build directly from source. Run the following commands in the R console or command-line client.
```R
install.packages("devtools")
library("devtools")
install_github("looker/lookr")	# to get upstream changes, run this command periodically
```

### Usage
```R
# preliminaires #
library("LookR")

# setting up the client and authenticating (id and secret are available on your Looker instance)
looker_setup(	id = "myapi3id",
				secret = "myapi3secret",
				api_path = "https://mylookerendpoint.com:19999/api/3.0"
)

# running a Look by its look_id
my_look <- run_look(2039)

# running an inline query by providing query components (note: model, view, and fields are required parameters)
my_inline_query <- run_inline_query(model = "thelook", 
									view = "orders", 
									fields = c("orders.count", "orders.created_month")
									filters = list(c("orders.created_month", "90 days"), c("orders.status", "complete"))
)
```
### Contributing
- Clone this repo `git clone git@github.com:looker/lookr.git`;
- Download Intellij IDEA (Community Edition is fine), or your preferred JAVA IDE;
- In your Java IDE, generate a new project from external source—namely, `lookr/pom.xml`;
- When deploying new changes, make sure to bundle an uber jar containing all of the dependencies.

### TODO
1. tests;
2. push as many R functions as possible into Java.

