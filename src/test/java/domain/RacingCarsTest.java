package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class RacingCarsTest {
	private RacingCars racingCars;

	@BeforeEach
	void init() {
		String inputNames = "bmw,benz,volvo";
		racingCars = new RacingCars(inputNames);
	}

	@Test
	@DisplayName("각 자동차에 이름을 부여한다")
	void setCarsName() {
		assertThat(racingCars.getRacingCars().get(0).getName()).isEqualTo("bmw");
		assertThat(racingCars.getRacingCars().get(1).getName()).isEqualTo("benz");
		assertThat(racingCars.getRacingCars().get(2).getName()).isEqualTo("volvo");
	}
}
