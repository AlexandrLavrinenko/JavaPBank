package less_7.lecture.defaultInerface;

public interface Human {
    default void walk(){
        System.out.println("Я пошел");
    }
    static void sayHello(){
        System.out.println("Hello!");
    }
}
