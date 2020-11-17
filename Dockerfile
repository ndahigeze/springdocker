FROM openjdk:8-jdk-alpine
ADD target/dockerSpringboot.jar dockerSpringboot.jar
ENTRYPOINT ["java","-jar","dockerSpringboot.jar"]

#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.ja

