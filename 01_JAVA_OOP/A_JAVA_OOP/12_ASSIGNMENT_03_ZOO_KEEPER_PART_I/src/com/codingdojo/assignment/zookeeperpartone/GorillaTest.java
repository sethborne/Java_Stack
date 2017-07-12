package com.codingdojo.assignment.zookeeperpartone;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mammalFirst = new Mammal();
		int mammalFirstEnergy = mammalFirst.displayEnergy();
		System.out.println("Mammal Energy Level is: " + mammalFirstEnergy);
		
		
		Gorilla gorillaFirst = new Gorilla();
		String printCurrentGorillaEnergyLevel = "Gorilla Energy Level is: " + gorillaFirst.displayEnergy();
		int gorrillaFirstEnergy = gorillaFirst.displayEnergy();
		System.out.println("Gorilla Energy Level is: " + gorrillaFirstEnergy);
		//throw 3
		String gorillaThrow1 = gorillaFirst.throwSomething();
		System.out.println(gorillaThrow1);
		System.out.println(printCurrentGorillaEnergyLevel);
		
		String gorillaThrow2 = gorillaFirst.throwSomething();
		System.out.println(gorillaThrow2);
		System.out.println(printCurrentGorillaEnergyLevel);
		
		String gorillaThrow3 = gorillaFirst.throwSomething();
		System.out.println(gorillaThrow3);
		System.out.println(printCurrentGorillaEnergyLevel);
		//eat 2
		String gorillaEatBan1 = gorillaFirst.eatBananas();
		System.out.println(gorillaEatBan1);
		System.out.println(printCurrentGorillaEnergyLevel);
		
		String gorillaEatBan2 = gorillaFirst.eatBananas();
		System.out.println(gorillaEatBan2);
		System.out.println(printCurrentGorillaEnergyLevel);
		//climb 1
		String gorillaClimb1 = gorillaFirst.climb();
		System.out.println(gorillaClimb1);
		System.out.println(printCurrentGorillaEnergyLevel);
	}

}
