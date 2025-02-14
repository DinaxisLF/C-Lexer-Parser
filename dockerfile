# Etapa 1: Compilación con Maven y OpenJDK 8
FROM maven:3.8.1-openjdk-8 AS builder
WORKDIR /app
# Copiamos el pom y los sources para aprovechar el caché de Docker
COPY pom.xml .
COPY src ./src
# Compilamos y empaquetamos la aplicación (usa -DskipTests si no deseas ejecutar los tests)
RUN mvn clean package

# Etapa 2: Imagen final para ejecutar la aplicación
FROM openjdk:8-jre-slim
WORKDIR /app
# Copiamos el jar generado en la etapa anterior
COPY --from=builder /app/target/demo-antlr4-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar
# (Opcional) Exponer el puerto si tu app lo requiere
# EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
