package domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
	private final List<RacingCar> racingCars;

	public RacingCars(String inputNames) {
		this.racingCars = new ArrayList<>();
		this.setRacingCars(inputNames);
	}

	public List<RacingCar> getRacingCars() {
		return racingCars;
	}

	private void setRacingCars(String inputNames) {
		String[] names = inputNames.split(",");

		for (String name : names) {
			racingCars.add(new RacingCar(name));
		}
	}
}
