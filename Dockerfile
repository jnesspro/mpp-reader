FROM openjdk:10-jdk-slim as builder

COPY gradle /app_src/gradle
COPY build.gradle /app_src/build.gradle
COPY gradlew /app_src/gradlew
COPY src /app_src/src
RUN \
  cd /app_src \
  && ./gradlew test build \
  && cp build/libs/*.jar /srv/app.jar \
  && rm -rf /app_src/* \
  && rm -rf /var/cache/apk/* \
  && rm -rf /.gradle/* \
  && rm -rf /root/.gradle

FROM openjdk:10-jre-slim
EXPOSE 8080
COPY --from=builder /srv/app.jar /srv/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/srv/app.jar"]