package com.codingdojo.assignment.zookeeperpartone;

public class Mammal extends Animal{
	private int energyLevel = 100;
	
	//display Energy
	//getter
	public int displayEnergy() {
		return getEnergyLevel();
	}
	//setter

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
