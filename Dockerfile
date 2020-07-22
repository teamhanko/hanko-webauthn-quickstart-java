FROM openjdk:8-jdk-alpine

ENV API_URL="https://api.hanko.io"
ENV API_KEY=""
ENV API_KEY_ID=""

RUN addgroup -S hanko && adduser -S hanko -G hanko
USER hanko:hanko

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dclient.apiUrl=${API_URL}", "-Dclient.apiKey=${API_KEY}", "-Dclient.apiKeyId=${API_KEY_ID}","-jar","/app.jar"]

EXPOSE 3000