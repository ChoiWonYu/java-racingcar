package domain;

import exception.ExceptionHandler;

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
            ExceptionHandler.printErrorMessage(
                String.format("시도 횟수는 %d 이상이어야 합니다.", MIN_TRY_COUNT));
            throw new IllegalArgumentException();
        }
    }
}
