package type;

public class TryCount {

    private final int tryCount;

    public TryCount(final int tryCount) {
        this.tryCount = tryCount;
    }

    public int getTryCount() {
        return tryCount;
    }
    //이런 경우에도 getter를 쓰면 안 되는 건지 궁금합니다!
}
