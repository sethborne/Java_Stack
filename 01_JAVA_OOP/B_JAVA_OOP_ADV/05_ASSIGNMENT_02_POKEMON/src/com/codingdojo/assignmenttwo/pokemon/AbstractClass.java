package com.codingdojo.assignmenttwo.pokemon;

public abstract class AbstractClass implements PokemonInterface {
	//create
	//attack
	@Override
	public Pokemon createPokemon(String name, int health, String type) {
		// TODO Auto-generated method stub
		return new Pokemon(name, health, type);
	}

	@Override
	public void attackPokemon(Pokemon pokemon) {
		// TODO Auto-generated method stub
		int currentHealth = pokemon.getHealth() - 10;
		pokemon.setHealth(currentHealth);
	}

}
