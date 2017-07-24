package com.codingdojo.assignmentfour.zookeeperparttwo;

public class DragonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// attack three towns
		// eat two humans
		// fly twice
		// then display energy
		Dragon Drogo = new Dragon();
//		System.out.println("It was a sultry summer morning.  Rising early, Winston left his hovel to tend his flock.");
		Drogo.fly();
//		System.out.println("By god...I hope that isn't a dragon, Winston thought.");
		Drogo.eatHuman();
		Drogo.attackTown();
		Drogo.attackTown();
		Drogo.eatHuman();
		Drogo.fly();
		Drogo.attackTown();
		System.out.println(Drogo.getEnergyLevel());
	}

}
