# Usa Java 17 (compatible con Spring Boot 3)
FROM openjdk:17-jdk-slim

# Copia el jar
COPY target/users.jar app.jar

# Expone puerto
EXPOSE 8080

# Ejecuta la app
ENTRYPOINT ["java","-jar","/app.jar"]