package lab2.task2.maritalStat;

/**
 * Created by zorka_000 on 11/6/2017.
 */
public class Main {
    public static void main(String[] args) {
        Person katya = new Person("Katya",21,1);
        Person vitia = new Person("Vitia",64,2);
        Person vova = new Person("Vova",23,3);
        //System.out.println(katya);
        PersonReader reader = new PersonReader();
        reader.readPerson(katya);
        reader.readPerson(katya);
        reader.readPerson(vitia);
        reader.readPerson(vova);
    }
}
