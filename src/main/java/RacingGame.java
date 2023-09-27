import java.util.List;
import java.util.stream.Collectors;

import service.MovingManager;
import service.RandomMovingManager;
import type.Car;
import type.CarName;
import type.CarList;
import type.TryCount;

public class RacingGame {

    private final MovingManager movingManager = new RandomMovingManager();
    private final CarList cars;
    private final TryCount tryCount;

    public RacingGame(List<CarName> carNames, TryCount tryCount) {
        List<Car> cars = generateCars(carNames);
        this.cars = new CarList(cars);
        this.tryCount = tryCount;
    }

    private List<Car> generateCars(List<CarName> carNames) {
        return carNames.stream()
            .map(Car::new).collect(Collectors.toList());
    }

}
