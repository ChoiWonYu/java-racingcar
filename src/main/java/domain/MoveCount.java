package domain;

public class MoveCount {

    private int moveCount;

    public MoveCount(final int moveCount) {
        this.moveCount = moveCount;
    }

    public Boolean isSameValue(final Integer value) {
        return value == moveCount;
    }

    public void plusCount() {
        moveCount++;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
