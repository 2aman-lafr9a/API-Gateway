FROM openjdk:21

EXPOSE 8080

COPY . .

RUN ./mvnw clean install -DskipTests

ENTRYPOINT ["java","-jar","app.jar"]