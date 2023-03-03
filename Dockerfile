FROM openjdk:17-alpine
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
CMD ["app.jar"]