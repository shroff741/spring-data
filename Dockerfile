FROM openjdk:8
EXPOSE 8083
#ARG JAR_FILE=target/*.jar
ARG JAR_FILE=C:\Users\ABC\.jenkins\workspace\FirstPipeline\target\spring-data-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]