package domain;

public class RacingCar {
	private int moveCount = 0;
	private String name;
	private int fuel;

	public RacingCar(String carName, int fuel) {
		this.setName(carName);
		this.fuel = fuel;
	}

	public int getMoveCount() {
		return moveCount;
	}

	public void move(int randomNumber) {
		if (randomNumber >= 4) {
			this.moveCount++;
		}

		this.fuel--;
	}

	public String getName() {
		return this.name;
	}

	private void setName(String inputName) {
		this.validateName(inputName);
		this.name = inputName;
	}

	private void validateName(String inputName) {
		if (inputName.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다");
		}
	}

	public int getFuel() {
		return fuel;
	}
}
