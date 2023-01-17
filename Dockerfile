FROM openjdk:18.0.2.1-jdk

WORKDIR /server

COPY .mvn ./.mvn
COPY src ./src
COPY mvnw .
COPY mvnw.cmd .
COPY pom.xml .

RUN ./mvnw package
CMD java -jar target/server-0.0.1-SNAPSHOT.jar

EXPOSE 8080/tcp