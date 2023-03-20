package com.games.pingpong.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.games.pingpong.dao.GameRepository;
import com.games.pingpong.model.Game;

/**
 * 
 * @author pdevda
 *
 */
@RestController
public class GameController {
	
//	public static final String PONG = "pong";
//	
//	
//	@GetMapping
//	public String getResponse() {
//		return PONG;
//	}
	
	@Autowired
	private GameRepository repository;
	
	@PostMapping("/addGame")
	public Game saveGame(@RequestBody Game game) {
		return repository.save(game);
		
	}
	
	
	@GetMapping("/findAllGames")
	public List<Game> getGames(){
		return repository.findAll();
	}
	

}
