package less_7.lecture.s04nested_inner_classes;

// Nested Inner Classes - вложенный внутренний класс
public class Outer {
    private String str = "Outer variable";

    private class Inner{
        private void show(){
            System.out.println("Inner class method");
        }

        private void printStr(String str) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        // Variant #1
        Outer outer = new Outer();
        Inner inner = outer.new Inner();

        // Variant #2
        Outer.Inner inner1 = new Outer().new Inner();

        inner.show();
        inner.printStr(outer.str);
        inner1.show();
    }
}
