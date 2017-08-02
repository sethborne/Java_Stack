package com.codingdojo.assignmentfour.calculatorparttwo;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.performOperation(10.5);
		myCalc.performOperation("+");
		myCalc.performOperation(5.2);
		myCalc.performOperation("*");
		myCalc.performOperation(10);
		myCalc.performOperation("=");
		double finalNum = myCalc.getResult();
		System.out.println(finalNum);
		// sysout = 15.7
	}

}
