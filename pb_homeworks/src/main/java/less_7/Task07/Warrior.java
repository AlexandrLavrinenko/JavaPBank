package less_7.Task07;

import less_7.Task07.interfaces.Jumpable;
import less_7.Task07.interfaces.Shootable;

public class Warrior extends Person implements Runnable, Shootable, Jumpable {
    private String type = "Warrior";

    public String getType() {
        return type;
    }

    public Warrior(String name, int hp, int speedRun, int highJump) {
        super(name, hp, speedRun, highJump);
    }

    public Warrior(String name, int hp) {
        super(name, hp);
    }

    @Override
    public String toString() {
        return getType() + " " + getName() + " with " + getHp() + " health";
    }

    @Override
    public void run() {
        System.out.println(this.toString() + " run winh speed " + getSpeedRun());
    }

    @Override
    public void doJump() {
        System.out.println();

    }

    @Override
    public void doShoot() {

    }
}
