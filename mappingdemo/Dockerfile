FROM openjdk:8
ADD target/mappingdemo-docker.jar  mappingdemo-docker.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "mappingdemo-docker.jar"]