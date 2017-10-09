package lab1.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zorka_000 on 10/9/2017.
 */
public class AlternativeSwitch {
    public static void alternativeSwitch(String parameter){
        //To add option into switch just create class that implements AltSwitch,
        //define action() and name() methods and add object of this class to array:
        List<AltSwitch> options = new ArrayList<AltSwitch>();
        options.add(new Cat());
        options.add(new Dog());
        options.add(new Bird());
        boolean used = false;
        for (AltSwitch i: options){
            if (i.name().equals(parameter)){
                i.action();
                used = true;
            }
        }
        if (!used){
            System.out.println("Unknown parameter for switch");
        }
    }
}
