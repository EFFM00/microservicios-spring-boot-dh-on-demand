FROM openjdk:17
ARG JAR_FILE=target/configserver.jar
COPY %{JAR_FILE} app.jar
ENTRYPOINTS ["java", "~jar", "app.jar"]
EXPOSE 8080