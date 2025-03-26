# Stage 1: Build with Maven (including ANTLR generation)
FROM maven:3.8.6-eclipse-temurin-17 AS builder

# Install X11 dependencies (needed even in build stage if any tests use GUI)
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    xauth \
    libxrender1 \
    libxtst6 \
    libxi6 && \
    rm -rf /var/lib/apt/lists/*

WORKDIR /app

# First copy just the POM to cache dependencies
COPY pom.xml .

# Download dependencies first (faster rebuilds)
RUN mvn dependency:go-offline

# Copy source files
COPY src ./src

# Generate sources (including ANTLR files) and build
RUN mvn clean generate-sources package

# Stage 2: Runtime image
FROM eclipse-temurin:17-jdk

# Install X11 dependencies
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    xauth \
    libxrender1 \
    libxtst6 \
    libxi6 && \
    rm -rf /var/lib/apt/lists/*

# Set X11 environment variables
ENV DISPLAY=host.docker.internal:0.0
ENV XAUTHORITY=/tmp/.docker.xauth

WORKDIR /app

# Copy built artifacts from builder stage
COPY --from=builder /app/target/*.jar ./app.jar
COPY --from=builder /app/target/generated-sources ./generated-sources

# Copy ANTLR jar if needed at runtime
COPY antlr-4.13.2-complete.jar .

# Command to run your application
CMD ["java", "-cp", "app.jar:antlr-4.13.2-complete.jar", "com.dinaxis.Main"]