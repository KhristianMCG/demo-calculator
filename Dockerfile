FROM openjdk:8-jdk-alpine
MAINTAINER Cristian Moreno
COPY target/demo-calculator-0.0.1-SNAPSHOT.jar demo-calculator-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-calculator-0.0.1-SNAPSHOT.jar"]