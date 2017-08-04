package com.codingdojo.assignmentsix.randomword.models;

import java.util.Date;
import java.util.Random;

public class RandomWord {
	
	
	public static Date getCreateWordDate() {
		Date createWordDate = new Date();
		return createWordDate;
	}

	public static String getRandomWordOfLength() {
		String stringCharsToRandomize = "ABCDEFGHJKLMNPQRSTUVWXYZabcdefghjklmnpqrstuvwxyz23456789";
		int numOfChars = 10;
		
		StringBuilder randomString = new StringBuilder( numOfChars );
		Random rand = new Random();
		for(int i = 0; i < numOfChars; i += 1) {
			randomString.append(stringCharsToRandomize.charAt(rand.nextInt(stringCharsToRandomize.length())));
		}
		return randomString.toString();		
	}
	
	
}
