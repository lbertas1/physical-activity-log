FROM openjdk:15
EXPOSE 8889
ADD ./target/app.jar app.jar
ENTRYPOINT ["java", "-jar", "--enable-preview", "app.jar"]
