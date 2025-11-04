# Etapa 1: Build con Maven
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Crear directorio de trabajo
WORKDIR /workspace/app

# Copiar POM primero para cachear dependencias
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiar código fuente
COPY src ./src

# Construir la aplicación
RUN mvn clean package -DskipTests

# Etapa 2: Runtime
FROM eclipse-temurin:21-jre
WORKDIR /app

# Copiar el JAR construido
COPY --from=build /workspace/app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]