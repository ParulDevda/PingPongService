package com.games.pingpong.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pdevda
 * 
 * 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "game")
public class Game {
	
	@Field(value="id")
	private int id;
	
	@Field(value="players")
	private List<Player> players ;
	
	@Field(value="winner")
	private Player winner;
	

}
