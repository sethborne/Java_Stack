package com.codingdojo.assignmentsix.masterparttwo;

public class Samurai extends Human{
	private int health = 200;
	public static int numOfSamurai = 0;
	public static Object howMany;
	
	
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Samurai() {
		numOfSamurai += 1;
	}
	
	public void deathBlow(Human human) {
		human.health -= human.health;
		this.health -= this.health/2;
	}
	
	public void meditate(Human human) {
		this.health += (this.health/2);
	}
	
	public static int howMany() {
		return numOfSamurai;
	}
}
