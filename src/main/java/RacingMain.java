import java.util.List;
import type.CarName;
import type.TryCount;
import view.InputView;

public class RacingMain {

    public static void main(final String[] args) {
        final List<CarName> carNames = InputView.getCarNames();
        final TryCount tryCount = InputView.getTryCount();
    }

}
