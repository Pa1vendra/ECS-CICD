FROM openjdk:9
COPY target/app.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch app.jar'
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]