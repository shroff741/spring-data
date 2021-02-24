FROM openjdk:8
EXPOSE 8083
ARG JAR_FILE=C:/Users/ABC/.jenkins/workspace/FirstPipeline/target/*.jar
# COPY ${JAR_FILE} /app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
CMD ["dir"]