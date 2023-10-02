package domain;

import static exception.ErrorMessage.LESS_THAN_MIN_TRY_COUNT;
import static exception.ErrorMessage.WRONG_TYPE_TRY_COUNT;
import static exception.ErrorMessage.printErrorMessage;

public class TryCount {

    public static final int MIN_TRY_COUNT = 1;

    private final int tryCount;

    private TryCount(final int count) {
        validateSize(count);
        this.tryCount = count;
    }

    public static TryCount from(final String countInput) {
        validateType(countInput);
        int count = Integer.parseInt(countInput);
        return new TryCount(count);
    }

    public static TryCount from(final int tryCount) {
        return new TryCount(tryCount);
    }

    public int getTryCount() {
        return tryCount;
    }

    public void validateSize(final int tryCount) {
        if (tryCount < MIN_TRY_COUNT) {
            printErrorMessage(
                LESS_THAN_MIN_TRY_COUNT);
            throw new IllegalArgumentException();
        }
    }

    public static void validateType(final String countInput) {
        try {
            Integer.parseInt(countInput);
        } catch (NumberFormatException exception) {
            printErrorMessage(WRONG_TYPE_TRY_COUNT);
            throw new NumberFormatException();
        }
    }
}
