package lab1.task3;

/**
 * Created by zorka_000 on 10/18/2017.
 */
public class GameManager {
   static void fight(Character c1, Character c2){

       String creature1 = c1.getClass().getSimpleName();
       String creature2 = c2.getClass().getSimpleName();
       if (creature1.equals(creature2)){
           if (creature1.equals("Elf")){
               System.out.println("Two Elfs have equal power, they will fight forever. So in this case friendship wins");
               return;
           }
           creature1=creature1+"1";
           creature2=creature2+"2";
       }

       System.out.println("Starting a fight between "+creature1+" and "+creature2);
       System.out.println(creature1+" hp: "+c1.getHp()+", power: "+c1.getPower());
       System.out.println(creature2+" hp: "+c2.getHp()+", power: "+c2.getPower()+"\n\n");
       while (c1.isAlive() && c2.isAlive()){

           System.out.println(creature1+" kicks "+creature2);
           c1.kick(c2);
           System.out.println(creature2+" hp: "+c2.getHp()+", power: "+c2.getPower());

           System.out.println(creature2+" kicks "+creature1);
           c2.kick(c1);
           System.out.println(creature1+" hp: "+c1.getHp()+", power: "+c1.getPower());
       }
       if (c1.isAlive())
           System.out.println(creature1+" wins");
       else
           System.out.println(creature2+" wins");
   }


    public static void main(String[] args) {
       fight(CharacterFactory.createCharacter(),CharacterFactory.createCharacter());
    }
}
