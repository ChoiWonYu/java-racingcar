package type;

public class Car {

    private final CarName carName;
    private final MoveCount moveCount;
    private final StringBuilder carNameOutput;

    public Car(CarName carName) {
        this.carName = carName;
        this.moveCount = new MoveCount(1);
        this.carNameOutput = new StringBuilder().append(carName.getCarName()).append(" : ");
    }

    public MoveCount getMoveCount() {
        return moveCount;
    }

    public String getCarNameValue() {
        return carName.getCarName();
    }

    public void moveOrStopByManager(boolean canMove) {
        if (canMove) {
            move();
        }
    }

    public void move() {
        moveCount.plusCount();
    }

    public void printCarsMove() {
        System.out.print(carNameOutput);
        System.out.println("-".repeat(moveCount.getMoveCount()));
    }

}
