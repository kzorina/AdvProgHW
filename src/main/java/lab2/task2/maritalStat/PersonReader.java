package lab2.task2.maritalStat;

/**
 * Created by zorka_000 on 11/6/2017.
 */
public class PersonReader {
    private String previous;
    public void readPerson(Person p){
        if (p.toString().equals(previous)){
            System.out.println("You again???");
        }else {
            System.out.println(p.toString());
            previous = p.toString();
        }
    }
}
