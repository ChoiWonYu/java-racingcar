package controller.dto;

import domain.Car;
import java.util.List;
import java.util.stream.Collectors;

public class CarNamesResponse {

    public static final String NAME_JOINER = ", ";
    private final String joinedCarNames;

    private CarNamesResponse(String joinedCarNames) {
        this.joinedCarNames=joinedCarNames;
    }

    public static CarNamesResponse from(List<Car> carList) {
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
