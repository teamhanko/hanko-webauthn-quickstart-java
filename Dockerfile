FROM openjdk:8-jdk-alpine

ENV API_URL="https://api.dev.hanko.io"
ENV API_KEY="17a1b9585cc92782d6017324c77887b283427e8076a2e775dbd7570"
ENV API_KEY_ID="747cd24f-5e91-4b56-8738-7548d8ce3ea2"

RUN addgroup -S hanko && adduser -S hanko -G hanko
USER hanko:hanko

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dclient.apiUrl=${API_URL}", "-Dclient.apiKey=${API_KEY}", "-Dclient.apiKeyId=${API_KEY_ID}","-jar","/app.jar"]

EXPOSE 3000