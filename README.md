# LookR
### Overview
LookR is an R library that provides the user an interface from the R Console or command line to the Looker API (3.0). The API methods are determined dynamically by a Swagger JSON file available on a given Looker instance. All client methods are written in Java and called from R using the rJava library.


### Project setup
- TODO note command `mvn` commands supported by this project

- Download Intellij IDEA (Community Edition is fine)
- In Intellij, click File->Open, and choose `lookr/pom.xml`
- Once the project has loaded, right-click `lookr/src/gen` and choose `Mark Directory As -> Generated Sources Root`

### TODO
1. write tests so our methods do what we expect when we ship this thang;
2. write main class for R interface;
3. use rJava to construct R functions;
4. and, bundle dependencies into a "fat jar file," and ship in R library.
