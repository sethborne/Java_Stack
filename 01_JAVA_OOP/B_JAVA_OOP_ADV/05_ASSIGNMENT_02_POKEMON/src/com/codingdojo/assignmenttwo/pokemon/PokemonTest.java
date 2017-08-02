package com.codingdojo.assignmenttwo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pokemon poke1 = new Pokemon("bulbasaur", 100, "Land");
//		Pokemon poke2 = new Pokemon("bulbasaur2", 150, "Land2");
		
		Pokedex pokedex = new Pokedex();
		
		Pokemon pokeNum007 = pokedex.createPokemon("Squirtle", 100, "Water");
		Pokemon pokeNum025 = pokedex.createPokemon("Pikachu", 100, "Electric");
		Pokemon pokeNum058 = pokedex.createPokemon("Growlithe", 100, "Fire");
		
		
		
		System.out.println(pokedex.pokemonInfo(pokeNum007));
		System.out.println(pokedex.pokemonInfo(pokeNum025));
		System.out.println(pokedex.pokemonInfo(pokeNum058));
		
		System.out.println(pokeNum007.getName() + " got attacked!");
		pokedex.attackPokemon(pokeNum007);
		
		System.out.println(pokedex.pokemonInfo(pokeNum007));
		
		System.out.println("Number of Pokemon Created: " + Pokemon.getPokemonCount());
	}

}
