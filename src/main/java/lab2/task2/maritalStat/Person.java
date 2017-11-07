package lab2.task2.maritalStat;

/**
 * Created by zorka_000 on 11/6/2017.
 */
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private int maritalStatus;

    public String toString() {
        return this.name + " age :" + Integer.toString(age) + ", "+MaritalStatus.findByDbCode(this.maritalStatus);
    }
}
