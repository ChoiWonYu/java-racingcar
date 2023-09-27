package type;

public class Car {

    private final CarName carName;
    private final MoveCount moveCount;

    public Car(CarName carName) {
        this.carName = carName;
        this.moveCount = new MoveCount(1);
    }

    public int getMoveCountValue() {
        return moveCount.getMoveCount();
    }

    public String getCarNameValue() {
        return carName.getCarName();
    }

    public void move() {
        moveCount.plusCount();
    }

    public void printCarsMove() {
        System.out.printf("%s : ",carName.getCarName());
        System.out.println("-".repeat(moveCount.getMoveCount()));
    }

}
