package service;

public class StubRandomGenerator extends RandomGenerator {

    private int randomNumber;

    public StubRandomGenerator(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    @Override
    public int generateRandomNumber(final int endNum) {
        return randomNumber;
    }
}
