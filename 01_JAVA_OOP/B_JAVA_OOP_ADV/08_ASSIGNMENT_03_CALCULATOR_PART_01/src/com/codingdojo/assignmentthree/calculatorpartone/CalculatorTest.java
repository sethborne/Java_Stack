package com.codingdojo.assignmentthree.calculatorpartone;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.setOperandOne(10.5);
		myCalc.setOperation("-");
		myCalc.setOperandTwo(5.2);
		myCalc.performOperation();
		double finalNum = myCalc.getResult();
		System.out.println(finalNum);
		// sysout = 15.7
	}

}
