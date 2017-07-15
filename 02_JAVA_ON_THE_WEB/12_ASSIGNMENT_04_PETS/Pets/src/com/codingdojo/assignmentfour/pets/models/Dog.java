package com.codingdojo.assignmentfour.pets.models;

public class Dog extends BaseAnimal implements Pet{
	
	public Dog (String name, String breed, double weight) {
		super(name, breed, weight);
	}
	
	public String showAffection() {
		if(this.weight > 30) {
			return "The Dog is Fat";
		}
		else {
			return "The Dog Barks";			
		}
		
	}
}
