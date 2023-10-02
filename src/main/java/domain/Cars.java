package domain;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        this.cars = cars;
    }

    public void moveCarsSatisfiedCondition() {
        cars.forEach(Car::moveWhenSatisfiedCondition);
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

    public void actEachCar(Consumer<Car> act) {
        cars.forEach(act);
    }
}
