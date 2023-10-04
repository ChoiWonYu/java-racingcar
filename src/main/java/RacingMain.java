import java.util.Scanner;
import view.InputView;

public class RacingMain {

    public static void main(final String[] args) {
        InputView inputView = new InputView(new Scanner(System.in));
        RacingGameController gameController = new RacingGameController(inputView);
        gameController.race();
    }
}
