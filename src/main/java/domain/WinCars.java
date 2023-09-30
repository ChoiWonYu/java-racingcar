package domain;

import java.util.List;
import java.util.stream.Collectors;

public class WinCars {

    private List<Car> winCars;

    public WinCars(List<Car> winCars) {
        this.winCars = winCars;
    }

    @Override
    public String toString() {
        return winCars.stream()
            .map(Car::getCarNameValue)
            .collect(Collectors.joining(","));
    }
}
