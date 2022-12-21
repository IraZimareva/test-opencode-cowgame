package zimareva.model;

import javax.persistence.*;

@Entity
@Table(name = "attempt")
public class Attempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enteredNumber;

    public Attempt() {
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

    @Override
    public String toString() {
        return "Attempt{" +
                "enteredNumber='" + enteredNumber + '\'' +
                '}';
    }
}
