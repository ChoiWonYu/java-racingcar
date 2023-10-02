package domain;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarNameTest {

    @Test
    @DisplayName("최대 이름 길이보다 긴 이름으로 차 이름을 정하려고 할 때 에러")
    public void when_car_name_longer_than_max_length() {
        //given
        String testString = "A";

        //then
        assertThrows(IllegalArgumentException.class, () -> {
            Name.createCarName(testString.repeat(Name.MAX_LENGTH + 1));
        });
    }
}
