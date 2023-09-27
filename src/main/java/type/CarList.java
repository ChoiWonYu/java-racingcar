package type;

import java.util.List;
import java.util.function.Consumer;

public class CarList {

    private List<Car> cars;

    public CarList(List<Car> cars) {
        this.cars = cars;
    }

    public void repeatAction(Consumer<Car> action) {
        cars.forEach(action);
    }
}
