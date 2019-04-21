FROM openjdk:8-jre-alpine3.8
MAINTAINER lvzhjc@yonyou.com
COPY target/cloud-simple-helloword-0.0.1.jar /
COPY application.properties / 
EXPOSE 9966
ENTRYPOINT ["/usr/bin/java", "-jar", "cloud-simple-helloword-0.0.1.jar"]
