package type;

public class Car {

    private final CarName carName;
    private final MoveCount moveCount;

    public Car(CarName carName) {
        this.carName = carName;
        this.moveCount = new MoveCount(0);
    }

}
