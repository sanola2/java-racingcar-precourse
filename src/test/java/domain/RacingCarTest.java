package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingCarTest {
	private RacingCar racingCar;

	@BeforeEach
	void init() {
		racingCar = new RacingCar();
	}

	@ParameterizedTest
	@DisplayName("Random 값이 4 이상일 때 자동차가 전진한다")
	@ValueSource(ints = {4, 5, 6, 7, 8, 9})
	void randomNumberOver3(int randomNumber) {
		int previousCarMoveCount = racingCar.getMoveCount();
		racingCar.move(randomNumber);
		assertThat(racingCar.getMoveCount()).isEqualTo(previousCarMoveCount + 1);
	}

	@ParameterizedTest
	@DisplayName("Random 값이 3이하일 때 자동차는 멈춘다")
	@ValueSource(ints = {0, 1, 2, 3})
	void randomNumberUnder4(int randomNumber) {
		int previousCarMoveCount = racingCar.getMoveCount();
		racingCar.move(randomNumber);
		assertThat(racingCar.getMoveCount()).isEqualTo(previousCarMoveCount);
	}

	@Test
	@DisplayName("자동차는 이름을 가질 수 있다")
	void name() {
		String carName = "bmw";
		RacingCar bmw = new RacingCar(carName);
		assertThat(bmw.getName()).isEqualTo(carName);
	}

	@Test
	@DisplayName("자동차는 5자 이하의 이름만 가질 수 있다")
	void nameLimitedUnder5() {
		String carName = "ferrari";
		assertThatThrownBy(() -> new RacingCar(carName))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessageContaining("자동차 이름은 5자 이하만 가능합니다");

	}
}
