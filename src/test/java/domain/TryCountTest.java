package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TryCountTest {

    @Test
    @DisplayName("최소 횟수 미만의 정수를 받으면 예외처리됨")
    public void when_given_less_than_min_count_throw_exception() {
        // when & then
        assertThrows(IllegalArgumentException.class, () -> {
            TryCount.from(-1);
        });
    }

    @Test
    @DisplayName("정수 이외의 입력값을 변환하려고 하면 예외처리됨")
    public void when_given_not_integer_type_throw_exception() {
        //when & then
        assertThrows(NumberFormatException.class, () -> {
            TryCount.from("a");
        });
    }
}
