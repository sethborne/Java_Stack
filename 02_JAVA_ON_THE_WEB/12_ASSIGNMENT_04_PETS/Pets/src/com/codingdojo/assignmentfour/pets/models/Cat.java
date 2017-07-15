package com.codingdojo.assignmentfour.pets.models;

public class Cat extends BaseAnimal implements Pet{
	
	public Cat (String name, String breed, double weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		return "Your Cat " + name + " looks at you, slightly contemptuously.";
	}
}
