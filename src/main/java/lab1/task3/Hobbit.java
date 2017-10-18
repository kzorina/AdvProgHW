package lab1.task3;

/**
 * Created by zorka_000 on 10/18/2017.
 */
public class Hobbit extends Character {
    Hobbit(){
        setHp(3);
        setPower(0);
    }
    void kick(Character c){
        toCry();
    }
    void toCry(){
        System.out.println("aaaaaaaaaaaaaaaaa");
    }
}
