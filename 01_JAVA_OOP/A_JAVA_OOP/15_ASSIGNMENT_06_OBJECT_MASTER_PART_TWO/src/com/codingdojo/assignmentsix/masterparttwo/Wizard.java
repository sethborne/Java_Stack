package com.codingdojo.assignmentsix.masterparttwo;

public class Wizard extends Human{
	private int health = 50;
	private int intellegence = 8;
	
	public void heal(Human human) {
		human.health += this.intellegence;
	}
	
	public void fireball(Human human) {
		human.health -= this.intellegence*3;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getIntellegence() {
		return intellegence;
	}

	public void setIntellegence(int intellegence) {
		this.intellegence = intellegence;
	}
	
	
}
