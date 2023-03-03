# aws-spring-demo-app
This is sample app. aim to acquire skills for AWS and spring/java

### Language and Library version
| Language/Library | version |
|------------------|---------|
| Java             | 17.0.3  |
| spring boot      | 3.0.3   |


### Deploying AWS
build container
```shell
# build jar
$ ./gradlew clean build      
# docker build
$ docker build --build-arg JAR_FILE=build/*.jar -t myorg/aws-demo-app .
$ docker run -p 8080:8080 myorg/aws-demo-app
```

#### using CI/CD pipeline
TBD
