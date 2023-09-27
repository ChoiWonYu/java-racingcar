package type;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarListTest {

    private CarList cars;

    @Test
    @DisplayName("cars가 비어있을 때 예외")
    void when_cars_is_empty_throw_exception() {
        cars = new CarList(new ArrayList<>());
        assertThrows(NoSuchElementException.class, cars::getMaxValue);
    }

    @Test
    @DisplayName("cars 내부 car 중 가장 큰 전진 횟수를 반환")
    void return_max_value_of_move_count() {
        setData();
        assertEquals(1, cars.getMaxValue());
    }

    @Test
    @DisplayName("최대 전진 횟수를 가지는 car를 뽑는다.")
    void return_max_count_car_list() {
        setData();
        assertEquals(3, cars.getWinners().size());
    }

    private void setData() {
        CarName name1 = new CarName("a");
        CarName name2 = new CarName("b");
        CarName name3 = new CarName("c");

        Car car1 = new Car(name1);
        Car car2 = new Car(name2);
        Car car3 = new Car(name3);

        cars = new CarList(List.of(car1, car2, car3));
    }
}
