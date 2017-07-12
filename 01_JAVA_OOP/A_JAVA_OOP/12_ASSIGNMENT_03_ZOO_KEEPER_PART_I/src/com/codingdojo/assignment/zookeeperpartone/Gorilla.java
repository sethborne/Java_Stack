package com.codingdojo.assignment.zookeeperpartone;

public class Gorilla extends Mammal{
	//method throwSomething() - 
	public String throwSomething(){
		// current energyLevel
		int currentEnergyLevel = getEnergyLevel();
		System.out.println("Before Throwing, Energy Level Is: " + currentEnergyLevel);
		
		int decreaseEnergyLevelByThrow = 5;
		int afterThrowEnergyLevel = currentEnergyLevel - decreaseEnergyLevelByThrow;
		setEnergyLevel(afterThrowEnergyLevel);
		String throwSomethingMessage = "The Gorilla has Thrown Something.  This Decreases it's Energy Level by 5 to: " + afterThrowEnergyLevel + ".";
		return throwSomethingMessage;
	}
	//method eatBananas()
	//print message of Gorilla's satisfaction
	//increase energy by 10
	public String eatBananas() {
		//currentEnergyLevel
		int currentEnergyLevel = getEnergyLevel();
		System.out.println("Before Eating, Energy Level is: " + currentEnergyLevel);
		//eating
		int increaseEnergyLevelByEating = 10;
		int afterEatingEnergyLevel = currentEnergyLevel + increaseEnergyLevelByEating;
		setEnergyLevel(afterEatingEnergyLevel);
		String eatSomethingMessage = "The Gorilla Ate A Banana.  This makes the Gorilla Happy, its Energy Level Increases by 10 to: " + afterEatingEnergyLevel + ".";
		return eatSomethingMessage;
	}
	
	//method climb()
	//print message that Gorilla climbed Tree
	//decrease energy by 10
	public String climb() {
		//currentEnergyLevel
		int currentEnergyLevel = getEnergyLevel();
		System.out.println("Before Climbing, Energy Level is: " + currentEnergyLevel);
		//climbing
		int decreaseEnergyLevelByClimbing = 10;
		int afterClimbingEnergyLevel = currentEnergyLevel - decreaseEnergyLevelByClimbing;
		setEnergyLevel(afterClimbingEnergyLevel);
		String climbSomethingMessage = "The Gorilla Climbed a Tree.  A Big Tree.  The Gorilla is tired and it's Energy Level Decreases by 10 to: " + afterClimbingEnergyLevel + ".";
		return climbSomethingMessage;
	}
}
