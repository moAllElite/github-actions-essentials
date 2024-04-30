FROM openjdk:17
LABEL authors="ahmed"
WORKDIR  /app

COPY target/github-actions-essentials-1.0.0.jar /app/github-actions-essentials.jar
#ARG JAR_FILE=taget/*.jar
EXPOSE 8080

#ENTRYPOINT ["java", "-jar","/app.jar"]

CMD ["java","-jar","github-actions-essentials.jar"]