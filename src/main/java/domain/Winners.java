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
}
