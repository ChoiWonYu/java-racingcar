import domain.CarMapper;
import java.util.List;

import domain.Car;
import domain.Cars;
import domain.TryCount;
import view.InputView;
import view.OutputView;

public class RacingGameController {

    private final InputView reader;
    private Cars cars;
    private TryCount tryCount;

    public RacingGameController(final InputView reader) {
        this.reader = reader;
    }

    public void race() {
        initGame();

        OutputView.showResultDescription();
        cars.actEachCar(this::showEachCarMove);
        OutputView.printNewLine();
        for (int i = 0; i < tryCount.getTryCount(); i++) {
            cars.moveCarsSatisfiedCondition();
            cars.actEachCar(this::showEachCarMove);
            OutputView.printNewLine();
        }

        showWinners();
    }

    private void initGame() {
        OutputView.askCarsNames();
        String namesInput = reader.getInputLine();
        this.cars = CarMapper.inputToCars(namesInput);

        OutputView.askTryCount();
        String countInput = reader.getInputLine();
        this.tryCount = TryCount.from(countInput);
    }

    private void showWinners() {
        List<Car> winnersCars = cars.getWinners();
        String winners = CarMapper.carsToOutput(winnersCars);
        OutputView.printWinners(winners);
    }

    private void showEachCarMove(Car car) {
        OutputView.showCarMove(car.getCarNameValue(), car.getMoveCountValue());
    }
}
