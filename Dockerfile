FROM openjdk:8
EXPOSE 8080
ADD target/spring-data-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-data-0.0.1-SNAPSHOT.jar"]