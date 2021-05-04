package domain;

import java.util.List;

public class Winners {
	private final List<RacingCar> winners;

	public Winners(List<RacingCar> winners) {
		this.winners = winners;
	}

	public List<RacingCar> getWinners() {
		return winners;
	}

	@Override
	public String toString() {
		StringBuilder winnersString = new StringBuilder();
		winnersString.append(winners.get(0).getName());
		for (int i = 1; i < winners.size(); i++) {
			winnersString.append(", ");
			winnersString.append(winners.get(i).getName());
		}

		return winnersString.toString();
	}
}
