package domain;

import static exception.ErrorMessage.LESS_THAN_MIN_TRY_COUNT;
import static exception.ErrorMessage.printErrorMessage;

public class TryCount {

    public static final int MIN_TRY_COUNT = 1;

    private final int tryCount;

    public TryCount(final int tryCount) {
        validateSize(tryCount);
        this.tryCount = tryCount;
    }

    public int getTryCount() {
        return tryCount;
    }

    public void validateSize(final int tryCount) {
        if (tryCount > MIN_TRY_COUNT) {
            printErrorMessage(
                LESS_THAN_MIN_TRY_COUNT);
            throw new IllegalArgumentException();
        }
    }
}
