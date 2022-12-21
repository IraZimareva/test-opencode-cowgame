package zimareva.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String benchmarkNumber;
    private Integer numberOfAttempts;
    private Boolean isOver;
    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    @JoinColumn(name = "game_id")
    private List<Attempt> attempts= new ArrayList<>();

    public Game() {
        this.numberOfAttempts = 0;
        this.isOver = false;
    }

    public Game(String benchmarkNumber) {
        this.benchmarkNumber = benchmarkNumber;
        this.numberOfAttempts = 0;
        this.isOver = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(Integer numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    public String getBenchmarkNumber() {
        return benchmarkNumber;
    }

    public void setBenchmarkNumber(String benchmarkNumber) {
        this.benchmarkNumber = benchmarkNumber;
    }

    public Boolean getOver() {
        return isOver;
    }

    public void setOver(Boolean over) {
        isOver = over;
    }

    public List<Attempt> getAttempts() {
        return attempts;
    }

    public void setAttempts(List<Attempt> attempts) {
        this.attempts = attempts;
    }

    public void addNewAttempt(Attempt attempt){
        attempts.add(attempt);
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", benchmarkNumber='" + benchmarkNumber + '\'' +
                ", numberOfAttempts=" + numberOfAttempts +
                ", isOver=" + isOver +
                ", attempts=" + attempts +
                '}';
    }
}
