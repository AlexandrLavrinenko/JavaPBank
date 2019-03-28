package less_7.lecture.defaultInerface;

public class Main {
    public static void main(String[] args) {
        Human r = new Runner();
        r.walk();
//        r.sayHello(); -- Error!
        Human.sayHello();
    }
}
