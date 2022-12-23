package zimareva.dto;

public class ResultDTO {
    private int bull; //количество полных совпадений
    private int cow; //количество совпадений без учёта позиции (исключая полные совпадения)
    private int countOfAttempts; //количество попыток
    private boolean isGameOver; //окончена ли игра?

    public ResultDTO(int bull, int cow) {
        this.bull = bull;
        this.cow = cow;
    }

    public int getBull() {
        return bull;
    }

    public void setBull(int bull) {
        this.bull = bull;
    }

    public int getCow() {
        return cow;
    }

    public void setCow(int cow) {
        this.cow = cow;
    }

    public int getCountOfAttempts() {
        return countOfAttempts;
    }

    public void setCountOfAttempts(int countOfAttempts) {
        this.countOfAttempts = countOfAttempts;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
                "bull=" + bull +
                ", cow=" + cow +
                ", countOfAttempts=" + countOfAttempts +
                ", isGameOver=" + isGameOver +
                '}';
    }
}
