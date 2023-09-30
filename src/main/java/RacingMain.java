import controller.RacingGameController;
import controller.dto.CarNamesRequest;
import controller.dto.TryCountRequest;
import view.InputOutputView;

public class RacingMain {

    public static void main(final String[] args) {
        final String carNames = InputOutputView.getCarNames();
        final String tryCount = InputOutputView.getTryCount();

        RacingGameController gameController=RacingGameController.of(CarNamesRequest.from(carNames),
            TryCountRequest.from(tryCount));
        gameController.race();
        gameController.printWinner();
    }
}
