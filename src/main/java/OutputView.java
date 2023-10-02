public class OutputView {

    public static final String PROGRESS_BAR = "-";

    public static void askCarsNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void askTryCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
    }

    public static void showResultDescription() {
        printNewLine();
        System.out.println("실행 결과");
    }

    public static void showCarMove(final String carName, final int count) {
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
