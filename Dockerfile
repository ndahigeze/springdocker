FROM openjdk:8-jdk-alpine
ADD target/dockerSpringboot.jar dockerSpringboot.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","dockerSpringboot.jar"]

#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar


