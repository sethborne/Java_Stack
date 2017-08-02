package com.codingdojo.assignmenttwo.pokemon;

public interface PokemonInterface {
	// create needs three parameters
	Pokemon createPokemon(String name, int health, String type);
	// attack needs a pokemon
	void attackPokemon(Pokemon pokemon);
	// returns the name, type and health of pokemon
	String pokemonInfo(Pokemon pokemon);
}
