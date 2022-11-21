/*package zimareva.model;

import javax.persistence.*;

//todo: а нужна ли вообще эта сущность? Можно же не хранить попытки, а на фронте выводить их динамически без отправки
//todo: каждый раз запросов к серверу через http
@Entity
@Table(name = "attempt")
public class Attempt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}*/
