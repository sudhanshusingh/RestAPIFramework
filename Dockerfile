FROM openjdk:8-jdk-alpine

RUN ./gradlew clean build

RUN mkdir /app

COPY build/libs/*.jar  /app/TestFramework-1.0-SNAPSHOT.jar

Expose 8080/

CMD [""]