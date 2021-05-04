package domain;

public class RacingTry {
	private final String racingCarName;
	private final int position;

	public RacingTry(String racingCarName, int position) {
		this.racingCarName = racingCarName;
		this.position = position;
	}

	public String getRacingCarName() {
		return racingCarName;
	}

	public int getPosition() {
		return position;
	}
}
