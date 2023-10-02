package view;

public class OutputView {

    public static final String PROGRESS_BAR = "-";

    public static void printResultDescription() {
        printNewLine();
        System.out.println("실행 결과");
    }

    public static void printCarMove(final String carName, final int count) {
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
