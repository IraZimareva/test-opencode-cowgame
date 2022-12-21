package zimareva.dto;

public class NumberDTO {
    private Long gameId;
    private int first;
    private int second;
    private int third;
    private int fourth;

    public NumberDTO() {
    }

    public NumberDTO(Long gameId, int first, int second, int third, int fourth) {
        this.gameId = gameId;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getThird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getFourth() {
        return fourth;
    }

    public void setFourth(int fourth) {
        this.fourth = fourth;
    }

    public String concatValueToString() {
        return first + "" + second + "" + third + "" + fourth;
    }
}
