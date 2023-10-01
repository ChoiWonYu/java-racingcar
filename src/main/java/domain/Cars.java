package domain;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

import service.MovingManager;
import service.RandomMovingManager;

public class Cars {

    private final List<Car> cars;
    private final MovingManager movingManager;

    private Cars(final List<Car> cars) {
        this.cars = cars;
        this.movingManager = new RandomMovingManager(new Random());
    }

    public static Cars from(final List<Car> carList) {
        return new Cars(carList);
    }

    public void moveOrStopUsingManager() {
        cars.forEach((car -> {
            Boolean canMove = movingManager.canCarMove();
            if(canMove){
                car.move();
            }}));
    }

    public List<Car> getCarList() {
        return this.cars;
    }

    public List<Car> getWinners() {
        Integer maxValue = getMaxValue();
        return cars.stream()
            .filter(car -> car.hasSameValue(maxValue))
            .collect(Collectors.toList());
    }

    public Integer getMaxValue() {
        return cars.stream()
            .mapToInt(Car::getMoveCountValue)
            .max()
            .orElseThrow(NoSuchElementException::new);
    }
}
