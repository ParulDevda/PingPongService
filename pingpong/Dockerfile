FROM azul/zulu-openjdk:17.0.4.1
ARG JAR_FILE=target/PingPongServer.jar
COPY ${JAR_FILE} pingpong.jar
ENTRYPOINT ["java","-jar","/pingpong.jar"]
