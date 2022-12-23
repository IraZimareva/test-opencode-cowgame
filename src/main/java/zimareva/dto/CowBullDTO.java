package zimareva.dto;

public class CowBullDTO {
    private int bull; //количество полных совпадений
    private int cow; //количество совпадений без учёта позиции (исключая полные совпадения)

    public CowBullDTO(int bull, int cow) {
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
}
