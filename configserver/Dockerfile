FROM openjdk:8
ADD target/configserver-docker.jar  configserver-docker.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "configserver-docker.jar"]