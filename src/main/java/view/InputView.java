package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import domain.CarName;
import domain.TryCount;

public class InputView {

    private static final Scanner reader = new Scanner(System.in);

    public static List<CarName> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return Arrays.stream(reader.nextLine().split(","))
            .map(CarName::new)
            .collect(Collectors.toList());
    }

    public static TryCount getTryCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
        return new TryCount(reader.nextInt());
    }
}
