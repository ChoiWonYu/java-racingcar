package type;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarNameTest {

    @Test
    @DisplayName("최대 이름 길이보다 긴 이름으로 차 이름을 정하려고 할 때 에러")
    public void when_car_name_longer_than_max_length() {
        String testString = "A";

        assertThrows(IllegalArgumentException.class, () ->
            new CarName(testString.repeat(CarName.MAX_LENGTH + 1)));
    }

}
