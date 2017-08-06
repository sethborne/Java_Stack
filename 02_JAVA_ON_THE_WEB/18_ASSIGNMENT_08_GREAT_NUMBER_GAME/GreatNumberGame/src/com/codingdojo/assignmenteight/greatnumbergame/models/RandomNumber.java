package com.codingdojo.assignmenteight.greatnumbergame.models;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
	//function for randomNumber
	public static int getRandomNumber() {
		int numValMin = 1;
		int numValMax = 100;
		int newRandomNumber = ThreadLocalRandom.current().nextInt(numValMin, numValMax + 1);
		return newRandomNumber;
	}
}
