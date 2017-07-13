package com.codingdojo.lesson.lessonstatic;

public class Person {
	//fields
	private int age;
	private String name;
	//Class Variable
	public static int numberOfPeople = 0;
	public Person(int ageParam, String nameParam) {
		age = ageParam;
		name = nameParam;
		//Class Variable iterates everytime the Person is instantiated
		numberOfPeople += 1;
	}
	//when make static variables in a class - typical to make static method to access
	public static int getPeopleCount() {
		return numberOfPeople;
	}
}
