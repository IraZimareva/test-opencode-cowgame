package zimareva.model;

import javax.persistence.*;

@Entity
@Table(name = "attempt")
public class Attempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enteredNumber;
    private Integer bull;
    private Integer cow;

    public Attempt() {
    }

    public Attempt(String enteredNumber) {
        this.enteredNumber = enteredNumber;
    }

    public Attempt(String enteredNumber, Integer bull, Integer cow) {
        this.enteredNumber = enteredNumber;
        this.bull = bull;
        this.cow = cow;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(String enteredNumber) {
        this.enteredNumber = enteredNumber;
    }

    public Integer getBull() {
        return bull;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public Integer getCow() {
        return cow;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }
}
