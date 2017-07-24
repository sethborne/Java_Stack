package com.codingdojo.assignmentsix.masterparttwo;

public class Ninja extends Human{
	private int stealth = 10;
	
	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public void steal(Human human) {
		human.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		this.health -= 10;
	}
}
