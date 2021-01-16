FROM openjdk:15
EXPOSE 8085
ADD ./target/app.jar app.jar
ENTRYPOINT ["java", "-jar", "--enable-preview", "app.jar"]
