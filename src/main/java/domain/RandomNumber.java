package domain;

import java.util.Random;

public class RandomNumber {
	private static final int RANDOM_NUMBER_BOUND = 10;

	private int number;

	public RandomNumber() {
		generate();
	}

	private void generate() {
		Random random = new Random();
		this.number = random.nextInt(RANDOM_NUMBER_BOUND);
	}

	public int getNumber() {
		return number;
	}
}
