FROM openjdk:11-jre-slim
COPY target/root.jar /usr/local/lib/root.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/root.jar"]