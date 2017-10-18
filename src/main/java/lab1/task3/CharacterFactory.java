package lab1.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zorka_000 on 10/18/2017.
 */
public class CharacterFactory {
    static Character createCharacter(){
        List<Character> creatures = new ArrayList<Character>();
        creatures.add(new Hobbit());
        creatures.add(new Elf());
        creatures.add(new King());
        creatures.add(new Knight());
        int i = new Random().nextInt(creatures.size());

        return  creatures.get(i);
    }
}
