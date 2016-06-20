# LookR

### Overview
LookR is an open-source R library that provides the user an interface from the R Console or command line to the Looker API (3.0). The API methods are determined dynamically by a Swagger JSON file available on a given Looker instance. All client methods are written in Java and called from R using the rJava library.

### OSX Installation

The LookR library is not distributed on CRAN; instead, one must build directly from source. Run the following commands in the R console or command-line client.

```R
install.packages("devtools")
library("devtools")
install_github("looker/lookr")	# to get upstream changes, run this command periodically
```

### Ubuntu Installation

#### Preliminaries
Note: I am testing this in an virtual environment that's running Ubuntu 14.04. Make sure Apt is installed. Open up a terminal window and type 
  
```
apt
```

You should see something like this:

![image](https://cloud.githubusercontent.com/assets/2467394/14268697/ecba665a-fa92-11e5-8128-38a7edfd1326.png)

If not, try installing Apt referencing Step 1 from [here](https://www.digitalocean.com/community/tutorials/how-to-set-up-r-on-ubuntu-14-04).

#### Java Setup

Determine which Java version you have running (LookR has only been tested on Java 7 and 8):

```
java -version
```

If you don't have Java installed or you think it might be best to upgrade, run the following commands:

```
sudo apt-get install python-software-properties
```

```
sudo add-apt-repository ppa:webupd8team/java
```

```
sudo apt-get update
```

```
sudo apt-get install oracle-java8-installer
```

Once you have a JRE and Java SDK installed, confirm that the necessary Java environmental variables are set:

```
echo $JAVA_HOME
```

If there are no results, run:

```
export JAVA_HOME=$(readlink -f /usr/bin/javac | sed "s:/bin/javac::")
```

```
export PATH=$PATH:$JAVA_HOME/bin
```

Create a Java config file for R:
```
sudo vi /etc/ld.so.conf.d/java.conf
```

Then paste `/usr/lib/jvm/java-8-oracle/jre/lib/amd64` and `/usr/lib/jvm/java-8-oracle/jre/lib/amd64/server` into that file and save it.

Set the shared library variable:

```
export LD_LIBRARY_PATH=$JAVA_HOME/jre/lib/amd64:$JAVA_HOME/jre/lib/amd64/server
```

Set up R's Java config file:

```
sudo R CMD javareconf
```

#### R Setup

> Note that LookR requires R version 3.2 or later.

Install R base:

```
sudo apt-get -y install r-base
```

Install rJava:

```
sudo apt-get install r-cran-rjava
```

Install rjson:

```
sudo apt-get install r-cran-rjson
```

Install curl utilities for future devtools support:

```
sudo apt-get -y build-dep libcurl4-gnutls-dev
```

```
sudo apt-get -y install libcurl4-gnutls-dev
```

Enter the R command-line client:

```
R
```

Install devtools:

```
install.packages("devtools")
```

Install LookR:

```
library("devtools")
install_github("looker/lookr")
```


### Usage
```R
# preliminaires #
library("devtools")
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
