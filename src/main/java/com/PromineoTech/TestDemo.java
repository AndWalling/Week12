package com.PromineoTech;

import java.util.Random;

public class TestDemo {
	public int addPositive(int a, int b) {
		if (a >= 1 && b >= 1) {
			return (a + b);
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	} 
	public int multiplyTwoNumbers(int a, int b) {
		return (a * b);
	}
	int getRandomInt() {

	    Random random = new Random();

	    return random.nextInt(10) + 1;

	}
	int randomNumberSquared() {
		int a = getRandomInt();
		return a * a;
	}
}
