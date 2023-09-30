package domain;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;
import service.MovingManager;
import service.RandomMovingManager;

public class Cars {

    private final List<Car> cars;
    private final MovingManager movingManager;

    private Cars(List<Car> cars) {
        this.cars = cars;
        this.movingManager = new RandomMovingManager(new Random());
    }

    public static Cars from(List<Car> carList) {
        return new Cars(carList);
    }

    public void actOnEachCar(Consumer<Car> action) {
        cars.forEach(action);
    }

    public List<Car> getWinners() {
        Integer maxValue = getMaxValue();
        return cars.stream()
            .filter(car -> car.getMoveCountValue() == maxValue)
            .collect(Collectors.toList());
    }

    public Integer getMaxValue() {
        return cars.stream()
            .mapToInt(Car::getMoveCountValue)
            .max()
            .orElseThrow(NoSuchElementException::new);
    }
}
