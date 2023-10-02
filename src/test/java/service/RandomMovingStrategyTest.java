package service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomMovingStrategyTest {

    private RandomMovingStrategy movingStrategy;

    @Test
    @DisplayName("랜덤으로 생성한 숫자가 4미만일 경우 전진 불가, false 반환")
    void when_num_smaller_than_4_return_false() {
        //given
        movingStrategy = generateRandomMovingStrategyByNum(3);

        //when
        boolean result = movingStrategy.canCarMove();

        //then
        assertFalse(result);
    }

    @Test
    @DisplayName("랜덤으로 생성한 숫자가 4미만일 경우 전진 불가, false 반환")
    void when_num_bigger_than_4_return_true() {
        //given
        movingStrategy = generateRandomMovingStrategyByNum(5);

        //when
        boolean result = movingStrategy.canCarMove();

        //then
        assertTrue(result);
    }

    private RandomMovingStrategy generateRandomMovingStrategyByNum(final int num) {
        return new RandomMovingStrategy(new StubRandomGenerator(num));
    }
}
