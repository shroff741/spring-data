FROM openjdk:8
EXPOSE 8083
COPY target/spring-data-0.0.1-SNAPSHOT.jar spring-data-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-data-0.0.1-SNAPSHOT.jar"]