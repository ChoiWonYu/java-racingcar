package domain;

public class CarStatus {

    private final String carName;
    private final int countMove;

    public CarStatus(final String carName, final int countMove) {
        this.carName = carName;
        this.countMove = countMove;
    }

    public String getCarName() {
        return carName;
    }

    public int getCountMove() {
        return countMove;
    }
}
