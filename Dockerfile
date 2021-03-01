FROM openjdk:8
EXPOSE 8083
ADD target/spring-data-0.0.1-SNAPSHOT.jar spring-data-0.0.1-SNAPSHOT.jar
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java","-jar","/spring-data-0.0.1-SNAPSHOT.jar"]