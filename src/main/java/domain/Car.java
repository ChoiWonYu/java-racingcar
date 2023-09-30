package domain;

public class Car {

    public static final Integer DEFAULT_MOVE_COUNT_VALUE=1;
    private final Name name;
    private final MoveCount moveCount;

    private Car(Name carName) {
        this.name = carName;
        this.moveCount = new MoveCount(DEFAULT_MOVE_COUNT_VALUE);
    }

    public static Car from(String inputName) {
        Name carName=Name.createCarName(inputName);
        return new Car(carName);
    }

    public int getMoveCountValue() {
        return moveCount.getMoveCount();
    }

    public String getCarNameValue() {
        return name.getName();
    }

    public void move() {
        moveCount.plusCount();
    }

    public Boolean hasSameValue(Integer value) {
        Integer countValue=getMoveCountValue();
        return countValue.equals(value);
    }
}
