package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

    private Car car;
    private CarName carName;

    @BeforeEach
    void init() {
        carName = new CarName("test");
        car = new Car(carName);
    }

    @Test
    @DisplayName("움직였을 때 moveCount의 값 증가")
    void when_receive_true_move() {

        int initialMoveCount = car.getMoveCountValue();
        car.move();
        int resultMoveCount = car.getMoveCountValue();

        assertEquals(initialMoveCount + 1, resultMoveCount);
    }
}
