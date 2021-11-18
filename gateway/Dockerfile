FROM openjdk:8
ADD target/gateway-docker.jar  gateway-docker.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "gateway-docker.jar"]