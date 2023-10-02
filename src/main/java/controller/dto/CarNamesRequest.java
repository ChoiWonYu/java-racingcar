package controller.dto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import domain.Car;
import domain.Cars;

public class CarNamesRequest {

    public static final String NAME_SEPARATOR = ",";

    private final String separatedCarNames;

    private CarNamesRequest(final String names) {
        this.separatedCarNames = names;
    }

    public static CarNamesRequest from(final String namesInput) {
        return new CarNamesRequest(namesInput);
    }

    public Cars createCars() {
        String[] carNameArray = separatedCarNames.split(NAME_SEPARATOR);

        List<Car> carList = Arrays.stream(carNameArray)
            .map(Car::from)
            .collect(Collectors.toList());

        return Cars.from(carList);
    }
}
