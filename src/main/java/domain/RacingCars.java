package domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
	private final List<RacingCar> racingCars;

	public RacingCars(String inputNames, int tryCount) {
		this.racingCars = new ArrayList<>();
		this.setRacingCars(inputNames, tryCount);
	}

	public void driveCars(int tryCount) {
		for (int i = 0; i < tryCount; i++) {
			moveCars();
		}
	}

	private void moveCars() {
		for (RacingCar racingCar : racingCars) {
			RandomNumber randomNumber = new RandomNumber();
			racingCar.move(randomNumber.getNumber());
		}
	}

	public List<RacingCar> getRacingCars() {
		return racingCars;
	}

	private void setRacingCars(String inputNames, int tryCount) {
		String[] names = inputNames.split(",");

		for (String name : names) {
			racingCars.add(new RacingCar(name, tryCount));
		}
	}
}
