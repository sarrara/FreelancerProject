FROM openjdk:8
EXPOSE 8761
ADD target/EurekaServerProject-0.0.1-SNAPSHOT.jar EurekaServer-docker.jar
ENTRYPOINT ["java", "-jar", "EurekaServer-docker.jar"]
