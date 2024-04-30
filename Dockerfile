FROM openjdk:17
LABEL authors="ahmed"
WORKDIR  /app

COPY target/github-actions-essentials-0.0.1.jar github-actions-essentials.jar

#COPY ${JAR_FILE} app.jar
EXPOSE 8080


ENTRYPOINT ["java","-jar","/github-actions-essentials.jar"]
