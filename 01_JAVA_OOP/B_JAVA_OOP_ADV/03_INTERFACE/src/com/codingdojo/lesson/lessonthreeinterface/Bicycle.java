package com.codingdojo.lesson.lessonthreeinterface;

class Bicycle implements OperateBicycle {
	private int speed;
	// constructor
	public Bicycle() {
		speed = 0;
	}
	// static method that calls on the interface static method
	public static void staticMethod() {
		OperateBicycle.staticMethod();
	}
	//implementing speedUp
	public void speedUp(int increment) {
		speed += increment;
	}
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	public int getSpeed() {
		return speed;
	}
	
}
