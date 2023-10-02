import java.util.Scanner;

public class RacingMain {

    public static void main(final String[] args) {
        RacingGameController gameController = new RacingGameController(new Scanner(System.in));
        gameController.race();
    }
}
