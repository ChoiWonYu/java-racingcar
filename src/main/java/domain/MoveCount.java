package domain;

public class MoveCount {

    private int moveCount;

    public MoveCount(int moveCount) {
        this.moveCount = moveCount;
    }


    public void plusCount() {
        moveCount++;
    }


    public int getMoveCount() {
        return moveCount;
    }
}
