package com.codingdojo.assignmenttwo.pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	
	private static int numberOfPokemon = 0;
	
	public Pokemon() {
		numberOfPokemon += 1;
	}
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		numberOfPokemon += 1;
	}
	
	public static int pokemonCount() {
		return numberOfPokemon;
	}
}
