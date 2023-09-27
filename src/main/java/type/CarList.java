package type;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CarList {

    private List<Car> cars;

    public CarList(List<Car> cars) {
        this.cars = cars;
    }

    public void repeatAction(Consumer<Car> action) {
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
            .mapToInt(Car::getMoveCountValue).max()
            .orElseThrow(NoSuchElementException::new);
    }
}
