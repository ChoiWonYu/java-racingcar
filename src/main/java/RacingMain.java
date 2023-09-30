import java.util.List;
import service.RacingGameService;
import domain.CarName;
import domain.TryCount;
import view.InputView;
import view.ResultView;

public class RacingMain {

    public static void main(final String[] args) {
        final List<CarName> carNames = InputView.getCarNames();
        final TryCount tryCount = InputView.getTryCount();

        final RacingGameService racingGame = new RacingGameService(carNames, tryCount);
        racingGame.race();

        ResultView.printWinners(racingGame.getWinCars());
    }
}
