# PingPongService


**A simple PingPong Microservice using SpringBoot framework, which is dockerized and runs in a container.**

### Main Classes 
+ PingpongApplication.java
+ Controller.java

### Compile and Build the jar file using mvn

```bash
mvn clean
mvn install
```

or right click on project in eclipse and do run as Maven Build -> package 

Above step will create a PingPongServer.jar file in /target/ dir 

### Build docker image 

```bash
docker build -t pingpongserver .
```

### Create a container from the image, and run the app on it

```bash
docker run -p 8080:8080 pingpongserver
```

App is available on http://localhost:8080/

Requesting api  - http://localhost:8080/api/ping  returns "pong" as a response 

### Debug cmds 

To view all images on docker

```bash
docker images
```
Sample Output 

```bash
REPOSITORY                    TAG       IMAGE ID       CREATED         SIZE
pingpongserver                latest    77e459b0b8c2   2 minutes ago   414MB
```

To remove an image by providing its id 

```bash
docker image rm 95c65f9fdf60
```

To view all container 

```bash
docker container ls -a
```



