package zimareva.model;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String benchmarkNumber;
    private Integer numberOfAttempts;

    public Game() {
    }

    public Game(String benchmarkNumber, Integer numberOfAttempts) {
        this.benchmarkNumber = benchmarkNumber;
        this.numberOfAttempts = numberOfAttempts;
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

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", benchmarkNumber=" + benchmarkNumber +
                ", numberOfAttempts=" + numberOfAttempts +
                '}';
    }
}
