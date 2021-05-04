package domain;

import java.util.List;

public class RacingResult {
	private final List<RacingTries> racingResult;

	public RacingResult(List<RacingTries> racingResult) {
		this.racingResult = racingResult;
	}

	public List<RacingTries> getRacingResult() {
		return racingResult;
	}
}
