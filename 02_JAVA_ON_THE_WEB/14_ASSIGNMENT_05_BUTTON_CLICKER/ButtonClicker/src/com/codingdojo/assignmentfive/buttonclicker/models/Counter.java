package com.codingdojo.assignmentfive.buttonclicker.models;

public class Counter {
	private int count = 0;
	public Counter (){
//		this.count = 0;
	}
	
//	public Counter() {
//		// TODO Auto-generated constructor stub
//	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int incrementCount(int numValIncrement) {
		int returnCount;
		int getCurrClick = getCount();
		returnCount = numValIncrement + getCurrClick;
		setCount(returnCount);
		return returnCount;
	}
}


