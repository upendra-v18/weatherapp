FROM openjdk:17
ARG JAR_FILE=target/weatherapp-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080



