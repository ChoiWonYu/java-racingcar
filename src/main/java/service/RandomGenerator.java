package service;

import java.util.Random;

public class RandomGenerator {

    private final Random random;

    public RandomGenerator() {
        this.random = new Random();
    }

    public int generateRandomNumber(final int maxRandomNumber) {
        return random.nextInt(maxRandomNumber);
    }
}
