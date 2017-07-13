package com.codingdojo.lesson.lessonstatic;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person(10, "Person1");
		Person person2 = new Person(5, "Person2");
		
		// Class Variable doen't need a variable of an instantiated class type
//		System.out.println(Person.numberOfPeople);
		// this should output 2
		
		// Class Variable called with method on Class
		// no instantiation
		System.out.println("getMethod : " + Person.getPeopleCount());
	}

}
