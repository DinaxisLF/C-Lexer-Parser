# Use a base image with Java and Maven
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Install X11 dependencies
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    xauth \
    libxrender1 \
    libxtst6 \
    libxi6 \
    && rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src
COPY antlr-4.13.2-complete.jar .

# Build the project
RUN mvn clean package

# Runtime stage
FROM eclipse-temurin:17-jdk

# Install X11 dependencies
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    xauth \
    libxrender1 \
    libxtst6 \
    libxi6 \
    && rm -rf /var/lib/apt/lists/*

# Set environment variables for X11
ENV DISPLAY=host.docker.internal:0.0
ENV XAUTHORITY=/tmp/.docker.xauth

# Copy built artifacts from build stage
WORKDIR /app
COPY --from=build /app/target/*.jar ./app.jar
COPY antlr-4.13.2-complete.jar .

# Command to run your application
CMD ["java", "-cp", "app.jar:antlr-4.13.2-complete.jar", "com.dinaxis.Main"]