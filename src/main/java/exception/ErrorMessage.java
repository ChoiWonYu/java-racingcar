package exception;

import domain.Name;
import domain.TryCount;

public enum ErrorMessage {

    LONGER_THAN_MAX_NAME_LENGTH(String.format("이름은 %d자 이하만 가능합니다.", Name.MAX_LENGTH)),
    LESS_THAN_MIN_TRY_COUNT(String.format("시도 횟수는 %d 이상이어야 합니다.", TryCount.MIN_TRY_COUNT)),
    WRONG_TYPE_TRY_COUNT("시도 횟수는 정수만 입력 가능합니다.");

    private final String message;

    ErrorMessage(final String message) {
        this.message = message;
    }

    public static void printErrorMessage(final ErrorMessage handler) {
        System.out.print("[ERROR] ");
        System.out.println(handler.message);
    }
}
