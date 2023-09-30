package controller.dto;

import domain.Car;
import domain.Cars;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarNamesRequest {

    public static final String NAME_SEPARATOR=",";
    private final String separatedCarNames;

    private CarNamesRequest(String names) {
        this.separatedCarNames=names;
    }

    public static CarNamesRequest from(String namesInput) {
        return new CarNamesRequest(namesInput);
    }

    public Cars createCars() {
        List<String> carNameArray = Arrays.stream(separatedCarNames.split(NAME_SEPARATOR))
            .collect(Collectors.toList());

        List<Car> carList=carNameArray.stream()
            .map(Car::from)
            .collect(Collectors.toList());

        return Cars.from(carList);
    }
}
