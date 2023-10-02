package domain;

import static exception.ErrorMessage.LONGER_THAN_MAX_NAME_LENGTH;
import static exception.ErrorMessage.printErrorMessage;

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
            printErrorMessage(LONGER_THAN_MAX_NAME_LENGTH);
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }
}
