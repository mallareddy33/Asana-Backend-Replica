FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/asana-backend-replica.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]