package domain;

public class RacingCar {
	private int moveCount = 0;

	public int getMoveCount() {
		return moveCount;
	}

	public void move(int randomNumber) {
		if (randomNumber >= 4) {
			this.moveCount++;
		}
	}
}
