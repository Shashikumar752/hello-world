FROM openjdk:8-jdk-alpine

VOLUME /tmp

# copy jar file
ARG JAR_FILE
COPY ${JAR_FILE} app.jar

# set entry point
ENTRYPOINT ["java","-jar","/app.jar"]

# expose ports
EXPOSE 9000/tcp
EXPOSE 9001/tcp
