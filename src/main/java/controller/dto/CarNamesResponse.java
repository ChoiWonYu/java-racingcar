package controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import domain.Car;

public class CarNamesResponse {

    public static final String NAME_JOINER = ", ";
    private final String joinedCarNames;

    private CarNamesResponse(final String joinedCarNames) {
        this.joinedCarNames=joinedCarNames;
    }

    public static CarNamesResponse from(final List<Car> carList) {
        List<String> carNameList=carList.stream()
            .map(Car::getCarNameValue)
            .collect(Collectors.toList());

        String joinedCarNames=String.join(NAME_JOINER,carNameList);
        return new CarNamesResponse(joinedCarNames);
    }

    public String getJoinedCarNames() {
        return joinedCarNames;
    }
}
