package domain;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import service.MovingStrategy;
import service.RandomGenerator;
import service.RandomMovingStrategy;

public class Cars {

    private final List<Car> cars;
    private final MovingStrategy movingManager;

    private Cars(final List<Car> cars) {
        this.cars = cars;
        this.movingManager = new RandomMovingStrategy(new RandomGenerator());
    }

    public static Cars from(final List<Car> carList) {
        return new Cars(carList);
    }

    public void moveOrStopUsingManager() {
        cars.forEach((car -> {
            Boolean canMove = movingManager.canCarMove();
            if (canMove) {
                car.move();
            }
        }));
    }

    public List<Car> getCarList() {
        return this.cars;
    }

    public List<Car> getWinners() {
        int maxValue = getMaxValue();
        return cars.stream()
            .filter(car -> car.hasSameMoveCount(maxValue))
            .collect(Collectors.toList());
    }

    public int getMaxValue() {
        return cars.stream()
            .mapToInt(Car::getMoveCountValue)
            .max()
            .orElseThrow(NoSuchElementException::new);
    }
}
