import java.util.List;
import type.CarName;
import type.TryCount;
import view.InputView;
import view.ResultView;

public class RacingMain {

    public static void main(final String[] args) {
        final List<CarName> carNames = InputView.getCarNames();
        final TryCount tryCount = InputView.getTryCount();

        final RacingGame racingGame = new RacingGame(carNames, tryCount);
        racingGame.race();

        ResultView.printWinners(racingGame.getWinCars());
    }
}
