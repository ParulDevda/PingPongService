package com.games.pingpong.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.games.pingpong.model.Player;

public interface PlayerRepository extends MongoRepository<Player, Integer>{
	
	public List<Player> findByFirstName(String firstName);
	public List<Player> findByLastName(String lastName);
	
	
	public Player findByRank(int rank);

}
