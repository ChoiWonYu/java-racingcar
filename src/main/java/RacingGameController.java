import domain.CarMapper;
import java.util.List;

import domain.CarStatus;
import domain.Car;
import domain.Cars;
import domain.TryCount;
import java.util.Scanner;

public class RacingGameController {

    private final Scanner reader;
    private Cars cars;
    private TryCount tryCount;

    public RacingGameController(final Scanner reader) {
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
        String namesInput = reader.nextLine();
        this.cars = CarMapper.inputToCars(namesInput);

        OutputView.askTryCount();
        String countInput = reader.nextLine();
        this.tryCount = TryCount.from(countInput);
    }

    private void showWinners() {
        List<Car> winnersCars = cars.getWinners();
        String winners = CarMapper.carsToOutput(winnersCars);
        OutputView.printWinners(winners);
    }

    private void showEachCarMove(Car car) {
        CarStatus status = car.toStatus();
        OutputView.showCarMove(status.getCarName(), status.getCountMove());
    }
}
