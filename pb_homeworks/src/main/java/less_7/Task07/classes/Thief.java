package less_7.Task07.classes;

public class Thief extends Person {
    private String type = "Thief";

    public String getType() {
        return type;
    }

    public Thief(String name, int hp, int speedRun, int highJump) {
        super(name, hp, speedRun, highJump);
    }

    public Thief(String name, int hp) {
        super(name, hp);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public int getSpeedRun() {
        return super.getSpeedRun();
    }

    @Override
    public int getHighJump() {
        return super.getHighJump();
    }

    @Override
    public String toString() {
        return getType() + " " + super.toString();
    }
}
