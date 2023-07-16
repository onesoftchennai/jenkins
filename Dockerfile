FROM eclipse-temurin:17-jdk-jammy

COPY target/testweb-api.jar /testweb-api.jar

CMD ["java", "-jar", "/testweb-api.jar"]