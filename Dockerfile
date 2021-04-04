FROM maven:3.6.1-jdk-8-alpine

WORKDIR /app

# copy the source tree and the pom.xml to our new container
COPY ./ ./

# package our application code
RUN mvn clean package

FROM openjdk:8-jre-alpine3.9

WORKDIR /usr/app

COPY --from=0 /app/target/ecs-1.jar /usr/app/

RUN sh -c 'touch ecs-1.jar'

ENTRYPOINT ["java","-jar","ecs-1.jar"]
