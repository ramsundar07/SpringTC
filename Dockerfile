FROM eclipse-temurin:17-jre
COPY target/SpringTC-1.0.0.jar SpringTC.jar
ENTRYPOINT ["java", "-jar", "/SpringTC.jar"]
