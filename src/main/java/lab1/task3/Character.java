package lab1.task3;

/**
 * Created by zorka_000 on 10/18/2017.
 */
public abstract class Character {
    int power;
    int hp;

    boolean isAlive() {
        return hp >= 1;
    }

    abstract void kick(Character c);

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
