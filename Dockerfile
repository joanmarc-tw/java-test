# Use an OpenJDK base image
FROM eclipse-temurin:21-jdk

# Set the working directory
WORKDIR /app

# Copy Maven wrapper & project files
COPY . .

# Build the app
RUN ./mvnw clean package -DskipTests

# Run the app
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
