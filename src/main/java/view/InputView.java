package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import type.CarName;
import type.TryCount;

public class InputView {

    private static final Scanner reader = new Scanner(System.in);
    //private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //아래와 같이 일회성 컬렉션도 일급 컬렉션으로 생성해야 하는지 궁금합니다!
    public static List<CarName> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return Arrays.stream(reader.nextLine().split(","))
            .map(CarName::new).collect(Collectors.toList());
    }

    public static TryCount getTryCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
        return new TryCount(reader.nextInt());
    }
}
