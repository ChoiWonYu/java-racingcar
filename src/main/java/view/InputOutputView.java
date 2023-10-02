package view;

import java.util.Scanner;

public class InputOutputView {

    public static final String PROGRESS_BAR = "-";
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

    public static void printResultDescription() {
        printNewLine();
        System.out.println("실행 결과");
    }

    public static void printCarMove(final String carName, final Integer count) {
        System.out.printf("%s : %s\n", carName, PROGRESS_BAR.repeat(count));
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void printWinners(final String winners) {
        System.out.print(winners);
        System.out.println("가 최종 우승했습니다!");
    }
}
