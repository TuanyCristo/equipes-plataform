# ----- Build -----
# Maven
FROM maven:3.8.5-openjdk-17 AS build

# CAMINHO
WORKDIR /app

# Copia pom
COPY pom.xml .

# Baixar dependências
COPY . .

RUN mvn clean install -DskipTests

# ----- Run -----
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=build /app/target/service-core-0.0.1-SNAPSHOT.jar service-core.jar

ENTRYPOINT ["java", "-jar", "service-core.jar"]