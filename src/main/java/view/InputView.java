package view;

import java.util.Scanner;

public class InputView {
	private final Scanner scanner = new Scanner(System.in);

	public String inputCarNames() {
		System.out.println(Constants.INPUT_CAR_NAMES);
		return scanner.next();
	}

	public int inputTryCount() {
		System.out.println(Constants.INPUT_TRY_COUNT);
		return scanner.nextInt();
	}
}
