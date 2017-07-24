package com.codingdojo.assignmentsix.masterparttwo;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human();
		System.out.println("human1 health is " + human1.displayHealth());
		
		Wizard wizard1 = new Wizard();
		System.out.println("wizard1 health is " + wizard1.displayHealth() + " wizard1 intellegence is " + wizard1.displayIntellegence());
		
		Ninja ninja1 = new Ninja();
		System.out.println("ninja1 health is " + ninja1.displayHealth());
		
		Samurai samurai1 = new Samurai();
		System.out.println("samurai1 health is " + samurai1.displayHealth());
		
		wizard1.heal(human1);
		System.out.println("human 1 healed " + wizard1.displayIntellegence() + " points by wizard1.  human1 new Health is: " + human1.displayHealth());
		
		wizard1.fireball(human1);
		System.out.println("human1 was ungrateful for the healing wizard1 provided.  wizard1 attacks human1 with a fireball.  human1's current health is: " + human1.displayHealth());
		
		System.out.println("ninja1 current stealth is: " + ninja1.displayStealth());
		
		ninja1.steal(human1);
		System.out.println("ninja1 notices human1 is ungrateful. ninja1 steals " + ninja1.getStealth() + " points of Health from human1. human1's current health is: " + human1.getHealth() + " while ninja1's health is now: " + ninja1.getHealth());
		
		System.out.println("samurai1 health: " + samurai1.displayHealth());
		
		System.out.println("samurai1 despises all this noise during his training time.");
		samurai1.deathBlow(human1);
		System.out.println("samurai1 hands a deathblow to human1.  Reducing human1's health to " + human1.getHealth() + " and reducing samurai1's health to " + samurai1.getHealth());
		ninja1.runAway();
		System.out.println("ninja1 sees samurai1's deathblow.  Fearing for his life, ninja1 runs away, reducing ninja1's health to: " + ninja1.getHealth());
		
		samurai1.meditate(samurai1);
		System.out.println("Fatigued by his altercation with human1, samurai1 mediates.  Afterwards, samurai1 feels recharged, but not fully.  Samurai1's health is: " + samurai1.getHealth());
		
		Samurai samurai2 = new Samurai();
		Samurai samurai3 = new Samurai();
		System.out.println("Shhhh...there are currently " + Samurai.howMany() + " Samurais in the game.");
		
	}

}
