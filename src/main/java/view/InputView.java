package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import type.CarName;

public class InputView {

    private static final Scanner reader = new Scanner(System.in);
    //private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //아래와 같이 일회성 컬렉션도 일급 컬렉션으로 생성해야 하는지 궁금합니다!
    public static List<CarName> getCarNames() {
        return Arrays.stream(reader.nextLine().split(","))
            .map(CarName::new).collect(Collectors.toList());
    }
}
