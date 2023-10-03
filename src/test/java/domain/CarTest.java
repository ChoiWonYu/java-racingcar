package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.MovingStrategy;
import service.StubMovingStrategy;

class CarTest {

    private Car car;
    private MovingStrategy movingStrategy;


    @Test
    @DisplayName("전진 전략의 메서드가 true를 반환하면 전진해야 한다.")
    void when_receive_true_move() {
        // given
        movingStrategy = new StubMovingStrategy(true);
        car = Car.createDefault("test", movingStrategy);
        int initialMoveCount = car.getMoveCountValue();

        // when
        car.moveWhenSatisfiedCondition();
        int resultMoveCount = car.getMoveCountValue();

        // then
        assertEquals(initialMoveCount + 1, resultMoveCount);
    }

    @Test
    @DisplayName("전진 전략의 메서드가 false를 반환하면 전진하면 안 된다.")
    void when_receive_false_dont_move() {
        // given
        movingStrategy = new StubMovingStrategy(false);
        car = Car.createDefault("test", movingStrategy);

        // when
        int initialMoveCount = car.getMoveCountValue();
        car.moveWhenSatisfiedCondition();
        int resultMoveCount = car.getMoveCountValue();

        // then
        assertEquals(initialMoveCount, resultMoveCount);
    }
}
