package controller;

import controller.dto.CarNamesRequest;
import controller.dto.CarNamesResponse;
import controller.dto.CarStatusResponse;
import controller.dto.TryCountRequest;
import domain.Car;
import domain.Cars;
import domain.TryCount;
import java.util.List;
import java.util.stream.Collectors;
import view.InputOutputView;

public class RacingGameController {

    private final Cars cars;
    private final TryCount tryCount;
    private RacingGameController(Cars cars,TryCount tryCount) {
        this.cars=cars;
        this.tryCount=tryCount;
    };

    public static RacingGameController of(CarNamesRequest namesRequest, TryCountRequest countRequest) {
        TryCount tryCount=countRequest.createTryCount();
        Cars cars=namesRequest.createCars();

        return new RacingGameController(cars, tryCount);
    }

    public void race() {
        InputOutputView.printResultDescription();
        List<Car>targetCars=cars.getCarList();
        printEachCarMove(targetCars);
        for (int i = 0; i < tryCount.getTryCount(); i++) {
            cars.moveOrStopUsingManager();
            printEachCarMove(targetCars);
        }
    }

    private void printEachCarMove(List<Car> targetCars) {
        List<CarStatusResponse> carStatusDtos=targetCars.stream()
            .map(CarStatusResponse::from)
            .collect(Collectors.toList());

        carStatusDtos.forEach(dto-> InputOutputView.printCarMove(dto.getCarName(),
                dto.getCountMove())
            );

        InputOutputView.printNewLine();
    }

    public void printWinner() {
        List<Car> winnersCars=cars.getWinners();
        String winners= CarNamesResponse.from(winnersCars)
            .getJoinedCarNames();

        InputOutputView.printWinners(winners);
    }
}
