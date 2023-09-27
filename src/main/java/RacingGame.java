import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import service.MovingManager;
import service.RandomMovingManager;
import type.Car;
import type.CarName;
import type.CarList;
import type.TryCount;

public class RacingGame {

    private final MovingManager movingManager;
    private final CarList cars;
    private final TryCount tryCount;

    public RacingGame(List<CarName> carNames, TryCount tryCount) {
        List<Car> cars = generateCars(carNames);
        this.cars = new CarList(cars);
        this.tryCount = tryCount;
        this.movingManager = new RandomMovingManager(new Random());
    }

    private List<Car> generateCars(List<CarName> carNames) {
        return carNames.stream()
            .map(Car::new).collect(Collectors.toList());
    }

    public void race() {
        System.out.println("\n실행 결과");

        cars.repeatAction(Car::printCarsMove);
        System.out.println("\n");
        for (int i = 0; i < tryCount.getTryCount(); i++) {
            cars.repeatAction(this::moveOrStopByManager);
            cars.repeatAction(Car::printCarsMove);
            System.out.println("\n");
        }
    }

    private void moveOrStopByManager(Car car) {
        boolean canMove=movingManager.canMove();
        car.moveOrStopByManager(canMove);
    }
}
