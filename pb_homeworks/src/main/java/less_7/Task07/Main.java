package less_7.Task07;

import less_7.Task07.classes.Thief;
import less_7.Task07.classes.Warrior;
import less_7.Task07.interfaces.Runable;
import less_7.Task07.interfaces.Shootable;
import less_7.Task07.interfaces.Sweemable;

public class Main {

    public static void main(String[] args) {
        Thief thief = new Thief("Altair", 100, 10, 100);
        System.out.println(thief.toString() + " " + thief.getHighJump());
        // lambda
        doRun(() -> System.out.println("With Lambda"));
        // Anonymous Inner Classes
        doSweeming(new Sweemable(){
            @Override
            public void doSweem() {
                System.out.println("Anonymous Inner Classes");
            }
        });
        doShooting((s) -> smartShoot("Хрясь!"));
        doShooting(Main ::smartShoot);

        System.out.println("##################################");
        Warrior warrior = new Warrior("Spartacus", 150, 8, 30);
        warrior.run();
        warrior.doJump();
        doShooting((w) -> System.out.println("Warrior not shooting..."));
    }

    private static void doRun(Runable runable){
        System.out.println("Running...");
        runable.doRun();
        System.out.println("----------------------------------");
    }

    private static void doSweeming(Sweemable sweemable){
        System.out.println("Sweeming...");
        sweemable.doSweem();
        System.out.println("----------------------------------");
    }

    private static void doShooting(Shootable shootable) {
        System.out.println("Paff-paff!");
        shootable.doShoot("Klick!");
        System.out.println("----------------------------------");
    }

    private static void smartShoot(String s) {
        System.out.println("Soundmoderator: " + s);
    }
}
