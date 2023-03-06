package com.games.pingpong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 
 *  run this as java application, that brings up the app at localhost:8080 port
 *  opening http:localhost:8080/api/ping - returns pong 
 * @author pdevda
 *
 */
@SpringBootApplication
public class PingpongApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingpongApplication.class, args);
	}

}
