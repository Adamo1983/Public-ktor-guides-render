# Stage 1: Build stage
FROM gradle:7.6-jdk17 AS build
WORKDIR /app
COPY . .
RUN ./gradlew shadowJar --no-daemon

# Stage 2: Runtime stage
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/build/libs/remoteGarage-guides-all.jar app.jar
EXPOSE 8800
CMD ["java", "-jar", "app.jar"]