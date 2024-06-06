#
# Build stage
#
FROM maven:3-openjdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
COPY .git /home/app
RUN mvn -f /home/app/pom.xml clean package -Dmaven.test.skip=true

#
# Package stage
#
FROM build
ARG PROJECT_VERSION="0.0.1-SNAPSHOT"
COPY --from=build /home/app/target/cotacao-api-$PROJECT_VERSION.jar /usr/local/lib/cotacao-api.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/usr/local/lib/cotacao-api.jar"]
