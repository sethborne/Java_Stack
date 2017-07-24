package com.codingdojo.assignmentfour.zookeeperparttwo;

public class Dragon extends Reptile {
	
	int energyLevel = 300;

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void fly() {
		System.out.println("In the distance, the air crackles, signaling a Dragon in flight.");
		this.energyLevel -= 50;
	}
	
	public void eatHuman() {
		System.out.println("(Muttering) Early Bird My Ass.  Nobody Talks about the Early Wor...AAAAArrrrrggggghhhhh");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Bring out your Pails!!...(CowBell Rings)...Bring out your Pails!!...");
		this.energyLevel -= 100;
	}
	
}
