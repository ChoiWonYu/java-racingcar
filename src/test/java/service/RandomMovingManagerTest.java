package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomMovingManagerTest {

    private RandomMovingManager movingManager;

    @Test
    @DisplayName("랜덤으로 생성한 숫자가 4미만일 경우 전진 불가, false 반환")
    void when_num_smaller_than_4_return_false() {
        movingManager = generateRandomMovingManagerByNum(3);
        boolean result = movingManager.canMove();

        assertFalse(result);
    }

    @Test
    @DisplayName("랜덤으로 생성한 숫자가 4미만일 경우 전진 불가, false 반환")
    void when_num_bigger_than_4_return_true() {
        movingManager = generateRandomMovingManagerByNum(5);
        boolean result = movingManager.canMove();

        assertTrue(result);
    }

    private RandomMovingManager generateRandomMovingManagerByNum(int num) {
        return new RandomMovingManager(new StubRandom(num));
    }
}
