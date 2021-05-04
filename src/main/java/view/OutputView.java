package view;

import domain.RacingResult;
import domain.RacingTries;
import domain.Winners;

public class OutputView {
	public void printWinner(Winners winners) {
		System.out.println(winners.toString() + Constants.PRINT_WINNER);
	}

	public void printRacingResult(RacingResult racingResult) {
		System.out.println(Constants.EXECUTION_RESULT);
		for (RacingTries racingTries : racingResult.getRacingResult()) {
			System.out.println(racingTries.toString());
		}
	}
}
