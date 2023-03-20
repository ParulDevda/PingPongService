package com.games.pingpong.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.games.pingpong.dao.PlayerRepository;
import com.games.pingpong.model.Player;

/**
 * 
 * @author pdevda
 *
 */
@RestController
public class PlayerController {
	
	@Autowired
	private PlayerRepository repository;
	
	
	@PostMapping("/addPlayer")
	public Player savePlayer(@RequestBody Player player) {
		return repository.save(player);
	}
	
	@GetMapping("/findAllPlayers")
	public List<Player> getPlayer(){
		return repository.findAll();
	}

}
