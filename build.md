Get the most recent swagger.json file

The `jq` filter does a pretty-print of the json. It isn't really required but
nice.

```
curl https://demo.looker.com:19999/api/3.1/swagger.json | jq . > swagger.json
```

Get swagger-codegen-cli-<VERSION>.jar. Use the latest 2.X.X version for now.

```
java -jar swagger-codegen-cli-2.4.23.jar generate \
  --config codegen-config.json \
  --lang r --input-spec swagger.json \
  --api-package looker --artifact-id looker \
  --template-dir templates
```

Base template files can be found under in the github repo `modules/swagger-codegen/src/main/resources/r/`

get debug info with this...

```
java -DdebugOperations -jar swagger-codegen-cli-2.4.23.jar generate \
  -l r -i swagger.json --api-package looker --artifact-id looker \
  -t t -c codegen-config.json > debugOperations-output.txt
```

```

NAME
        swagger-codegen-cli generate - Generate code with chosen lang

SYNOPSIS
        swagger-codegen-cli generate
                [(-a <authorization> | --auth <authorization>)]
                [--additional-properties <additional properties>...]
                [--api-package <api package>] [--artifact-id <artifact id>]
                [--artifact-version <artifact version>]
                [(-c <configuration file> | --config <configuration file>)]
                [-D <system properties>...] [--git-repo-base-url <git repo base url>]
                [--git-repo-id <git repo id>] [--git-user-id <git user id>]
                [--group-id <group id>] [--http-user-agent <http user agent>]
                (-i <spec file> | --input-spec <spec file>)
                [--ignore-file-override <ignore file override location>]
                [--ignore-import-mapping <ignore import mapping>]
                [--import-mappings <import mappings>...]
                [--instantiation-types <instantiation types>...]
                [--invoker-package <invoker package>]
                (-l <language> | --lang <language>)
                [--language-specific-primitives <language specific primitives>...]
                [--library <library>] [--model-name-prefix <model name prefix>]
                [--model-name-suffix <model name suffix>]
                [--model-package <model package>]
                [(-o <output directory> | --output <output directory>)]
                [--release-note <release note>] [--remove-operation-id-prefix]
                [--reserved-words-mappings <reserved word mappings>...]
                [(-s | --skip-overwrite)] [--skip-alias-generation]
                [(-t <template directory> | --template-dir <template directory>)]
                [--type-mappings <type mappings>...] [(-v | --verbose)]

OPTIONS
        -a <authorization>, --auth <authorization>
            adds authorization headers when fetching the swagger definitions
            remotely. Pass in a URL-encoded string of name:header with a comma
            separating multiple values

        --additional-properties <additional properties>
            sets additional properties that can be referenced by the mustache
            templates in the format of name=value,name=value. You can also have
            multiple occurrences of this option.

        --api-package <api package>
            package for generated api classes

        --artifact-id <artifact id>
            artifactId in generated pom.xml

        --artifact-version <artifact version>
            artifact version in generated pom.xml

        -c <configuration file>, --config <configuration file>
            Path to json configuration file. File content should be in a json
            format {"optionKey":"optionValue", "optionKey1":"optionValue1"...}
            Supported options can be different for each language. Run
            config-help -l {lang} command for language specific config options.

        -D <system properties>
            sets specified system properties in the format of
            name=value,name=value (or multiple options, each with name=value)

        --git-repo-base-url <git repo base url>
            Git repo base URL, e.g. https://github.com.

        --git-repo-id <git repo id>
            Git repo ID, e.g. swagger-codegen.

        --git-user-id <git user id>
            Git user ID, e.g. swagger-api.

        --group-id <group id>
            groupId in generated pom.xml

        --http-user-agent <http user agent>
            HTTP user agent, e.g. codegen_csharp_api_client, default to
            'Swagger-Codegen/{packageVersion}}/{language}'

        -i <spec file>, --input-spec <spec file>
            location of the swagger spec, as URL or file (required)

        --ignore-file-override <ignore file override location>
            Specifies an override location for the .swagger-codegen-ignore file.
            Most useful on initial generation.

        --ignore-import-mapping <ignore import mapping>
            allow generate model classes using names previously listed on import
            mappings.

        --import-mappings <import mappings>
            specifies mappings between a given class and the import that should
            be used for that class in the format of type=import,type=import. You
            can also have multiple occurrences of this option.

        --instantiation-types <instantiation types>
            sets instantiation type mappings in the format of
            type=instantiatedType,type=instantiatedType.For example (in Java):
            array=ArrayList,map=HashMap. In other words array types will get
            instantiated as ArrayList in generated code. You can also have
            multiple occurrences of this option.

        --invoker-package <invoker package>
            root package for generated code

        -l <language>, --lang <language>
            client language to generate (maybe class name in classpath,
            required)

        --language-specific-primitives <language specific primitives>
            specifies additional language specific primitive types in the format
            of type1,type2,type3,type3. For example:
            String,boolean,Boolean,Double. You can also have multiple
            occurrences of this option.

        --library <library>
            library template (sub-template)

        --model-name-prefix <model name prefix>
            Prefix that will be prepended to all model names. Default is the
            empty string.

        --model-name-suffix <model name suffix>
            Suffix that will be appended to all model names. Default is the
            empty string.

        --model-package <model package>
            package for generated models

        -o <output directory>, --output <output directory>
            where to write the generated files (current dir by default)

        --release-note <release note>
            Release note, default to 'Minor update'.

        --remove-operation-id-prefix
            Remove prefix of operationId, e.g. config_getId => getId

        --reserved-words-mappings <reserved word mappings>
            specifies how a reserved name should be escaped to. Otherwise, the
            default _<name> is used. For example id=identifier. You can also
            have multiple occurrences of this option.

        -s, --skip-overwrite
            specifies if the existing files should be overwritten during the
            generation.

        --skip-alias-generation
            skip code generation for models identified as alias.

        -t <template directory>, --template-dir <template directory>
            folder containing the template files

        --type-mappings <type mappings>
            sets mappings between swagger spec types and generated code types in
            the format of swaggerType=generatedType,swaggerType=generatedType.
            For example: array=List,map=Map,string=String. You can also have
            multiple occurrences of this option.

        -v, --verbose
            verbose mode

```

generate the README.md from README.Rmd

```
# install R from instructions at https://cran.r-project.org/bin/linux/debian/#installation
sudo apt install pandoc
R
install.packages("rmarkdown")
rmarkdown::render("README.Rmd")
q()
```

Testing
```
R
> devtools::install(".")
> sdk <- lookr::LookerSDK$new(configFile = "looker.ini")
> sdk$me()$content$display_name
[1] "Firstadmin Rekool"
> data <- sdk$runLook(lookId = 5 )
> fname = sapply(data, "[[", 1)
> ocount = sapply(data, "[[", 2)
> data.frame(fname, ocount)
     fname ocount
1    Homer      5
2     Bart      4
3   Robert      3
4  Bernard      2
5 Milhouse      1
> data <- sdk$runInlineQuery(model = "system__activity", view = "history", fields
= c("history.completed_date", "history.source", "user.count"))
> str(data)
> sdk$me()$content
> sdk$me()$content$sessions[[1]]$ip_address
[1] "192.168.8.1"
> looks <- sdk$allLooks()
> looks[[1]]$title
[1] "Sales by State"
>
`` <- sdk$allDashboards()
> dashes[[1]]$title
[1] "Biz Pulse"
