package zimareva.utils;

public class ResultDTO {
    private int bull; //количество полных совпадений
    private int cow; //количество совпадений без учёта позиции (исключая полные совпадения)

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

    @Override
    public String toString() {
        return "ResultDTO{" +
                "bull=" + bull +
                ", cow=" + cow +
                '}';
    }
}
