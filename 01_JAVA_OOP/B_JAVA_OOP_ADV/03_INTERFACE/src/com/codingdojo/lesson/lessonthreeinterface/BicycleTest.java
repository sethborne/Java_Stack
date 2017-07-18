package com.codingdojo.lesson.lessonthreeinterface;

public class BicycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle newBike = new Bicycle();
		//print constant = 3.0
		System.out.println(Bicycle.myConstant);
		//print Hello Everybody
		newBike.sayHello();
		// this invokes a class method, goes back to interface
		// should print "Hello from the Static Method of the interface"
		Bicycle.staticMethod();
		//speed = 3
		newBike.speedUp(3);
		// should print 3
		System.out.println(newBike.getSpeed());
		// drop speed by 2
		newBike.applyBrake(2);
		// print new speed = 1
		System.out.println(newBike.getSpeed());
		
	}

}
