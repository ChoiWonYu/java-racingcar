package view;

import java.util.Scanner;

public class InputView {

    private static final Scanner reader = new Scanner(System.in);

    public static String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return getUserInput();
    }

    public static String getTryCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
        return getUserInput();
    }

    public static String getUserInput() {
        return reader.nextLine();
    }
}
