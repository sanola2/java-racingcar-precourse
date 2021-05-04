package domain;

import java.util.List;

public class RacingTries {
	private final List<RacingTry> racingTryList;

	public RacingTries(List<RacingTry> racingTryList) {
		this.racingTryList = racingTryList;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (RacingTry racingTry : racingTryList) {
			result.append(racingTry.getRacingCarName());
			result.append(" : ");
			printPosition(result, racingTry);
			result.append("\n");
		}
		return result.toString();
	}

	private void printPosition(StringBuilder result, RacingTry racingTry) {
		result.append("-");
		for(int i = 0; i< racingTry.getPosition(); i++) {
			result.append("-");
		}
	}
}
