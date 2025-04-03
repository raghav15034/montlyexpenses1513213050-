FROM openjdk:17
WORKDIR /pdf12

COPY target/monthly-expenses-0.0.1-SNAPSHOT.jar  /pdf12/monthly-expenses-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","monthly-expenses-0.0.1-SNAPSHOT.jar"]