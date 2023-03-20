package com.games.pingpong.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.games.pingpong.model.Game;

public interface GameRepository extends MongoRepository<Game, Integer>{
	
	public Game findById(int id);

}
