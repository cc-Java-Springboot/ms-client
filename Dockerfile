FROM openjdk:17
ADD  target/ms-client-0.0.1-SNAPSHOT.jar ms-client.jar
ENTRYPOINT ["java","-jar","ms-client.jar"]