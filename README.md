## Dockerfile maven plugin with spring boot example
Make sure you set docker username in pom.xml file that's use for when creating image.

* Build image
```
mvn install dockerfile:build or ./mvnw install dockerfile:build
```
* Run image as docker container
```
docker-compose up || docker-compose up -d
```

* Push image
```
mvn dockerfile:push or ./mvnw dockerfile:push
```
For push image make sure:
* login docker hub
* repository and image name should be same.
* if mvn push failed then you can use bellow command
```
docker push {image-name||image-id}
```

For more info:
* visit: [spring-io](https://spring.io/guides/gs/spring-boot-docker)
* visit: [dockerfile-maven](https://github.com/spotify/dockerfile-maven)
