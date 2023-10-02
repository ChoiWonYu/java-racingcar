import controller.RacingGameController;
import controller.dto.CarNamesRequest;
import controller.dto.TryCountRequest;
import view.InputView;

public class RacingMain {

    public static void main(final String[] args) {
        final String carNames = InputView.getCarNames();
        final String tryCount = InputView.getTryCount();

        RacingGameController gameController = RacingGameController.of(
            CarNamesRequest.from(carNames),
            TryCountRequest.from(tryCount));
        gameController.race();
        gameController.printWinner();
    }
}
