FROM openjdk:8
EXPOSE 8082
ADD target/GestionPropositionsProjet-0.0.1-SNAPSHOT.jar GestionPropositionsProjets-docker.jar
ENTRYPOINT ["java", "-jar", "GestionPropositionsProjets-docker.jar"]