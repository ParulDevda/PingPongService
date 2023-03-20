package com.games.pingpong.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "player")
public class Player {
	
	@Field(value="firstName")
	private String firstName;
	
	@Field(value="lastName")
	private String lastName;
	
	
	@Field(value="rank")
	private int rank;

}
