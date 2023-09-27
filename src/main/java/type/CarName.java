package type;

public class CarName {

    public static final int MAX_LENGTH=5;
    //특정 타입과 관련된 상수라면 위처럼 클래스에서 관리하는 게 맞는지 상수를 따로 관리하는 게 맞는지 궁금합니다

    private final String carName;

    public CarName(final String carName){
        this.carName=carName;
    }

}
