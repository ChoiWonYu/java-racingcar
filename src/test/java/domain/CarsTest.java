package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {

    private Cars cars;

    @Test
    @DisplayName("cars가 비어있을 때 예외")
    void when_cars_is_empty_throw_exception() {
        //given
        cars = Cars.from(new ArrayList<>());

        //then
        assertThrows(NoSuchElementException.class, cars::getMaxValue);
    }

    @Test
    @DisplayName("cars 내부 car 중 가장 큰 전진 횟수를 반환")
    void return_max_value_of_move_count() {
        //given
        setData();

        //then
        assertEquals(1, cars.getMaxValue());
    }

    @Test
    @DisplayName("최대 전진 횟수를 가지는 car를 뽑는다.")
    void return_max_count_car_list() {
        //given
        setData();

        //then
        assertEquals(3, cars.getWinners().size());
    }

    private void setData() {
        Car car1 = Car.from("a");
        Car car2 = Car.from("b");
        Car car3 = Car.from("c");

        cars = Cars.from(List.of(car1, car2, car3));
    }
}
