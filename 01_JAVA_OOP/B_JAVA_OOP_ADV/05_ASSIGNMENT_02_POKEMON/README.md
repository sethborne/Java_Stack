# Pokemon Assignment

In this assignment, we will create a Pokedex to tell us information about Pokemon characters.

## Topics:

● Class members

● Abstract classes

● Interfaces

## Tasks:

### Create a Pokemon class with:

● Name, Health, and Type member variables.

● A count static variable that keeps the number of Pokemon created in the program.

● Getters and setters for each member variable.

● A constructor class to set the instance's name, health, and type on creation

### Create an interface for the following methods:

● createPokemon(String name, String type, int health): creates a Pokemon.

● attackPokemon(Pokemon pokemon): lowers the attacked Pokemon's health by 10

● pokemonInfo(Pokemon pokemon): returns the name, health, and type of the pokemon

● Create an abstract class that only implements createPokemon and attackPokemon

● Create a Pokedex class that extends the abstract class above and implements pokemonInfo(Pokemon pokemon).