FROM openjdk:8-jdk-alpine
RUN addgroup -S manin && adduser -S manin -G manin
USER manin:manin
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dspring.data.mongodb.host=mongodb","-jar","/app.jar"]