package zimareva.model;

import javax.persistence.*;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String generatedNumber;
    private Integer numberOfAttempts;

    public Game() {
    }

    public Game(String generatedNumber) {
        this.generatedNumber = generatedNumber;
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

    public String getGeneratedNumber() {
        return generatedNumber;
    }

    public void setGeneratedNumber(String generatedNumber) {
        this.generatedNumber = generatedNumber;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", generatedNumber=" + generatedNumber +
                ", numberOfAttempts=" + numberOfAttempts +
                '}';
    }
}
