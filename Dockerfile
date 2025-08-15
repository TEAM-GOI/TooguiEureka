FROM openjdk:17-jdk-slim

WORKDIR /app

ARG JAR_FILE=build/libs/TooguiEureka-0.0.1-SNAPSHOT.jar

# jar 파일 복제
COPY ${JAR_FILE} app.jar

EXPOSE 8761
# 실행 명령어
ENTRYPOINT ["java","-jar", "app.jar"]