FROM openjdk:17
ARG JAR_FILE=target/gateway.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "~-ar", "app.jar"]
EXPOSE 8080