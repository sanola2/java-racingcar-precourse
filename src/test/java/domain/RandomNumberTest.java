package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {
	@Test
	@DisplayName("0~9 사이의 Random 값이 생성 된다")
	void generateTest() {
		RandomNumber randomNumber = new RandomNumber();
		assertThat(randomNumber.getNumber()).isBetween(0, 9);
	}
}
