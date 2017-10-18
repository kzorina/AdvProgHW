package lab1.task3;

/**
 * Created by zorka_000 on 10/18/2017.
 */
public class Elf extends Character {
    Elf(){
        setHp(10);
        setPower(10);
    }
    void kick(Character c){
        if (c.getPower()<power){
            c.setHp(0);
        } else{
            c.setPower(c.getPower()-1);
        }
    }

}
