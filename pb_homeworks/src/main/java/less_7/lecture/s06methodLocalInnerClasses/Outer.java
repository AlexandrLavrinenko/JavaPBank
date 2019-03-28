package less_7.lecture.s06methodLocalInnerClasses;

// Method Local Inner classes - Внутренний класс в локальном методе
public class Outer {
    private void outerMethod() {
        System.out.println("Outer method");
        int i = 47;
        class Inner{
            private void show(){
                System.out.println("Inner local method, i = " + i);
            }
        }
        Inner inner = new Inner();
        inner.show();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}
