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

    public WinCars getWinners() {
        Integer maxValue = getMaxValue();
        List<Car> winCars = cars.stream()
            .filter(car -> car.getMoveCount().getMoveCount() == maxValue)
            .collect(Collectors.toList());
        return new WinCars(winCars);
    }

    public Integer getMaxValue() {
        return cars.stream()
            .map(Car::getMoveCount).mapToInt(MoveCount::getMoveCount)
            .max().orElseThrow(NoSuchElementException::new);
    }
}
