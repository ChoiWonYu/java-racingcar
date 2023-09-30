package controller.dto;

import domain.Car;

public class CarStatusResponse {

    private final String carName;
    private final Integer countMove;

    private CarStatusResponse(String carName, Integer countMove) {
        this.carName=carName;
        this.countMove=countMove;
    }

    public static CarStatusResponse from(Car car) {
        return new CarStatusResponse(car.getCarNameValue(), car.getMoveCountValue());
    }

    public String getCarName() {
        return carName;
    }

    public Integer getCountMove() {
        return countMove;
    }
}
