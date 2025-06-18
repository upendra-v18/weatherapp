# Use official OpenJDK image
FROM openjdk:17

# Copy the JAR file
COPY target/weatherapp-1.0.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
