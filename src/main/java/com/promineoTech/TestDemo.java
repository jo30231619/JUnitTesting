package com.promineoTech;

import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		int sum = a + b;
		if (a > 0 && b > 0) {
			return sum;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}

	/*
	 * wrote a method to multiply positive integers
	 */
	public int multiplyPostive(int a, int b) {
		int total = a * b;
		if (a > 0 && b > 0) {
			return total;
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
	}

	public int randomNumberSquared() {
		int numberSquared = getRandomInt() * getRandomInt();
		return numberSquared;
	}
	
	public int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}

}
