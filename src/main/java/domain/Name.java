package domain;

import exception.ExceptionHandler;

public class Name {

    public static final int MAX_LENGTH = 5;

    private final String name;

    private Name(final String name) {
        this.name = name;
    }

    public static Name createCarName(final String carName) {
        validateLength(carName);
        return new Name(carName);
    }

    private static void validateLength(final String carName) {
        if (carName.length() > MAX_LENGTH) {
            ExceptionHandler.printErrorMessage(String.format("이름은 %d자 이하만 가능합니다.", MAX_LENGTH));
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }
}
