package service;

public class StubMovingStrategy implements MovingStrategy {

    private final boolean expectedResult;

    public StubMovingStrategy(boolean expectedResult) {
        this.expectedResult = expectedResult;
    }

    @Override
    public boolean canMove() {
        return expectedResult;
    }
}
