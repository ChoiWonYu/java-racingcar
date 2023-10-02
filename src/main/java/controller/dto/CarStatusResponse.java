package controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import domain.Car;

public class CarStatusResponse {

    private final String carName;
    private final int countMove;

    private CarStatusResponse(final String carName, final int countMove) {
        this.carName = carName;
        this.countMove = countMove;
    }

    public static CarStatusResponse from(final Car car) {
        return new CarStatusResponse(car.getCarNameValue(), car.getMoveCountValue());
    }

    public static List<CarStatusResponse> createCarStatusResponses(final List<Car> targetCars) {
        List<CarStatusResponse> carStatusDtos = targetCars.stream()
            .map(CarStatusResponse::from)
            .collect(Collectors.toList());
        return carStatusDtos;
    }

    public String getCarName() {
        return carName;
    }

    public int getCountMove() {
        return countMove;
    }
}
