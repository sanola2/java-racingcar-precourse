package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {
	@ParameterizedTest
	@DisplayName("Random 값이 4 이상일 때 자동차가 전진한다")
	@ValueSource(ints = {4, 5, 6, 7, 8, 9})
	void randomNumberOver4(int randomNumber) {
		RacingCar racingCar = new RacingCar();
		int previousCarMoveCount = racingCar.getMoveCount();
		racingCar.moveForward(randomNumber);
		assertThat(racingCar.getMoveCount()).isEqualTo(previousCarMoveCount + 1);
	}
}
