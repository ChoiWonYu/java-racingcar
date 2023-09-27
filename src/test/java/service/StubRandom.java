package service;

import java.util.Random;

public class StubRandom extends Random {

    private int randomNumber;

    public StubRandom(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    @Override
    public int nextInt(int endNum) {
        return randomNumber;
    }
}
