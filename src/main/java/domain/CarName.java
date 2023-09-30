package domain;

import exception.ExceptionHandler;

public class CarName {

    public static final int MAX_LENGTH = 5;

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
}
