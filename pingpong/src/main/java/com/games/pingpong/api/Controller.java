package com.games.pingpong.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author pdevda
 *
 */
@RestController
@RequestMapping("/api/ping")
public class Controller {
	
	public static final String PONG = "pong";
	
	
	@GetMapping
	public String getResponse() {
		return PONG;
	}

}
