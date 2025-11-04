# Etapa 1: Build con Maven
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /workspace/app

# Copiar POM y descargar dependencias
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiar código fuente
COPY src ./src

# Construir la aplicación
RUN mvn clean package -DskipTests

# Etapa 2: Runtime
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copiar el JAR
COPY --from=build /workspace/app/target/*.jar app.jar

# Puerto que usa Render
EXPOSE 8080

# Health check para Render
HEALTHCHECK --interval=30s --timeout=3s --start-period=5s --retries=3 \
  CMD curl -f http://localhost:8080/actuator/health || exit 1

ENTRYPOINT ["java", "-jar", "app.jar"]