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
		racingCars = new RacingCars(inputNames, 5);
	}

	@Test
	@DisplayName("각 자동차에 이름을 부여한다")
	void setCarsName() {
		assertThat(racingCars.getRacingCars().get(0).getName()).isEqualTo("bmw");
		assertThat(racingCars.getRacingCars().get(1).getName()).isEqualTo("benz");
		assertThat(racingCars.getRacingCars().get(2).getName()).isEqualTo("volvo");
	}

	@Test
	@DisplayName("입력 받은 횟수만큼 자동차를 동작 시킨다")
	void executionCountTest() {
		racingCars.driveCars(5);
		assertThat(racingCars.getRacingCars().get(0).getFuel()).isEqualTo(0);
		assertThat(racingCars.getRacingCars().get(1).getFuel()).isEqualTo(0);
		assertThat(racingCars.getRacingCars().get(2).getFuel()).isEqualTo(0);
	}
}
