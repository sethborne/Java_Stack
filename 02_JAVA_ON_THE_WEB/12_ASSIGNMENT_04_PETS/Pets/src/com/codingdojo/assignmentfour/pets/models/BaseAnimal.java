package com.codingdojo.assignmentfour.pets.models;

public abstract class BaseAnimal implements Pet {
	
	// don't do public private here - nothing will access.
	String name;
	String breed;
	double weight;
	
	BaseAnimal(String name, String breed, double weight){
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// method signature for show affection
	// let child classes know they need to implement this
	public abstract String showAffection();
}
