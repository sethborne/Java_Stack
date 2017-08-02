package com.codingdojo.assignmenttwo.pokemon;
//extends AbstractClass, implements PokemonInfo
public class Pokedex extends AbstractClass implements PokemonInterface {


	@Override
	public String pokemonInfo(Pokemon pokemon) {
		//
		String pokeInformation = "Name: " + pokemon.getName() + " | Type: " + pokemon.getType() + " | Health: " + pokemon.getHealth();
		return pokeInformation;
	}
	//pokeInfo
	
}
