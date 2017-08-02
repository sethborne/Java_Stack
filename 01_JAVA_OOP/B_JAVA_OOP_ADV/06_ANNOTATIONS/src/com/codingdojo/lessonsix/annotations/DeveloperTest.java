package com.codingdojo.lessonsix.annotations;

public class DeveloperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer newDev = new Developer();
//		newDev.setName("Test");
		System.out.println(newDev.getName());
		
		Human newHuman = new Human();
		newHuman.setName("Steve");
		System.out.println(newHuman.getName());
	}

}
