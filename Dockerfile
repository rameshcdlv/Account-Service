FROM openjdk:8
MAINAINER Akula Ramesh "rameshcdlv@gmail.com"
WORKDIR /usr/local/bin/
COPY maven/AccountService-0.0.1-SNAPSHOT.jar account-service.jar
CMD ["java","-jar","account-service.jar"]
