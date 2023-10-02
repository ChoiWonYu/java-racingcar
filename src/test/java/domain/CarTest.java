package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    private Car car;

    @BeforeEach
    void init() {
        car = Car.from("test");
    }

    @Test
    @DisplayName("움직였을 때 moveCount의 값 증가")
    void when_receive_true_move() {
        //given
        int initialMoveCount = car.getMoveCountValue();

        //when
        car.move();
        int resultMoveCount = car.getMoveCountValue();

        //then
        assertEquals(initialMoveCount + 1, resultMoveCount);
    }
}
