package type;

import org.junit.jupiter.api.Assertions;
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
    @DisplayName("false가 전달되면 움직이지 말아야 한다.")
    void when_receive_false_dont_move() {

        MoveCount moveCount = car.getMoveCount();
        int initialMoveCount = moveCount.getMoveCount();

        car.moveOrStopByManager(false);
        int resultMoveCount = moveCount.getMoveCount();

        Assertions.assertEquals(initialMoveCount, resultMoveCount);
    }

    @Test
    @DisplayName("true가 전달되면 한 번 움직여야 한다.")
    void when_receive_true_move() {

        MoveCount moveCount = car.getMoveCount();
        int initialMoveCount = moveCount.getMoveCount();

        car.moveOrStopByManager(true);
        int resultMoveCount = moveCount.getMoveCount();

        Assertions.assertEquals(initialMoveCount + 1, resultMoveCount);
    }
}
