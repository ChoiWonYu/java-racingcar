package service;

public class RandomMovingStrategy implements MovingStrategy {

    public final int MAX_RANDOM_NUM = 9;
    private final RandomGenerator randomGenerator;

    public RandomMovingStrategy(final RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    @Override
    public boolean canMove() {
        int randomNumber = randomGenerator.generateRandomNumber(MAX_RANDOM_NUM);
        return randomNumber >= MAX_RANDOM_NUM / 2;
    }
}
