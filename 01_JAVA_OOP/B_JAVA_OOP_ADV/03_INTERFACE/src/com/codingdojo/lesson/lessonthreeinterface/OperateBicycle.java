package com.codingdojo.lesson.lessonthreeinterface;

public interface OperateBicycle {
	double myConstant = 3.0;
	
	default void sayHello() {
		System.out.println("Hello Everybody");
	}
	
	static void staticMethod() {
		System.out.println("Hello from the Static Method of the Interface");
	}
	
	void speedUp(int increment);
	void applyBrake(int decrement);
}
