package view;

import domain.Winners;

public class OutputView {
	public void printWinner(Winners winners) {
		System.out.println(winners.toString() + Constants.PRINT_WINNER);
	}
}
