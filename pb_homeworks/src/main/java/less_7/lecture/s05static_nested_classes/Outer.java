package less_7.lecture.s05static_nested_classes;

// Static Nested classes or Member of outer class - Статические вложенные классы
public class Outer {
    static class Inner {
        private void show() {
            System.out.println("Inner method show");
        }

        static void method1() {
            System.out.println("Inner static method");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner(); // sic(!)
        inner.show();
        Outer.Inner.method1();
    }
}
