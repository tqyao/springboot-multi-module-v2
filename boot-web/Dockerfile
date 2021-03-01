FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/boot-web-0.0.1-SNAPSHOT.jar web-app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/web-app.jar"]