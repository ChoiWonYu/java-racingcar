package type;

import exception.ExceptionHandler;

public class CarName {

    public static final int MAX_LENGTH = 5;
    //특정 타입과 관련된 상수라면 위처럼 클래스에서 관리하는 게 맞는지 상수를 따로 관리하는 게 맞는지 궁금합니다

    private final String carName;

    public CarName(final String carName) {
        validateLength(carName);
        this.carName = carName;
    }

    private void validateLength(final String carName) {
        if (carName.length() > MAX_LENGTH) {
            ExceptionHandler.printErrorMessage(String.format("이름은 %d자 이하만 가능합니다.",MAX_LENGTH));
            throw new IllegalArgumentException();
        }
    }

    public String getCarName() {
        return carName;
    }
    //원시값을 포장한 객체에서는 getter를 써도 되는지 궁금합니다!
}
