package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarMapper {

    public static final String NAME_JOINER = ", ";
    public static final String NAME_SEPARATOR = ",";

    public static Cars inputToCars(final String separatedCarNames) {
        String[] carNames = separatedCarNames.split(NAME_SEPARATOR);

        List<Car> targetCars = Arrays.stream(carNames)
            .map(Car::createDefault)
            .collect(Collectors.toList());

        return new Cars(targetCars);
    }

    public static String carsToOutput(final List<Car> targetCars) {
        List<String> carNames = targetCars.stream()
            .map(Car::getCarNameValue)
            .collect(Collectors.toList());

        return String.join(NAME_JOINER, carNames);
    }
}
