package less_7.lecture.s07anonymousInnerClasses;

// Anonymous Inner classes - Анонимные внутренние классы объявляются без указания имени класса
public class Outer {
    static Demo demo = new Demo(){
        @Override
        public void show() {
            super.show();
            System.out.println("Anonymous show");
        }
    };

    public static void main(String[] args) {
        demo.show();

        Hello hello = new Hello() {
            @Override
            public void sayHello() {
                System.out.println("Hi!");
            }
        };
        hello.sayHello();
    }
}
