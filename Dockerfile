# Use the official OpenJDK 17 image as the base
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from your Maven build
COPY */target/*.jar spring-boot-app.jar

# Define the entry point for running the application
ENTRYPOINT ["java", "-jar", "/spring-boot-app.jar"]
