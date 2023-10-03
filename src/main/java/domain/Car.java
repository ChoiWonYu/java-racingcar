package domain;

import service.MovingStrategy;
import service.RandomGenerator;
import service.RandomMovingStrategy;

public class Car {

    public static final int DEFAULT_MOVE_COUNT_VALUE = 1;

    private final Name name;
    private final MoveCount moveCount;
    private final MovingStrategy movingStrategy;

    private Car(final Name carName, final MoveCount count, final MovingStrategy movingStrategy) {
        this.name = carName;
        this.moveCount = count;
        this.movingStrategy = movingStrategy;
    }

    public static Car from(final String inputName) {
        Name carName = Name.createCarName(inputName);
        MoveCount count = new MoveCount(DEFAULT_MOVE_COUNT_VALUE);
        MovingStrategy movingStrategy = new RandomMovingStrategy(new RandomGenerator());
        return new Car(carName, count, movingStrategy);
    }

    public static Car of(final String inputName, final MovingStrategy movingStrategy) {
        Name carName = Name.createCarName(inputName);
        MoveCount count = new MoveCount(DEFAULT_MOVE_COUNT_VALUE);
        return new Car(carName, count, movingStrategy);
    }

    public int getMoveCountValue() {
        return moveCount.getMoveCount();
    }

    public String getCarNameValue() {
        return name.getName();
    }

    public boolean hasSameMoveCount(int count) {
        return moveCount.isSameValue(count);
    }

    public void moveWhenSatisfiedCondition() {
        if (movingStrategy.canCarMove()) {
            move();
        }
    }

    private void move() {
        moveCount.plusCount();
    }
}
