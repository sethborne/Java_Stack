package com.codingdojo.assignmentsix.masterparttwo;

public class Human {
	private int strength = 3;
	private int intellegence = 3;
	private int stealth = 3;
	protected int health = 100;
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntellegence() {
		return intellegence;
	}

	public void setIntellegence(int intellegence) {
		this.intellegence = intellegence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void attack(Human human) {
		human.health -= this.strength;
	}
	
	public int displayStrength() {
		return getStrength();
	}
	
	public int displayIntellegence() {
		return getIntellegence();
	}
	
	public int displayStealth() {
		return getStealth();
	}
	
	public int displayHealth() {
		return getHealth();
	}
}
