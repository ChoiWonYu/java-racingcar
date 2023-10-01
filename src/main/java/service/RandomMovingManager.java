package service;

import java.util.Random;

public class RandomMovingManager implements MovingManager{

    public final int    MAX_RANDOM_NUM=9;
    private final Random random;

    public RandomMovingManager(final Random random) {
        this.random=random;
    }

    @Override
    public Boolean canCarMove() {
        int randomNumber=generateRandomNumber();
        return randomNumber>=MAX_RANDOM_NUM/2;
    }

    private int generateRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUM+1);
    }
}
