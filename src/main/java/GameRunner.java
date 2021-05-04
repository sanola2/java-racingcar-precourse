import domain.RacingCars;
import domain.RacingResult;
import domain.Winners;
import view.InputView;
import view.OutputView;

public class GameRunner {
	private final InputView inputView;
	private final OutputView outputView;

	public GameRunner() {
		this.inputView = new InputView();
		this.outputView = new OutputView();
	}

	public void play() {
		String inputCarName = inputView.inputCarNames();
		int tryCount = inputView.inputTryCount();

		RacingCars racingCars = new RacingCars(inputCarName, tryCount);
		RacingResult racingResult = racingCars.driveCars(tryCount);
		outputView.printRacingResult(racingResult);

		Winners winners = racingCars.getWinners();
		outputView.printWinner(winners);
	}
}
