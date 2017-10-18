package lab1.task3;

import java.util.Random;

/**
 * Created by zorka_000 on 10/18/2017.
 */
public class Knight extends Character {
    Knight(){
        setHp(2+ new Random().nextInt(11));
        setPower(2+ new Random().nextInt(11));
    }
    void kick(Character c){
        int kick = new Random().nextInt(power);
        c.setHp(c.getHp()-kick);
        System.out.println("damage: "+kick);
    }
}
